package aula20200320.testesGerais;

public class GerenciadorDeComissao {
	
	public static double calcularComissaoPadrao(double valorDaVenda, double percentualDeComissao) {
		return valorDaVenda * (percentualDeComissao/100.00);
	}

	public static double calcularComissaoComValorMinimo(double valorMinimo, double valorDaVenda,double percentualDeComissao) {
		double valorcomissao = valorDaVenda * (percentualDeComissao/100.00);
		
		if(valorcomissao < valorMinimo) {
			return valorMinimo;
		}
		
		return valorcomissao;
		
	}

	public static double calcularComissaoComFaixa(double valorMinimo, double valorMaximo, double valorDaVenda,
			double percentualDeComissao) {
		double valorcomissao = valorDaVenda * (percentualDeComissao/100.00);
		
		if(valorcomissao < valorMinimo) {
			return valorMinimo;
		}
		
		if(valorcomissao > valorMaximo) {
			return valorMaximo;
		}
		
		
		return valorcomissao;
	}

}
