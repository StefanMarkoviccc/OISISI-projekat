package View;
import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JTextField;

import Kontroleri.DodajEntitetProzorKontroler;

public class ToolBar extends JPanel {
	
	private JButton btnDodaj;
	private JButton btnEdit;
	private JButton btnIzbrisi;
	private JButton btnPretrazi;
	private JTextField txtPretrazi;
	
	ToolBar()
	{
		setLayout(new BorderLayout());
		JPanel left = new JPanel();
		JPanel right = new JPanel();
		
		left.setLayout(new FlowLayout(FlowLayout.LEFT));
		left.setLayout(new FlowLayout(FlowLayout.RIGHT));
		
		btnDodaj = new JButton(new DodajEntitetProzorKontroler());
		btnEdit = new JButton("Edit");
		btnIzbrisi = new JButton("Delete");
		btnPretrazi = new JButton("Search");
		txtPretrazi = new JTextField();
		txtPretrazi.setPreferredSize(new Dimension(200,25));
		
		right.add(txtPretrazi);
		right.add(btnPretrazi);
		left.add(btnDodaj);
		left.add(btnEdit);
		left.add(btnIzbrisi);
		
		add(right,BorderLayout.EAST);
		add(left,BorderLayout.WEST);
	}
	

}
