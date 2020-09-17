package entidades;

public class Operario extends Pessoa {

	private double valorProducao;
	private double comissao;
	private double vencimentoBase;
	
	public Operario(String nome, String endereco, String telefone, double valorProducao, double comissao,
			double vencimentoBase) {
		super(nome, endereco, telefone);
		this.valorProducao = valorProducao;
		this.comissao = comissao;
		this.vencimentoBase = vencimentoBase;
	}

	public double getValorProducao() {
		return valorProducao;
	}

	public void setValorProducao(double valorProducao) {
		this.valorProducao = valorProducao;
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
		totalVencimentos = vencimentoBase+comissao;
		return totalVencimentos;
		
	}
	
}
