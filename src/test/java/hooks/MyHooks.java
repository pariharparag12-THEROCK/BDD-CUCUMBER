package hooks;

import io.cucumber.java.After;
import io.cucumber.java.AfterAll;
import io.cucumber.java.Before;
import io.cucumber.java.BeforeAll;
import io.cucumber.java.BeforeStep;
import io.cucumber.java.AfterStep;


public class MyHooks {

	/*
			@Before (order = -1)
			public void beforeHook1() {
				System.out.println("Before hook1 is executing");
			}
			
			
			@Before (order = 0)
			public void beforeHook2() {
				System.out.println("Before hook2 is executing");
			}
			
			
			@After (order = 1000)
			public void afterHook1() {
				System.out.println("After hook1 is executing");
			}
			
			
			@After (order = 2)
			public void afterHook2() {
				System.out.println("After hook2 is executing");
			}
			
			
			@BeforeStep (order = 1)
			public void beforeStep() {
				System.out.println("Before Step");
			}
			
			@AfterStep (order = 2)
			public void afterStep() {
				System.out.println("After Step");
			}
			
			
			// Method should be static in @BeforeAll and @AfterAllc //
			
			@BeforeAll (order = 1)  
			public static void beforeAll1() {
				System.out.println("Before ALL1 is executing");
			}
			
			@BeforeAll (order = 2)
			public static void beforeAll2() {
				System.out.println("Before ALL2 is executing");
		}
			
			
			@AfterAll (order = 1)
			public static void afterAll1() {
				System.out.println("After ALL1 is executing");
			}
					
			@AfterAll (order = 2)
			public static void afterAll2() {
				System.out.println("After ALL2 is executing");
		}
			
			
			
			*/
	
	
	/*@Before("@sanity or @regression")
	public void beforeHook() {
		System.out.println("Before hook is executing");
	}
	
	@After("@regression")
	public void afterHook() {
		System.out.println("After hook is executing");
	}
	*/
	
	
	
	@BeforeStep("@sanity")
	public void beforeStep() {
		System.out.println("Before Step is executing");
	}
	
	
	@AfterStep("@regression")
	public void AfterStep() {
		System.out.println("After Step is executing");
	}
	
	
}
