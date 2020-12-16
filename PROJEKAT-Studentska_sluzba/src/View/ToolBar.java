package View;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;



public class ToolBar extends JPanel {
	
	private JButton btnAdd;
	private JButton btnEdit;
	private JButton btnDelete;
	private JButton btnSearch;
	private JTextField txtSearch;
	
	ToolBar()
	{
		setLayout(new BorderLayout());
		
		JPanel ToolBar = new JPanel();
		JPanel left = new JPanel();
		JPanel right = new JPanel();
		
		left.setLayout(new FlowLayout(FlowLayout.LEFT));
		right.setLayout(new FlowLayout(FlowLayout.RIGHT));
		
		btnAdd = new JButton("Add");
		btnAdd.setText("+");
		btnEdit = new JButton("Edit");
		btnDelete = new JButton("Delete");
		btnSearch = new JButton("Search");
		txtSearch = new JTextField();
		txtSearch.setPreferredSize(new Dimension(200,28));
		
		left.add(btnAdd);
		left.add(btnEdit);
		left.add(btnDelete);
		right.add(txtSearch);
		right.add(btnSearch);
		
		add(left,BorderLayout.WEST);
		add(right,BorderLayout.EAST);
		
		
		
	}
	
	

}
