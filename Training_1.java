package PROB04;

import java.util.Arrays;

public class Training_1 {
	public static void main (String [] args) {
		int [] angka1 = {6,3,9,4,5,2};
		int [] angka2 = {8,5,7,1,2,9};
		
		int [] jawab = penjumlahan(angka1, angka2);
		int [] jawab2 = gabung(angka1, angka2);
		
		printHasil(jawab);
		System.out.println("");
		printHasil(jawab2);
		System.out.println("");
		urutMundur(angka1);
		printHasil(angka1);
		}
	private static int [] penjumlahan (int [] array1, int [] array2) {
		int hasil [] = new int [array1.length];
		for (int i = 0 ; i < array1.length ; i++) {
			hasil [i] = array1[i] + array2[i];
		}
		return hasil;
	}
	private static int [] gabung (int [] array1, int [] array2) {
		int hasil [] = new int [array1.length + array2.length];
		for (int i = 0 ; i < array1.length ; i++) {
			hasil [i] = array1[i];
		}
		for (int i = 0 ; i < array2.length ; i++) {
			hasil [(array1.length +i)] = array2[i];
		}
		return hasil;
	}
	private static void urutMundur (int [] array1) {
		Arrays.sort(array1);
		for(int i = 0 ; i < array1.length/2 ; i++) {
			int balik = array1[i];
			array1[i] = array1[(array1.length-1)-i];
			array1[(array1.length-1)-i] = balik;
		}
	}
	private static void printHasil (int [] hasil) {
		System.out.print(Arrays.toString(hasil));
	}
	
}


	
		


	
