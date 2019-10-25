/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author richa
 */
import java.util.Arrays;
public class ArrayStack<T> implements Stack<T> {
    public static final int CAPACITY= 1000;
    private T[] data;
    private int t = -1;
    public ArrayStack() {
        this(CAPACITY);
    }
    public ArrayStack(int capacity){
        data = (T[])new Object[capacity];
    }
    public int size(){
        return (t+1);
    }
    public void push(T e) throws IllegalStateException{
        if(size() == data.length)
            throw new IllegalStateException("Stack is full");
        data[++t]= e;
    }
    public T top(){
        if(isEmpty())
            return null;
        return data[t];
    }
    public T pop(){
        if(isEmpty())
            return null;
        T answer = data[t];
        data[t]= null;
        t--;
        return answer;
    }
    public boolean isEmpty(){
        if(size()==0){
            return true;
        }
        return false;
    }
    public static<T> void reverse(T[] a){
        Stack<T> buffer = new ArrayStack<>(a.length);
        for(int i = 0; i<a.length;i++){
            buffer.push(a[i]);
        
        }
        for(int i=0;i<a.length;i++)
            a[i]= buffer.pop();
    }
    
    public static boolean isMatched(String expression){
        final String opening = "({[";
        final String closing = "]})";
        Stack<Character> buffer= new LinkedStack<>();
        for(char c: expression.toCharArray()){
            if(opening.indexOf(c)!=-1)
                buffer.push(c);
            else if(closing.indexOf(c)!= -1){
                if(buffer.isEmpty())
                    return false;
                if(closing.indexOf(c) != opening.indexOf(buffer.pop()))
                    return false;
            }
        }
        return buffer.isEmpty();
    }
    public static void main (String args[]){
        Stack<Integer> S= new ArrayStack<>();
        S.push(5);
        S.push(3);
        System.out.println(S.size());
        System.out.println(S.pop());
        System.out.println(S.isEmpty());
        System.out.println(S.pop());
        System.out.println(S.isEmpty());
        System.out.println(S.pop());
        S.push(7);
        S.push(9);
        System.out.println(S.top());
        S.push(4);
        System.out.println(S.size());
        System.out.println(S.pop());
        S.push(6);
        S.push(8);
        System.out.println(S.pop());
        
        Integer[] a={4,8,15,16,23,42};
        String[] s= {"Jack", "Kate", "Hurley","Jin", "Michael"};
        System.out.println("a= " + Arrays.toString(a));
        System.out.println("s =" + Arrays.toString(s));
        System.out.println("Reversing...");
        reverse(a);
        reverse(s);
        System.out.println("a= " + Arrays.toString(a));
        System.out.println("s =" + Arrays.toString(s));
    }
}
