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
public class Ferro extends Eletrodomestico {
    public Ferro(String brand, int voltagem, double price) {
        super(brand, voltagem, price);
    }
    public Ferro(String brand, int voltagem){
        super(brand,voltagem); 
    }
    /*public Ferro(String brand,int voltagem){
        super.brand=brand;
        super.voltage=voltagem;
    }
    public Ferro(String brand,int voltagem, double price){
        super.brand=brand;
        super.voltage=voltagem;
        super.price=price;
    }
    */
    @Override
    /*
    Param: Month ~~ Valor correspondente ao mês de compra.
    Param: Price ~~ Valor Original do Produto.
    Method: Discount ~~ Calcula o valor baseado no mês de compra.
    E o Retorna
    */
    public double discount(int month){
        if(month==4){
            return this.getPrice()*0.85;
        }
    return this.getPrice();
    }
    @Override
    public void voltagem(int voltage){
        if(voltage==110){
            this.voltage=110;
        }else{
            if(voltage==220){
                this.voltage=220;
            }else{
                if(voltage==5){
                    this.voltage=5;
                }
            }
        }
    }
}
