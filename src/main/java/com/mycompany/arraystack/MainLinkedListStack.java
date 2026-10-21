/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.arraystack;

/**
 *
 * @author syahrilfarhan
 */

class Node{
    int data;
    Node next;
    
    public Node(int data){
        this.data = data;
        this.next = null;
    }
}

class LinkedListStack{
    private Node top;
    private int count; //sama kayak capacity;
    
    public LinkedListStack(){
        top = null;
        count = 0;
    }
    
    public boolean isEmpty(){
        return (top == null);
    }
    
    public int size(){
        return count;
    }   
    
    public void push(int value){
        Node newNode = new Node(value);
        
        newNode.next = top;
        top = newNode;
        count++;
    }
    
    public int pop(){
        if(isEmpty()){
            throw new IllegalStateException("Stack kosong / Underflow");
        }
        int value = top.data;
        top = top.next;
        count--;
        return value;
        
    }
    
    public void display(){
        if(isEmpty()){
            throw new IllegalStateException("Stack kosong / Underflow");
        }
        
        Node current = top;
        System.out.println("Isi stack (TOP Ke BOTTON ) : ");
        
        while(current != null){
            System.out.println("| " + current.data + " |" );
            current = current.next;
        }
    }
}

public class MainLinkedListStack {
    public static void main(String[] args) {
        LinkedListStack stack = new LinkedListStack();
        
//        stack.push(10);
//        stack.push(20);
//        stack.push(30);
//        stack.push(40);
//        
//        stack.display();
//        
//        System.out.println("POP: " + stack.pop());
//        stack.display();
//        
//        System.out.println("Jumlah elemen : " + stack.size());
//        System.out.println("Stack kosong? : " + stack.isEmpty());

//        stack.push(15);
//        stack.push(25);
//        stack.push(35);
//        stack.display();
//        System.out.println("POP: "+stack.pop());
//        
//        stack.push(45);
//        stack.push(55);
//        stack.display();
//        System.out.println("POP: "+stack.pop());
//        stack.display();

            
    }
}
