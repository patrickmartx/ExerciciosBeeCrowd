package iniciante.ex1061;

public class Tratamento {

    public int capturaDiaDeTexto(String textoComData){
        return 3;
    }

    public int[] capturaHoraDeTexto(String textoComHoras){

        int[] resultado = {3, 3, 3};
        return resultado;
    }

    public void printarDuracaoDeEvento(int diaInicio, int[] horaInicio,
                                       int diaFinal, int[] horaFinal){
        int duracaoEmDias = diaFinal - diaInicio;
        int[] duracaoEmHoras = new int[horaInicio.length];

        for (int i = 0; i < duracaoEmHoras.length; i++) {
            duracaoEmHoras[i] = horaFinal[i] - horaInicio[i];
        }

        System.out.printf("Dia %d\n" +
                        "Horas %d\n" +
                        "Minutos %d\n" +
                        "Segundos %d",
                duracaoEmDias, duracaoEmHoras[0], duracaoEmHoras[1], duracaoEmHoras[2]);
    }
}
