package iniciante.ex1021;

import java.io.IOException;
import java.security.InvalidParameterException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {
        Scanner input = new Scanner(System.in);
        TratamentoDoValor tratar = new TratamentoDoValor();

        double valorMonetario = input.nextDouble();

        if (!tratar.verificaDisponiblidadeNumero(valorMonetario))
            throw new InvalidParameterException("Número inválido!");
        else
            tratar.printaQuantidadeMinimaDeNotas(valorMonetario);
        
        input.close();

    }
}
