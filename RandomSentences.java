import java.util.Random;
import java.util.Scanner;

public class RandomSentences {

    public static void main(String[] args) {

        String[] names = {"Peter", "Michael", "Jane", "Joanne", "Stephen",
                "Danielle", "Maria", "Helen", "Mark", "Luke"};
        String[] places = {"Sofia", "Plovdiv", "Burgas", "Varna",
                "Stara Zagora", "Russe", "Sliven", "Yambol", "Veliko Tarnovo"};
        String[] verbs = {"eats", "holds", "sees", "plays with", "brings",
                "remembers", "loves", "hates", "owns", "dreams about"};
        String[] nouns = {"stones", "cake", "apple", "laptop", "bikes"};
        String[] adverbs = {"slowly", "diligently", "warmly", "sadly",
                "rapidly"};
        String[] details = {"near the river", "at home", "in the park"};

        System.out.println("Hello, this is your first random-generated sentence:");
        System.out.println();

        Scanner scanner = new Scanner(System.in);

        while (true) {
            String randomName = getRandomWord(names);
            String randomPlace = getRandomWord(places);
            String randomVerb = getRandomWord(verbs);
            String randomNoun = getRandomWord(nouns);
            String randomAdverb = getRandomWord(adverbs);
            String randomDetail = getRandomWord(details);
            System.out.printf("--- %s from %s %s %s %s %s. ---\n", randomName,
                    randomPlace, randomAdverb, randomVerb, randomNoun,
                    randomDetail);
            System.out.println();
            System.out.println("Click [Enter] to generate a new one or type \"exit\".");

            String input = scanner.nextLine();

            if (input.equalsIgnoreCase("exit")) {
                System.out.println("Goodbye!");
                break;
            }
        }
    }
    public static String getRandomWord(String[] words) {
        Random random = new Random();
        int randomIndex = random.nextInt(words.length);
        return words[randomIndex];
    }
}