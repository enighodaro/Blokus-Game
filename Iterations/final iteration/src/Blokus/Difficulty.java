package Blokus;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Difficulty extends JFrame{

        private JPanel tPanel;
        private JLabel topLabel;
        private JButton b1,b2,b3;
        private ButtonGroup btnGroup;
    
        public Difficulty()
    {
        tPanel=new JPanel();
        tPanel.setLayout(new FlowLayout());
        topLabel=new JLabel("CHOOSE LEVEL OF DIFFICULTY ");
            b1=new JButton("EASY");
            b2=new JButton("MEDIUM");
            b3=new JButton("HARD");
            
            
            btnGroup=new ButtonGroup();
            btnGroup.add(b1);
            btnGroup.add(b2);
            btnGroup.add(b3);
            
            tPanel.add(topLabel);
            tPanel.add(b1);
        tPanel.add(b2);
        tPanel.add(b3);
        
        
        
        b1.addActionListener(event->{
            setVisible(false);
            new SpecialReq();});
        b2.addActionListener(event->{
            setVisible(false);
            new SpecialReq();});
        b3.addActionListener(event->{
            setVisible(false);
            new SpecialReq();});
       
        
        
        getContentPane().setLayout(new BorderLayout());
        getContentPane().add(tPanel, BorderLayout.CENTER);
        
        setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE);
        
        pack();
        setLocationRelativeTo(null);
    setResizable( true);
    setSize(500,150);
    setVisible( true);
    



}


}
