package app;

import entities.Product;

import java.util.Locale;
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Product product = new Product();  // aqui importa a class Product

        System.out.println("Enter product data: ");
        System.out.print("Name: ");
        product.name = sc.nextLine();
        System.out.print("Price: ");
        product.price = sc.nextDouble();
        System.out.print("Quantity in stock: ");
        product.quantity = sc.nextInt();
        System.out.println();

       // product.toString(); // toString() serve para converter o objeto em String, tem que declarar na classe Product
        System.out.println("Product data: " + product.toString());

        System.out.println();
        System.out.print("Enter the number of products to be added in stock: ");
        int quantity = sc.nextInt(); // esse valor que vai ser digitado será usado como parametro na função addProduct da classe Product
        product.addProduct(quantity);


        System.out.println();
        System.out.println("Updated data: " + product.toString());

        System.out.println();
        System.out.print("Enter the number of products to be removed from stock: ");
        quantity = sc.nextInt(); // esse valor que vai ser digitado será usado como parametro na função removeProduct da classe Product
        product.removeProduct(quantity);

        System.out.println();
        System.out.println("Updated data: " + product.toString());

        sc.close();
    }
}
