package com.jvm.demos.methodbinding;

public class Editor extends Staff {
	public void printUserType() {
	  System.out.println("Editor");
	}
	
	public void approveReview() {
		System.out.println("Editor: approveReview");
	}
}
