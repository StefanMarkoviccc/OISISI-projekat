import java.awt.event.KeyEvent;

import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.KeyStroke;

public class MenuBar extends JMenuBar {
	
	private JMenu file;
	private JMenu edit;
	private JMenu help;
	
	public MenuBar()
	{
		file = new JMenu("File");
		edit = new JMenu("Edit");
		help = new JMenu("Help");
		JMenuItem newItem = new JMenuItem(new DodajEntitetProzorKontroler());
		JMenuItem closeItem = new JMenuItem("Close");
		JMenuItem editItem = new JMenuItem("Edit");
		JMenuItem deleteItem = new JMenuItem("Delete");
		JMenuItem helpItem = new JMenuItem("Help");
		JMenuItem aboutItem = new JMenuItem(new AboutControler());
		
		//mneumonici
		newItem.setMnemonic(KeyEvent.VK_N);
		closeItem.setMnemonic(KeyEvent.VK_C);
		editItem.setMnemonic(KeyEvent.VK_E);
		deleteItem.setMnemonic(KeyEvent.VK_D);
		helpItem.setMnemonic(KeyEvent.VK_A);
		
		//akceleratori
		newItem.setAccelerator(KeyStroke.getKeyStroke(
			    KeyEvent.VK_N, KeyEvent.CTRL_DOWN_MASK));
		
		closeItem.setAccelerator(KeyStroke.getKeyStroke(
			    KeyEvent.VK_C, KeyEvent.CTRL_DOWN_MASK));
		
		editItem.setAccelerator(KeyStroke.getKeyStroke(
			    KeyEvent.VK_E, KeyEvent.CTRL_DOWN_MASK));
		
		deleteItem.setAccelerator(KeyStroke.getKeyStroke(
			    KeyEvent.VK_D, KeyEvent.CTRL_DOWN_MASK));
		
		helpItem.setAccelerator(KeyStroke.getKeyStroke(
			    KeyEvent.VK_H, KeyEvent.CTRL_DOWN_MASK));
		
		
		aboutItem.setAccelerator(KeyStroke.getKeyStroke(
			    KeyEvent.VK_A, KeyEvent.CTRL_DOWN_MASK));
		
		file.add(newItem);
		file.add(closeItem);
		edit.add(editItem);
		edit.add(deleteItem);
		help.add(helpItem);
		help.add(aboutItem);
		
		add(file);
		add(edit);
		add(help);
		
	}
	
	

}
