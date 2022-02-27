        // soal no 5
        // tentukan hasil yang didapatkan ketika dilakukan perintah berikut
        // remove(0), remove(3), remove(2) --. untuk menghapus elemen pada array

import java.util.ArrayList;

public class soal5 {
    public static void main(String[] args) {
        // membuat ArrayList nama dengan tipe data String
        // String[] nama = {"R","E","N","A"}
        ArrayList<String> nama = new ArrayList<String>();

        // menambahkan data dengan tipe data string ke array nama
        nama.add("R");
        nama.add("E");
        nama.add("N");
        nama.add("A");  

        // menampilkan elemen array sebelum perintah remove()
        System.out.println("before remove: " + nama);

        // menampilkan elemen array setelah perintah remove()
        System.out.print("after remove: ");
        System.out.println(nama.remove(0));
        System.out.println(nama.remove(3)); 
        System.out.println(nama.remove(2));
    }

} 