package w9.stack;

public class Test {
    public static void main(String[] args) {
        Stack<Integer> stackInteger = new Stack<>(3);
        stackInteger.push(1);
        stackInteger.push(2);
        stackInteger.push(123);
        System.out.println(stackInteger.isEmpty() + " " + stackInteger.getSize());
        System.out.println(stackInteger.pop());
        stackInteger.pop();
        System.out.println(stackInteger.peak());

        Stack<Character> stackCharacter = new Stack<>(3);
        stackCharacter.push('a');
        stackCharacter.push('+');
        stackCharacter.push(' ');
        System.out.println(stackCharacter.isEmpty() + " " + stackCharacter.getSize());
        System.out.println(stackCharacter.pop());
        stackCharacter.pop();
        System.out.println(stackCharacter.peak());
    }
}
