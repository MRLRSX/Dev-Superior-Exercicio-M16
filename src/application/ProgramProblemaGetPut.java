package application;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;

public class ProgramProblemaGetPut {
	public static void main(String[] args) {
       Locale.setDefault(Locale.US);
       List<Integer> teste01 = Arrays.asList(10, 20, 30);
       List<Double> teste02 = Arrays.asList(10.0, 20.0, 30.5);
       List<Object> teste03 = new ArrayList<Object>();
       copy(teste01, teste03);
       print(teste03);
       copy(teste02, teste03);
       print(teste03);
       
	}
	
	public static void copy(List<? extends Number> source, List<? super Number> destiny) {
		for(Number number : source){
			destiny.add(number);
		}
		 
	}
	public static void print(List<?> lista) {
		for(Object objeto: lista) {
			System.out.print(objeto);
		}
		System.out.println("");
	}
}
