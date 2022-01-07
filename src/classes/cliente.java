/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classes;

/**
 *
 * @author Cristiano
 */
public class cliente {

    
private int id; 
private String nome; 
private String email; 
private int cpf;  
private int rg;  
private String endereço_completo;  
private int renda;  
private int senha; 

    public cliente(int id, String nome, String email, int cpf, int rg, String endereço_completo, int renda, int senha) {
        this.id = id;
        this.nome = nome;
        this.email = email;
        this.cpf = cpf;
        this.rg = rg;
        this.endereço_completo = endereço_completo;
        this.renda = renda;
        this.senha = senha;
    }

    public cliente() {
           }


    /**
     * @return the id
     */
    public int getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * @return the nome
     */
    public String getNome() {
        return nome;
    }

    /**
     * @param nome the nome to set
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * @return the email
     */
    public String getEmail() {
        return email;
    }

    /**
     * @param email the email to set
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * @return the cpf
     */
    public int getCpf() {
        return cpf;
    }

    /**
     * @param cpf the cpf to set
     */
    public void setCpf(int cpf) {
        this.cpf = cpf;
    }

    /**
     * @return the rg
     */
    public int getRg() {
        return rg;
    }

    /**
     * @param rg the rg to set
     */
    public void setRg(int rg) {
        this.rg = rg;
    }

    /**
     * @return the endereço_completo
     */
    public String getEndereço_completo() {
        return endereço_completo;
    }

    /**
     * @param endereço_completo the endereço_completo to set
     */
    public void setEndereço_completo(String endereço_completo) {
        this.endereço_completo = endereço_completo;
    }

    /**
     * @return the renda
     */
    public int getRenda() {
        return renda;
    }

    /**
     * @param renda the renda to set
     */
    public void setRenda(int renda) {
        this.renda = renda;
    }

    /**
     * @return the senha
     */
    public int getSenha() {
        return senha;
    }

    /**
     * @param senha the senha to set
     */
    public void setSenha(int senha) {
        this.senha = senha;
    }
    }

    
    

