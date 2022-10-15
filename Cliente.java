import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Cliente {
    private String nome;
    private List fitasAlugadas = new ArrayList();

    public Cliente(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void addAluguel(Aluguel aluguel) {
        fitasAlugadas.add(aluguel);
    }

    // Esse método tinha muita responsabilidade, então foi quebrado em várias partes
    public String extrato() {
        final String fimDeLinha = System.getProperty("line.separator");
        double valorTotal = 0.0;
        int pontosDeAlugadorFrequente = 0;
        Iterator alugueis = fitasAlugadas.iterator();
        String resultado = "Registro de Alugueis de " + getNome() + fimDeLinha;
        while (alugueis.hasNext()) {
            Aluguel cada = (Aluguel) alugueis.next();

            double valorCorrente = cada.valoresAluguel();

            pontosDeAlugadorFrequente += cada.contadorPontos();

            resultado += "\t" + cada.getFita().getTitulo() + "\t" + valorCorrente +
                    fimDeLinha;
            valorTotal += valorCorrente;
        }

        resultado += "Valor total: " + valorTotal + fimDeLinha;
        resultado += "Pontos acumulados: " + pontosDeAlugadorFrequente +
                " Pontos de alugador frequente";
        return resultado;
    }
}