/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbl.eletrodomesticos.felipe;

/**
 *
 * @author felip
 */
public class Loja {
    private Liquidificador liquidificador;
    private Ferro ferro;
    private Batedeira batedeira;

    public Liquidificador getLiquidificador() {
        return liquidificador;
    }

    public void setLiquidificador(Liquidificador liquidificador) {
        this.liquidificador = liquidificador;
    }

    public Ferro getFerro() {
        return ferro;
    }

    public void setFerro(Ferro ferro) {
        this.ferro = ferro;
    }

    public Batedeira getBatedeira() {
        return batedeira;
    }

    public void setBatedeira(Batedeira batedeira) {
        this.batedeira = batedeira;
    }
    
}
