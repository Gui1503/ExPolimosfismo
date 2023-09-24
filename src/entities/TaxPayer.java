package entities;

public abstract class TaxPayer {
	
	private String nome;
	private double RendAnual;
	
	public TaxPayer() {
		
	}

	public TaxPayer(String nome, double rendAnual) {
		super();
		this.nome = nome;
		RendAnual = rendAnual;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getRendAnual() {
		return RendAnual;
	}

	public void setRendAnual(double rendAnual) {
		RendAnual = rendAnual;
	}
	
	public abstract double tax();
	

}
