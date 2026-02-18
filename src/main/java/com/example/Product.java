package com.example;

public class Product {
    private String id;       
    private String name;     
    private double price;    
    private int stock;       

    public Product() {
        this.id = null;
        this.name = null;
        this.price = 0.0;
        this.stock = 0;
    }

    public Product(String id, String name, double price, int stock) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.stock = stock;
    }

    // Getters
    public String getId() { return id; }
    public String getName() { return name; }
    public double getPrice() { return price; }
    public int getStock() { return stock; }

    // Setters
    public void setId(String id) { this.id = id; }
    public void setName(String name) { this.name = name; }
    public void setPrice(double price) {
        if (price >= 0) {
            this.price = price;
        } else {
            System.out.println("El precio no puede ser negativo.");
        }
    }
    public void setStock(int stock) {
        if (stock >= 0) {
            this.stock = stock;
        } else {
            System.out.println("El stock no puede ser negativo.");
        }
    }

    @Override
    public String toString() {
        return "Product [ID: " + id + 
               ", Name: " + name + 
               ", Price: " + price + 
               ", Stock: " + stock + "]";
    }
}