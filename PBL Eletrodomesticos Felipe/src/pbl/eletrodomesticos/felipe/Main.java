/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbl.eletrodomesticos.felipe;

import javax.swing.JOptionPane;

/**
 *
 * @author felip
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Declarações de Controle
        int conliqui=0, conferro=0, conbated=0, conproduct=0,conloja=0, helices;
        int conliquiloja=0, conferroloja=0, conbatedloja=0;
        int controlercliente=4;
        String brand;
        int voltagem;
        double price;
        double capacidade, quantidade;
        int controlermaster=10;
        Loja loja= new Loja();
        while(controlermaster!=-1){
        String[] master = {"Cliente", "Empresario"};
        controlermaster = JOptionPane.showOptionDialog(null, "Bem vindo, A FF's Company:", "Selecione", JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, master, master[0]);
        switch(controlermaster){
            case 0:
                //cliente:
                JOptionPane.showMessageDialog(null, "Bem vindo, Cliente");
                String[] clienteop= {"Liquidificador", "Ferro", "Batedeira"};
                while(controlercliente!=-1){
                    controlercliente = JOptionPane.showOptionDialog(null, "O que deseja adquirir ?", "Selecione", JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, clienteop, clienteop[0]);
                    if(controlercliente==0){
                        JOptionPane.showMessageDialog(null, "Produto: Liquidificador");
                        JOptionPane.showConfirmDialog(null, "Marca:"+loja.getLiquidificador().getBrand()+"\nVoltagem:"+loja.getLiquidificador().getVoltage()+"\nPreço:"+loja.getLiquidificador().getPrice()+"\nLitragem:"+loja.getLiquidificador().getLitragem()+"\nTampa:"+loja.getLiquidificador().getTampa().getDescri()+"\nCor Tampa:"+loja.getLiquidificador().getTampa().getCor());
                    }
                    if(controlercliente==1){
                        JOptionPane.showMessageDialog(null, "Produto: Ferro");
                        JOptionPane.showConfirmDialog(null, "Marca:"+loja.getFerro().getBrand()+"\nVoltagem:"+loja.getFerro().getVoltage()+"\nPrice:"+loja.getFerro().getPrice());
                    }
                    if(controlercliente==2){
                        JOptionPane.showMessageDialog(null, "Produto: Batedeira");
                        JOptionPane.showConfirmDialog(null, "Marca:"+loja.getBatedeira().getBrand()+"\nVoltagem:"+loja.getBatedeira().getVoltage()+"\nPrice:"+loja.getBatedeira().getPrice()+"\nLitragem:"+loja.getBatedeira().getLitragem()+"\nN. Hélices:"+loja.getBatedeira().getQhelices());
                    }
                }
                break;
            case 1:
                //Empresario
                String[] options = {"Fábrica", "Loja"};
                int controler1 = JOptionPane.showOptionDialog(null, "Escolha o tipo de Estabelecimento:", "Selecione", JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, options, options[0]);
                switch(controler1){
                    case 0:
                        //Fabrica
                        Fabrica fabrica = new Fabrica();
                        while(conproduct<3){
                            int controlerproduct;
                            String[] produtos = {"Liquidificador", "Ferro", "Batedeira"};
                            controlerproduct=JOptionPane.showOptionDialog(null, "Selecione um Produto para Cadastrar: ", "Selecione", JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, produtos, produtos[0]);;
                            if(controlerproduct==-1){
                                break;
                            }
                            if(controlerproduct==0){
                                if(controlerproduct==0 && conliqui==0){
                                    JOptionPane.showMessageDialog(null, "Cadastro Liquidificador:");
                                    brand=JOptionPane.showInputDialog("Insira a Marca:");
                                    voltagem=Integer.parseInt(JOptionPane.showInputDialog("Insira a Voltagem: "));
                                    Liquidificador liquifab = new Liquidificador(brand, voltagem);
                                    capacidade=Double.parseDouble(JOptionPane.showInputDialog("Insira a Capacidade:"));
                                    quantidade=Double.parseDouble(JOptionPane.showInputDialog("Insira a quantidade:"));
                                    liquifab.calcLitragem(quantidade, capacidade);
                                    JOptionPane.showMessageDialog(null, "A litragem final e de:"+liquifab.getLitragem());
                                    Tampa liquitampa = new Tampa();
                                    JOptionPane.showMessageDialog(null, "Informações da Tampa:");
                                    liquitampa.setCor(JOptionPane.showInputDialog("Insira a Cor da Tampa:"));
                                    liquitampa.setDescri(JOptionPane.showInputDialog("Descrição da Tampa:"));
                                    liquifab.setTampa(liquitampa);
                                    fabrica.setLiquidificador(liquifab);
                                    conliqui++;
                                    conproduct++;
                                }else{
                                    if(conliqui==1){
                                        JOptionPane.showMessageDialog(null, "Você ja cadastrou este produto !\n Por favor Escolha Outro.");
                                    }
                                }
                            }
                            if(controlerproduct==1){
                                if(controlerproduct==1 && conferro==0){
                                    JOptionPane.showMessageDialog(null, "Cadastro Ferro:");
                                    brand=JOptionPane.showInputDialog("Insira a Marca:");
                                    voltagem=Integer.parseInt(JOptionPane.showInputDialog("Insira a Voltagem: "));
                                    Ferro ferrofab = new Ferro(brand, voltagem);
                                    fabrica.setFerro(ferrofab);
                                    conferro++;
                                    conproduct++;
                                }else{
                                    if(conferro==1){
                                        JOptionPane.showMessageDialog(null, "Você ja cadastrou este produto !\n Por favor Escolha Outro.");
                                    }
                                }
                            }
                            if(controlerproduct==2){
                                if(controlerproduct==2 && conbated==0){
                                    JOptionPane.showMessageDialog(null, "Cadastro Batedeira:");
                                    brand=JOptionPane.showInputDialog("Insira a Marca");
                                    voltagem=Integer.parseInt(JOptionPane.showInputDialog("Insira a Voltagem:"));
                                    Batedeira batefab = new Batedeira(brand, voltagem);
                                    quantidade=Double.parseDouble(JOptionPane.showInputDialog("Insira a quantidade:"));
                                    capacidade=Double.parseDouble(JOptionPane.showInputDialog("Insira a Capacidade:"));
                                    helices=Integer.parseInt(JOptionPane.showInputDialog("Quantidade de Helices:"));
                                    batefab.setQhelices(helices);
                                    batefab.calcLitragem(quantidade, capacidade);
                                    JOptionPane.showMessageDialog(null, "A litragem final e de:"+batefab.getLitragem());
                                    fabrica.setBatedeira(batefab);
                                    conbated++;
                                    conproduct++;
                                }else{
                                    if(conbated==1){
                                        JOptionPane.showMessageDialog(null, "Você ja cadastrou este produto !\n Por favor Escolha Outro.");
                                    }
                                }
                            }
                        }
                        break;
                    case 1:
                        //Loja
                        while(conloja<3){
                            int controlerloja;
                            String[] produtos = {"Liquidificador", "Ferro", "Batedeira"};
                            controlerloja=JOptionPane.showOptionDialog(null, "Selecione um Produto para Cadastrar: ", "Selecione", JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, produtos, produtos[0]);
                            if(controlerloja==-1){
                                break;
                            }
                            if(controlerloja==0){
                                if(controlerloja==0 && conliquiloja==0){
                                    JOptionPane.showMessageDialog(null, "Cadastro Liquidificador:");
                                    brand=JOptionPane.showInputDialog("Insira a Marca:");
                                    voltagem=Integer.parseInt(JOptionPane.showInputDialog("Insira a Voltagem: "));
                                    price=Double.parseDouble(JOptionPane.showInputDialog("Insira o Preço:"));
                                    Liquidificador liquiloja = new Liquidificador(brand, voltagem, price);
                                    capacidade=Double.parseDouble(JOptionPane.showInputDialog("Insira a Capacidade:"));
                                    quantidade=Double.parseDouble(JOptionPane.showInputDialog("Insira a quantidade:"));
                                    liquiloja.calcLitragem(quantidade, capacidade);
                                    JOptionPane.showMessageDialog(null, "A litragem final e de:"+liquiloja.getLitragem());
                                    Tampa liquitampa = new Tampa();
                                    JOptionPane.showMessageDialog(null, "Informações da Tampa:");
                                    liquitampa.setCor(JOptionPane.showInputDialog("Insira a Cor da Tampa:"));
                                    liquitampa.setDescri(JOptionPane.showInputDialog("Descrição da Tampa:"));
                                    liquiloja.setTampa(liquitampa);
                                    loja.setLiquidificador(liquiloja);
                                    conliquiloja++;
                                    conloja++;
                                }else{
                                    if(conliquiloja==1){
                                        JOptionPane.showMessageDialog(null, "Você ja cadastrou este produto !\n Por favor Escolha Outro.");
                                    }
                                }
                            }
                            if(controlerloja==1){
                                if(controlerloja==1 && conferroloja==0){
                                    JOptionPane.showMessageDialog(null, "Cadastro Ferro:");
                                    brand=JOptionPane.showInputDialog("Insira a Marca:");
                                    voltagem=Integer.parseInt(JOptionPane.showInputDialog("Insira a Voltagem: "));
                                    price=Double.parseDouble(JOptionPane.showInputDialog("Insira o Preço:"));
                                    Ferro ferroloja = new Ferro(brand, voltagem, price);
                                    loja.setFerro(ferroloja);
                                    conferroloja++;
                                    conloja++;
                                }else{
                                    if(conferroloja==1){
                                        JOptionPane.showMessageDialog(null, "Você ja cadastrou este produto !\n Por favor Escolha Outro.");
                                    }
                                }
                            }
                            if(controlerloja==2){
                                if(controlerloja==2 && conbatedloja==0){
                                    JOptionPane.showMessageDialog(null, "Cadastro Batedeira:");
                                    brand=JOptionPane.showInputDialog("Insira a Marca");
                                    voltagem=Integer.parseInt(JOptionPane.showInputDialog("Insira a Voltagem:"));
                                    price=Double.parseDouble(JOptionPane.showInputDialog("Insira o Preço:"));
                                    Batedeira bateloja = new Batedeira(brand, voltagem, price);
                                    quantidade=Double.parseDouble(JOptionPane.showInputDialog("Insira a quantidade:"));
                                    capacidade=Double.parseDouble(JOptionPane.showInputDialog("Insira a Capacidade:"));
                                    helices=Integer.parseInt(JOptionPane.showInputDialog("Quantidade de Helices:"));
                                    bateloja.setQhelices(helices);
                                    bateloja.calcLitragem(quantidade, capacidade);
                                    JOptionPane.showMessageDialog(null, "A litragem final e de:"+bateloja.getLitragem());
                                    loja.setBatedeira(bateloja);
                                    conbated++;
                                    conloja++;
                                }else{
                                    if(conbated==1){
                                        JOptionPane.showMessageDialog(null, "Você ja cadastrou este produto !\n Por favor Escolha Outro.");
                                    }
                                }
                            }
                        }
                        break;
                    case -1:
                        //sair
                        break;
                }
                break;
            case -1:
                // Sair
                break;
            }
        }   
    
    }
}
