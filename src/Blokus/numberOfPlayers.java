package Blokus;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class numberOfPlayers extends JFrame{

        private JPanel tPanel, tPanel2;
        private JLabel topLabel;
        private JButton b1,b2,b3,b4;
        private ButtonGroup btnGroup;
	
        public numberOfPlayers()
	{
	    tPanel=new JPanel();
	    tPanel2=new JPanel();
	    tPanel2.setLayout((new FlowLayout())); 
	    tPanel.setLayout((new GridLayout(2,2)));
	    topLabel=new JLabel("Choose The Number of Players ");
            b1=new JButton("1 PLAYER");
            b2=new JButton("2 PLAYER");
            b3=new JButton("3 PLAYER");
            b4=new JButton("4 PLAYER");
            
            btnGroup=new ButtonGroup();
            btnGroup.add(b1);
            btnGroup.add(b2);
            btnGroup.add(b3);
            btnGroup.add(b4);
        tPanel2.add(topLabel);
        tPanel.add(b1);
        tPanel.add(b2);
        tPanel.add(b3);
        tPanel.add(b4);
        
        
        b1.addActionListener(event->{
        	setVisible(false);
        	new Difficulty();});
        b2.addActionListener(event->{
        	setVisible(false);
        	new Difficulty();});
        b3.addActionListener(event->{
        	setVisible(false);
        	new Difficulty();});
        b4.addActionListener(event->{
        	setVisible(false);
        	new SpecialReq();});
        
        
        getContentPane().setLayout(new BorderLayout());
        getContentPane().add(tPanel2, BorderLayout.NORTH);
        getContentPane().add(tPanel, BorderLayout.CENTER);
        
        setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE);
        
        pack();
        setLocationRelativeTo(null);
	setResizable( true);
	setSize(400,400);
	setVisible( true);
	

}

}
