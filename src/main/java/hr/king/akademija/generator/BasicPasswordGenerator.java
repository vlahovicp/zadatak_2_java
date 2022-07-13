package hr.king.akademija.generator;

public class BasicPasswordGenerator extends PasswordGenerator {

    @Override
    public String generatePassword(int size) {
        StringBuilder password = new StringBuilder();

        for (int i = 0; i < size; i++) {
            password.append(getRandomCharacter());
        }

        return password.toString();
    }

}
