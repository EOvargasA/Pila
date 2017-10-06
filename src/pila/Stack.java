/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pila;

/**
 *
 * @author Osiris
 */
public class Stack <T>{
    private Node<T> top;
    private int size;
    
    Stack(){
        top = null;
        size = 0;
    }
    
    Stack(T d){
        Node<T> a = new Node<T>(d);
        top = a;
        size++;
    }
    
    public int getSize(){
        return size;
    }
    
    public void push (T d){
        Node<T> a = new Node<T>(d);
        a.next = top;
        top = a;
        size++;
    }
    
    public T pop(){
        if(!isEmpty()){
            T a = top.data;
            top = top.next;
            size--;
            return a;
        }
        return null;
    }
    
    public T getTop(){
        if(!isEmpty()){
            return top.data;
        }
        return null;
    }
    
    public void showStack(){
        Node<T> a = top;
        while (a != null){
            System.out.print("["+a.data+"] -> ");
            a = a.next;
        }
        System.out.println("null");
    }
    
    public boolean isEmpty(){
        return size == 0;
    }
}
