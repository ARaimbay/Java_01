public class Person {
    private String middleName = "Christopher";

    public static Person kate = null;
    public static double PI = 3.14;

    public void sayHello() {
        System.out.println("Hello");
    }

    public void saySomething(String message){
        System.out.println(message);
    }

    public char getMiddleInitial() {
        return middleName.charAt(0);
    }

    public int add(int num1, int num2) {
        return num1 + num2;
    }

    public void test(int num1, int num2, String[] words) {
        //do something clever with words
    }

    public void test2(int num1, int num2, String... words) {
        // do something clever
        System.out.println(words[2]);
    }

    public static void main(String[] args) {
        Person p1 = new Person();
        p1.sayHello();
        p1.saySomething("My groovy message");
        p1.saySomething("Here's something else to say");
        System.out.println(p1.getMiddleInitial());
        System.out.println(p1.add(3, 5));
        String[] words = new String[] {"one", "two", "three"};
        p1.test(3, 5, words);
        p1.test2(3, 5, "one", "two", "three");
        System.out.println(PI);
    }
}
