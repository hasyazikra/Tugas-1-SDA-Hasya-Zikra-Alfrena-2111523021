        // soal no 3
        // tentukan hasil yang didapatkan ketika dilakukan perintah berikut
        // get(0), get(2), get(6), get(-3) --> untuk mencari elemen pada indeks
        //  tertentu

import java.util.ArrayList;

public class soal3 {
    public static void main(String[] args) {
        // membuat ArrayList nama dengan tipe data String
        // String[] nama = {"R","E","N","A"}
        ArrayList<String> nama = new ArrayList<String>(4);

        // menambahkan data dengan tipe data string ke array nama
        nama.add("R");
        nama.add("E");
        nama.add("N");
        nama.add("A");

        // menampilkan elemen array sebelum dilakukan perintah get()
        System.out.println("before operation: " + nama);

        // menampilkan hasil setelah dilakukan perintah get()
        System.out.println("get(0) = " + nama.get(0));
        System.out.println("get(2) = " + nama.get(2));
        System.out.println("get(6) = " + nama.get(6));
        System.out.println("get(-3) = " + nama.get(-3));
    }
}  