/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author AGNES TITANIA
 */
public class StackTugasMahasiswa01 {
    Mahasiswa01[] stack;
    int top;
    int size;

    public StackTugasMahasiswa01(int size) {
        this.size = size;
        stack = new Mahasiswa01[size];
        top = -1;
    }

    public boolean isFull() {
        return top == size - 1;
    }

    public boolean isEmpty() {
        return top == -1;
    }

    public void push(Mahasiswa01 mhs) {
        if (!isFull()) {
            top++;
            stack[top] = mhs;
        }
    }

    public Mahasiswa01 pop() {
        if (!isEmpty()) {
            Mahasiswa01 m = stack[top];
            top--;
            return m;
        } else {
            return null;
        }
    }

    public Mahasiswa01 peek() {
        if (!isEmpty()) {
            return stack[top];
        } else {
            return null;
        }
    }

    // ✅ Tambahan:
    public Mahasiswa01 peekBottom() {
        if (!isEmpty()) {
            return stack[0];
        } else {
            return null;
        }
    }

    public int countTugas() {
        return top + 1;
    }

    public void print() {
        for (int i = 0; i <= top; i++) {
            String nilai = (stack[i].nilai == -1) ? "Belum Dinilai" : String.valueOf(stack[i].nilai);
            System.out.println(stack[i].nama + "\t" + stack[i].nim + "\t" + stack[i].kelas + "\t" + nilai);
        }
    }
}