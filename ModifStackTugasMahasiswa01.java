public class ModifStackTugasMahasiswa01 {
    ModifMahasiswa01[] stack;
    int top;
    int size;

    // Konstruktor
    public ModifStackTugasMahasiswa01(int size) {
        this.size = size;
        stack = new ModifMahasiswa01[size];
        top = -1;
    }

    // Method untuk memeriksa jika stack penuh
    public boolean isFull() {
        return top == size - 1;
    }

    // Method untuk memeriksa jika stack kosong
    public boolean isEmpty() {
        return top == -1;
    }

    // Method untuk menambah tugas ke dalam stack
    public void push(ModifMahasiswa01 mhs) {
        if (!isFull()) {
            top++;
            stack[top] = mhs;
        } else {
            System.out.println("Stack penuh! Tidak bisa menambahkan tugas lagi.");
        }
    }

    // Method untuk mengeluarkan tugas dari stack
    public ModifMahasiswa01 pop() {
        if (!isEmpty()) {
            ModifMahasiswa01 m = stack[top];
            top--;
            return m;
        } else {
            System.out.println("Stack kosong! Tidak ada tugas untuk dinilai.");
            return null;
        }
    }

    // Method untuk melihat tugas terakhir tanpa mengeluarkannya
    public ModifMahasiswa01 peek() {
        if (!isEmpty()) {
            return stack[top];
        } else {
            System.out.println("Stack kosong! Tidak ada tugas yang dikumpulkan.");
            return null;
        }
    }

    // Method untuk mencetak semua tugas di stack
    public void print() {
        if (isEmpty()) {
            System.out.println("Stack kosong! Tidak ada tugas yang dikumpulkan.");
        } else {
            for (int i = 0; i <= top; i++) {
                String nilaiTugas = (stack[i].nilai == -1) ? "Belum Dinilai" : String.valueOf(stack[i].nilai);
                System.out.println(stack[i].nama + "\t" + stack[i].nim + "\t" + stack[i].kelas + "\t" + nilaiTugas);
            }
        }
        System.out.println();
    }

    // Method untuk melihat tugas pertama di stack (bottom)
    public ModifMahasiswa01 peekBottom() {
        if (!isEmpty()) {
            return stack[0];
        } else {
            System.out.println("Stack kosong! Tidak ada tugas yang dikumpulkan.");
            return null;
        }
    }

    // Method untuk menghitung jumlah tugas dalam stack
    public int countTugas() {
        return top + 1;
    }
}
