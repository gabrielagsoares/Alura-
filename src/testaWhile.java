
public class testaWhile {

	    public static void main(String[] args) {
	        int contador = 0;
	        while(contador <= 10) {
	            System.out.println(contador); //
	            contador = contador + 1; // <--se eu escrever s� isso vai ficar imprimindo 000000000
	        }                            // posso colocar tbm como contador+=1 ou ent�o contador++
	        System.out.println(contador);

	    }
	}

