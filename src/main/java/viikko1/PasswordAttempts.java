package viikko1;

public class PasswordAttempts {
    public static String login(String[] tries) {
  String correct = "java123";
        int limit = Math.min(3, tries.length);
        for (int i = 0; i < limit; i++) {
            if (tries[i].equals(correct)) {
                return "Tervetuloa!";
            }
        }
        return "Liian monta virheellistä yritystä.";
    }
}