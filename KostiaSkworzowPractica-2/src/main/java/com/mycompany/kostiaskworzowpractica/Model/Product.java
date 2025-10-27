/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.kostiaskworzowpractica.Model;

/**
 *
 * @author student
 */
public class Product {
private String name;
private String nameproduct;
private String categoria;
private int price;

    public String getName() {
        return name;
    }

    public String getCategoria() {
        return categoria;
    }

    public int getPrice() {
        return price;
    }

    public Product(String name, String categoria, int price) {
        this.name = name;
        this.categoria = categoria;
        this.price = price;
    }
    
}
