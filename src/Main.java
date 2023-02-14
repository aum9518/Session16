import java.awt.*;

public class Main {
    public static void main(String[] args) {
        Technique phone = new Phone("Ultra22","Samsung",2,"128gb");
        Technique phone1 = new Phone("iphon11","Iphon",11,"128gb");

        Technique computer  = new Computer("Macbook pro","Apple",4,"M2max");
        Technique computer1  = new Computer("Macbook air","Apple",3,"M2max");

        Technique smartWatch = new SmartWatch("AppleWatch", "Aaple",2,"856 mah");
        Technique smartWatch1 = new SmartWatch("sportWatch", "Aaple",2,"856 mah");

        Technique[] accessuary = {phone,phone1,computer,computer1,smartWatch,smartWatch1};
        for (Technique a:accessuary) {
            System.out.println(a.getBrand()+"\n"+a.getName()+"\n"+a.getVersion()+"\n"+a.turnOn()+a.turnOff());
        }
    }
}