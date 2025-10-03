import java.util.*;

class Question {
    String q;
    List<String> o;
    int a;

    Question(String q, List<String> o, int a) {
        this.q = q;
        this.o = o;
        this.a = a;
    }

    public boolean ask(Scanner s) {
        System.out.println("\n" + q);
        for (int i = 0; i < o.size(); i++) {
            System.out.println((i + 1) + ". " + o.get(i));
        }
        System.out.print("Enter choice: ");
        int x = -1;
        try {
            x = Integer.parseInt(s.nextLine().trim());
        } catch (Exception e) {
        }
        return x == a;
    }
}

public class QuizApp {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        List<Question> l = new ArrayList<>();
        l.add(new Question("What are Java loops?", Arrays.asList("Decision making statements", "Repetition statements", "Error handling", "None"), 2));
        l.add(new Question("What is enhanced for-loop?", Arrays.asList("Loop without condition", "Improved syntax for iterating collections", "Recursive loop", "Infinite loop"), 2));
        l.add(new Question("How do you handle multiple user inputs?", Arrays.asList("Using arrays", "Using Scanner with loops", "Using switch", "Using only if-else"), 2));
        l.add(new Question("How is switch-case different from if-else?", Arrays.asList("Switch supports multiple branches easily", "If-else only one condition", "Switch is faster always", "Both are identical"), 1));
        l.add(new Question("What are collections in Java?", Arrays.asList("Group of objects", "Only Arrays", "Primitive storage", "Thread library"), 1));
        System.out.println("===== Welcome to the Java Quiz App =====");
        int sc = 0;
        for (Question q : l) {
            if (q.ask(s)) {
                System.out.println("Correct");
                sc++;
            } else {
                System.out.println("Wrong");
            }
        }
        System.out.println("\n===== Quiz Over =====");
        System.out.println("Score: " + sc + " / " + l.size());
    }
}
