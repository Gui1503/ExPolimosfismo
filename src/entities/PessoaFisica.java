package entities;

public class PessoaFisica extends TaxPayer {
	private double gastosSaude;
	
	public PessoaFisica() {
		
	}

	public PessoaFisica(String nome, double rendAnual, double gastosSaude) {
		super(nome, rendAnual);
		this.gastosSaude = gastosSaude;
	}

	public double getGastosSaude() {
		return gastosSaude;
	}

	public void setGastosSaude(double gastosSaude) {
		this.gastosSaude = gastosSaude;
	}
//Calculando a renda anual:
	@Override
	public double tax() {
		
		double impostoBaixo;
		if(getRendAnual() < 20000.0) {
			impostoBaixo = getRendAnual() * 0.15;
		}
		else {
			impostoBaixo = getRendAnual() * 0.25;
		}
		impostoBaixo -=getGastosSaude() *0.5;
		if(impostoBaixo<0) {
			impostoBaixo = 0;
		}
	
		return impostoBaixo;
	}

}
