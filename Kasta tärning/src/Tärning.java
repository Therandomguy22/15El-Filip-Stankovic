import java.util.Scanner;

public class T�rning {
	
	public static void main(String [] args) {
		int datortarning;
		int spelartarning = 0;
		
		System.out.println("T�rningsspel!");
		System.out.println("Du vinner om ditt t�rningskast �r h�gre �n datorn");
		
		datortarning = (int)( Math.random() *6 )+1;
		
		System.out.print("Skriv in ett tal 1-6: ");
		
		Scanner in = new Scanner(System.in);
		
		spelartarning = in.nextInt();
		in.close();
		
		if (spelartarning > datortarning)
			System.out.println("Du vann!");
		else
			System.out.println("RIP");
	}
}