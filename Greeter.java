public class Greeter {

    void greeting() {
        System.out.println("Hi there");
    }

    public static void main(String[] args) {
        (new Greeter()).greeting();
    }
}