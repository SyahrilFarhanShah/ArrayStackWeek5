/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.arraystack;

/**
 *
 * @author syahrilfarhan
 */
class ArrayStack {
    private int[] data;
    private int top;
    private int capacity;
    
    public ArrayStack(int capacity){
        if (capacity <= 0){
            throw new IllegalArgumentException("Kapasitas Harus lebih dari 0");
        }
        this.capacity = capacity;
        data = new int [capacity];
        top = -1;
    }
    
    public  boolean isEmpty(){
        return top == -1;
    }
    
    public boolean isFull(){
        return top == capacity -1;
    }
    
    public int size(){
        return top+1;
    }
    
    public void push(int value){
        if(isFull()){
            System.out.println("Stack sudah Full / Overflow");
        }
        
        top++;
        data[top] = value;
    }
    
    public int pop(){
        if(isEmpty()){
            throw new IllegalStateException("Stack kosong / underflow");
        }
        
        int value = data [top];
        top--;
        return value;
    }
    
    public int peek(){
        if(isEmpty()){
            throw new IllegalStateException("Stack kosong / underflow");
        }
        return data[top];
    }
    
    public void display(){
        if(isEmpty()){
            System.out.println("Stack Kosong");
            return;
        }
        
        System.out.println("Isi Stack (Top ke Bottom) : ");
        
        for(int i = top;i>= 0; i--){
            System.out.println("| " + data[i]+ " |");
        }
    }
    
    
}  

public class MainArrayStack {

    public static void main(String[] args) {
//        ArrayStack stack = new ArrayStack(5);
//        
//        stack.push(10);
//        stack.push(20);
//        stack.push(30);
//        stack.push(40);
//        
//        stack.display();
//        
//        System.out.println("TOP: " + stack.peek());
//        System.out.println("POP: " + stack.pop());
//        stack.display();
//        
//        System.out.println("Jumlah elemen : " + stack.size());
//        System.out.println("Stack kosong? : " + stack.isEmpty());
//        System.out.println("Stack penuh?  : " + stack.isFull());

          ArrayStack stack = new ArrayStack(3);
          stack.push(10);
          stack.push(20);
          stack.push(30);
          stack.push(40);
          stack.display();
    }
}
