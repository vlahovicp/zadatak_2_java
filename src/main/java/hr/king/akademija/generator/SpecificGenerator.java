package hr.king.akademija.generator;

public class SpecificGenerator extends PasswordGenerator{

    private final String LOWER_CASE_LETTERS = "qwertzuiopasdfghjklyxcvbnm";

    @Override
    public String generatePassword(int size) {
        StringBuilder password = new StringBuilder();

        for (int i = 0; i < size; i++) {
            password.append(lowerCase());
        }

        return password.toString();
    }

    private String lowerCase() {
        String lowerCase = "";

        do {
            lowerCase = Character.toString(getRandomCharacter());
        } while (!LOWER_CASE_LETTERS.contains(lowerCase));

        return lowerCase;
    }
}
