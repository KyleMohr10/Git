package week1advjava;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws SQLException {
		Scanner kb = new Scanner(System.in);
		char option = 'z';
		
		do {
			System.out.println("---------------");
			System.out.println("Welcome to the Library");
			System.out.println("Enter a to add a product");
			System.out.println("Enter r to rent a product");
			System.out.println("Enter s to search a product");
			System.out.println("Enter p to purchase a product");
			System.out.println("Enter t to print a product");
			System.out.println("Enter c to copt a product");
			System.out.println("Enter q to quit");
			System.out.println("---------------");
			
			//get user option choice
			option = kb.next().charAt(0);
			
			if (option == 'a') {
				try {
					System.out.println("Enter product name");
					String productName = kb.next();
					System.out.println("Enter qty");
					int qty = kb.nextInt();
					System.out.println("Enter cost");
					double itemCost = kb.nextDouble();
					
				
				AddProduct(productName, qty, itemCost);
				}
				catch(Exception ex) {
					System.out.println("Error invalid input");
				}
			}
			else if (option == 'r') {
				RentProduct();
			}
			else if (option == 's') {
				SearchProduct();
			}
			else if (option == 'p') {
				PurchaseProduct();
			}
			else if (option == 't') {
				PrintProduct();
			}
			else if (option == 'g') {
				GetAllProducts();
			}
			else {
				System.out.println("You entered the wrong input, please try again");
			
			}
	
		}while (option != 'q');
		
		if (option == 'q') {
			System.out.println("Thank you for visint the Library");
		}	
	}
	public static void AddProduct(String productName, int qty, double itemCost2) throws SQLException {
		

			System.out.println("Adding a product");
		
		Scanner kb = new Scanner(System.in);
		
		System.out.println("Enter the product name");
		String name = kb.next();
		
		System.out.println("Enter the product qty");
		int book = kb.nextInt();
		
		System.out.println("Enter the product cost");
		double cost = kb.nextDouble();
		
		Connection connection = DriverManager.getConnection("jdbc:mysql://database_1/mytable?user=root1&password=Lumpy1021");
		PreparedStatement ps = connection.prepareStatement("Insert into products (name, book, cost) values(?,?,?)");
		ps.setString(1, name);
		ps.setInt(2, book);
		ps.setDouble(3, cost);
		
		ps.executeUpdate();
		
		System.out.println("Products Add was Successful");
		GetAllProducts();
			
	}
	 public static void RentProduct() {
		System.out.println("Rent a product");
		System.out.println("Enter the product name");
		Scanner kb = new Scanner(System.in);
		//TODO implement database interaction here
	}
	public static void SearchProduct() {
		System.out.println("Searching a product");
		System.out.println("Enter the product name");
		Scanner kb = new Scanner(System.in);
		String name = kb.next();
		//TODO implement database interaction here
	}
	public static void PurchaseProduct() {
		System.out.println("Purchase a product");
		System.out.println("Enter the product name");
		Scanner kb = new Scanner(System.in);
		//TODO implement database interaction here
		}
	public static void PrintProduct() {
		System.out.println("Print a product");
		System.out.println("Enter the product name");
		Scanner kb = new Scanner(System.in);
		//TODO implement database interaction here
		}
	public static void GetAllProducts() throws SQLException {
		Connection connection = DriverManager.getConnection("jdbc:mysql://database_1/mytable?user=root1&password=Lumpy1021");
		Statement statement = connection.createStatement();
		ResultSet rs = statement.executeQuery("select * from products"); //gets the data from the database
		
		while(rs.next()) {
			System.out.println(rs.getString("name"));
			System.out.println(rs.getString("book"));
			System.out.println(rs.getString("cost"));
		}
	}
}
			
			
				
			
			
		
