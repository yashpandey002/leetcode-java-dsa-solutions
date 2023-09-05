public class Main {
    public static Boolean main(String[] args) {
        String sentence = "thequickbrownfoxjumpsoverthelazydog";
        String alphabet = "abcdefghijklmnopqrstuvwxyz";
        for (int i = 0; i < sentence.length(); i++) {
            for (int j = 0; j < alphabet.length(); j++) {
                if (sentence.charAt(i) != alphabet.charAt(j)) {
                    System.out.println("Not Pangram");
                    break;
                }
            }
        }

        System.out.println("Pangram");
    }
}