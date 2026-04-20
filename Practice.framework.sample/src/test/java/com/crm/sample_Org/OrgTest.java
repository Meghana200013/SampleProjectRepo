package com.crm.sample_Org;

import org.testng.annotations.Test;

public class OrgTest {
	
	
		@Test (groups="ST") 
		public void createOrgTest()
		{
			System.out.println("excecute org test");
		}
		
		
			@Test (groups="RRT") 
			public void modifyOrgTest()
			{
				System.out.println("Excecute modify org test");
			}

}
