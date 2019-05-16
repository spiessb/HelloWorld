package quizes;

/* Byte or Integer */
public class Laches {

    public static void main(String[] args) {
        x((byte)3 + (byte)5);  //prints "I"
    }

    public static void x(Byte i) {
        System.out.println("B");
    }

    public static void x(Integer i) {
        System.out.println("I");
    }

}
