package com.crm.sample_Contact;

import org.testng.annotations.Test;

public class ContactTest {
	@Test (groups="ST") 
	public void createcontactTest()
	{
		String Browser = System.getProperty("browser");
		String URL = System.getProperty("url");
		String UN = System.getProperty("username");
		String PW = System.getProperty("password");
		
		System.out.println(Browser+ "\t"+URL+"\t"+UN+"\t"+PW+"\t");
		System.out.println("execute createContactTest");
	}
	
	@Test  (groups="RT")
	public void modifycontactTest()
	{
		System.out.println("Excecute modifyContactTest");
	}
	
	@Test  (groups="RT")
	public void deletecontactTest()
	{
		System.out.println("Excecute deleteContactTest");
	}
}
