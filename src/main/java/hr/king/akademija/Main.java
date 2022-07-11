package hr.king.akademija;

import hr.king.akademija.generator.BasicPasswordGenerator;
import hr.king.akademija.generator.PasswordGenerator;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        PasswordGenerator passwordGenerator = new BasicPasswordGenerator();

        List<String> passwords = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            passwords.add(passwordGenerator.generatePassword(10));
        }

        passwords.forEach(System.out::println);
    }

}
