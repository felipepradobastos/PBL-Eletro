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
public abstract class Eletrodomestico {
    
    protected String brand;
    protected double price;
    protected int voltage;
    public Eletrodomestico(String brand, int voltagem){
        this.brand=brand;
        this.voltage=voltagem;
    }
    public Eletrodomestico(String brand, int voltagem, double price){
        this.brand=brand;
        this.voltage=voltagem;
        this.price=price;
    }
    
    public abstract double discount(int month);
    
    public void voltagem(int voltage){
        if(voltage==110){
            this.voltage=110;
        }else{
            if(voltage==220){
                this.voltage=220;
            }
        }
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getVoltage() {
        return voltage;
    }
    
}
