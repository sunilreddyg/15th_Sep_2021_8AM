package mq.java.variables;

public class String_Comparision_Commands {

	public static void main(String[] args) {
		
		/*
		 * string store set of characters. And string
		 * contains set of events to manipulate stored characters
		 */
		
		
		/*
		 * Equals:-->
		 * 		method verify equal comparision between two string
		 * 		and return boolean value true / false.
		 * 		[Equal comparision is casesensitive]
		 */
		String Exp_res="Email sent successfull";
		String Act_res="email sent successfull";
		boolean flag=Exp_res.equals(Act_res);
		System.out.println("String equal comparision status is --> "+flag);
		
		
		/*
		 * Equalignorecase:-->
		 * 			it verify equal comparision between two string 
		 * 			by ignoring case sensitive
		 */
		boolean flag1=Exp_res.equalsIgnoreCase(Act_res);
		System.out.println("Ignore case comparision is --> "+flag1);
		
		
		/*
		 * contains:-->
		 * 			Verify partial sequence characters available at 
		 * 			main string
		 */
		String status="Create 76hjhf98klk  successfull";
		boolean flag2=status.contains("Create");			 //Following Sequence
		boolean flag3=status.contains("Create succesfull");  //Here breaking sequence
		System.out.println("Sub String status availabel "+flag2);
		System.out.println("Sub String status availabel "+flag3);
		
		
		/*
		 * length:-->
		 * 		Method return characters count available at string 
		 * 		with in integer format
		 */
		String mobilenumber="9030248855";
		int count=mobilenumber.length();
		System.out.println("mobile number length is ---> "+count);
		boolean flag4=count==10;
		System.out.println("Is Mobile number in 10 digits ---> "+flag4);
		
		
		/*
		 * substring:-->
		 * 		Method get sub string charcters from main string
		 */
		String AccountNumber="123488881478";
		String Last_digits=AccountNumber.substring(8);
		System.out.println("Account last 4 digits are --> "+Last_digits);
		
		String Middle_digits=AccountNumber.substring(4, 8);
		System.out.println("Account middle 4 digits are --> "+Middle_digits);
		
		
		/*
		 * startswith:-->
		 * 			Method verify given string started with expected characters
		 * 			and return boolean value
		 */
		boolean flag5=AccountNumber.startsWith("1234");
		System.out.println("Starts with Comparision is --> "+flag5);
		
		
		/*
		 * endswith:-->
		 * 			Method verify given string ends with expected characters
		 * 			and return boolean value
		 */
		boolean flag6=AccountNumber.endsWith("1478");
		System.out.println("ends with Comparision is --> "+flag6);
		
		/*
		 * isempty:-->
		 * 		method return characters available status in 
		 * 		boolean format
		 * 		=> Return true when string doesn't have any charactes
		 * 		=> Return false when string has characters
		 */
		String var="";
		String var1="Hello";
		System.out.println("var empty status is ---> "+var.isEmpty());
		System.out.println("Var1 empty statu is ---> "+var1.isEmpty());
		
	
		/*
		 * charsAt:-->
		 * 		Method return single character using index number
		 */
		String browsername="Chrome,Firefox";
		char ch=browsername.charAt(7);
		System.out.println("charcters available at 7th index number ---> "+ch);
		
		/*
		 * replace:-->
		 * 		Replace old characters with New characters 
		 */
		String Rep=browsername.replace('F', 'G');
		System.out.println("After replace character is --> "+Rep);
		System.out.println(browsername.replaceAll("o", "i"));
		
		/*
		 * Concat:-->
		 * 			Add new string to existing charactes
		 */
		String New_browser=browsername.concat(",Safari");
		System.out.println(New_browser);

		/*
		 * tolowercase:-->
		 * 			Convert all uppercase characters in lowercase
		 */
		String toolname="WebDriver";
		System.out.println(toolname.toLowerCase());
		System.out.println(toolname.toUpperCase());
		
		
		/*
		 * trim:--> method trim extra spaces [Only left and Right spaces]
		 */
		String pincode="   500035    ";
		System.out.println("before trim pincode length is --> "+pincode.length());
		String new_pincode=pincode.trim();
		System.out.println("after trim pincode length is --->"+new_pincode.length());
	}

}
