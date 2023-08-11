package iniciante.ex1061;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Tratamento tratar = new Tratamento();

        String diaInicioInserido = input.nextLine();
        String horaInicioInserida = input.nextLine();

        String diaFinalInserido = input.nextLine();
        String horaFinalInserida = input.nextLine();

        int diaInicio = tratar.capturaDiaDeTexto(diaInicioInserido);
        int[] horaInicio = tratar.capturaHoraDeTexto(horaInicioInserida);

        int diaFinal = tratar.capturaDiaDeTexto(diaFinalInserido);
        int[] horaFinal = tratar.capturaHoraDeTexto(horaFinalInserida);

        tratar.printarDuracaoDeEvento(diaInicio, horaInicio, diaFinal, horaFinal);

    }
}
