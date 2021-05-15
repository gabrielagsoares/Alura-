
public class testaLacos {

	public static void main(String[] args) {
		for (int multiplicador = 1; multiplicador <= 10; multiplicador++) { //tabuada do 1 ao 10
			for (int contador = 0; contador <= 10; contador++) {
				System.out.print(multiplicador * contador); // tirei o ln e cada tabuada ficou em 1 linha 
				System.out.print("  "); //dar espaçamento
			}
			System.out.println(); //pular linha
		}
	}
}
