
package Geral;

public class Endereco {
    private String nomeRua;
    private int numeroCasa;
    private String bairro;
    private String cidade;
    private String cep;
    private String estado;
    private String pais;

    public Endereco(){
        
    }
    public Endereco(String nomeRua, int numeroCasa, String bairro, String cidade, String cep, String estado, String pais) {
        this.nomeRua = nomeRua;
        this.numeroCasa = numeroCasa;
        this.bairro = bairro;
        this.cidade = cidade;
        this.cep = cep;
        this.estado = estado;
        this.pais = pais;
    }

    public String getNomeRua() {
        return nomeRua;
    }

    public void setNomeRua(String nomeRua) {
        this.nomeRua = nomeRua;
    }

    public int getNumeroCasa() {
        return numeroCasa;
    }

    public void setNumeroCasa(int numeroCasa) {
        this.numeroCasa = numeroCasa;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String país) {
        this.pais = país;
    }

    @Override
    public String toString() {
        return "Endere\u00e7o{" + "nomeRua=" + nomeRua + ", numeroCasa=" + numeroCasa + ", bairro=" + bairro + ", cidade=" + cidade + ", cep=" + cep + ", estado=" + estado + ", pa\u00eds=" + pais + '}';
    }
    
}
