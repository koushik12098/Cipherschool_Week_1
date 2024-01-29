public class primitiveDT {
    public static void main(String[] args) {
        int x = 5;
        int y = 7;
        System.out.println("X is: " + x);
        System.out.println("Y is: " + y);

        byte b = 10;
        System.out.println("B is: " + b);

        int i = b; // Implicit Type Casting or WIdening or up-casting
        System.out.println("I is: " + i);

        byte b2 = (byte)129; // Explicit Type Casting or narrowing or down-casting
        System.out.println("B2 is: " + b2);

        byte b3 = (byte)128;
        System.out.println("B3 is: " + b3);

        float f = (float)5.5; // by default considers decimal to double

        float f2 = 5.5f;

        double d = 10.5;
        char ch = 'a';
        System.out.println(ch);
        //Tasl - 1:Different ways to convert charact to int

        //int  a = Character.getNumericValue('z');
        //System.out.println("A is: " + a);

        char c = 'a';
        int xa = c;
        System.out.println(xa);

        System.out.println((int)('a'));
        System.out.println((int)('A'));
        //we wil require 'A' -> 0, 'Z' -> 25
        char c3 = 'e';
        int e = c3 -'a';
        System.out.println("E is: " + e);

        int z = x + y;
        // + -> operator
        // x,y -> operands

        //Increment & Decrement Operators
        int m = 5;
        int n = m++; // assign the value of m and ten increase value of m whenever it was defined
        // think of this as:
        // 1. int n = m;
        // m= m + 1;
        System.out.println("M is: ");
        System.out.println(m);
        System.out.println("N is: ");
        System.out.println(n);
        
        int p = 5;
        int q = ++p; // increase value of p and assign to q
        //think of this as:
        // 1. p = p + 1;
        // 2. int q = p;
        System.out.println("P is: " + p + ", Q is: " + q);


    }
}
