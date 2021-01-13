package View;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import Controllers.ButtonSearchController;
import Controllers.DeleteEntityController;
import Controllers.EditEntityControler;
import Controllers.NewEntityController;



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
		
		btnAdd = new JButton(new NewEntityController());
		btnAdd.setText("+");
		btnEdit = new JButton(new EditEntityControler());
		btnDelete = new JButton(new DeleteEntityController());
		btnSearch = new JButton(new ButtonSearchController());
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

	public JButton getBtnAdd() {
		return btnAdd;
	}

	public void setBtnAdd(JButton btnAdd) {
		this.btnAdd = btnAdd;
	}

	public JButton getBtnEdit() {
		return btnEdit;
	}

	public void setBtnEdit(JButton btnEdit) {
		this.btnEdit = btnEdit;
	}

	public JButton getBtnDelete() {
		return btnDelete;
	}

	public void setBtnDelete(JButton btnDelete) {
		this.btnDelete = btnDelete;
	}

	public JButton getBtnSearch() {
		return btnSearch;
	}

	public void setBtnSearch(JButton btnSearch) {
		this.btnSearch = btnSearch;
	}

	public JTextField getTxtSearch() {
		return txtSearch;
	}

	public void setTxtSearch(JTextField txtSearch) {
		this.txtSearch = txtSearch;
	}
	
	

}
