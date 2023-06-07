package br.upf.ccc.app168238.dominio;

/**
 *
 * @author 168238
 */
public class CompraAprazo extends Compra{

    private Integer numeroParcelas;
    
    public CompraAprazo(){
        super();
    }
    
    public CompraAprazo(Integer idCompra){
        super(idCompra);
    }
    
    public CompraAprazo(Integer idCompra, String nomeMercadoria, Float quantidade, Float valorUnitario) {
        super(idCompra, nomeMercadoria, quantidade, valorUnitario);
//        this.numeroParcelas = numeroParcelas;;;
    }
    
    public float calcularValorParcelas(){
        return calcularTotal() /this.getNumeroParcelas();
    }

    /**
     * @return the numeroParcelas
     */
    public Integer getNumeroParcelas() {
        return numeroParcelas;
    }

    /**
     * @param numeroParcelas the numeroParcelas to set
     */
    public void setNumeroParcelas(Integer numeroParcelas) {
        this.numeroParcelas = numeroParcelas;
    }
}
