import java.util.Scanner;
public class prog {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		int escolaridade, exp;
		char opc1, opc2;
		
		System.out.println("Qual a sua escolaridade");
		System.out.println("1) Ensino fundamental");
		System.out.println("2) Ensino médio");
		System.out.println("3) Ensino superior");
		System.out.println("4) Pós-graduação");
		System.out.printf("Digite uma opção: ");
		escolaridade = sc.nextInt();
		
		System.out.printf("Você tem quantos anos de experiência profissional ? ");
		exp = sc.nextInt();
		System.out.printf("Você tem disponibilidade para viajar (S/N) ? ");
		opc1 = sc.next().charAt(0);
		System.out.printf("Você tem habilitação de motorista (S/N) ? ");
		opc2 = sc.next().charAt(0);
		

	}

}
