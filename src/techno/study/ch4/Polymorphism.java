package techno.study.ch4;

/**
 * interface, override, toString
 *
 * TODO overloading a method, overloading vs overriding
 */
public class Polymorphism {

    public static void main(String[] args) {
        Lemur lemur = new Lemur();
        System.out.println(lemur.age);
        HasTail hasTail = lemur;
        System.out.println(hasTail.isTailStriped());
        Primate primate = lemur;
        System.out.println(primate.hasHair());
    }

    //TODO Task
    //  0. create class Shape, create subclasses: Rectangle, Triangle, Square, Sphere and Cube,
    //     apply HasVolume, HasArea, HasPerimeter interfaces to them
    ///
}


class Primate {
    public boolean hasHair() {
        return true;
    }
}

interface HasTail {
    public boolean isTailStriped();
}

class Lemur extends Primate implements HasTail {
    public boolean isTailStriped() {
        return false;
    }

    public int age = 10;
}