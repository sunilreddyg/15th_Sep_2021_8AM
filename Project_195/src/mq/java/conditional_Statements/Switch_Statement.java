package mq.java.conditional_Statements;

public class Switch_Statement {

	public static void main(String[] args)
	{
		
		/*
		 * => It is a multi decision statement
		 * => It work similar as else-if statement only difference
		 * 		it switch to required case instead of checking
		 * 		each statement.
		 */
		
		String month="mar";
		switch (month) 
		{
		case "jan":
			System.out.println("10 % Discount");
			break;
			
		case "feb":
			System.out.println("20 % Discount");
			break;
			
		case "mar":
			System.out.println("30 % Discount");
			break;
			
		case "apr":
			System.out.println("40 % Discount");
			break;

		default:System.out.println("Month name mismatch or not selected");
			break;
		}
		
		
		
		
		

	}

}
