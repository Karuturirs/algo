package com.prepare.algo.ds;

public class MyStack<T> {

    StackNode<T> top;

    private static class StackNode<T>{

        T data;
        StackNode<T> next;

        StackNode(T d){
            data = d;
        }
    }

    public boolean isEmpty(){
        return top == null;
    }

    public T pop(){
        StackNode<T> x = top;
        top = x.next;
        return x.data;
    }

    public void push(T item){
        StackNode<T> x = new StackNode(item);
        x.next = top;
        top = x;
    }

    public T peek(){
        return top.data;
    }


    public void print() {
        StackNode<T> x = top;
        while(x !=null){
            System.out.println(x.data);
            x = x.next;
        }
    }

    public static void main(String[] args){

        MyStack<Integer> stack = new MyStack();

        stack.push(1);
        stack.push(2);
        stack.push(3);

        stack.pop();
        stack.push(4);
        stack.pop();
        stack.push(5);

        stack.print();

    }

}
