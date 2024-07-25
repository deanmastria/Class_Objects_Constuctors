package org.example;

public class Product {
    private double productCost;
    private int quantity;
    private String productName;

    // Constructor to initialize the product cost, quantity, and name
    public Product(double productCost, int quantity, String productName) {
        this.productCost = productCost;
        this.quantity = quantity;
        this.productName = productName;
    }

    // Method to calculate and print the total cost of the products
    public void totalCost() {
        double total = productCost * quantity;
        System.out.println("Total cost for " + quantity + " units of " + productName + " is: " + String.format("%.2f", total));
    }

    // Method to print the cost of one unit and the quantity purchased
    public void printProduct() {
        System.out.println("Product: " + productName);
        System.out.println("Cost per unit: " + String.format("%.2f", productCost));
        System.out.println("Quantity purchased: " + quantity);
    }

    public static void main(String[] args) {
        Product product = new Product(49.99, 10, "Lego Star Wars: The Musical");
        System.out.println(" ");
        product.printProduct();
        System.out.println(" ");
        product.totalCost();
    }
}
