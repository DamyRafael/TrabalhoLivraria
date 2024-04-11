
package Geral;
import java.util.ArrayList;


public class Venda {
    private int qntProdutos;
    private double valorPagar;
    private static ArrayList<String> formaPagamento;
    private double VlrDesconto;
    
    public Venda(){
        
    }
    
    public Venda( int qntProdutos, double valorPagar, ArrayList<String> formaPagamento, double VlrDesconto) {
        this.qntProdutos = qntProdutos;
        this.valorPagar = valorPagar;
        this.formaPagamento = formaPagamento;
        this.VlrDesconto = VlrDesconto;
    }

    public double getVlrDesconto() {
        return VlrDesconto;
    }

    public void setVlrDesconto(double VlrDesconto) {
        this.VlrDesconto = VlrDesconto;
    }

    public int getQntProdutos() {
        return qntProdutos;
    }

    public void setQntProdutos(int qntProdutos) {
        this.qntProdutos = qntProdutos;
    }

    public double getValorPagar() {
        return valorPagar;
    }

    public void setValorPagar(double valorPagar) {
        this.valorPagar = valorPagar;
    }

    public ArrayList<String> getFormaPagamento() {
        return formaPagamento;
    }

    public void setFormaPagamento(ArrayList<String> formaPagamento) {
        this.formaPagamento = formaPagamento;
    }
    public String listaFormaPagamento(ArrayList<String> FormasPagamento){
        var Pagamentos = " ";
        for (String index : FormasPagamento) {
            Pagamentos += index.toString() +" , ";
        }
     return Pagamentos;          
    }
    @Override
    public String toString() {
        return "Venda{" + ", qntProdutos=" + qntProdutos + ", valorPagar=" + valorPagar + ", formaPagamento=" + listaFormaPagamento(formaPagamento) + '}';
    }
    
}
