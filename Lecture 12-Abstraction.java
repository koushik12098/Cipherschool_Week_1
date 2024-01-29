abstract class Car{ // we cannot instantiate an abstract class, which means we cannot create objects of an abstract class
    int maxSpeed;
    abstract void accelerate(); // Onlydeclared bit nit implemented - it is without a body
    //they are created to force the child clasese to implement them before using. We will use then after overriding

    abstract void brake();
}

abstract class BMW extends Car{
    void accelerate(){
        System.out.println("BMW is accelerating");
    }
}

class BMW2 extends BMW{
    void brake(){
        System.out.println("BMW is applying brake");
    }
}

abstract class A{//an abstract class can exist without abstract methods
    //we simply mean we will not be able to create object[instantiate] of this class
    int x = 10;
    void fun(){ // Abstract class can have concrete methods
        System.out.println("Hello, I'm A");
    }
}
public class AbstractStudy {
    public static void main(String[] args) {
        //Car c = new Car(); // Cannot instantiate an abstract class
       // BMW beemer = new BMW();
       // beemer.accelerate();
       BMW2 b = new BMW2();
       b.accelerate();
       b.brake();
    }
}
