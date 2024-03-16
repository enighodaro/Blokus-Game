import javax.swing.JOptionPane; 
import javax.swing.JLabel;
import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.Timer;

import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.Container;
import java.awt.Color;
import java.awt.Dimension;
import javax.swing.BorderFactory;

import java.util.*; 
/**
 * Write a description of class Blocki here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Blocks
{
    // instance variables - replace the example below with your own
    private JButton[][] buttton; 
    private ArrayList<Integer> array = new ArrayList<Integer>(); 
    /**
     * Constructor for objects of class Blocki
     */
    public Blocks()
    {
        // initialise instance variables
        
    }

    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public JPanel buttons(Color color)
    {
        // put your code here
        JButton[][][] buttons = new JButton[21][][]; 
        
        int i =0; 
        JPanel grid = new JPanel();
        grid.setLayout(new GridLayout(21*5,21*5));
        //grid.setLayout(new FlowLayout());
        //grid.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        //grid.setPreferredSize(new Dimension(300, 300)); 
        
        buttons[i++] = new JButton[5][5]; //i=0
        for(int j = 0 ; j<5; j++) {
            for(int k = 0 ; k<5; k++){
                buttons[0][j][k]= new JButton() ; 
                buttons[0][j][k].setBackground(color); 
                buttons[0][j][k].setVisible(false);
                buttons[0][j][k].setPreferredSize(new Dimension(0,0));
                grid.add(buttons[0][j][k]);
                if(j==0&(k==0|k==1|k==2|k==3|k==4)){
                    buttons[0][j][k].setVisible(true);
                    buttons[0][j][k].setPreferredSize(new Dimension(40,40));
                    //grid.add(buttons[0][j][k]);
                }
            }
        }
        
        buttons[i++] = new JButton[5][5]; //i=1
        for(int j = 0 ; j<5; j++) {
            for(int k = 0 ; k<5; k++){
                buttons[1][j][k]= new JButton() ; 
                buttons[1][j][k].setBackground(color);
                buttons[1][j][k].setPreferredSize(new Dimension(0,0));
                buttons[1][j][k].setVisible(false);
                grid.add(buttons[1][j][k]);
                if((j==0&k==1)|((j==1|j==2)&(k==0|k==1))){
                    buttons[1][j][k].setVisible(true);
                    buttons[1][j][k].setPreferredSize(new Dimension(40,40));
                    //grid.add(buttons[1][j][k]);
                }
            }
        }
        
        buttons[i++] = new JButton[5][5]; //i=2
        for(int j = 0 ; j<5; j++) {
            for(int k = 0 ; k<5; k++){
                buttons[2][j][k]= new JButton() ; 
                buttons[2][j][k].setBackground(color); 
                buttons[2][j][k].setPreferredSize(new Dimension(0,0));
                buttons[2][j][k].setVisible(false);
                grid.add(buttons[2][j][k]);
                if(((j==0|j==2)&(k==0|k==1))|((j==1)&(k==0))){
                    buttons[2][j][k].setVisible(true);
                    buttons[2][j][k].setPreferredSize(new Dimension(40,40));
                    //grid.add(buttons[2][j][k]);
                }
            }
        }
        
        buttons[i++] = new JButton[5][5]; //i=3
        for(int j = 0 ; j<5; j++) {
            for(int k = 0 ; k<5; k++){
                buttons[3][j][k]= new JButton() ; 
                buttons[3][j][k].setBackground(color); 
                buttons[3][j][k].setVisible(false);
                buttons[3][j][k].setPreferredSize(new Dimension(0,0));
                grid.add(buttons[3][j][k]);
                if(((j==0|j==1)&k==2)|(j==2&(k==0|k==1|k==2))){
                    buttons[3][j][k].setVisible(true);
                    buttons[3][j][k].setPreferredSize(new Dimension(40,40));
                    //grid.add(buttons[3][j][k]);
                }
            }
        }
        
        buttons[i++] = new JButton[5][5]; //i=4
        for(int j = 0 ; j<5; j++) {
            for(int k = 0 ; k<5; k++){
                buttons[4][j][k]= new JButton() ; 
                buttons[4][j][k].setBackground(color); 
                buttons[4][j][k].setVisible(false);
                buttons[4][j][k].setPreferredSize(new Dimension(0,0));
                grid.add(buttons[4][j][k]);
                if((j==0&k==1)|(j==1&(k==0|k==1|k==2|k==3))){
                    //grid.add(buttons[4][j][k]);
                    buttons[4][j][k].setVisible(true);
                    buttons[4][j][k].setPreferredSize(new Dimension(40,40));
                }
            }
        }
        
        buttons[i++] = new JButton[5][5]; //i=5
        for(int j = 0 ; j<5; j++) {
            for(int k = 0 ; k<5; k++){
                buttons[5][j][k]= new JButton() ; 
                buttons[5][j][k].setBackground(color); 
                buttons[5][j][k].setVisible(false);
                buttons[5][j][k].setPreferredSize(new Dimension(0,0));
                grid.add(buttons[0][j][k]);
                if((j==0&(k==0|k==1|k==2|k==3))|(j==1&k==3)){
                    //grid.add(buttons[5][j][k]);
                    buttons[5][j][k].setVisible(true);
                    buttons[5][j][k].setPreferredSize(new Dimension(40,40));
                }
            }
        }
        
        buttons[i++] = new JButton[5][5]; //i=6
        for(int j = 0 ; j<5; j++) {
            for(int k = 0 ; k<5; k++){
                buttons[6][j][k]= new JButton() ; 
                buttons[6][j][k].setBackground(color);
                buttons[6][j][k].setPreferredSize(new Dimension(0,0));
                buttons[6][j][k].setVisible(false);
                grid.add(buttons[6][j][k]);
                if((j==1&(k==0|k==1|k==2))|((j==0|j==2)&k==1)){
                    //grid.add(buttons[6][j][k]);
                    buttons[6][j][k].setVisible(true);
                    buttons[6][j][k].setPreferredSize(new Dimension(40,40));
                }
            }
        }
        
        buttons[i++] = new JButton[5][5]; //i=7
        for(int j = 0 ; j<5; j++) {
            for(int k = 0 ; k<5; k++){
                buttons[7][j][k]= new JButton() ; 
                buttons[7][j][k].setBackground(color);
                buttons[7][j][k].setPreferredSize(new Dimension(0,0));
                buttons[7][j][k].setVisible(false);
                grid.add(buttons[0][j][k]);
                if(j==1&(k==0|k==1|k==2)|((j==0|j==2)&(k==2))){
                    //grid.add(buttons[7][j][k]);
                    buttons[7][j][k].setVisible(true);
                    buttons[7][j][k].setPreferredSize(new Dimension(40,40));
                }
            }
        }
        
        buttons[i++] = new JButton[5][5]; //i=8
        for(int j = 0 ; j<5; j++) {
            for(int k = 0 ; k<5; k++){
                buttons[8][j][k]= new JButton() ; 
                buttons[8][j][k].setBackground(color);
                buttons[8][j][k].setPreferredSize(new Dimension(0,0));
                buttons[8][j][k].setVisible(false);
                grid.add(buttons[8][j][k]);
                if(j==0&k==1|(j==1&(k==1|k==2))|(j==2&(k==0|k==1))){
                    //grid.add(buttons[8][j][k]);
                    buttons[8][j][k].setVisible(true);
                    buttons[8][j][k].setPreferredSize(new Dimension(40,40));
                }
            }
        }
        
        buttons[i++] = new JButton[5][5]; //i=9
        for(int j = 0 ; j<5; j++) {
            for(int k = 0 ; k<5; k++){
                buttons[9][j][k]= new JButton() ; 
                buttons[9][j][k].setBackground(color); 
                buttons[9][j][k].setPreferredSize(new Dimension(0,0));
                buttons[9][j][k].setVisible(false);
                grid.add(buttons[9][j][k]);
                if(j==0&(k==1|k==2)|(j==1&k==1)|(j==2&(k==0|k==1))){
                    //grid.add(buttons[9][j][k]);
                    buttons[9][j][k].setVisible(true);
                    buttons[9][j][k].setPreferredSize(new Dimension(0,0));
                }
            }
        }
        
        buttons[i++] = new JButton[5][5]; //i=10
        for(int j = 0 ; j<5; j++) {
            for(int k = 0 ; k<5; k++){
                buttons[10][j][k]= new JButton() ; 
                buttons[10][j][k].setBackground(color); 
                buttons[10][j][k].setPreferredSize(new Dimension(0,0));
                buttons[10][j][k].setVisible(false);
                grid.add(buttons[10][j][k]);
                if((j==2&(k==0|k==1))|((j==0|j==1)&k==1)|(j==3&k==0)){
                    //grid.add(buttons[10][j][k]);
                    buttons[10][j][k].setVisible(true);
                    buttons[10][j][k].setPreferredSize(new Dimension(40,40));
                }
            }
        }
        
        buttons[i++] = new JButton[5][5]; //i=11
        for(int j = 0 ; j<5; j++) {
            for(int k = 0 ; k<5; k++){
                buttons[11][j][k]= new JButton() ; 
                buttons[11][j][k].setBackground(color); 
                buttons[11][j][k].setPreferredSize(new Dimension(0,0));
                buttons[11][j][k].setVisible(false);
                //grid.add(buttons[0][j][k]);
                if((j==0&(k==1|k==2))|(j==1&(k==0|k==1))|(j==2&k==0)){
                    //grid.add(buttons[11][j][k]);
                    buttons[11][j][k].setVisible(true);
                    buttons[11][j][k].setPreferredSize(new Dimension(40,40));
                }
            }
        }
        
        buttons[i++] = new JButton[5][5]; //i=12
        for(int j = 0 ; j<5; j++) {
            for(int k = 0 ; k<5; k++){
                buttons[12][j][k]= new JButton() ; 
                buttons[12][j][k].setBackground(color); 
                buttons[12][j][k].setVisible(false);
                buttons[12][j][k].setPreferredSize(new Dimension(0,0));
                grid.add(buttons[0][j][k]);
                if(j==0&k==1|(j==1&(k==0|k==1))|(j==2&k==0)){
                    //grid.add(buttons[12][j][k]);
                    buttons[12][j][k].setVisible(true);
                    buttons[12][j][k].setPreferredSize(new Dimension(40,40));
                }
            }
        }
        
        buttons[i++] = new JButton[5][5]; //i=13
        for(int j = 0 ; j<5; j++) {
            for(int k = 0 ; k<5; k++){
                buttons[13][j][k]= new JButton() ; 
                buttons[13][j][k].setBackground(color); 
                buttons[13][j][k].setPreferredSize(new Dimension(0,0));
                buttons[13][j][k].setVisible(false);
                grid.add(buttons[13][j][k]);
                if((j==0|j==1)&(k==0|k==1)){
                    //grid.add(buttons[13][j][k]);
                    buttons[13][j][k].setVisible(true);
                    buttons[13][j][k].setPreferredSize(new Dimension(40,40));
                }
            }
        }
        
        buttons[i++] = new JButton[5][5]; //i=14
        for(int j = 0 ; j<5; j++) {
            for(int k = 0 ; k<5; k++){
                buttons[14][j][k]= new JButton() ; 
                buttons[14][j][k].setBackground(color); 
                buttons[14][j][k].setPreferredSize(new Dimension(0,0));
                buttons[14][j][k].setVisible(false);
                grid.add(buttons[14][j][k]);
                if(j==0&k==1|(j==1&(k==0|k==1|k==2))){
                    //grid.add(buttons[14][j][k]);
                    buttons[14][j][k].setVisible(true);
                    buttons[14][j][k].setPreferredSize(new Dimension(40,40));
                }
            }
        }
        
        buttons[i++] = new JButton[5][5]; //i=15
        for(int j = 0 ; j<5; j++) {
            for(int k = 0 ; k<5; k++){
                buttons[15][j][k]= new JButton() ; 
                buttons[15][j][k].setBackground(color);
                buttons[15][j][k].setPreferredSize(new Dimension(0,0));
                buttons[15][j][k].setVisible(false);
                grid.add(buttons[15][j][k]);
                if(j==0&(k==0|k==1|k==2)|(j==1&k==2)){
                    //grid.add(buttons[15][j][k]);
                    buttons[15][j][k].setVisible(true);
                    buttons[15][j][k].setPreferredSize(new Dimension(40,40));
                }
            }
        }
        
        buttons[i++] = new JButton[5][5]; //i=16
        for(int j = 0 ; j<5; j++) {
            for(int k = 0 ; k<5; k++){
                buttons[16][j][k]= new JButton() ; 
                buttons[16][j][k].setBackground(color); 
                buttons[16][j][k].setPreferredSize(new Dimension(0,0));
                buttons[16][j][k].setVisible(false);
                grid.add(buttons[16][j][k]);
                if(j==0&(k==0|k==1|k==2|k==3)){
                    //grid.add(buttons[16][j][k]);
                    buttons[16][j][k].setVisible(true);
                    buttons[16][j][k].setPreferredSize(new Dimension(40,40));
                }
            }
        }
        
        buttons[i++] = new JButton[5][5]; //i=17
        for(int j = 0 ; j<5; j++) {
            for(int k = 0 ; k<5; k++){
                buttons[17][j][k]= new JButton() ; 
                buttons[17][j][k].setBackground(color); 
                buttons[17][j][k].setPreferredSize(new Dimension(0,0));
                buttons[17][j][k].setVisible(false);
                grid.add(buttons[17][j][k]);
                if(j==0&k==1|(j==1&(k==0|k==1))){
                    //grid.add(buttons[17][j][k]);
                    buttons[17][j][k].setVisible(true);
                    buttons[17][j][k].setPreferredSize(new Dimension(40,40));
                }
            }
        }
        
        buttons[i++] = new JButton[5][5]; //i=18
        for(int j = 0 ; j<5; j++) {
            for(int k = 0 ; k<5; k++){
                buttons[18][j][k]= new JButton() ; 
                buttons[18][j][k].setBackground(color); 
                buttons[18][j][k].setPreferredSize(new Dimension(0,0));
                buttons[18][j][k].setVisible(false);
                grid.add(buttons[18][j][k]);
                if(j==0&(k==0|k==1|k==2)){
                    //grid.add(buttons[18][j][k]);
                    buttons[18][j][k].setVisible(true);
                    buttons[18][j][k].setPreferredSize(new Dimension(40,40));
                }
            }
        }
        
        buttons[i++] = new JButton[5][5]; //i=19
        for(int j = 0 ; j<5; j++) {
            for(int k = 0 ; k<5; k++){
                buttons[19][j][k]= new JButton() ; 
                buttons[19][j][k].setBackground(color); 
                buttons[19][j][k].setPreferredSize(new Dimension(0,0));
                buttons[19][j][k].setVisible(false);
                grid.add(buttons[19][j][k]);
                if(j==0&(k==0|k==1)){
                    //grid.add(buttons[19][j][k]);
                    buttons[19][j][k].setVisible(true);
                    buttons[19][j][k].setPreferredSize(new Dimension(40,40));
                }
            }
        }
        
        buttons[i++] = new JButton[5][5]; //i=20
        for(int j = 0 ; j<5; j++) {
            for(int k = 0 ; k<5; k++){
                buttons[20][j][k]= new JButton() ; 
                buttons[20][j][k].setBackground(color); 
                buttons[20][j][k].setPreferredSize(new Dimension(0,0));
                buttons[20][j][k].setVisible(false);
                grid.add(buttons[20][j][k]);
                if(j==0&k==0){
                    //grid.add(buttons[20][j][k]);
                    buttons[20][j][k].setVisible(true);
                    buttons[20][j][k].setPreferredSize(new Dimension(40,40));
                }
            }
        }
        
        return grid;
    }
}
