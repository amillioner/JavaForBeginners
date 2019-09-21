package techno.study.ch6;

import java.io.IOException;

public class JavaExceptions {

    public static void main(String[] args) {
        //compile time error
        String str = null;
        System.out.println(str.indexOf(1));

        //compile time error
        int[] a = new int[5];
        System.out.println(a[6]);

        //run time error
        System.out.println(100/0);

        JavaExceptions exceptions = new JavaExceptions();
        exceptions.run();
        try {
            exceptions.readFile();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /**
     * throws unchecked exception
     */
    public void run(){
        throw new RuntimeException();
    }


    /**
     * throws checked exception
     */
    public void readFile() throws IOException {
        throw new IOException();
    }


    /**
     * handles exception in it
     */
    public void writeFile(){
        try {
            throw new IOException();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
