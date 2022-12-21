package data;

public class Coffe extends Products {

    private Integer temperature;
    private Integer volume;
    
    public Coffe(Integer id, Integer price, String name, Integer temperature, Integer volume) {
        super(id, price, name);
        this.temperature = temperature;
        this.volume = volume;
    }

    public Integer getTemperature() {
        return temperature;
    }

    public Integer getVolume() {
        return volume;
    }

    public void setTemperature(Integer temperature) {
        this.temperature = temperature;
    }

    public void setVolume(Integer volume) {
        this.volume = volume;
    }

}
