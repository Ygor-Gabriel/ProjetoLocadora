//Classe Fita
public class Fita implements AluguelDeFita {
    //atributos e constantes
    public static final int NORMAL = 0;
    public static final int LANCAMENTO = 1;
    public static final int INFANTIL = 2;
    private FitaMts fitaMts;
    private String titulo;
    //construtor
    public Fita(String titulo, int codigoDePreco) {
        this.titulo = titulo;
        definePrecoPorTipo(codigoDePreco);
    }
    //metodos
    public String getTitulo() {
        return titulo;
    }

    @Override
    public double getValorAluguel(int diasAlugado) {
        return fitaMts.getValorAluguel(diasAlugado);
    }

    @Override
    public int getPontos(int diasAlugado) {
        return fitaMts.getPtsDeAluguel(diasAlugado);
    }

    public void definePrecoPorTipo(int codigoDePreco) {
        switch (codigoDePreco) {
            case NORMAL:
                this.fitaMts = new FitaPadrao();
                break;
            case LANCAMENTO:
                this.fitaMts = new FitaLan();
                break;
            case INFANTIL:
                this.fitaMts = new FitaInf();
                break;
        }
    }
}