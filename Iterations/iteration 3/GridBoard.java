import javax.swing.JOptionPane; 
import javax.swing.JLabel;
import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.Timer;
import javax.swing.JScrollPane; 

import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.Container;
import java.awt.Color;
/**
 * Write a description of class GridBoard here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class GridBoard
{
    // instance variables - replace the example below with your own
    private Blocks b1= new Blocks();
    private JFrame frame;
    private Color color = Color.RED;
    /**
     * Constructor for objects of class GridBoard
     */
    public GridBoard()
    {
        // initialise instance variables
        addGrid();
    }

    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public void addGrid()
    {
        // put your code here
        frame = new JFrame("Blokus Blocks");  
        frame.setSize(500,500);
        frame.setResizable(true);
        JPanel contentPane = (JPanel)frame.getContentPane();
        contentPane.setLayout(new BorderLayout()); 
                
        JLabel board = new JLabel("Put Board Here");
        //JScrollPane scrlpane = new JScrollPane(b1.buttons(color));
        JScrollPane scrlpane = new JScrollPane(b1.buttons(color),
         JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED,
         JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
         
        contentPane.add(board, BorderLayout.SOUTH); 
        contentPane.add(scrlpane, BorderLayout.CENTER);
        //frame.add(scrlpane, BorderLayout.CENTER); 
        
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.pack();
        frame.setVisible(true); 
    }
}
