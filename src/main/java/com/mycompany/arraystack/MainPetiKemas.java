/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package com.mycompany.arraystack;

/**
 *
 * @author syahrilfarhan
 */
class NodePetiKemas{
    PetiKemas data;
    NodePetiKemas next;
    
    public NodePetiKemas(PetiKemas data){
        this.data = data;
        this.next = null;
    }
}

class PetiKemas {

    private int id;
    private String size; //20 feet atau 40 feet
    private float tonase; //berat
    private String tipe; //ada 2 jenis : Kering atau Reefer

    public PetiKemas(int id, String size, float tonase, String tipe) {
        this.id = id;
        this.size = size;
        this.tonase = tonase;
        this.tipe = tipe;
    }

    @Override
    public String toString() {
        return id + " - " + size + " - " + tonase + " - " + tipe;
    }
}

class LinkedListStackPetiKemas{
    private NodePetiKemas top;
    private int count; //sama kayak capacity;
    
    public LinkedListStackPetiKemas(){
        top = null;
        count = 0;
    }
    
    public boolean isEmpty(){
        return (top == null);
    }
    
    public int size(){
        return count;
    }   
    
    public void push(PetiKemas value){
        NodePetiKemas newNode = new NodePetiKemas(value);
        
        newNode.next = top;
        top = newNode;
        count++;
    }
    
    public PetiKemas pop(){
        if(isEmpty()){
            throw new IllegalStateException("Stack kosong / Underflow");
        }
        PetiKemas value = top.data;
        top = top.next;
        count--;
        return value;
        
    }
    
    public PetiKemas peek(){
        if(isEmpty()){
            throw new IllegalStateException("Stack kosong / underflow");
        }
        return top.data;
    }
    
    public void display(){
        if(isEmpty()){
            throw new IllegalStateException("Stack kosong / Underflow");
        }
        
        NodePetiKemas current = top;
        System.out.println("Isi stack (TOP Ke BOTTON ) : ");
        
        while(current != null){
            System.out.println("| " + current.data + " |" );
            current = current.next;
        }
    }
}

public class MainPetiKemas {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        LinkedListStackPetiKemas stack = new LinkedListStackPetiKemas();
        
        stack.push(new PetiKemas(1, "20 Feet", 50.5f, "Kering"));
        stack.display();
        System.out.println(" ");
        
        stack.push(new PetiKemas(2, "40 Feet", 45.5f, "Kering"));
        stack.display();
        System.out.println(" ");
        
        stack.push(new PetiKemas(3, "20 Feet", 21.5f, "Reefer"));
        stack.display();
        System.out.println(" ");
        
        stack.push(new PetiKemas(4, "40 Feet", 32.5f, "Kering"));
        stack.display();
        System.out.println(" ");
        
        stack.push(new PetiKemas(5, "20 Feet", 33.5f, "Reefer"));
        stack.display();
        System.out.println(" ");
        
        stack.push(new PetiKemas(6, "20 Feet", 12.5f, "Kering"));
        stack.display();
        System.out.println(" ");
        
        stack.push(new PetiKemas(7, "40 Feet", 20.5f, "Kering"));
        stack.display();
        System.out.println(" ");
        
        stack.push(new PetiKemas(8, "20 Feet", 11.5f, "Reefer"));
        stack.display();
        System.out.println(" ");
        
        stack.push(new PetiKemas(9, "40 Feet", 4.5f, "Kering"));
        stack.display();
        System.out.println(" ");
        
        stack.push(new PetiKemas(10, "20 Feet", 11.5f, "Reefer"));
        stack.display();
        System.out.println(" ");
        System.out.println(" ");
        
        System.out.println("POP: "+stack.pop());
        stack.display();
        
        System.out.println("TOP: "+ stack.pop());
        stack.display();
        
        System.out.println("TOP: "+stack.peek());
        System.out.println("Jumlah Peti Kemas : "+stack.size());
        System.out.println("Stack Kosong : "+stack.isEmpty());
    }
}
