package com.school.sptech;

public class Biblioteca {

    private String nome;
    private double multaDiaria;
    private Integer qtdLivros = 0;
    private Boolean ativa = true;

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Boolean getAtiva() {
        return ativa;
    }

    public Integer getQtdLivros() {
        return qtdLivros;
    }

    public double getMultaDiaria() {
        return multaDiaria;
    }

    public String getNome() {
        return nome;
    }


//    Biblioteca b1 = new Biblioteca("Central", 2.5);
//    b1.registrarLivro(10);
//b1.emprestar(4);
//System.out.println(b1.getQtdLivros());


    public Biblioteca(String nome, Double multaDiaria){}

    public void registrarLivro(Integer quantidade){
        if(quantidade > 0 && quantidade != null && ativa == true){
            this.qtdLivros += quantidade;
        }
    }

    public Integer emprestar(Integer quantidade){
        if(ativa == true && (quantidade > 0 && quantidade < qtdLivros && quantidade != null)) {
            return quantidade;
        }else {
            return null;
        }
    }

    public Integer desativar(){
        if(ativa == false) {
            return null;
        }else {
            Integer quantidadeAntesZerar = qtdLivros;
            ativa = false;
            qtdLivros = 0;
            return quantidadeAntesZerar;
        }
    }

    public void transferir(Biblioteca destino, Integer quantidade){
        
    }
//    Transfere livros se:
//    Ambas bibliotecas estiverem ativas
//    quantidade for válida e menor ou igual ao estoque
//    Caso contrário: não faz nada
        public Boolean reajustarMulta(Double percentual){
        
        }
//    Reajusta a multa diária com base no percentual (0.10 = 10%)
//    Só aplica se percentual for > 0 e diferente de null
//    Retorna true se alterado, false se inválido
}
