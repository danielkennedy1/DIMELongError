package info.scce.dime.app.demo;

import java.util.ArrayList;
import java.util.List;

/**
 * Collection of static methods for native SIBs
 */
public class Native {
	
	public static void sayHello(String name) {
		System.out.println("---------------------");
		System.out.println("  Hello " + name + "!");
		System.out.println("---------------------");
	}
	
	public static List<Integer> getIntegerList(){
		System.out.println("getIntegerList called");
		ArrayList<Integer> result = new ArrayList<Integer>();
		for(int i = 0; i<10; i++) result.add(i); 
		return result;
	}
	
	public static void printInteger(Integer input) {
		System.out.println(input + "");
	}
}