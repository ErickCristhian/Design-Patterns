import java.util.Collection;

public class Aluguel {
	private Fita fita;
    private int diasAlugada;
    private Cliente cliente;

    public Aluguel(Fita fita, int diasAlugada) {
        this.fita = fita;
        this.diasAlugada = diasAlugada;
    }

    public Fita getFita() {
        return fita;
    }

    public int getDiasAlugada() {
        return diasAlugada;
    }

    public String extrato() {
        final String fimDeLinha = System.getProperty("line.separator");
        double valorTotal = 0.0;
        int pontosDeAlugadorFrequente = 0;
        String resultado = "Registro de Alugueis de " + cliente.getNome() + fimDeLinha;
        Collection<Aluguel> listaAlugueis = cliente.getFitasAlugadas();

        for (Aluguel f : listaAlugueis) {

            double valorCorrente = 0.0;
            Aluguel cada = f;
            switch (cada.getFita().getCodigoDePreco()) {
            case normal:
                valorCorrente += 2;
                if (cada.getDiasAlugada() > 2) {
                    valorCorrente += (cada.getDiasAlugada() - 2) * 1.5;
                }
                break;
            case lancamento:
                valorCorrente += cada.getDiasAlugada() * 3;
                break;
            case infantil:
                valorCorrente += 1.5;
                if (cada.getDiasAlugada() > 3) {
                    valorCorrente += (cada.getDiasAlugada() - 3) * 1.5;
                }
                break;
            } 
            pontosDeAlugadorFrequente++;
            
            if (cada.getFita().getCodigoDePreco() == Tipo.lancamento
                && cada.getDiasAlugada() > 1) {
                pontosDeAlugadorFrequente++;
            }

           
            resultado += "\t" + cada.getFita().getTitulo() + "\t"
                         + valorCorrente + fimDeLinha;
            valorTotal += valorCorrente;
        } 
        resultado += "Valor total devido: " + valorTotal + fimDeLinha;
        resultado += "Voce acumulou " + pontosDeAlugadorFrequente
                     + " pontos de alugador frequente";
        return resultado;
    }
}
