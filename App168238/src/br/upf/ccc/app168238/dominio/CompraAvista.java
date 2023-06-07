package br.upf.ccc.app168238.dominio;

public class CompraAvista extends Compra{
   private float desconto;

    public CompraAvista(Integer idCompra) {
        super(idCompra);
    }
   
    public CompraAvista() {
        super();
    }
   
    public CompraAvista(Integer idCompra, String nomeMercadoria, Float quantidade, Float valorUnitario) {
        super(idCompra, nomeMercadoria, quantidade, valorUnitario);
    }

    /**
     * @return the desconto
     */
    public float getDesconto() {
        return desconto;
    }

    /**
     * @param desconto the desconto to set
     */
    public void setDesconto(float desconto) {
        this.desconto = desconto;
    }
   
}
