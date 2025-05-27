public class PatternMatchingSwitch {
    public static void identifyType(Object obj) {
        switch (obj) {
            case Integer i -> System.out.println("It's an Integer: " + i);
            case String s -> System.out.println("It's a String: " + s);
            case Double d -> System.out.println("It's a Double: " + d);
            default -> System.out.println("Unknown type");
        }
    }

    public static void main(String[] args) {
        identifyType(42);
        identifyType("Hello");
        identifyType(3.14);
    }
}
