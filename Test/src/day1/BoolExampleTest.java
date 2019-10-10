package day1;

import static junit.framework.TestCase.assertEquals;

public class BoolExampleTest {

    @org.junit.Test
    public void main() {
    }

    @org.junit.Test
    public void CallThisMethod() {
        BoolExample be = new BoolExample();
        int actual = be.CallThisMethod();
        int expected = 42;
        assertEquals(actual,  expected);
    }

    @org.junit.Test
    public void getVal() {
    }

    @org.junit.Test
    public void setVal() {
    }
}