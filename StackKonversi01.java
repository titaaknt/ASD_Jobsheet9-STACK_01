/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author AGNES TITANIA
 */
public class StackKonversi01 {
    int[] tumpukanBiner;
    int size;
    int top;

    public StackKonversi01() {
        this.size = 32; // maksimum 32 bit
        tumpukanBiner = new int[size];
        top = -1;
    }

    public boolean isEmpty() {
        return top == -1;
    }

    public boolean isFull() {
        return top == size - 1;
    }

    public void push(int data) {
        if (isFull()) {
            System.out.println("x: Stack penuh");
        } else {
            top++;
            tumpukanBiner[top] = data;
        }
    }

    public int pop() {
        if (isEmpty()) {
            System.out.println("x: Stack kosong");
            return -1;
        } else {
            int data = tumpukanBiner[top];
            top--;
            return data;
        }
    }

    public String konversiDesimalKeBiner(int nilai) {
        StackKonversi01 stack = new StackKonversi01();
       while (nilai != 0) {
            int sisa = nilai % 2;
            stack.push(sisa);
            nilai = nilai / 2;
        }

        String biner = "";
        while (!stack.isEmpty()) {
            biner += stack.pop();
        }
        return biner;
    }
}
