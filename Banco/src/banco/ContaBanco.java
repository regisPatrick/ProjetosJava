/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package banco;

import java.util.Calendar;

/**
 *
 * @author user
 */
public class ContaBanco {
    
    public int num_conta;
    protected String tipo;
    private String dono;
    private float saldo;
    private boolean status;

    Calendar cal = Calendar.getInstance();
    
    public ContaBanco(){
        this.setStatus(false);
        this.setSaldo(0f);
    }
    
    public int getNum_conta(){
        return this.num_conta;
    }
    
    public void setNum_conta(int n){
        this.num_conta = n;
    }
    
    public String getTipo(){
        return this.tipo;
    }
    
    public void setTipo(String t){
        this.tipo = t;    
    }
    
    public String getDono(){
        return this.dono;
    }
    
    public void setDono(String d){
        this.dono = d;
    }
    
    public float getSaldo(){
        return this.saldo;
    }
    
    public void setSaldo(float s){
        this.saldo = s;
    }
    
    public boolean getStatus(){
        return this.status;
    }
    
    public void setStatus(boolean st){
        this.status = st;
    }
    
    public void abrirConta(String tc){
        this.setStatus(true);
        if (this.getStatus() == true){
            System.out.println("Sua conta está aberta");
        }else{
            System.out.println("Sua conta está fechada");
        }
        if((tc.equals("cp")) || (tc.equals("cc"))){
            this.setTipo(tc);
        }else{
            System.out.println("Opção inválida");
            System.out.println("Pode ser somente cc ou cp");
        }
        System.out.println("A sua conta é: " + this.getTipo());
        if (this.getTipo().equals("cc")){
            this.setSaldo(this.getSaldo() + 50f);
            System.out.println("Ao abrir a conta corrente você ganhou R$50,00");
        }else if (this.getTipo().equals("cp")){
            this.setSaldo(this.getSaldo() + 150f);
            System.out.println("Ao abrir a conta poupança você ganhou R$150,00");
        }
    }
    
    public void fecharConta(){
        if (this.getSaldo() == 0){
            this.setStatus(false);
            System.out.println("Sua conta foi encerrada com sucesso");
        }else if (this.getSaldo() > 0){
            System.out.println("Você precisa sacar o dinheiro de sua conta para poder encerrá-la");
        }else if (this.getSaldo() < 0){
            System.out.println("Você não pode encerrar a sua conta pois seu saldo é negativo");
        }
    }
    
    public void depositarDinheiro(float din){
        if (this.getStatus() == true){
            System.out.println("Efetuar deposito no valor de R$" + din);
            this.setSaldo(this.getSaldo() + din);
            System.out.println("Dinheiro depositado com sucesso");
            System.out.println("Seu saldo atual é: " + this.getSaldo());
        }else{
            System.out.println("Você não pode depositar pois a sua conta não está aberta");
        }
    }
    
    public void sacarDinheiro(float dindin){
        if((this.getStatus() == true) && (this.getSaldo() > 0)){
            if (this.getSaldo() >= dindin){
                this.setSaldo(this.getSaldo() - dindin);
                System.out.println("Saque realizado com sucesso");
                System.out.println("Seu saldo atual é: " + this.getSaldo());
            }else{
                System.out.println("Saldo insuficiente para sacar este valor");
            }
        }else if (this.getStatus() == false){
            System.out.println("A conta está fechada");
        }else if (this.getSaldo() < 0){
            System.out.println("Saldo negativo, não é possível sacar");
        }
    }
    
    public void mensalidade(){
        //int dia = cal.get(Calendar.DAY_OF_MONTH);
        //int mes = cal.get(Calendar.MONTH);
        //int ano = cal.get(Calendar.YEAR);
        int dia = 9;
        int mes = 8;
        int ano = 2019;
        if (dia == 10){
            if(this.getTipo().equals("cc")){
                this.setSaldo(this.getSaldo() - 12f);
                System.out.println("A mensalidade desse mês da sua conta corrente no valor de R$12.00, foi paga hoje, dia " + dia + " refente ao mês de " + mes + " do ano de " + ano);
            }else if(this.getTipo().equals("cp")){
                this.setSaldo(this.getSaldo() - 20f);
                System.out.println("A mensalidade desse mês da sua conta poupança no valor de R$20.00, foi paga hoje, dia " + dia + " refente ao mês de " + mes + " do ano de " + ano);  
            }
        }else{
            System.out.println("O pagamento das mensalidades acontece no dia 10 do mês corrente hoje é dia " + dia + "/" + mes + "/" + ano);
        } 
            
    }
    
    public void situacaoConta(){
        System.out.println("O número da conta é: " + this.getNum_conta());
        System.out.println("O tipo da conta é: " + this.getTipo());
        System.out.println("O dono da conta é: " + this.getDono());
        System.out.println("O saldo da conta é: R$" + this.getSaldo());
        System.out.println("O status da conta é: " + this.getStatus());
    }
    
}
