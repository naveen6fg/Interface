package interfaces;

import java.io.BufferedReader;
import java.io.InputStreamReader;

interface SIM
{
	public String sendSMS(String msg,long mobNo);
	public String dialCall(long mobNo );
}

class Airtel implements SIM
{
	public String sendSMS(String msg,long mobNo)
	{
		return "Airtel :You message sent successfull";
	}
	public String dialCall(long mobNo )
	{
		return "Airtel : This no u're dailing is busy, please dail after sometime";
	}
}

class Vodafone implements SIM
{
	public String sendSMS(String msg,long mobNo)
	{
		return "Vodafone :You message sent successfull";
	}
	public String dialCall(long mobNo )
	{
		return "Vodafone : This no u're dailing is out of reach, please dail after sometime";
	}
}

class jio implements SIM
{
	public String sendSMS(String msg,long mobNo)
	{
		return "jio :You message sent successfull";
	}
	public String dialCall(long mobNo )
	{
		return "jio : This no u're dailing is switched of, please dail after sometime";
	}
}

class Mobile
{
	private SIM sim;
	public void insertSIM(String simName) throws Exception
	{
		Class simClass= Class.forName(simName);
		Object simObject= simClass.newInstance();
		
		if(simObject instanceof SIM)
		{
			sim= (SIM)simObject;
		}
		else 
		{
			throw new Exception("Invalid SIM");
		}
	}
	public String sendSMS(String msg,long mobNo)
	{
		return sim.sendSMS(msg, mobNo);
	}
	public String dialCall(long mobNo )
	{
		return sim.dialCall(mobNo);
	}
}

public class MobileUser
{
  public static void main(String[] args) throws Exception
  {
	 Mobile iphone=new Mobile();
	 BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
	 
	 System.out.println("Insert SIM");
	 String simName  =br.readLine();
	 
	 iphone.insertSIM(simName);
	 
	 System.out.println();
	 System.out.println("Type 1 and press <Enter> Key to send message:");
	 System.out.println("Type 2 and press <Enter> Key to make call:\n");
	 
	 System.out.println("Enter option");
	 String option = br.readLine();
	 
	 String resp;
	 if(option.contains("1"))
	 {
		 System.out.println("Type message and press <enter> key");
		 String msg =br.readLine();
		
		 System.out.println("Type message and press <enter> key");
		 String mobNo =br.readLine();
		 
		 //resp= micromax.sendSMS(msg,Long.parseLong(mobNo));
		// System.out.println(resp);
		 
		 
	 }
	 else if(option.contains("2"))
	 {
		 System.out.println("Type message and press <enter> key");
		 String mobNo =br.readLine();
		 
		// resp= micromax.sendSMS(msg,Long.parseLong(mobNo));
		 //System.out.println(resp);
	 }
	 else 
	 {
	    System.out.println("Invalid option");		 
	 } 
	 
  }
}
