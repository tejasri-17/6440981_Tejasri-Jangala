public class TypeCasting {
    public static void main(String[] args) {
        double d = 9.78;
        int i = (int) d; // Explicit casting
        System.out.println("Double to int: " + i);

        int x = 10;
        double y = x; // Implicit casting
        System.out.println("Int to double: " + y);
    }
}
