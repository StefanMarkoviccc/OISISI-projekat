package View;

import java.awt.event.KeyEvent;
import java.security.KeyStore;

import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.KeyStroke;

import Controllers.AboutController;
import Controllers.CloseController;
import Controllers.DeleteEntityController;
import Controllers.EditEntityControler;
import Controllers.HelpController;
import Controllers.NewEntityController;

public class MenuBar extends JMenuBar {
	
	private JMenu file;
	private JMenu edit;
	private JMenu help;
	
	public MenuBar()
	{
		file = new JMenu("File");
		edit = new JMenu("Edit");
		help = new JMenu(new HelpController());
		help.setText("Help");
		JMenuItem newItem = new JMenuItem(new NewEntityController());
		JMenuItem closeItem = new JMenuItem(new CloseController());
		JMenuItem editItem = new JMenuItem(new EditEntityControler());
		JMenuItem deleteItem = new JMenuItem(new DeleteEntityController());
		JMenuItem helpItem = new JMenuItem(new HelpController());
		JMenuItem aboutItem = new JMenuItem(new AboutController());
		
		newItem.setText("New");
			KeyStroke keyStrokeOtvori = KeyStroke.getKeyStroke(KeyEvent.VK_N, KeyEvent.CTRL_DOWN_MASK);
			newItem.setAccelerator(keyStrokeOtvori);
		
		closeItem.setText("Close");
			KeyStroke keyStrokeZatvori = KeyStroke.getKeyStroke(KeyEvent.VK_C, KeyEvent.CTRL_DOWN_MASK);
			closeItem.setAccelerator(keyStrokeZatvori);
		
		file.add(newItem);
		file.add(closeItem);
		
		editItem.setText("Edit");
		KeyStroke keyStrokeEdit = KeyStroke.getKeyStroke(KeyEvent.VK_E,KeyEvent.CTRL_DOWN_MASK);
		editItem.setAccelerator(keyStrokeEdit);
		
		deleteItem.setText("Delete");
		KeyStroke keyStrokeDelete = KeyStroke.getKeyStroke(KeyEvent.VK_D,KeyEvent.CTRL_DOWN_MASK);
		deleteItem.setAccelerator(keyStrokeDelete);
		
		edit.add(editItem);
		edit.add(deleteItem);
		
		helpItem.setText("Help");
		KeyStroke keyStrokeHelp = KeyStroke.getKeyStroke(KeyEvent.VK_H,KeyEvent.CTRL_DOWN_MASK);
		helpItem.setAccelerator(keyStrokeHelp);
		
		aboutItem.setText("About");
		KeyStroke keyStrokeAbout = KeyStroke.getKeyStroke(KeyEvent.VK_A,KeyEvent.CTRL_DOWN_MASK);
		aboutItem.setAccelerator(keyStrokeAbout);
		
		help.add(helpItem);
		help.add(aboutItem);
		
		newItem.setMnemonic(KeyEvent.VK_N);
		closeItem.setMnemonic(KeyEvent.VK_C);
		editItem.setMnemonic(KeyEvent.VK_E);
		deleteItem.setMnemonic(KeyEvent.VK_D);
		helpItem.setMnemonic(KeyEvent.VK_H);
		aboutItem.setMnemonic(KeyEvent.VK_A);
		
		
		add(file);
		add(edit);
		add(help);
		
	}
	
	

}
