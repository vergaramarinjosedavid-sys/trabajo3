package com.example;

public class Main {
    public static void main(String[] args) {
       
        Product p1 = new Product();
        p1.setId("001");
        p1.setName("Laptop");
        p1.setPrice(1200.50);
        p1.setStock(10);

       
        Product p2 = new Product("002", "Smartphone", 799.99, 20);

        
        System.out.println("Producto 1 - Nombre: " + p1.getName() + ", Precio: " + p1.getPrice());
        System.out.println("Producto 2 - Nombre: " + p2.getName() + ", Stock: " + p2.getStock());

        
        System.out.println(p1);
        System.out.println(p2);
    }
}