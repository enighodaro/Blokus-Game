package Blokus;

import java.awt.GridLayout;

import javax.swing.*;


public class SpecialReq extends JFrame {

	private JButton b1,b2;
	private JLabel lbl1;
	
	public SpecialReq()
	{
		super("Blokus");
		setLayout((new GridLayout(2,1)));
		b1=new JButton("REGULAR MODE");
		b2=new JButton("VISION IMPAIRED MODE");
		add(b1);
		add(b2);
		
		b1.addActionListener(event->{
		    setVisible(false);
			new Blokus();});
		b2.addActionListener(event->{
			setVisible(false);
			new Blokus();});
		
		setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE);
        
        pack();
        setLocationRelativeTo(null);
        setResizable( true);
        setSize(400,250);
        setVisible( true);
	
		
	}
}
