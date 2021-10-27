package nestedclass;

public class OuterClass {

    //outer class variables
    private  int outerNum1 = 10;

    public OuterClass(){

    }// outer class methods

    InnerA innerA = new InnerA();
    InnerB innerB = new InnerB();
    public void outerMethodA(){
        System.out.println("outer class method A");
    }
    public void outerMethodB(){
        System.out.println("outer class method B");
    }
    public class InnerA {
        //inner class constructor
        public InnerA(){ // this is the constructor for the class, bc a constructor has the same name as the class
            //constructor is a predefinition of the object

        }
        //inner class variables
        int numA=6;
        //inner class methods
        public void innerMethodA(){
            System.out.println("this is InnerA method");
        }

    }//inner class A ends here
    //inner class B
    public class InnerB{
        //inner B class constructor
        public InnerB(){

        }
        //inner B class variables
        int numB = 9;
        //inner B class methods
        public void innerMethodB(){
            System.out.println("this is InnerB method");
        }
    }// inner class B ends here
}// outer class ends here
