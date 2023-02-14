public class SmartWatch extends Technique{
    private String bettery;

    public SmartWatch() {
    }

    public SmartWatch(String bettery) {
        this.bettery = bettery;
    }

    public SmartWatch(String name, String brand, int version, String bettery) {
        super(name, brand, version);
        this.bettery = bettery;
    }

    public String getBettery() {
        return bettery;
    }

    public void setBettery(String bettery) {
        this.bettery = bettery;
    }

    @Override
    public String turnOn() {
        return super.turnOn();
    }

    @Override
    public String turnOff() {
        return super.turnOff();
    }
}
