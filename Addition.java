package test;

import java.util.Scanner;

import org.testng.annotations.Test;

public class Addition {
	@Test(priority=1,groups="add")
	public void addition1() {
		int a,b,c;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the values of a and b");
		a=sc.nextInt();
		b=sc.nextInt();
		c=a+b;
		System.out.println(c);
	}
	@Test(priority=2,groups="minus")
	public void subtraction1() {
		int a,b,c;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the values of a and b");
		a=sc.nextInt();
		b=sc.nextInt();
		c=a-b;
		System.out.println(c);
	}
	@Test(priority=3,groups="multiply")
	public void multiplication1() {
		int a,b,c;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the values of a and b");
		a=sc.nextInt();
		b=sc.nextInt();
		c=a*b;
		System.out.println(c);
	}
	@Test(priority=4,groups="divide")
	public void division1() {
		int a,b,c;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the values of a and b");
		a=sc.nextInt();
		b=sc.nextInt();
		c=a/b;
		System.out.println(c);

}
}
