public class Phone extends Technique{
    private String memory;

    public Phone(String name, String brand, int version, String memory) {
        super(name, brand, version);
        this.memory = memory;
    }

    @Override
    public String turnOn() {
        return super.turnOn();
    }

    @Override
    public String turnOff() {
        return super.turnOff();
    }

    public String getMemory() {
        return memory;
    }

    public void setMemory(String memory) {
        this.memory = memory;
    }

    public Phone(String memory) {
        this.memory = memory;
    }

    public Phone() {
    }
}
