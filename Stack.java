/* 
Implement a stack with the following methods:   push, pop, peek, and isEmpty.

@Author: Andile Jaden Mbele
*/

public class Stack {
    
    //let's first store the stack elements in an array
    private int[] stack;
    //the top of the stack is the index of the last element in the array
    private int top;
    //total capacity of the stack
    private int capacity;


    //constructor
    public Stack(int capacity) {
        this.capacity = capacity;
        this.stack = new int[capacity];
        this.top = -1;
    }
    
    //push an element to the stack
    public void push(int element) {
        if (top == capacity - 1) {
            System.out.println("Stack is full");
            return;
        }
        stack[++top] = element;
    }
    
    //pop an element from the stack
    public int pop() {
        if (top == -1) {
            System.out.println("Stack is empty");
            return -1;
        }
        return stack[top--];
    }

    //peek the top element of the stack
    public int peek() {
        if (top == -1) {
            System.out.println("Stack is empty");
            return -1;
        }
        return stack[top];
    }

    //check if the stack is empty
    public boolean isEmpty() {
        return top == -1;
    }

    //check if the stack is full
    public boolean isFull() {
        return top == capacity - 1;
    }

    //print the stack
    public void printStack() {
        if (top == -1) {
            System.out.println("Stack is empty");
            return;
        }
        for (int i = top; i >= 0; i--) {
            System.out.print(stack[i] + " ");
        }
        System.out.println();
    }

    //main method
    public static void main(String[] args) {
        Stack stack = new Stack(5);
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);
        stack.printStack();
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
    }
}
