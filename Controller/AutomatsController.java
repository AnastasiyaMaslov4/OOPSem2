package Controller;

import java.util.TreeSet;

import data.Products;
import services.DrinksServices;
import services.ProductServices;

public class AutomatsController {
    
    private final DrinksServices drinksServices;
    private final ProductServices productServices;

    public AutomatsController(DrinksServices drinksServices, ProductServices productServices) {
        this.drinksServices = drinksServices;
        this.productServices = productServices;
    }

    public void ShowAllDrinks() {
        drinksServices.showAll();
    }

    public void ShowAllProducts() {
        productServices.showAll();
    }

    public String getDrinkByCode(int code) {
        return drinksServices.getDrinkByCode(code).toString();
    }

    public String getProductByCode(int code) {
        return productServices.getProductByCode(code).toString();
    }

    public String reserveDrink(String name) {
        return drinksServices.reserveDrink(name).toString();
    }

    public String reserveProduct(String name) {
        return productServices.reserveProduct(name).toString();
    }

    public String bestProduct() {
        TreeSet<Products> data = new TreeSet<Products>();
        data.addAll(productServices.getProdRepo().getArrList());
        String bestProd = "Лучший продукт в этом автомате: " +  data.last().getName();
        return bestProd;
    }

    public String bestDrink() {
        TreeSet<Products> data = new TreeSet<Products>();
        data.addAll(drinksServices.getDrinksRepo().getArrList());
        String bestProd = "Лучший продукт в этом автомате: " +  data.last().getName();
        return bestProd;
    }

}
