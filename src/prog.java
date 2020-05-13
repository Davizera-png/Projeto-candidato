import java.util.Scanner;
public class prog {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		int escolaridade;
		
		System.out.println("Qual a sua escolaridade");
		System.out.println("1) Ensino fundamental");
		System.out.println("2) Ensino médio");
		System.out.println("3) Ensino superior");
		System.out.println("4) Pós-graduação");
		System.out.printf("Digite uma opção: ");
		escolaridade = sc.nextInt();

	}

}
