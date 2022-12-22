package services;

import data.Products;
import repository.DrinksRepository;
import view.GetProductByNameResponse;

public class DrinksServices {
    
    private final DrinksRepository drinksRepository;

    public DrinksServices(DrinksRepository drinksRepository) {
        this.drinksRepository = drinksRepository;
    }

    public GetProductByNameResponse getProductByName(String name) {
        Products drink = drinksRepository.getProductByName(name);
        if(drink == null) {
            return new GetProductByNameResponse("Такого продукта в автомате нет", null);
        }
        return new GetProductByNameResponse(null, "Продукт " + drink.getName() + " выдается");
    }

    public GetProductByNameResponse getDrinkByCode(int code) {
        Products drink = drinksRepository.getProductByCode(code);
        if(drink == null) {
            return new GetProductByNameResponse("Неверный код", null);
        }
        return new GetProductByNameResponse(null, "Продукт " + drink.getName() + " выдается");
    }

    public GetProductByNameResponse reserveDrink(String name) {
        Products drink = drinksRepository.getProductByName(name);
        if (drink == null) return new GetProductByNameResponse("Невозможно зарезервировать. Продукта нет в наличии", null);
        else return  new GetProductByNameResponse(null, "Продукт зарезервирован. Код для выдачи: " + drinksRepository.reservProduct(name));
    }

    public void showAll(){
        drinksRepository.showAll();
    }

    public DrinksRepository getDrinksRepo() {
        return drinksRepository;
    }

}
