
package Geral;

public class Livro {
    private int idLivro;
    private String nomeLivro;
    private String autorLivro;
    private String generoLivro;
    private String editoraLivro;
    private int anoLancamentoLivro;
    private int qntPaginasLivro;
    private int qntEstoqueLivro;
    private double valorLivro;
    private int qntdDesconto;
    private int qntdLivroSelecionado;
    
    
    public Livro() {
     
    }
    
    public Livro(String nomeLivro, int qntdDesconto, String autorLivro, int idLivro, String generoLivro, String editoraLivro, int anoLancamentoLivro, int qntPaginasLivro, int qntEstoqueLivro, double valorLivro) {
        this.nomeLivro = nomeLivro;
        this.autorLivro = autorLivro;
        this.generoLivro = generoLivro;
        this.editoraLivro = editoraLivro;
        this.anoLancamentoLivro = anoLancamentoLivro;
        this.qntPaginasLivro = qntPaginasLivro;
        this.qntEstoqueLivro = qntEstoqueLivro;
        this.valorLivro = valorLivro;
        this.idLivro = idLivro;
        this.qntdDesconto = qntdDesconto;
        this.qntdLivroSelecionado = qntdLivroSelecionado;
    }

    public int getQntdLivroSelecionado() {
        return qntdLivroSelecionado;
    }

    public void setQntdLivroSelecionado(int qntdLivroSelecionado) {
        this.qntdLivroSelecionado = qntdLivroSelecionado;
    }

    public int getQntdDesconto() {
        return qntdDesconto;
    }

    public void setQntdDesconto(int qntdDesconto) {
        this.qntdDesconto = qntdDesconto;
    }

    public String getNomeLivro() {
        return nomeLivro;
    }

    public void setNomeLivro(String nomeLivro) {
        this.nomeLivro = nomeLivro;
    }

    public int getIdLivro() {
        return idLivro;
    }

    public void setIdLivro(int idLivro) {
        this.idLivro = idLivro;
    }
    
    public String getAutorLivro() {
        return autorLivro;
    }

    public void setAutorLivro(String autorLivro) {
        this.autorLivro = autorLivro;
    }

    public String getGeneroLivro() {
        return generoLivro;
    }

    public void setGeneroLivro(String generoLivro) {
        this.generoLivro = generoLivro;
    }

    public String getEditoraLivro() {
        return editoraLivro;
    }

    public void setEditoraLivro(String editoraLivro) {
        this.editoraLivro = editoraLivro;
    }

    public int getAnoLancamentoLivro() {
        return anoLancamentoLivro;
    }

    public void setAnoLancamentoLivro(int anoLancamentoLivro) {
        this.anoLancamentoLivro = anoLancamentoLivro;
    }

    public int getQntPaginasLivro() {
        return qntPaginasLivro;
    }

    public void setQntPaginasLivro(int qntPaginasLivro) {
        this.qntPaginasLivro = qntPaginasLivro;
    }

    public int getQntEstoqueLivro() {
        return qntEstoqueLivro;
    }

    public void setQntEstoqueLivro(int qntEstoqueLivro) {
        this.qntEstoqueLivro = qntEstoqueLivro;
    }

    public double getValorLivro() {
        return valorLivro;
    }

    public void setValorLivro(double valorLivro) {
        this.valorLivro = valorLivro;
    }

    @Override
    public String toString() {
        return "Livro{" + "nomeLivro=" + nomeLivro + ", autorLivro=" + autorLivro + ", generoLivro=" + generoLivro + ", editoraLivro=" + editoraLivro + ", anoLancamentoLivro=" + anoLancamentoLivro + ", qntPaginasLivro=" + qntPaginasLivro + ", qntEstoqueLivro=" + qntEstoqueLivro + ", valorLivro=" + valorLivro + '}';
    }
    
    
}
