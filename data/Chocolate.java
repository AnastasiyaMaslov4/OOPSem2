package data;

public class Chocolate extends Products {

    private Integer mass;
    private String type;

    public Chocolate(Integer id, Integer price, String name, Integer mass, String type) {
        super(id, price, name);
        this.mass = mass;
        this.type = type;
        
    }

    public Integer getMass() {
        return mass;
    }

    public String getType() {
        return type;
    }
    
}
