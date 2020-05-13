import java.util.Scanner;
public class prog {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		int escolaridade, exp, pesc, pexp;
		char opc1, opc2;
		pesc = 0;
		pexp = 0;
		//leitura de dados
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
		
		//calculos
		
		//estrutura de escolaridade
		if (escolaridade == 1) {
			pesc = pesc + 10;
		} else if (escolaridade == 2) {
			pesc = pesc + 20;
		} else if (escolaridade == 3) {
			pesc = pesc + 30;
		} else if (escolaridade == 4) {
			pesc = pesc + 40;
		}
		
		//estrutura de experiencia
		if (exp > 0 && exp < 2) {
			pexp = pexp + 10;
		} else if (exp > 2 && exp < 5) {
			pexp = pexp + 20;
		} else if (exp > 5) {
			pexp = pexp + 40;
		}
		//termino de calculos
		 System.out.println("Pontos de escolaridade"+ pesc);
		 System.out.println("Pontos de experiência"+ pexp);
		
		
	}

}
