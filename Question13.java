package week4.day1;

import org.testng.annotations.Test;

public class Question13 {

		@Test (priority=0)
		public void testCase11() { 
		System.out.println("Test Case 1");
		}
		
		@Test (priority=1)
		public void testCase2() { 
		System.out.println("Test Case 2");
		}
		
		@Test (priority=-1)
		public void testCase1() { 
		System.out.println("Test Case 3");
		}


	}

