package draft.test3;

public class Main {
    public static void main(String[] args) {
        Stack<Character> charStack = new Stack<>();
        charStack.push('A');
        charStack.push('B');
        charStack.push('C');

        while (!charStack.isEmpty()) {
            System.out.println("Pop from charStack: " + charStack.pop());
        }

        Stack<Integer> intStack = new Stack<>();
        intStack.push(1);
        intStack.push(2);
        intStack.push(3);

        while (!intStack.isEmpty()) {
            System.out.println("Pop from intStack: " + intStack.pop());
        }
    }
}

