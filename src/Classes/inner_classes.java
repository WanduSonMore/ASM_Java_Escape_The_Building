package Classes;

class OuterClass {
    int x = 10;

    class InnerClass {
        int y = 5;
    }
    //private class InnerClass {
    //    int y = 5;
    //  }
    //An inner class can also be static,
    // which means that you can access it without
    // creating an object of the outer class
    //static class InnerClass {
    //    int y = 5;
    //  }
    //One advantage of inner classes,
    //is that they can access attributes
    // and methods of the outer class
    //  class InnerClass {
    //    public int myInnerMethod() {
    //      return x;
    //    }
    //  }
}

public class inner_classes {
    public static void main(String[] args) {
        OuterClass myOuter = new OuterClass();
        OuterClass.InnerClass myInner = myOuter.new InnerClass();
        System.out.println(myInner.y + myOuter.x);
    }
}

// Outputs 15 (5 + 10)