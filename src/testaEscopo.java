
public class testaEscopo {
	
	public static void main(String[] args) {
        System.out.println("testando condicionais");
        int idade = 20;
        int quantidadePessoas = 3;
        boolean acompanhado;
        
        //boolean acompanhado = quantidadePessoas >=2;
        if (quantidadePessoas >=2) {
        	 acompanhado = true;
        }
        
             if (idade >= 18 ) { // usar esse sinal para colocar 2 condições em 1 if||
            System.out.println("Você tem mais que 18 anos");
            System.out.println("Seja bem vindo");         
            } else {
            acompanhado = false;
                System.out.println("infelizmente voce nao pode entrar");
            }
        }
    }


