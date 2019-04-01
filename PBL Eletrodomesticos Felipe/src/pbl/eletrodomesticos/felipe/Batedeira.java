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
public class Batedeira extends Eletrodomestico implements Capacidade {
    public Batedeira(String brand, int voltagem, double price) {
        super(brand, voltagem, price);
    }
    public Batedeira(String brand, int voltagem){
        super(brand,voltagem); 
    }
    private double litragem;
    private int qhelices;
    @Override
    public void calcLitragem(double quantidade,double capacidade){
        this.litragem=quantidade/(capacidade*qhelices);
    }
    public double getLitragem(){
        return this.litragem;
    }
    @Override
    /*
    Param: Month ~~ Valor correspondente ao mês de compra.
    Param: Price ~~ Valor Original do Produto.
    Method: Discount ~~ Calcula o valor baseado no mês de compra.
    E o Retorna
    */
    public double discount(int month){
        if(month==12){
            return this.getPrice()*0.8;
        }
    return this.getPrice();
    }

    public int getQhelices() {
        return qhelices;
    }

    public void setQhelices(int qhelices) {
        this.qhelices = qhelices;
    }
}
