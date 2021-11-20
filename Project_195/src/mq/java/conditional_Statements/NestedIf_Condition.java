package mq.java.conditional_Statements;

public class NestedIf_Condition {

	public static void main(String[] args) 
	{
		
		
		
		int Age=14;
		boolean goodhealth=true;
		
		if(Age > 1)
		{
			
			//nested Condition
			if(goodhealth==false)
			{
				System.out.println("Insureance Accepted with Conditions");
			}
			else
			{
				System.out.println("Insurance Accepted");
			}
		}
		else
		{
			System.out.println("Insurance Rejected");
		}

	}

}
