public class Locadora {
    public static void main(String[] args) {
        Cliente c1 = new Cliente("Ygor");
        c1.addAluguel(new Aluguel(new Fita("O Exorcista",
                Fita.NORMAL), 3));
        c1.addAluguel(new Aluguel(new Fita("Men in Black ",
                Fita.NORMAL), 2));
        c1.addAluguel(new Aluguel(new Fita("Jurassic Park III ",
                Fita.LANCAMENTO), 3));
        c1.addAluguel(new Aluguel(new Fita("Planeta dos Macacos ",
                Fita.LANCAMENTO), 4));
        c1.addAluguel(new Aluguel(new Fita("Pateta no Planeta dos Macacos ",
                Fita.INFANTIL), 10));
        c1.addAluguel(new Aluguel(new Fita("O Rei Leao ",
                Fita.INFANTIL), 30));
        System.out.println(c1.extrato());

        Cliente c2 = new Cliente("Alexandre");
        c2.addAluguel(new Aluguel(new Fita("As tartarugas ninja",
                Fita.NORMAL), 5));
        c2.addAluguel(new Aluguel(new Fita("Deu a louca na chapeuzinho vermelho ",
                Fita.NORMAL), 4));
        c2.addAluguel(new Aluguel(new Fita("Avatar ",
                Fita.LANCAMENTO), 6));
        c2.addAluguel(new Aluguel(new Fita("Encontros e desencontros ",
                Fita.LANCAMENTO), 2));
        c2.addAluguel(new Aluguel(new Fita("Space Jam ",
                Fita.INFANTIL), 30));
        c2.addAluguel(new Aluguel(new Fita("A branca de neve ",
                Fita.INFANTIL), 50));
        System.out.println(c2.extrato());
    }
}