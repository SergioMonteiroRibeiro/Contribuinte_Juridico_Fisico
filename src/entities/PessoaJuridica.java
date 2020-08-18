package entities;

public class PessoaJuridica extends Contribuinte {

	private Integer numFuncionarios;
	
	public PessoaJuridica(String nome, Double rendaAnual) {
		super(nome, rendaAnual);
	}
	
	public PessoaJuridica(String nome, Double rendaAnual, Integer numFuncionarios) {
		super(nome, rendaAnual);
		this.numFuncionarios = numFuncionarios;
	}
	
	public Integer getNumFuncionarios() {
		return numFuncionarios;
	}

	public void setNumFuncionarios(Integer numFuncionarios) {
		this.numFuncionarios = numFuncionarios;
	}

	@Override
	public Double impostoPago() {
		Double imposto = 00.00;
		
		if(numFuncionarios > 10) {
			imposto = getRendaAnual() * 0.14;
		}
		else {
			imposto = getRendaAnual() * 0.16;
		}
		return imposto;
	}
}
