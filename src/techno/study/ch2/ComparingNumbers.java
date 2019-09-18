package techno.study.ch2;

/**
 * Comparing operators: ==, !=, <, <=, >, >=
 */
public class ComparingNumbers {

    public static void main(String[] args) {

        // example 1
        int temperature = 90;

        if(temperature > 80){
            System.out.println("Hot");
        }
        if(temperature < 80 && temperature > 70){
            System.out.println("Warm");
        }
        if(temperature < 50){
            System.out.println("Cold");
        }

        //example 2

        int a1 = 1, a2 = 2, a3 = 3;
        int highest = 0;

        if(highest < a1){
            highest = a1;
        }
        if(highest < a2){
            highest = a2;
        }
        if(highest < a3){
            highest = a3;
        }
        System.out.println(highest);
    }

    // TODO Task
    //  0. find lowest number
    //  1. fix first example, look for missing statements, what if we have negative number
    //  2. find second highest number

}
