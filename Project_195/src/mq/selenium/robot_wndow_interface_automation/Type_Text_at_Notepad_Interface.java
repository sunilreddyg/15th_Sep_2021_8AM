package robot_wndow_interface_automation;

import java.awt.Robot;
import java.awt.event.KeyEvent;

public class Type_Text_at_Notepad_Interface {

	public static void main(String[] args) throws Exception
	{
		//Opening notepad file at runtime
		Runtime.getRuntime().exec("notepad.exe");
		Thread.sleep(5000);
		
		//Crate objet for Robot
		Robot robot=new Robot();
		robot.setAutoDelay(300);
		
		//Type text at notepad  "welcome to mindq"
		
		robot.keyPress(KeyEvent.VK_W);
		robot.keyPress(KeyEvent.VK_E);
		robot.keyPress(KeyEvent.VK_L);
		robot.keyPress(KeyEvent.VK_C);
		robot.keyPress(KeyEvent.VK_O);
		robot.keyPress(KeyEvent.VK_M);
		robot.keyPress(KeyEvent.VK_E);
		
		
	}

}
