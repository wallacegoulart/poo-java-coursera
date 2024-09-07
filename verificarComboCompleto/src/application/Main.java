package application;
import java.util.Scanner;

public class Main {

    // Função para verificar se o cliente contratou um combo completo
    public static String verificarComboCompleto(String[] servicosContratados) {
      String[] comboPadrao = {"movel", "banda larga","tv"};
 		  Scanner sc = new Scanner(System.in);
		
		  String comboCliente = sc.nextLine().trim();
		  String[] comboClienteArray = comboCliente.split(",");
		
		  int cont = 0;
		
		  for(String variavelComboCliente : comboClienteArray) {
		    for(String variavelComboPadrao :comboPadrao ) {
		      if(variavelComboPadrao.equals(variavelComboCliente)) {
		        cont++;
				}
			}
		}
		
		  if(cont >= 3) {
		    System.out.println("Combo Completo");
		}
		  else{
		    System.out.println("Combo Incompleto");
		}
      
      sc.close();
 
    }
}
