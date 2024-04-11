
package Geral;

public class Cliente {
    private int codigoCliente;
    private String nomeCliente;
    private Endereco Endereco;
    private String cpfCliente;
    private int idadeCliente;
    private String emailCliente;
    private String telefoneCliente;
    
    public Cliente(){
        
    }
    public Cliente(String nomeCliente, Endereco Endereco, String cpfCliente, int idadeCliente, String emailCliente, String telefoneCliente, int codigoCliente) {
        this.nomeCliente = nomeCliente;
        this.Endereco = Endereco;
        this.cpfCliente = cpfCliente;
        this.idadeCliente = idadeCliente;
        this.emailCliente = emailCliente;
        this.telefoneCliente = telefoneCliente;
        this.codigoCliente = codigoCliente;
    }

    public String getNomeCliente() {
        return nomeCliente;
    }

    public int getCodigoCliente() {
        return codigoCliente;
    }

    public void setCodigoCliente(int codigoCliente) {
        this.codigoCliente = codigoCliente;
    }

    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }

    public Endereco getEndereco() {
        return Endereco;
    }

    public void setEndereco(Endereco Endereco) {
        this.Endereco = Endereco;
    }

    public String getCpfCliente() {
        return cpfCliente;
    }

    public void setCpfCliente(String cpfCliente) {
        this.cpfCliente = cpfCliente;
    }

    public int getIdadeCliente() {
        return idadeCliente;
    }

    public void setIdadeCliente(int idadeCliente) {
        this.idadeCliente = idadeCliente;
    }

    public String getEmailCliente() {
        return emailCliente;
    }

    public void setEmailCliente(String emailCliente) {
        this.emailCliente = emailCliente;
    }

    public String getTelefoneCliente() {
        return telefoneCliente;
    }

    public void setTelefoneCliente(String telefoneCliente) {
        this.telefoneCliente = telefoneCliente;
    }

    @Override
    public String toString() {
        return "Cliente{" + "codigoCliente" + codigoCliente + ", nomeCliente=" + nomeCliente + ", Endere\u00e7o=" + Endereco + ", cpfCliente=" + cpfCliente + ", idadeCliente=" + idadeCliente + ", emailCliente=" + emailCliente + ", telefoneCliente=" + telefoneCliente + '}';
    }
    
}
