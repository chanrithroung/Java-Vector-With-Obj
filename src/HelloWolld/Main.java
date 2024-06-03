package HelloWolld;
public class Main {
    public static void main(String[] args) {
        Main sayHello = new Main();
        sayHello.sayHelloWorld();
        System.out.println(sayHello.getString());
    }

    public void sayHelloWorld() {
        System.out.println("Hello, World");
    }

    public String getString() {
        return "This is a string";
    }

}