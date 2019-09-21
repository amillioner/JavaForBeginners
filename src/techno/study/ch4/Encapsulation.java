package techno.study.ch4;


/**
 * setter, getter, this
 */
public class Encapsulation {

    public static void main(String[] args) {
        Laptop car = new Laptop();
        car.color = "Yellow";
        car.setColorType("yellow");
    }

    //TODO Task
    // 0. create class "Person" with at least 5 attributes and encapsulate it
}

class Laptop {
    String color;
    private ColorRGB colorType;

    private Processor processor;

    public void setColorType(String colorType) {
        if (colorType.equalsIgnoreCase("yellow")) {
            this.colorType = new ColorRGB();
            this.colorType.green = 255;
            this.colorType.red = 255;
        } else {
            this.colorType = new ColorRGB();
        }
    }
}

class ColorRGB {
    int red;
    int green;
    int blue;
}


class Processor {

    private String number;
    private int numberOfCores;

}