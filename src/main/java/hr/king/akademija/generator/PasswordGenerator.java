package hr.king.akademija.generator;

import java.util.Random;

public abstract class PasswordGenerator {

    protected Random random;

    public PasswordGenerator() {
        this.random = new Random();
    }

    public abstract String generatePassword(int size);

    protected final Character getRandomCharacter() {
        if (this.random.nextInt() % 2 == 0) {
            return (char) (this.random.nextInt('z' - 'a') + 'a');
        } else {
            if (this.random.nextBoolean()) {
                return (char) (this.random.nextInt('Z' - 'A') + 'A');
            } else {
                return (char) (this.random.nextInt('9' - '0') + '0');
            }
        }
    }
}
