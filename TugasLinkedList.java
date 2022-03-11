import java.util.LinkedList;

public class TugasLinkedList{
    public static void main(String[] args) {
        
        System.out.println("-------------------------------------");
        System.out.println("Nama\t: Syakina Triyana");
        System.out.println("NIM\t: 2111522017");
        System.out.println("Matkul\t: Struktur Data dan Algoritma");
        System.out.println("-------------------------------------");
        
        LinkedList <String> saya = new LinkedList<>();

        saya.add("S");
        saya.add("Y");
        saya.add("A");
        saya.add("K");
        saya.add("I");
        saya.add("N");
        saya.add("A");
        saya.add(" ");
        saya.add("T");
        saya.add("R");
        saya.add("I");
        saya.add("Y");
        saya.add("A");
        saya.add("N");
        saya.add("A");

        System.out.println("Nama Lengkap    \t: " + saya);
        System.out.println("Ukuran awal     \t: " + saya.size());
        System.out.println("-------------------------------------");

        //Perintah Add

        saya.addFirst("K");
        saya.addFirst(" ");
        saya.add("J");
        saya.add(5,"R");
        saya.addLast("X");

        System.out.println("1. Penggunaan perintah Add");
        System.out.println("Setelah Ditambahkan\t: " + saya);
        System.out.println("Ukuran setelah Add\t: " + saya.size());
        System.out.println("-------------------------------------");

        //Perintah Set

        saya.set(0,"W");
        saya.set(6,"Q");
        saya.set(12,"C");
        saya.set(16, "O");

        System.out.println("2. Penggunaan perintah Set");
        System.out.println("Setelah Disisipkan\t: " + saya);
        System.out.println("Ukuran setelah Set\t: " + saya.size());
        System.out.println("-------------------------------------");

        //Perintah Remove

        saya.removeFirst();
        saya.remove(7);
        saya.removeLast();
        
        System.out.println("3. Penggunaan perintah Remove");
        System.out.println("Setelah Dihapus\t: " + saya);
        System.out.println("Ukuran setelah Remove\t: " + saya.size());
        System.out.println("-------------------------------------");

        //Perintah Pop

        System.out.println("4. Penggunaan perintah Pop");
        System.out.println("Elemen Terhapus \t: " + saya.pop());
        System.out.println("LinkedList setelah Pop\t: " + saya);
        System.out.println("Ukuran setelah Pop\t: " + saya.size());
        System.out.println("-------------------------------------");

        //Perintah Push

        saya.push("Ir.");
        saya.push("1.");

        System.out.println("5. Penggunaan perintah Push");
        System.out.println("Fungsi Push\t: " + saya);
        System.out.println("Ukuran setelah Push\t: " + saya.size());
        System.out.println("-------------------------------------");

    }
}
