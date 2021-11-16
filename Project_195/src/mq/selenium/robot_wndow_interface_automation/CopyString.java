package robot_wndow_interface_automation;

import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

public class CopyString {

	public static void main(String[] args) throws Exception 
	{
		
		//Opening notepad file at runtime
		Runtime.getRuntime().exec("notepad.exe");
		Thread.sleep(5000);
		
		//Crate objet for Robot
		Robot robot=new Robot();
		robot.setAutoDelay(300);
		
		
		String text="Plan your next trip with confidence - "
				+ "get the latest entry requirements and quarantine info.";
		
		
		StringSelection stext=new StringSelection(text);
		Clipboard clipboard=Toolkit.getDefaultToolkit().getSystemClipboard();
		clipboard.setContents(stext, stext);
		
		//Press Control+V Shortcut at Computer
		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_V);

		//Release Down Keys
		 robot.keyRelease(KeyEvent.VK_CONTROL);
	}

}
