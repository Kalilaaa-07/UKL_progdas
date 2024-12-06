package soal3;

import java.util.Scanner;
import java.util.HashMap;

public class Nomor2{
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Masukkan jumlah elemen array: ");
        int n = s.nextInt();
        
        int[] array = new int[n];
        System.out.println("Masukkan elemen array:");
        for (int i = 0; i < n; i++) {
            System.out.print("Elemen ke-" + (i + 1) + ": ");
            array[i] = s.nextInt();
        }
        
        HashMap<Integer, Integer> elementCount = new HashMap<>();
        for (int i = 0; i < n; i++) {
            elementCount.put(array[i], elementCount.getOrDefault(array[i], 0) + 1);
        }
        
        //elemen yang terduplikat dan jumlah kemunculannya
        boolean Duplicates = false;
        System.out.print("Array memiliki elemen duplikat: ");
        for (Integer key : elementCount.keySet()) {
            if (elementCount.get(key) > 1) {
                Duplicates = true;
                System.out.print(key + "(" + elementCount.get(key) + ") ");
            }
        }
        
        if (!Duplicates) {
            System.out.println("Array tidak memiliki elemen duplikat.");
        }
        s.close();
    }
}
