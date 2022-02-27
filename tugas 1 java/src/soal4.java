        // soal no 4
        // tentukan hasil yang didapatkan ketika dilakukan perintah berikut
        // indexOf(a), indexOf(c), indexOf(q) --> untuk memeriksa indeks elemen
        // pada array

import java.util.ArrayList;

public class soal4 {
    public static void main(String[] args) {
        // membuat ArrayList nama dengan tipe data String
        // String[] nama = {"R","E","N","A"}
        ArrayList<String> nama = new ArrayList<String>();

        // menambahkan data dengan tipe data string ke array nama
        nama.add("r");
        nama.add("e");
        nama.add("n");
        nama.add("a");

        // menampilkan elemen array sebelum dilakukan perintah indexOf()
        System.out.println("before operation: " + nama);

        // untuk memberi space atau jarak
        System.out.println("");

        // menampilkan hasil perintah indexOf()
        System.out.println("index of a = " + nama.indexOf("a"));  
        System.out.println("index of c = " + nama.indexOf("c")); 
        System.out.println("index of q = " + nama.indexOf("q"));
        // indexOf "c" dan "q" bernilai -1 karena tidak terdapat pada array
        // sedangkan indexOf "a" bernilai 3 karena terletak pada indeks ke-3
        //  pada array
    }
}