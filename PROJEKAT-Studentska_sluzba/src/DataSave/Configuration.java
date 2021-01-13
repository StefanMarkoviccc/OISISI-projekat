package DataSave;

import java.io.File;
import java.nio.file.Path;
import java.nio.file.Paths;

import javax.swing.Icon;
import javax.swing.ImageIcon;

public class Configuration
{
	private static Path relativePath=Paths.get("");
	public static String resourcesPath=relativePath.toAbsolutePath().toString()+"/resources/";
	
	
	private static Path currentRelativePath= Paths.get("");

	
	public static Icon addIcon=  new ImageIcon(currentRelativePath.toAbsolutePath().toString()+"/slike/add.png");
	public static Icon editIcon=  new ImageIcon(currentRelativePath.toAbsolutePath().toString()+"/slike/edit.png");
	public static Icon deleteIcon=  new ImageIcon(currentRelativePath.toAbsolutePath().toString()+"/slike/bin.png");

	public static Icon pretragaIcon= new ImageIcon(currentRelativePath.toAbsolutePath().toString()+"/slike/pretraga.png");

	public static Icon closeIcon=  new ImageIcon(currentRelativePath.toAbsolutePath().toString()+"/slike/close1_3_13.png");

	
	

}
