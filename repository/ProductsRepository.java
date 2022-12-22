package repository;

import java.util.ArrayList;

import data.Products;

/**
 * ProductsRepository
 */
public class ProductsRepository {

    private ArrayList<Products> productsRepository = new ArrayList<>();

    public ProductsRepository(ArrayList<Products> productsRepository) {
        this.productsRepository = productsRepository;
    }

    public ArrayList<Products> getArrList() {
        return productsRepository;
    }

    public Products getProductByName(String name) {
        for (Products el : productsRepository) {
            if (el.getName().equals(name)) return el;
        }
        return null;
    }

    public Products getProductByCode(int code) {
        for (Products el : productsRepository) {
            if (el.hashCode() == code) {
                return el;
            }
        }
        return null;
    }

    public boolean addProduct(Products product) {
        for (Products el : productsRepository) {
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
        for (Products el : productsRepository) {
            System.out.println(el.getName());
        }
    }
}