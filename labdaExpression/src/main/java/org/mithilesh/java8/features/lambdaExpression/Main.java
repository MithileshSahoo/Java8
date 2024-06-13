package org.mithilesh.java8.features.lambdaExpression;

public class Main {
    public static void main(String[] args) {

        // Use lambda expressions to declare the functional  interface methods.
        Greetings greetings = () -> System.out.println("Good Morning !!");

        Greetings greetings1 = () -> System.out.println("Good afternoon !!");

        GreetingsWithOneParam greetingsWithOneParam =
                (String name) -> System.out.println("Good morning, " + name);


        GreetingsWithMultiParam greetingsWithMultiParam =
                (String name1, String name2) -> System.out.println("Good morning, " + name1 + ", " + name2);

        // Call the above methods
        greetings.Hello();
        greetings1.Hello();
        greetingsWithOneParam.GoodMorning("Mithilesh");
        greetingsWithMultiParam.Greetings("Ram", "Manoj");
    }
}