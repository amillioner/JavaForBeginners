package techno.study.ch2;

/**
 * 1. Boolean: true, false
 *
 * boolean: The boolean data type has only two possible values: true and false.
 * Use this data type for simple flags that track true/false conditions.
 * This data type represents one bit of information, but its "size" isn't something that's precisely defined.
 *
 * 2. Logical operators: ! - NOT, && - AND, || - OR, ^ - XOR
 *
 * 3. IF statement
 */

public class DataTypesBooleans {

    public static void main(String[] args) {
        boolean a = true;
        boolean b = false;

        System.out.println(a);
        System.out.println(b);

        System.out.println(!a);

        System.out.println(a && b);
        System.out.println(a || b);
        System.out.println(a ^ b);

        boolean isGreen = true;
        if(isGreen){
            System.out.println("You can walk");
        }
    }

    // TODO TASK
    //   check two boolean variables username and password respectively, if both of them are true, print "logged in"
}
