public class Aluguel {
    //atributos
    private AluguelDeFita fita;
    private int diasAlugada;
    //construtor
    public Aluguel(AluguelDeFita fita, int diasAlugada) {
        this.fita = fita;
        this.diasAlugada = diasAlugada;
    }
    //metodos
    public AluguelDeFita getFita() {
        return fita;
    }

    //public int getDiasAlugada() {
    //    return diasAlugada;
    //}

    public double valoresAluguel(){
        return this.fita.getValorAluguel(diasAlugada);
    }

    public int contadorPontos(){
        return this.fita.getPontos(diasAlugada);
    }
}