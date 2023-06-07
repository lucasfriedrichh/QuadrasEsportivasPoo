package br.upf.ccc.app168238.dominio;

import br.upf.ccc.app168238.exception.ValorNegativoException;

public abstract class Compra {
    private Integer idCompra;
    private String nomeMercadoria;
    private Float quantidade;
    private float valorUnitario;

    
    public Compra(Integer idCompra) {
        this.idCompra = idCompra;
    }
    
    public Compra(Integer idCompra, String nomeMercadoria,Float quantidade, Float valorUnitario) {
        this.nomeMercadoria = nomeMercadoria;
        
        try {
            if (quantidade < 0f && valorUnitario < 0) {
                throw new ValorNegativoException();
            }    
            this.quantidade = quantidade;
            this.valorUnitario = valorUnitario;
        } catch (ValorNegativoException e) {
            System.out.println(e.getMessage());
        }    
    }
    
    public Compra(){
        quantidade = 0f;
    }
    
    //Calcula o total da compra.
    public float calcularTotal(){
        return this.quantidade * this.valorUnitario;
    }
    
    /**
     * @return the idCompra
     */
    public Integer getIdCompra() {
        return idCompra;
    }

    /**
     * @param idCompra the idCompra to set
     */
    public void setIdCompra(Integer idCompra) {
        this.idCompra = idCompra;
    }

    /**
     * @return the nomeMercadoria
     */
    public String getNomeMercadoria() {
        return nomeMercadoria;
    }

    /**
     * @param nomeMercadoria the nomeMercadoria to set
     */
    public void setNomeMercadoria(String nomeMercadoria) {
        this.nomeMercadoria = nomeMercadoria;
    }

    /**
     * @return the quantidade
     */
    public Float getQuantidade() {
        return quantidade;
    }

    /**
     * @param quantidade the quantidade to set
     */
    public void setQuantidade(Float quantidade) {
        this.quantidade = quantidade;
    }

    /**
     * @return the valorUnitário
     */
    public float getValorUnitário() {
        return valorUnitario;
    }

    /**
     * @param valorUnitario the valorUnitário to set
     */
    public void setValorUnitário(float valorUnitario) {
        this.valorUnitario = valorUnitario;
    }
}
