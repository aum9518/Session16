public class Technique {
    private String name;
    private String brand;
    private int version;

    public Technique(String name, String brand, int version) {
        this.name = name;
        this.brand = brand;
        this.version = version;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getVersion() {
        return version;
    }

    public void setVersion(int version) {
        this.version = version;
    }

    public Technique() {
    }

    public String turnOn(){
        return name+" включена ";
    }

    public String turnOff(){
        return name+" выключена";
    }
}
