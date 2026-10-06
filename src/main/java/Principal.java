
import java.util.Scanner;

/**
 *
 * @author 10725213830
 */
public class Principal {

    public static void main(String[] args) {
        //Variaveis
        Scanner sc = new Scanner(System.in);
        double i, numi, numf, numm = 0, numff;

        System.out.println("Qual o Numero Inicial?");
        numi = sc.nextDouble();

        System.out.println("Qual o Numero Inicial?");
        numf = sc.nextDouble();
        
        i = numi;
                
        //Processamento
        do {
            numm += i;

            i++;

        } while (i >= numi && i <= numf);
        numff = numm / numf;
        
        //Saida
        System.out.printf("A media aritmedica e: %.4f", numff);
    }
}
