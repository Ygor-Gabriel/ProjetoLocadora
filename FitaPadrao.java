public class FitaPadrao extends FitaMts {
    @Override
    public double getValorAluguel(int diasAlugado) {
        double valorDoAluguel = 2;
        if (diasAlugado > 2) {
            valorDoAluguel += (diasAlugado - 2) * 1.5;
        }
        return valorDoAluguel;
    }

    @Override
    public int getPtsDeAluguel(int diasAlugadas) {
        return 1;
    }
}
