import java.util.Scanner;
public class prog {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		int escolaridade, exp;
		char opc1, opc2;
		
		System.out.println("Qual a sua escolaridade");
		System.out.println("1) Ensino fundamental");
		System.out.println("2) Ensino m�dio");
		System.out.println("3) Ensino superior");
		System.out.println("4) P�s-gradua��o");
		System.out.printf("Digite uma op��o: ");
		escolaridade = sc.nextInt();
		
		System.out.printf("Voc� tem quantos anos de experi�ncia profissional ? ");
		exp = sc.nextInt();
		System.out.printf("Voc� tem disponibilidade para viajar (S/N) ? ");
		opc1 = sc.next().charAt(0);
		System.out.printf("Voc� tem habilita��o de motorista (S/N) ? ");
		opc2 = sc.next().charAt(0);
		

	}

}
