package test;

import java.util.Scanner;

import org.testng.annotations.Test;

public class Calculator {

		Scanner n = new Scanner(System.in);
         @Test(groups="addition")
		public void addition() {
			int sum = 0, no_of_values, values_to_add;
			System.out.println("enter the value");
			no_of_values = n.nextInt();
			for (int i = 0; i < no_of_values; i++) {
				values_to_add = n.nextInt();
				sum = sum + values_to_add;
			}
			System.out.println(sum);
		}
        @Test(groups="subtraction")
		public void subtraction() {
			int diff = 0,no_of_values, values_to_subtract;
			System.out.println("enter the value");
			no_of_values = n.nextInt();
			for (int i = 0; i < no_of_values; i++) {
				values_to_subtract = n.nextInt();
				diff = values_to_subtract-diff;
			}
			System.out.println(diff);
		}
         @Test(groups="multiplication")
		public void multiplication() {
			int mul = 1, no_of_values, values_to_multiply;
			System.out.println("enter the value");
			no_of_values = n.nextInt();
			for (int index = 0; index < no_of_values; index++) {
				values_to_multiply = n.nextInt();
				mul = mul * values_to_multiply;
			}
			System.out.println(mul);
		}
         @Test(groups="division")
		public void division() {
			int div = 100,  no_of_values, values_to_divide;
			System.out.println("enter the value");
			no_of_values= n.nextInt();
			for (int index = 0; index < no_of_values; index++) {
				values_to_divide = n.nextInt();
				div = div / values_to_divide;
			}
			System.out.println(div);
		}
	}
