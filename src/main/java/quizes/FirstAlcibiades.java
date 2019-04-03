package quizes;

public class FirstAlcibiades {

    public static void main(String args[]) {
        String X = "ABC";
        String Y = null;
        boolean b = "ABC".toString() == X;
        System.out.println(b && Y.equals(null)); //NPE
    }
}
