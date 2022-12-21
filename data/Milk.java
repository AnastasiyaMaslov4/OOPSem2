package data;

public class Milk extends Products {

    private Double fatContent;
    private Integer volume;

    public Milk(Integer id, Integer price, String name, Double fatContent, Integer volume) {
        super(id, price, name);
        this.fatContent = fatContent;
        this.volume = volume;

    }

    public Double getFatContent() {
        return fatContent;
    }

    public Integer getVolume() {
        return volume;
    }

    public void setFatContent(Double fatContent) {
        this.fatContent = fatContent;
    }

    public void setVolume(Integer volume) {
        this.volume = volume;
    }
    
}
