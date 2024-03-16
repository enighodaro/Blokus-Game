 
import javax.swing.*;
import javax.swing.event.*;
import java.awt.event.*;
import java.awt.*;
import javax.imageio.*;
import java.io.File;

public class Blokus

{  
   public static final int NUM_PLAYERS = 4;
   private static int activePlayers;
   private static int diffclty;
   private static boolean visualAid;
   
   
   public Blokus(int players, int diff, boolean help)
   { 
	   activePlayers = players;
	   diffclty = diff;
	   visualAid = help;
	   new BlokusFrame();}
   
   public static class BlokusFrame extends JFrame
   {
	   private JPanel mainPanel;
	   private JPanel sidePanel;
	   private JPanel piecesPanel;
	   private JPanel brdPanel;
	   private JLabel label;
	   private ImageIcon boardImage;
	   private JButton surrender;
	   private boolean visualHint = true;
	   private JButton visualHintB;
	   private Board board;
	   private Player[] players;
	   private int turn = -1;
	   private JLabel playerOnTurn;
	   private int pieceIndex;
	   private Point selected;
      
      
      
      public BlokusFrame()
      {
         super("Blokus");
         board = new Board();
         players = new Player[NUM_PLAYERS];
         players[0] = new Player(Board.BLUE);
         players[1] = new Player(Board.RED);
         players[2] = new Player(Board.YELLOW);
         players[3] = new Player(Board.GREEN);
         
         setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
         initializeGUI();
         startNewTurn();
      }
      
      private void initializeGUI()
      {
    	  class SurrenderListener implements ActionListener
          {
             public void actionPerformed(ActionEvent event)
             {
                players[turn].canPlay = false;
                startNewTurn();
             }
          }
          class VisualHintListener implements ActionListener
          {
         	 public void actionPerformed(ActionEvent event)
         	 {
         		 if(visualHint) {
         			 visualHint = false;
         			 // Process to repaint all the rellow squares
         		 }
         		 else {
         			 visualHint = true;
         			 //Process to repaint all the corners
         		 }
         	 }
          }

    	  
    	  class BoardClickListener implements MouseListener, MouseMotionListener, MouseWheelListener
         {
            public void mouseClicked(MouseEvent e)
            {
               // Gets the right-click
            	
            	if (e.getButton() == MouseEvent.BUTTON3)
               {
                  flipPiece();
               }
               else
               {
                  try
                  {
                     //Placing a piece anywhere inbounds in the board
                	  board.placePiece(players[turn].pieces.get(
                        pieceIndex), selected.x - Pieces.SHAPE_SIZE / 2, 
                        selected.y - Pieces.SHAPE_SIZE / 2, players[turn].firstMove);
                     drawBoard();
                     //Gets rid of the first move
                     players[turn].pieces.remove(pieceIndex);
                     players[turn].firstMove = false;
                     players[turn].canPlay = players[turn].pieces.size() != 0;
                     startNewTurn();
                  }
                  catch (Board.IllegalMoveException ex)
                  {
                     displayMessage(ex.getMessage(), "Illegal Move!");
                  }
               }
            }
            
            public void mousePressed(MouseEvent e)
            {
               
            }
            
            public void mouseReleased(MouseEvent e)
            {
               
            }
            
            public void mouseEntered(MouseEvent e)
            {
               
            }
            
            public void mouseExited(MouseEvent e)
            {
               selected = null;
               board.resetOverlay();
               drawBoard();
            }
            
            public void mouseDragged(MouseEvent e)
            {
            
            }
            
            public void mouseMoved(MouseEvent e)
            {
               Point p = board.getCoordinates(e.getPoint(), Board.DEFAULT_RESOLUTION);
               if (!p.equals(selected))
               {
                  selected = p;
                  board.overlay(players[turn].pieces.get(pieceIndex), selected.x, selected.y);
                  drawBoard();
               }
            }
            
            public void mouseWheelMoved(MouseWheelEvent e)
            {
               if (e.getWheelRotation() > 0)
               {
                  rotateClockwise();
               }
               else
               {
                  rotateCounterClockwise();
               }
            }
         }
         
        
         
         mainPanel = new JPanel();
         mainPanel.setLayout(new BoxLayout(mainPanel, BoxLayout.PAGE_AXIS));
         piecesPanel = new JPanel();
         piecesPanel.setLayout(new BoxLayout(piecesPanel, BoxLayout.LINE_AXIS));
         
         JScrollPane jsp = new JScrollPane(piecesPanel);
         
         
         jsp.getHorizontalScrollBar().setUnitIncrement(Pieces.DEFAULT_RESOLUTION / 3);
      
         jsp.setPreferredSize(new Dimension(Pieces.DEFAULT_RESOLUTION - 80, Board.DEFAULT_RESOLUTION - 40));

         
         surrender = new JButton("Surrender");
         surrender.setPreferredSize(new Dimension(Pieces.DEFAULT_RESOLUTION, 30));
         surrender.addActionListener(new SurrenderListener());
         
         visualHintB = new JButton("VH");
         visualHintB.addActionListener(new VisualHintListener());
         
         sidePanel = new JPanel();
         sidePanel.setLayout(new BoxLayout(sidePanel, BoxLayout.PAGE_AXIS));
         
         
         brdPanel = new JPanel();
         
         boardImage = new ImageIcon(board.render());
         playerOnTurn = new JLabel();
         
         label = new JLabel(boardImage);
         BoardClickListener bcl = new BoardClickListener();
         label.addMouseListener(bcl);
         label.addMouseMotionListener(bcl);
         label.addMouseWheelListener(bcl);
         
         brdPanel.add(label);
         sidePanel.add(playerOnTurn);
         sidePanel.add(jsp);
         sidePanel.add(surrender);
         mainPanel.add(brdPanel);
         mainPanel.add(sidePanel);
         mainPanel.add(visualHintB);
         
         getContentPane().add(mainPanel);
         pack();
         setVisible(true);
      }
            
      private class PieceLabelClickListener implements MouseListener
      {
         public void mouseClicked(MouseEvent e)
         {
            
            BlokusPieceLabel bp = (BlokusPieceLabel) e.getComponent();
            clearBorder();
            pieceIndex = bp.pieceIndex;
            drawBorder();
         }
         
         public void mousePressed(MouseEvent e)
         {
            
         }
         
         public void mouseReleased(MouseEvent e)
         {
            
         }
         
         public void mouseEntered(MouseEvent e)
         {
            
         }
         
         public void mouseExited(MouseEvent e)
         {
            
         }
      }
      
      private void startNewTurn()
      {
         turn++;
         turn %= NUM_PLAYERS;
         //playerToPlay();
         if (isGameOver())
         {
            gameOver();
         }
         
         if (!players[turn].canPlay)
         {
            startNewTurn();
            return;
         }
         
         piecesPanel.removeAll();
         
         for (int i = 0; i < players[turn].pieces.size(); i++)
         {
            BlokusPieceLabel pieceLabel = 
               new BlokusPieceLabel(i, players[turn].pieces.get(i), Pieces.DEFAULT_RESOLUTION);
            pieceLabel.addMouseListener(new PieceLabelClickListener());
            pieceLabel.setBorder(BorderFactory.createLineBorder(Color.LIGHT_GRAY));
            piecesPanel.add(pieceLabel);
         }
         
         pieceIndex = 0;
         drawBorder();
         piecesPanel.repaint();
         
         pack();
      }
      
      private boolean isGameOver()
      {
         for (int i = 0; i < NUM_PLAYERS; i++)
         {
            if (players[i].canPlay) return false;
         }
         return true;
      }
      
      private void gameOver()
      {
         StringBuffer sb = new StringBuffer();
         for (int i = 0; i < NUM_PLAYERS; i++)
         {
            sb.append(Board.getColorName(getPlayerColor(i)));
            sb.append(": ");
            sb.append(players[i].getScore());
            sb.append("\n");
         }
         JOptionPane.showMessageDialog(this, sb.toString(), "Game Over", JOptionPane.INFORMATION_MESSAGE );
         System.exit(0);
      }
      
      private int getPlayerColor(int index)
      {
         switch (index)
         {
            case 0: return Board.BLUE;
            case 1: return Board.RED;
            case 2: return Board.YELLOW;
            case 3: return Board.GREEN;
            default: return 0;
         }
      }
      
      private void rotateClockwise()
      {
         players[turn].pieces.get(pieceIndex).rotateClockwise();
         board.overlay(players[turn].pieces.get(pieceIndex), selected.x, selected.y);
         drawBoard();
      }
      
      private void rotateCounterClockwise()
      {
         players[turn].pieces.get(pieceIndex).rotateCounterClockwise();
         board.overlay(players[turn].pieces.get(pieceIndex), selected.x, selected.y);
         drawBoard();
      }
      
      private void flipPiece()
      {
         players[turn].pieces.get(pieceIndex).flipOver();
         board.overlay(players[turn].pieces.get(pieceIndex), selected.x, selected.y);
         drawBoard();
      }
      
      private void drawBoard()
      {
         boardImage.setImage(board.render());
         label.repaint();
      }
      
      private void drawBorder()
      {
         JComponent piece = (JComponent) piecesPanel.getComponent(pieceIndex);
         piece.setBorder(BorderFactory.createLineBorder(Color.YELLOW));
      }
      
      private void clearBorder()
      {
         JComponent piece = (JComponent) piecesPanel.getComponent(pieceIndex);
         piece.setBorder(BorderFactory.createLineBorder(Color.LIGHT_GRAY));
      }
      
      private void displayMessage(String message, String title)
      {
         JOptionPane.showMessageDialog(this, message, title, JOptionPane.INFORMATION_MESSAGE);
      }
   
      private void playerToPlay() {
    	  switch(activePlayers % 4) {
    	  case 0: fourPlayerGame();
    	  case 1: fourPlayerGame();
    	  case 2: twoPlayerGame();
    	  		
    	  }
      }
      private void fourPlayerGame() {
    	  switch(turn % 4) {
    	  case 0:	playerOnTurn.setText("Blue player turn");
    	  			getContentPane().validate();
    	  			getContentPane().repaint();
    	  case 1: 	playerOnTurn.setText("Red player turn");
    	  			getContentPane().validate();
    	  			getContentPane().repaint();
    	  case 2: 	playerOnTurn.setText("Yellow player turn");
    	  			getContentPane().validate();
    	  			getContentPane().repaint();
    	  case 3: 	playerOnTurn.setText("Green player turn");
    	  			getContentPane().validate();
    	  			getContentPane().repaint();
    	  }
      }
      private void twoPlayerGame() {
    	  switch(turn % 2) {
    	  case 0:	playerOnTurn.setText("Blue player turn");
    	  			getContentPane().validate();
    	  			getContentPane().repaint();
    	  case 1:	playerOnTurn.setText("Red player turn");
    	  			getContentPane().validate();
    	  			getContentPane().repaint();
    	  }
      }
   }
   
   public static class BlokusPieceLabel extends JLabel
   {  
      public int pieceIndex;
      
      public BlokusPieceLabel(int pieceIndex, Pieces bp, int size)
      {
         super(new ImageIcon(bp.render(size)));
         this.pieceIndex = pieceIndex;
      }
   }
   
}