package models;

public class EnderecoJogo {
  private int ide;
  //idEndereco
  private String rua;
  private int numero;
  private String pReferencia;
  //pontoDeReferencia

	public int getIde() {
		return ide;
		//getIdEndereco
	}
	public void setIde(int id) {
		this.ide = id;
	//setIdEndereco
	}
	public String getRua() {
		return rua;
	}
	public void setRua(String rua) {
		this.rua = rua;
	}
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	public String getPReferencia() {
		return pReferencia;
		//getPontoDeReferencia
	}
	public void setPReferencia(String pReferencia) {
		this.pReferencia = pReferencia;
	   //setPontoDeReferencia
	}
	
}