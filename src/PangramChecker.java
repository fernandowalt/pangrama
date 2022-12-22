

public class PangramChecker {

    public boolean isPangram(String input) {

        String converted = input.toLowerCase().replaceAll("\\s+", "");

        for (char a : "abcdefghijklmnopqrstuvwxyz".toCharArray()) {

            if (converted.indexOf(a) == -1) {
                return false;
            }
        }
        return true;
    }


}

