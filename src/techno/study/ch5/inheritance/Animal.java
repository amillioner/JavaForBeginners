package techno.study.ch5.inheritance;

public class Animal {
    private int age;
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
}

//    And here are the contents of Lion.java:
class Lion extends Animal {
    private void roar() {
        System.out.println("The "+getAge()+" year old lion says: Roar!");
    }
}

//
//public class Lion extends Animal {
//    private void roar() {
////        System.out.println("The "+age+" year old lion says: Roar!"); // DOES NOT COMPILE
//    }
//}