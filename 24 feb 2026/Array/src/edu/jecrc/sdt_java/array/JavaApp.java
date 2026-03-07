package edu.jecrc.sdt_java.array;
import java.util.Scanner;
public class JavaApp {
	public static void execution() {
		/*int[] array;
		array = new int[5];
		System.out.println(array);
		System.out.println(array.length);
		int data =1 ;
		for(int i=0 ; i < array.length ; i++) {
			array[i] =  data;
			data++;
		}
		for(int i : array) {
			System.out.println(i);
		}*/
		
		Scanner s = new Scanner(System.in);
		System.out.print("Enter the size of 1 d iint array:");
		int size = s.nextInt();
		int[] array;
		array = new int[size];
		System.out.println(array);
		System.out.println(array.length);
		for(int i=0 ; i < array.length ; i++) {
			System.out.print("Enter data: ");
			array[i] = s.nextInt();
		}
		for(int i : array) {
			System.out.println(i);
		}
		s.close();
	}
}
