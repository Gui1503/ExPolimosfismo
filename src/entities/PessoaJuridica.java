package entities;

public class PessoaJuridica extends TaxPayer {
	
	private int nFuncionarios;
	
	public PessoaJuridica() {
		
	}

	public PessoaJuridica(String nome, double rendAnual, int nFuncionarios) {
		super(nome, rendAnual);
		this.nFuncionarios = nFuncionarios;
	}

	public int getnFuncionarios() {
		return nFuncionarios;
	}

	public void setnFuncionarios(int nFuncionarios) {
		this.nFuncionarios = nFuncionarios;
	}
//Calculando a renda anual:
	@Override
	public double tax() {
		
		if(nFuncionarios > 10) {
			return getRendAnual() * 0.14;
		}
		else {
			return getRendAnual()* 0.16;
		}

		
	}
	
	

}
