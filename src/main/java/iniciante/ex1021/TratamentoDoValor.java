package iniciante.ex1021;

public class TratamentoDoValor {

    public boolean verificaDisponiblidadeNumero(double numero) {
        if ((numero < 0) || (numero > 1000000)) {
            return false;
        }
        return true;
    }

    public void printaQuantidadeMinimaDeNotas(double valor) {
        double[] notas = { 100.00, 50.00, 20.00, 10.00, 5.00, 2.00 };
        double[] moedas = { 1.00, 0.50, 0.25, 0.10, 0.05, 0.01 };

        int[] quantidadeNotas = separaQuantidadeDeNotas(notas, valor);
        int[] quantidadeMoedas = separaQuantidadeDeMoedas(moedas, valor);

        System.out.println("NOTAS:");

        for (int i = 0; i < quantidadeNotas.length; i++) {
            System.out.printf("%d nota(s) de R$ %.2f\n", quantidadeNotas[i], notas[i]);
        }

        System.out.println("MOEDAS:");

        for (int i = 0; i < quantidadeNotas.length; i++) {
            System.out.printf("%d moeda(s) de R$ %.2f\n", quantidadeMoedas[i], moedas[i]);
        }
    }

    public int[] separaQuantidadeDeNotas(double[] notas, double valor) {
        int notasDisponiveis = 6;

        int[] quantidadeNotas = new int[notasDisponiveis];

        for (int i = 0; i < notasDisponiveis; i++) {
            quantidadeNotas[i] = (int) (valor / notas[i]);
            valor %= notas[i];
        }
        return quantidadeNotas;
    }

    public int[] separaQuantidadeDeMoedas(double[] moedas, double valor) {
        int casaDasUnidades = 10;
        int cincoReaisUsados = 5;
        int doisReaisUsados = 2;

        int moedasDisponiveis = 6;
        int converteCentavosEmReais = 100;

        valor = (((valor % casaDasUnidades) % cincoReaisUsados) % doisReaisUsados);

        double valorComCentavos = valor * converteCentavosEmReais;

        int[] quantiadeMoedas = new int[moedasDisponiveis];

        for (int i = 0; i < moedasDisponiveis; i++) {
            quantiadeMoedas[i] = (int) (valorComCentavos / (moedas[i] * converteCentavosEmReais));
            valorComCentavos %= (moedas[i] * converteCentavosEmReais);
        }

        return quantiadeMoedas;
    }
}
