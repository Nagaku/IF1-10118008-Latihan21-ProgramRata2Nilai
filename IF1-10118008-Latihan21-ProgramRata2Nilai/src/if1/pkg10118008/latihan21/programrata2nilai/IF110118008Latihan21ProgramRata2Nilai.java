/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package if1.pkg10118008.latihan21.programrata2nilai;
import java.util.Scanner;
/**
 *
 * * @author
 * NAMA			: Michael Nagaku Milenn Salim
 * KELAS		: IF-1
 * NIM			: 10118008
 * Deskripsi Program	: menghitung rata rata mahasiswa
 */
public class IF110118008Latihan21ProgramRata2Nilai {

	/**
	 * @param args the command line arguments
	 */
	public static void main(String[] args) {
		// TODO code application logic here
		Scanner scanner = new Scanner(System.in);
		System.out.print("Masukkan Banyaknya Mahasiswa : ");
		int jumlahMahasiswa = scanner.nextInt();
		double rataMahasiswa = 0;
		for( int i = 0; i < jumlahMahasiswa; i++){
			System.out.print("Nilai Mahasiswa ke-" + (i+1) + " : ");
			rataMahasiswa += scanner.nextInt();
		}
		rataMahasiswa /= jumlahMahasiswa;
		System.out.println("Maka, Rata-rata Nilainya adalah " + rataMahasiswa);
	}

	
}
