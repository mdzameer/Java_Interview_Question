package asgmnt3.defaultmethods;

@FunctionalInterface
interface Transformer {
    String transform(String input);

    default String defaultTransform() {
        return "DEFAULT";
    }
}

public class FunctionalWithDefault {
    public static void main(String[] args) {
        Transformer upper = str -> str.toUpperCase();
        System.out.println(upper.transform("hello"));
        System.out.println(upper.defaultTransform());
    }
}
