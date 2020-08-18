package entities;

public class PessoaFisica extends Contribuinte {

	private Double gastoSaude;

	public PessoaFisica(String nome, Double rendaAnual) {
		super(nome, rendaAnual);
	}

	public PessoaFisica(String nome, Double rendaAnual, Double gastoSaude) {
		super(nome, rendaAnual);
		this.gastoSaude = gastoSaude;
	}

	public Double getGastoSaude() {
		return gastoSaude;
	}

	public void setGastoSaude(Double gastoSaude) {
		this.gastoSaude = gastoSaude;
	}

	@Override
	public Double impostoPago() {
		
		Double imposto = 00.00;
		
		if (getRendaAnual() < 20000.00) {
			imposto = (getRendaAnual() * 0.15);
		}
		else {
			imposto = (getRendaAnual() * 0.25);
		}
		
		if (gastoSaude > 0) {
			imposto -= (getGastoSaude() * 0.50);
		}
		return imposto;
	}
}
