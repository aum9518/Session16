public class Computer extends Technique{
    private String RAM;

    public Computer(String RAM) {
        this.RAM = RAM;
    }

    public Computer() {
    }

    public Computer(String name, String brand, int version, String RAM) {
        super(name, brand, version);
        this.RAM = RAM;
    }

    public String getRAM() {
        return RAM;
    }

    public void setRAM(String RAM) {
        this.RAM = RAM;
    }

    @Override
    public String turnOn() {
        return RAM;
    }

    @Override
    public String turnOff() {
        return RAM;
    }
}
