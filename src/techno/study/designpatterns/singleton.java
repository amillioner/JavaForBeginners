package techno.study.designpatterns;

class Singleton {
//    Java Singleton Design Pattern Practices with Examples
//    In previous articles, we discussed about singleton design pattern and singleton class implementation in detail.
//    In this article, we will see how we can create singleton classes. After reading this article you will be able to create your singleton class according to your use, simplicity and removed bottlenecks.
//    There are many ways this can be done in Java. All these ways differs in their implementation of the pattern, but in the end, they all achieve the same end result of a single instance.
//
//    Eager initialization: This is the simplest method of creating a singleton class. In this, object of class is created when it is loaded to the memory by JVM. It is done by assigning the reference an instance directly.
//    It can be used when program will always use instance of this class, or the cost of creating the instance is not too large in terms of resources and time.

    // Java code to create singleton class by
// Eager Initialization
    public static class GFG1 {
        // public instance initialized when loading the class
        private static final GFG1 instance = new GFG1();

        private GFG1() {
            // private constructor
        }

        public static GFG1 getInstance() {
            return instance;
        }
    }
//    Pros:
//
//    Very simple to implement.
//    Cons:
//
//    May lead to resource wastage. Because instance of class is created always, whether it is required or not.
//    CPU time is also wasted in creation of instance if it is not required.
//    Exception handling is not possible.
//            Using static block: This is also a sub part of Eager initialization. The only difference is object is created in a static block so that we can have access on its creation, like exception handling. In this way also, object is created at the time of class loading.
//    It can be used when there is a chance of exceptions in creating object with eager initialization.

    // Java code to create singleton class
// Using Static block
    public static class GFG2 {
        // public instance
        public static GFG2 instance;

        private GFG2() {
            // private constructor
        }

        {
            // static block to initialize instance
            instance = new GFG2();
        }
    }
//    Pros:
//
//    Very simple to implement.
//    No need to implement getInstance() method. Instance can be accessed directly.
//    Exceptions can be handled in static block.
//            Cons:
//
//    May lead to resource wastage. Because instance of class is created always, whether it is required or not.
//    CPU time is also wasted in creation of instance if it is not required.
//    Lazy initialization: In this method, object is created only if it is needed. This may prevent resource wastage. An implementation of getInstance() method is required which return the instance. There is a null check that if object is not created then create, otherwise return previously created. To make sure that class cannot be instantiated in any other way, constructor is made final. As object is created with in a method, it ensures that object will not be created until and unless it is required. Instance is kept private so that no one can access it directly.
//    It can be used in a single threaded environment because multiple threads can break singleton property because they can access get instance method simultaneously and create multiple objects.

    //Java Code to create singleton class
// With Lazy initialization
    public static class GFG3 {
        // private instance, so that it can be
        // accessed by only by getInstance() method
        private static GFG3 instance;

        private GFG3() {
            // private constructor
        }

        //method to return instance of class
        public static GFG3 getInstance() {
            if (instance == null) {
                // if instance is null, initialize
                instance = new GFG3();
            }
            return instance;
        }
    }
//    Pros:
//
//    Object is created only if it is needed. It may overcome resource overcome and wastage of CPU time.
//    Exception handling is also possible in method.
//            Cons:
//
//    Every time a condition of null has to be checked.
//    instance can’t be accessed directly.
//    In multithreaded environment, it may break singleton property.
//    Thread Safe Singleton: A thread safe singleton in created so that singleton property is maintained even in multithreaded environment. To make a singleton class thread-safe, getInstance() method is made synchronized so that multiple threads can’t access it simultaneously.

    // Java program to create Thread Safe
// Singleton class
    public class GFG4 {
//        // private instance, so that it can be
//        // accessed by only by getInstance() method
//        private static GFG instance;
//
//        private GFG4() {
//            // private constructor
//        }
//
//        //synchronized method to control simultaneous access
//        synchronized public static GFG4 getInstance() {
//            if (instance == null) {
//                // if instance is null, initialize
//                instance = new GFG4();
//            }
//            return instance;
//        }
    }
//    Pros:
//
//    Lazy initialization is possible.
//    It is also thread safe.
//            Cons:
//
//    getInstance() method is synchronized so it causes slow performance as multiple threads can’t access it simultaneously.
//    Lazy initialization with Double check locking: In this mechanism, we overcome the overhead problem of synchronized code. In this method, getInstance is not synchronized but the block which creates instance is synchronized so that minimum number of threads have to wait and that’s only for first time.

    // Java code to explain double check locking
    public class GFG5 {
//        // private instance, so that it can be
//        // accessed by only by getInstance() method
//        private static GFG5 instance;
//
//        private GFG5() {
//            // private constructor
//        }
//
//        public static GFG5 getInstance() {
//            if (instance == null) {
//                //synchronized block to remove overhead
//                synchronized (GFG5.class) {
//                    if (instance == null) {
//                        // if instance is null, initialize
//                        instance = new GFG5();
//                    }
//
//                }
//            }
//            return instance;
//        }
    }
//    Pros:
//
//    Lazy initialization is possible.
//    It is also thread safe.
//    Performance reduced because of synchronized keyword is overcome.
//            Cons:
//
//    First time, it can affect performance.
//    As cons. of double check locking method is bearable so it can be used for high performance multi-threaded applications.
//
//    Bill Pugh Singleton Implementation: Prior to Java5, memory model had a lot of issues and above methods caused failure in certain scenarios in multithreaded environment. So, Bill Pugh suggested a concept of inner static classes to use for singleton.

    // Java code for Bill Pugh Singleton Implementaion
    public static class GFG6 {

        private GFG6() {
            // private constructor
        }

        // Inner class to provide instance of class
        private static class BillPughSingleton {
            private static final GFG6 INSTANCE = new GFG6();
        }

        public static GFG6 getInstance() {
            return BillPughSingleton.INSTANCE;
        }
    }
//    When the singleton class is loaded, inner class is not loaded and hence doesn’t create object when loading the class. Inner class is created only when getInstance() method is called. So it may seem like eager initialization but it is lazy initialization.
//    This is the most widely used approach as it doesn’t use synchronization.
//
//    When to use What
//
//    Eager initialization is easy to implement but it may cause resource and CPU time wastage. Use it only if cost of initializing a class is less in terms of resources or your program will always need the instance of class.
//    By using Static block in Eager initialization we can provide exception handling and also can control over instance.
//    Using synchronized we can create singleton class in multi-threading environment also but it can cause slow performance, so we can use Double check locking mechanism.
//    Bill Pugh implementation is most widely used approach for singleton classes. Most developers prefer it because of its simplicity and advantages.
}
