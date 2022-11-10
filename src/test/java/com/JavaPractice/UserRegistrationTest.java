package com.JavaPractice;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;

public class UserRegistrationTest {

	@AfterAll
	static void displayMethod(){
		System.out.println("Welcome to the Mood Analyzer program");
	} 

	@AfterEach
	public void afterDisplayMethod(){
		System.out.println("test is passed");
	}  

}
