package repository;

import java.util.ArrayList;

import data.Products;

public class DrinksRepository {
    
    private ArrayList<Products> drinksRepository = new ArrayList<>();

    public DrinksRepository(ArrayList<Products> drinksRepository) {
        this.drinksRepository = drinksRepository;
    }

    public Products getProductByName(String name) {
        for (Products el : drinksRepository) {
            if (el.getName().equals(name)) return el;
        }
        return null;
    }

    public Products getProductByCode(int code) {
        for (Products el : drinksRepository) {
            if (el.hashCode() == code) {
                return el;
            }
        }
        return null;
    }

    public boolean addProduct(Products product) {
        for (Products el : drinksRepository) {
           if (el.getName().equals(product.getName())) return false;
        }
        return true;
    }

    public Integer reservProduct(String name) {
        if (getProductByName(name) == null) return null;
        else return getProductByName(name).hashCode();
    }

    public void showAll() {
        System.out.println("Продукты в наличии: ");
        for (Products el : drinksRepository) {
            System.out.println(el.getName());
        }
    }

}
