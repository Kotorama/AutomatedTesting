package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        char ch = 'A';

        System.out.println("Is digit? " + Character.isDigit(ch));
        System.out.println("Is letter? " + Character.isLetter((ch)));
        System.out.println("Is capital? " + Character.isUpperCase((ch)));
        System.out.println("Is lowercase? " + Character.isLowerCase((ch)));
        System.out.println("Conversion to capital: " + Character.toUpperCase((ch)));
        System.out.println("Conversion to lowercase: " + Character.toLowerCase((ch)));
    }
}