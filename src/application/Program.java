package application;

import java.util.Date;

import src.model.entities.Department;
import src.model.entities.Seller;

public class Program {

	public static void main(String[] args) {
		
		Department obj = new Department();		
		
		Seller seller = new Seller(21, "Bob", "bob@gmail.com", new Date(), 3000.0, obj);
		
		System.out.println(seller);

	}

}
