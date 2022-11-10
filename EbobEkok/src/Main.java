import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("1. Ebob Hesabı\n2. Ekok Hesabı");
		System.out.print("Lütfen işlem seçiniz: ");
		int select = scanner.nextInt();
		
		if(select == 1) {
			System.out.print("Birinci sayı: ");
			int a = scanner.nextInt();
			System.out.print("İkinci sayı: ");
			int b = scanner.nextInt();
			
			int ebob = 1;  // aralarında asal sayıların ebobu
			
			for(int i = 1; i<= a && i<=b; i++) {
				if(a%i == 0 && b%i == 0) {
					ebob = i;
				}
			}
			
			System.out.println("Ebob: " + ebob);
		}
		
		else if(select == 2) {
			System.out.print("Birinci sayı: ");
			int a = scanner.nextInt();
			System.out.print("İkinci sayı: ");
			int b = scanner.nextInt();
			
			int ekok = 0;
			int max = a*b; //Aralarında asal olma durumunda ekok bu değere eşittir
			int i = max;
			while (i != 0) {
				
				if(i % a == 0 && i % b == 0) {
					ekok = i;
				}
				
				i--;
				
			}
			System.out.println("Ekok: " + ekok);
			
		}
		else {
			System.out.println("Hatalı tuşlama");
		}
	}

}
