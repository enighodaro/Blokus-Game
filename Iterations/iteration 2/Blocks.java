
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
public class Blocks extends JButton{
    JButton[] block;
    //JButton[][][] button;
    JLabel colour;
    JButton[][] button = new JButton[0][3];
    
    public Blocks() {
        createBlocks();
        
    }
    public void createBlocks(){
        //
        
        int[][][] coord = new int[][][]{ //creates square shapes
            {{0,-2},{0,-1},{0,0},{0,1},{0,2}}, //long backward L
            {{-3,1},{-2,1},{-1,1},{0,1},{0,0}},//sideways long L
            {{0,1},{-1,0},{0,0},{-1,-1},{0,2}},//long Z
            {{0, 0},{1,0},{0,1},{1,1},{1,2}},//
            {{-1,0},{0,0},{1,0},{0,1},{0,-1}},
            {{-1,0},{0,0},{1,0},{1,1},{1,2}},
            {{0,1},{-1,0},{0,0},{-1,-1},{1,1}},
            {{-1,0},{0,0},{0,1},{0,2},{1,2}},
            {{-1,0},{0,0},{1,0},{0,1},{2,0}},
            {{-1,0},{0,0},{0,1},{0,2},{1,1}},
            {{-2,1},{-1,1},{0,1},{0,0},{0,2}},
            {{-1,2},{-1,1},{-1,0},{0,2},{0,0}}, 
            
            {{0,1},{-1,0},{0,0},{-1,-1}},
            {{-1,0},{0,0},{1,0},{0,1}},
            {{0, 0},{1,0},{0,1},{1,1}},
            {{0,-1}, {0,0},{0,1},{0,2}},
            {{-2,1},{-1,1},{0,1},{0,0}},
            
            {{0,-1}, {0,0},{0,1}},
            {{-1,0}, {0,0},{0,1}},
            
            {{0,0},{0,1}},
            
            {{0,0}}
            
        };
    }
    public int[][][] setShape4(){
        final int[][][] coord4 = new int[][][]{ //creates four square shapes
            {{0,1},{-1,0},{0,0},{-1,-1}},
            {{-1,0},{0,0},{1,0},{0,1}},
            {{0, 0},{1,0},{0,1},{1,1}},
            {{0,-1}, {0,0},{0,1},{0,2}},
            {{-2,1},{-1,1},{0,1},{0,0}}
            
        };
        return coord4;
    }
    
    public int[][][]setShape5(){
        final int[][][] coord5 = new int[][][]{ //creates five square shapes
            {{0,-2},{0,-1},{0,0},{0,1},{0,2}},
            {{-3,1},{-2,1},{-1,1},{0,1},{0,0}},
            {{0,1},{-1,0},{0,0},{-1,-1},{0,2}},
            {{0, 0},{1,0},{0,1},{1,1},{1,2}},
            {{-1,0},{0,0},{1,0},{0,1},{0,-1}},
            {{-1,0},{0,0},{1,0},{1,1},{1,2}},
            {{0,1},{-1,0},{0,0},{-1,-1},{1,1}},
            {{-1,0},{0,0},{0,1},{0,2},{1,2}},
            {{-1,0},{0,0},{1,0},{0,1},{2,0}},
            {{-1,0},{0,0},{0,1},{0,2},{1,1}},
            {{-2,1},{-1,1},{0,1},{0,0},{0,2}},
            {{-1,2},{-1,1},{-1,0},{0,2},{0,0}}
            
        };
        return coord5;
    }
    
    public int[][][] setShape3(){
        int[][][] coord3 = new int[][][]{ //creates three square shapes
            {{0,-1}, {0,0},{0,1}},
            {{-1,0}, {0,0},{0,1}}
            
        };
        return coord3;
    }
    public int[][] setShape2(){
        int[][] coord2 = new int[][]{ //creates two square shapes
            {0,0},{0,1}
        };
        return coord2;
    }
    public int[] setShape1(){
        final int[] coord1 = new int[]{0,0}; //creates one square shapes 
        return coord1; 
  
    }
    
}
