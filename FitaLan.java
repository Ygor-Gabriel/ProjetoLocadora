public class FitaLan extends FitaMts {

    @Override
    public double getValorAluguel(int diasAlugado) {
        return diasAlugado * 3;
    }

    @Override
    public int getPtsDeAluguel(int diasAlugadas) {
        return (diasAlugadas > 1) ? 2 : 1;
    }
}
