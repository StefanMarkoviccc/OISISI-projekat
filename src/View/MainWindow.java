package View;

import java.awt.BorderLayout;
import java.awt.Dimension;

import javax.swing.JFrame;

import ModelP.Model;
import ReaderWriter.RideWrt;

public class MainWindow extends JFrame {
	
	private Model model;
	private StatusBar status;
	private ToolBar tool;
	private WorkSpace workSpace;
	private static MainWindow instance;

	public static MainWindow getInstance() 
	{
		if(instance==null) 
		{
			instance=new MainWindow();
		}
		return instance;
	}
	
	public MainWindow()
	{
		setPreferredSize(new Dimension(500, 500));
		pack();
		setJMenuBar(new MenuBar());
		setLayout(new BorderLayout());
		model = new Model();
		status = new StatusBar();
		tool = new ToolBar();
		add(tool,BorderLayout.NORTH);
		add(status,BorderLayout.SOUTH);
		workSpace = new WorkSpace();
		add(workSpace,BorderLayout.CENTER);
		RideWrt.readFile("C:\\Users\\Markoviccc\\Desktop\\ProjekatOISISI\\src\\Data\\data.ss");
		
		
	}

	public Model getModel() {
		return model;
	}

	public void setModel(Model model) {
		this.model = model;
	}

	public StatusBar getStatus() {
		return status;
	}

	public void setStatus(StatusBar status) {
		this.status = status;
	}

	public ToolBar getTool() {
		return tool;
	}

	public void setTool(ToolBar tool) {
		this.tool = tool;
	}

	public WorkSpace getWorkSpace() {
		return workSpace;
	}

	public void setWorkSpace(WorkSpace workSpace) {
		this.workSpace = workSpace;
	}

	
	
	
}
