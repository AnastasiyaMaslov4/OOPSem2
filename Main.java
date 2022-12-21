import java.util.ArrayList;
import java.util.Arrays;

import Controller.AutomatsController;
import data.Chocolate;
import data.Milk;
import data.Products;
import data.Tea;
import repository.DrinksRepository;
import repository.ProductsRepository;
import services.DrinksServices;
import services.ProductServices;

public class Main {
    public static void main(String[] args) {
        
        ArrayList<Products> newProdList = new ArrayList<>();
        Products MilkChoc = new Chocolate(1, 100, "Milk Chocolate", 100, "Milk");
        Products DarkChoc = new Chocolate(2, 120, "Dark Chocolate", 100, "Dark");
        Products WhiteChoc = new Chocolate(3, 90, "White Chocolate", 100, "White");
        Products FatMilk = new Milk(4, 150, "Fat Milk", 6.0, 1000);
        Products LowFatMilk = new Milk(5, 160, "Low Fat Milk", 1.0, 1000);

        newProdList.addAll(Arrays.asList(MilkChoc, DarkChoc, WhiteChoc, FatMilk, LowFatMilk));

        ArrayList<Products> drinksList = new ArrayList<>();

        Products HotTea = new Tea(1, 100, "Hot black tea", 100, 300);
        Products GreenTea = new Tea(2, 120, "Green tea", 90, 300);
        Products ColdTea = new Tea(3, 100, "Cold black tea", 30, 330);

        drinksList.addAll(Arrays.asList(HotTea, GreenTea, ColdTea));

        ProductsRepository Automat1 = new ProductsRepository(newProdList);
        DrinksRepository Automat2 = new DrinksRepository(drinksList);

        ProductServices automat1Service = new ProductServices(Automat1);
        DrinksServices automat2Service = new DrinksServices(Automat2);

        AutomatsController controller = new AutomatsController(automat2Service, automat1Service);

        controller.ShowAllDrinks();
        System.out.println();
        System.out.println(controller.reserveDrink("Green tea"));
        System.out.println();
        System.out.println(controller.getDrinkByCode(1392838282));
        System.out.println();
        controller.ShowAllProducts();
        System.out.println();
        System.out.println(controller.reserveProduct("Milk Chocolate"));
        System.out.println();
        System.out.println(controller.getProductByCode(664740647));

    }
}
