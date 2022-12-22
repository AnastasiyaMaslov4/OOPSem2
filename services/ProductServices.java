package services;

import data.Products;
import repository.ProductsRepository;
import view.GetProductByNameResponse;

public class ProductServices {
    
    private final ProductsRepository productsRepository;

    public ProductServices(ProductsRepository productsRepository) {
        this.productsRepository = productsRepository;
    }

    public ProductsRepository getProdRepo() {
        return productsRepository;
    }

    public GetProductByNameResponse getProductByName(String name) {
        Products prod = productsRepository.getProductByName(name);
        if(prod == null) {
            return new GetProductByNameResponse("Такого продукта в автомате нет", null);
        }
        return new GetProductByNameResponse(null, "Продукт " + prod.getName() + " выдается");
    }

    public GetProductByNameResponse getProductByCode(int code) {
        Products prod = productsRepository.getProductByCode(code);
        if(prod == null) {
            return new GetProductByNameResponse("Неверный код", null);
        }
        return new GetProductByNameResponse(null, "Продукт " + prod.getName() + " выдается");
    }

    public boolean addProduct(Products product) {
        return productsRepository.addProduct(product);
    }

    public GetProductByNameResponse reserveProduct(String name) {
        Products prod = productsRepository.getProductByName(name);
        if (prod == null) return new GetProductByNameResponse("Невозможно зарезервировать. Продукта нет в наличии", null);
        else return  new GetProductByNameResponse(null, "Продукт зарезервирован. Код для выдачи: " + productsRepository.reservProduct(name));
    }

    public void showAll() {
        productsRepository.showAll();
    }
}
