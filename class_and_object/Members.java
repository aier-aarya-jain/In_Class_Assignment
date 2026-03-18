package edu.jecrc.sdt_java.oops.class_and_object;

public class Members {
	public static int sv;
	public static void sm() {
		System.out.println("static sm()");
	}
	static {
		System.out.println("Static block");
	}
	public String nsv;
	public void nsm() {
		System.out.println("Non static nsm()");
	}
	
	{
		System.out.println("Non static block");
	}
}
