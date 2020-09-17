package entidades;

public class Vendedor extends Pessoa {
	private double valorVendas;
	private double comissao;
	private double vencimentoBase;

	public Vendedor(String nome, String endereco, String telefone, double valorVendas, double comissao,
			double vencimentoBase) {
		super(nome, endereco, telefone);
		this.valorVendas = valorVendas;
		this.comissao = comissao;
		this.vencimentoBase = vencimentoBase;
	}

	public double getValorVendas() {
		return valorVendas;
	}

	public void setValorVendas(double valorVendas) {
		this.valorVendas = valorVendas;
	}

	public double getComissao() {
		return comissao;
	}

	public void setComissao(double comissao) {
		this.comissao = comissao;
	}

	public double getVencimentoBase() {
		return vencimentoBase;
	}

	public void setVencimentoBase(double vencimentoBase) {
		this.vencimentoBase = vencimentoBase;
	}

	public double TotalVencimentos(double totalVencimentos) {
		totalVencimentos = vencimentoBase + comissao;
		return totalVencimentos;

	}

}
