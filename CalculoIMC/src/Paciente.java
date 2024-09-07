
public class Paciente {
	
	public float peso;

    public float altura;
   

    public Paciente(float peso , float altura){

                   this.peso = peso;      

                   this.altura = altura;

                   }

   

    private float calcularImc() {

                   return peso / (altura * altura) ;

                  

    }

   

    public void diagnostico() {

                   float imc = calcularImc();

                  

                   if(imc<16) {

                                   System.out.println("Baixo peso muito grave = IMC abaixo de 16kg/m²");

                   }

                   else if(imc>=16 && imc<17) {

                                   System.out.printf("Baixo peso grave = IMC entre 16 e 16,99 kg/m²");

                   }

                   else if(imc>=17 && imc<18.50) {

                                   System.out.printf("Baixo peso = IMC entre 17 e 18,49 kg/m²");

                   }

                   else if(imc>=18.50 && imc<25) {

                                   System.out.printf("Peso normal = IMC entre 18,50 e 24,99 kg/m²");

                   }

                   else if(imc>=25 && imc<29.99) {

                                   System.out.printf("Sobrepeso = IMC entre 25 e 29,99 kg/m²");

                   }

                   else if(imc>=30 && imc<34.99) {

                                   System.out.printf("Obesidade grau I = IMC entre 30 e 34,99 kg/m²");

                   }

                   else if(imc>=35 && imc<39.99) {

                                   System.out.printf("Obesidade grau II = IMC entre 35 e 39,99 kg/m²");

                   }

                   else if(imc>=40) {

                                   System.out.printf("Obesidade grau III (obesidade mórbida) = IMC igual ou maior que 40 kg/m²");

                   }

    }

}
