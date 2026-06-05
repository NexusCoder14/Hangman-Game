import java.util.*;

public class hang {

    static int count = 0;
    static String f = "";

    public static void game(String choice, String g, char[] arr) {
        f = new String(arr);
        if (choice.equals(f)) {
            return;
        }
        if (count >= 6) {
            return;
        }
        System.out.println("\nWord: " + f);
        System.out.println("Wrong guesses: " + count + "/6");

        Scanner sc = new Scanner(System.in);

        System.out.println("\nDo you want to try for the full word?");
        System.out.println("Press 1 for yes and 0 for no");
        int b = sc.nextInt();

        if (b == 1) {
            System.out.print("Enter your guess for the full word: ");
            String x = sc.next();
            if (choice.equals(x)) {
                f = choice;
                for (int i = 0; i < choice.length(); i++) arr[i] = choice.charAt(i);
                return;
            } else {
                System.out.println("Wrong full word guess!");
                count++;
                if (count >= 6) return;
            }
        }

        System.out.print("Guess a letter: ");
        g = sc.next();
        char guessedChar = g.charAt(0);

        boolean found = false;
        for (int i = 0; i < choice.length(); i++) {
            if (choice.charAt(i) == guessedChar) {
                arr[i] = guessedChar;
                found = true;
            }
        }

        if (!found) {
            System.out.println("Letter '" + guessedChar + "' not in word!");
            count++;
        } else {
            System.out.println("Good guess! '" + guessedChar + "' is in the word.");
        }
        game(choice, g, arr);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String g = "";

        String[] words = { "apple", "banana", "orange", "grape", "mango", "pineapple", "strawberry", "watermelon", "kiwi", "peach",
            "pear", "plum", "apricot", "cherry", "fig", "guava", "papaya", "lemon", "lime", "coconut",
            "almond", "cashew", "walnut", "peanut", "pistachio", "hazelnut", "macadamia", "bread", "butter", "cheese",
            "milk", "cream", "yogurt", "coffee", "tea", "sugar", "salt", "pepper", "honey", "jam",
            "biscuit", "cookie", "cake", "pastry", "pizza", "burger", "sandwich", "pasta", "noodle", "rice",
            "soup", "salad", "chicken", "beef", "pork", "fish", "shrimp", "crab", "lobster", "octopus",
            "squid", "tuna", "salmon", "sardine", "mackerel", "trout", "cod", "herring", "anchovy", "snapper",
            "grouper", "bass", "perch", "tilapia", "carp", "catfish", "dog", "cat", "horse", "cow",
            "goat", "sheep", "donkey", "camel", "tiger", "lion", "leopard", "cheetah", "panther", "wolf",
            "fox", "bear", "panda", "koala", "kangaroo", "monkey", "gorilla", "chimpanzee", "orangutan", "giraffe",
            "zebra", "elephant", "rhinoceros", "hippopotamus", "deer", "moose", "buffalo", "bison", "antelope", "gazelle",
            "rabbit", "hare", "squirrel", "rat", "mouse", "hamster", "guinea", "parrot", "sparrow", "pigeon",
            "crow", "raven", "eagle", "falcon", "hawk", "owl", "penguin", "peacock", "turkey", "duck",
            "goose", "swan", "flamingo", "ostrich", "emu", "kiwi", "lizard", "snake", "crocodile", "alligator",
            "turtle", "tortoise", "frog", "toad", "salamander", "newt", "butterfly", "dragonfly", "beetle", "ant",
            "bee", "wasp", "hornet", "mosquito", "spider", "scorpion", "centipede", "millipede", "computer", "keyboard",
            "monitor", "printer", "scanner", "speaker", "microphone", "camera", "battery", "charger", "cable", "router",
            "modem", "server", "network", "internet", "website", "browser", "software", "hardware", "program", "coding",
            "python", "java", "javascript", "html", "css", "database", "algorithm", "variable", "function", "object",
            "class", "method", "array", "string", "integer", "boolean", "compiler", "debugger", "terminal", "command",
            "process", "thread", "memory", "storage", "cloud", "security", "encryption", "firewall", "malware", "virus",
            "trojan", "worm", "phishing", "hacker", "developer", "engineer", "designer", "analyst", "manager", "teacher",
            "student", "doctor", "nurse", "pilot", "driver", "chef", "artist", "writer", "poet", "actor",
            "singer", "dancer", "athlete", "player", "coach", "referee", "judge", "lawyer", "police", "soldier",
            "farmer", "builder", "carpenter", "plumber", "electrician", "mechanic", "scientist", "researcher", "astronaut", "philosopher",
            "economist", "historian", "geographer", "mathematician", "physicist", "chemist", "biologist", "psychologist", "sociologist", "politician",
            "president", "minister", "governor", "senator", "mayor", "leader", "citizen", "country", "nation", "state",
            "city", "village", "town", "capital", "continent", "ocean", "river", "lake", "mountain", "valley",
            "desert", "forest", "jungle", "island", "beach", "harbor", "port", "bridge", "tunnel", "road",
            "highway", "railway", "airport", "station", "platform", "ticket", "passport", "luggage", "travel", "journey",
            "voyage", "adventure", "holiday", "vacation", "festival", "celebration", "ceremony", "tradition", "culture", "language",
            "history", "science", "technology", "engineering", "mathematics", "physics", "chemistry", "biology", "astronomy", "geology",
            "ecology", "environment", "climate", "weather", "temperature", "humidity", "pressure", "wind", "storm", "rain",
            "snow", "hail", "thunder", "lightning", "sunshine", "sunrise", "sunset", "midnight", "morning", "evening",
            "afternoon", "spring", "summer", "autumn", "winter", "yesterday", "today", "tomorrow", "future", "past",
            "present", "moment", "second", "minute", "hour", "day", "week", "month", "year", "decade",
            "century", "energy", "power", "force", "motion", "speed", "velocity", "acceleration", "gravity", "friction",
            "momentum", "density", "volume", "mass", "length", "width", "height", "depth", "area", "angle",
            "circle", "square", "triangle", "rectangle", "polygon", "sphere", "cylinder", "cone", "cube", "prism",
            "pyramid", "equation", "formula", "theorem", "logic", "reason", "thought", "idea", "dream", "vision",
            "plan", "goal", "mission", "success", "failure", "victory", "defeat", "effort", "practice", "training",
            "discipline", "patience", "courage", "strength", "wisdom", "knowledge", "experience", "friendship", "relationship", "family",
            "brother", "sister", "mother", "father", "parent", "child", "baby", "teenager", "adult", "elder",
            "community", "society", "freedom", "justice", "equality", "respect", "honesty", "kindness", "loyalty", "trust",
            "hope", "faith", "love", "peace", "happiness", "sadness", "anger", "fear", "surprise", "disgust",
            "excitement", "curiosity", "creativity", "innovation", "imagination", "invention", "discovery", "exploration", "education", "learning"
        };
        int d = (int) (Math.random() * words.length);
        String choice = words[d];

        System.out.println("Word has been selected!");
        System.out.println("The word has " + choice.length() + " letters.");
        System.out.println("Hangman game starts!\n");

        char[] arr = new char[choice.length()];
        Arrays.fill(arr, '-');

        game(choice, g, arr);
        if (choice.equals(f)) {
            System.out.println("\nThe word was: " + choice);
            System.out.println("You were saved... YOU WIN! 🎉");
        } else {
            System.out.println("\nThe word was: " + choice);
            System.out.println("Hanged... game over. YOU LOSE 💀");
        }
    }
}
