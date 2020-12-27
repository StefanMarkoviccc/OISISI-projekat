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
		JMenuItem aboutItem = new JMenuItem("About");
		
		newItem.setMnemonic(KeyEvent.VK_N);
		closeItem.setMnemonic(KeyEvent.VK_C);
		editItem.setMnemonic(KeyEvent.VK_E);
		deleteItem.setMnemonic(KeyEvent.VK_D);
		helpItem.setMnemonic(KeyEvent.VK_A);
		
		
		
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
