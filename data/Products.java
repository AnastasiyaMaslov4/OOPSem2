package data;


/**
 * Products
 */
public abstract class Products {

    private Integer id;
    private String name;
    private Integer price;

    public Products(Integer id, Integer price,String name) {
        this.id = id;
        this.price = price;
        this.name = name;
    }

    public Integer getId() {
        return id;
    }

    public Integer getPrice() {
        return price;
    }

    public String getName() {
        return name;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    public void setName(String name) {
        this.name = name;
    }


    
}