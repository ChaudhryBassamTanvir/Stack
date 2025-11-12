import java.util.Stack;

public class StackClass {

public static void pushAtBottom(int data, Stack<Integer> s){
if (s.isEmpty()) {
    s.push(data);
    return;
}



    int top=s.pop();
    pushAtBottom(data, s);
s.push(top);
}

public static Stack reverseaStack(Stack<Integer> s, Stack<Integer> newStack){
   if (s.isEmpty()) {
    return newStack;
   }
   
    int top =s.pop();

    reverseaStack(s, newStack);
    newStack.push(top);
    return newStack;
}


    public static void main(String[] args) {
     Stack<Integer> s = new Stack<>();
     Stack<Integer> newStack = new Stack<>();
        

s.push(1);
s.push(2);
s.push(3);

// pushAtBottom(4, s);
reverseaStack(s, newStack);

while (!newStack.isEmpty()) {
    System.out.println(newStack.peek());
    newStack.pop();
}
    }
}
