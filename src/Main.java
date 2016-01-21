import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner reader = new Scanner(System.in);
		System.out.println("Silakan pilih perintah dengan inputan {angka}:");
		System.out.println("1. Penambahan");
		System.out.println("2. Perkalian");
		System.out.println("3. Pengurangan");
		System.out.println("4. Keluar");
		System.out.println("Masukkan pilihan Anda:");
		int out = reader.nextInt();
		DoAction(out, reader);
		reader.close();
	}

	private static void DoAction(int choice, Scanner reader) {
		int[] arrayinput = new int[1]; // initialize with 1 length
		if (choice < 4) {
			System.out.println("Masukkan jumlah angka yang akan dilakukan proses:");
			int amountnumbers = reader.nextInt();
			arrayinput = new int[amountnumbers];
			for (int i = 0; i < arrayinput.length; i++) {
				System.out.println("Masukkan angka ke-" + (i + 1));
				int currentnumber = reader.nextInt();
				arrayinput[i] = currentnumber;
			}
		}

		int result = 0;

		switch (choice) {
		case (1):
			for (int i : arrayinput) {
				result += i;
			}
			break;
		case (2):
			result++;
			for (int i : arrayinput) {
				result *= i;
			}
			break;
		case (3):
			result = arrayinput[0];
			for (int i = 0; i < arrayinput.length; i++) {
				if (i != 0)
					result -= arrayinput[i];
			}
			break;
		case (4):
			System.exit(0);
			break;
		default:
			System.out.println("Pilihan Anda salah! Isikan angka 1-4:");
			DoAction(reader.nextInt(), reader);
			break;
		}

		if (choice < 4)
			System.out.println("Hasilnya: " + result);
	}

}
