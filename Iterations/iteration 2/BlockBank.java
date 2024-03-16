
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

import java.util.*; 
/**
 * Write a description of class BlockBank here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class BlockBank extends JPanel 
{
    // instance variables - replace the example below with your own
    //private Blocks block = new Blocks(); 
    private JFrame frame; 
    
    /**
     * Constructor for objects of class BlockBank
     */
    public BlockBank() 
    {
        // initialise instance variables
        super();
        
    }
    
    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public void addBlocks()
    {
        // put your code here
        frame = new JFrame("Blokus pieces");
        JLabel welcome= new JLabel("WELCOME TO WORLD OF CHOMP...");
        super.add(welcome, BorderLayout.NORTH); 
        new Blocks();
        
    }
}
