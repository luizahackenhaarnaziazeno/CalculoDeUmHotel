import java.util.Scanner;
public class CalculoDeUmHotel
{
    public static void main(String args[]){
        Scanner trabalho=new Scanner(System.in);
        
        int apartamentos;
        double valordadiaria,valorpromocao,valor100,valor70,valoraperder;
        
        System.out.print("Qual número de apartamnetos:");
        apartamentos=trabalho.nextInt();
        System.out.print("Qual o valor da diária:R$");
        valordadiaria=trabalho.nextDouble();
        
        //valor promocional da diária
        valorpromocao=valordadiaria*0.75;
        
        //valor total a ser arrecadado caso a ocupação neste final de semana atinja 100%
        valor100=apartamentos*(valorpromocao*2);
        
        //valor total a ser arrecadado caso a ocupação neste final de semana atinja 70%
        valor70=apartamentos*0.7*(valorpromocao*2);
        
        //valor que o hotel deixará de arrecadar em virtude da promoção,caso o ocupação atinja 100%
        valoraperder=apartamentos*(valordadiaria*2)-valor100;
        
        System.out.println("Valor promocional da diária:R$"+valorpromocao);
        System.out.println("Valor total a ser arrecadado caso a ocupação neste final de semana atinja 100%:R$"+valor100);
        System.out.println("Valor total a ser arrecadado caso a ocupação neste final de semana atinja 70%:R$"+valor70);
        System.out.println("Valor que o hotel deixará de arrecadar em virtude da promoção,caso o ocupação atinja 100%:R$"+valoraperder);
    }
}
    
  
