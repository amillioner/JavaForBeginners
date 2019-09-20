package techno.study.ch4;

/**
 * is-a relation, super, constructor, has-a relation
 * <p>
 * all classes extend from object
 *
 * TODO teach interface also
 */
public class Inheritance {

    public static void main(String[] args) {

    }

    //TODO
    //  0. create class Vehicle and create sub-classes of Vehicle, use super keyword, use constructor
    //     ex: Car, Bike, Truck etc.
    //  1. create 5 classes(like SizeXD classes we provided),
    //     use is-a and has-a relations between them, use your imagination when naming your class (hint. Food)
}

class Size1D {
    int x;
}

class Size2D extends Size1D { // is-a relation
    int y;
}

class Size3D extends Size2D {
    int z;
}

class Box {
    Size3D size; // has-a relation
}