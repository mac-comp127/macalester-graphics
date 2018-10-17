package kluver.section04.GreeterExample;

import java.util.Scanner;

/**
 * Created by dkluver on 2/13/17.
 */
public class SpanishGreeter extends Greeter {
    public SpanishGreeter(String name) {
        super(name);
    }

    @Override
    public String getUserName(Scanner scanner) {
        System.out.println("¡Hola!, ¿Cómo te llamas?");
        return scanner.nextLine();
    }

    @Override
    public void greet(String userName) {
        System.out.println("Hola, "+userName+" me lammo es "+ getMyName());
    }
}















