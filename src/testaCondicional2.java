
public class testaCondicional2 {
	
	    public static void main(String[] args) {
	        System.out.println("testando condicionais");
	        int idade = 20;
	        int quantidadePessoas = 3;
	        boolean acompanhado = quantidadePessoas >=2;
	        
	        System.out.println("o valor de acompanhado é: " + acompanhado);

	        if (idade >= 18 && acompanhado ) { // usar esse sinal para colocar 2 condições em 1 if||
	            System.out.println("Você tem mais que 18 anos");
	            System.out.println("Seja bem vindo");         
	            } else {
	                System.out.println("infelizmente voce nao pode entrar");
	            }
	        }
	    }
	