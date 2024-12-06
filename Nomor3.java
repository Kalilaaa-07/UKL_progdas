package soal3;

import java.util.HashMap;
import java.util.Scanner;

public class Nomor3 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.printf("Masukkan elemen array: ");
        String input = s.nextLine();

        // Mengubah input menjadi array integer
        String[] inputArray = input.split(" ");
        int[] array = new int[inputArray.length];
        for (int i = 0; i < inputArray.length; i++) {
            array[i] = Integer.parseInt(inputArray[i]);
        }

        HashMap<Integer, Integer> frequencyMap = new HashMap<>();

        for (int num : array) {
            if (frequencyMap.containsKey(num)) {
                frequencyMap.put(num, frequencyMap.get(num) + 1);
            } else {
                frequencyMap.put(num, 1);
            }
        }

        System.out.println("Hasil output:");
        for (int key : frequencyMap.keySet()) {
            System.out.println(key + " muncul " + frequencyMap.get(key) + " kali");
        }
        s.close();
    }
}
