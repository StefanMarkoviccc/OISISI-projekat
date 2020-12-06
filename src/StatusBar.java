import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.time.LocalDateTime;

import javax.swing.Timer;

import javax.swing.JLabel;
import javax.swing.JPanel;

public class StatusBar extends JPanel {
	
	private JLabel studentskaSluzba;
	private JLabel date;
	
	public StatusBar() 
	{
		setLayout(new BorderLayout());
		JLabel studentskaSluzba = new JLabel("Studetska sluzba");
		JLabel date = new JLabel();
		JPanel left = new JPanel();
		JPanel right = new JPanel();
		left.setLayout(new FlowLayout(FlowLayout.LEFT));
		right.setLayout(new FlowLayout(FlowLayout.RIGHT));
		
		Timer timer = new Timer(1000,new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e)
			{
				
				LocalDateTime ldt= LocalDateTime.now();
				String txt=ldt.toString();
				date.setText(txt);
			}
			
		});
		
		timer.start();
		
		left.add(studentskaSluzba);
		right.add(date);
		add(left,BorderLayout.WEST);
		add(right,BorderLayout.EAST);
		
		
	}
	
}
