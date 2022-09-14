package application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

import model.Product;
import model.services.CalculationService;

public class Program {
	public static void main(String[] args) {
      Locale.setDefault(Locale.US);
    
      String path = "C:\\Curso Java\\Codigo Projeto\\Generics02\\src\\ArquivoTeste\\produtos.txt";
      List<Product> lista = new ArrayList<>();
      
      try(BufferedReader bufferedReader = new BufferedReader(new FileReader(path))){
    	  String line = bufferedReader.readLine();
			
    	  while (line != null) {
				String[] fields = line.split(",");
				lista.add(new Product(fields[0], Double.parseDouble(fields[1])));
				line = bufferedReader.readLine();
			}
			
			Product produto = CalculationService.max(lista);
			System.out.println("Most expensive:");
			System.out.println(produto);
			
      }catch(IOException error){
    	  System.out.println(error.getMessage());
      }

      
	}
}
