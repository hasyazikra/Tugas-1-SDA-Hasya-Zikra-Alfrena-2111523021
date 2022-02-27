        // soal no 2
        // tentukan hasil yang didapatkan ketika dilakukan perintah berikut
        // size()  --> untuk memeriksa panjang/ ukuran arraylist

import java.util.ArrayList;

public class soal2 {
    //size()
    public static void main(String[] args) {
        // membuat ArrayList nama dengan tipe data String
        // String[] nama = {"R","E","N","A"}
        ArrayList<String> nama = new ArrayList<String>();

        // menambahkan data dengan tipe data string ke array nama
        nama.add("R");
        nama.add("E");
        nama.add("N");
        nama.add("A");
    
    // menampilkan arraylist nama
    System.out.println("before operation: " + nama); 
    
    // mendeklarasikan size dg tipe data integer yang isinya nama.size
    int size = nama.size();

    // menampilkan size dari arraylist nama
    System.out.println("Size of list = " + size);
    }
}  