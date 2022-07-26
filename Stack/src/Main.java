import java.util.Stack;

public class Main extends Stack{
    public static void main(String[] args) throws Exception {
        Stack s = new Stack();

        s.push(1);
        s.push(2);
        s.push(45);
        s.pop();

        //stack.display();

        System.out.println(s.pop());
        System.out.println(s.pop());
        s.peek();

        System.out.println(s.pop());
        System.out.println(s.pop());
        System.out.println(s.pop());
        //System.out.println(stack.pop());


        //stack.display();


    }
}