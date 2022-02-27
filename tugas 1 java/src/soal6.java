        // soal no 6
        // tentukan hasil yang didapatkan ketika dilakukan perintah berikut
        // add(0,e), add(2,f), add(3,g), add(4,h), add(6,h), add(-3,j)
        //  --> untuk menambahkan elemen pada array

import java.util.ArrayList;

public class soal6 {
    public static void main(String[] args) {
        // membuat ArrayList nama dengan tipe data String
        // String[] nama = {"R","E","N","A"}
        ArrayList<String> nama = new ArrayList<String>();

        // menambahkan data dengan tipe data string ke array nama
        nama.add("R");
        nama.add("E");
        nama.add("N");
        nama.add("A"); 
        
        // menampilkan elemen array sebelum perintah add()
        System.out.println("before operation: " + nama); 
        
        // menampilkan elemen array setelah perintah add(indeks, char)
        nama.add(0,"e");
        System.out.println("after char 'e' was added = " + nama);

        nama.add(2,"f");
        System.out.println("after char 'f' was added = " + nama);

        nama.add(3,"g");
        System.out.println("after char 'g' was added = " + nama);

        nama.add(4,"h");
        System.out.println("after char 'h' was added = " + nama);

        nama.add(6,"h");
        System.out.println("after char 'h' was added = " + nama);

        nama.add(-3,"j");
        System.out.println("after char 'j' was added = " + nama);
    }
} 