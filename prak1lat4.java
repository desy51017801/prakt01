import java.until.Scanner;

public class prak1lat4{
	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		
		int nilai1,nilai2,hasil;
		
		System.out.print("Masukkan integer pertama:");
		nilai1 = input.nextInt();
		
		System.out.print("Masukkan nilai integer kedua:");
		nilai2 = input.nextInt();
		
		hasil = nilai1 + nilai2;
		System.oussst.println("Hasil "  +nilai1+ " + "  +nilai2+ " = " +hasil);
	}
}