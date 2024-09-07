import java.util.Scanner;
public class Program {

	public static void main(String[] args) {
	      
        Scanner sc = new Scanner(System.in);


        System.out.println("Qual o peso? ");

        float peso = sc.nextFloat();


        System.out.println("Qual a altura? ");

        float altura = sc.nextFloat();

       

        Paciente paciente = new Paciente(peso,altura);

        paciente.diagnostico();
		// TODO Auto-generated method stub

	}

}
