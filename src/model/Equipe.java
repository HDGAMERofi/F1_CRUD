package src.model;

public class Equipe {

    private String nome;
    private String pais;
    private String chefe;
    private int anoFundacao;
    private int titulos;

    // Construtor
    public Equipe(String nome, String pais, String chefe, int anoFundacao, int titulos){
        this.nome = nome;
        this.pais = pais;
        this.chefe = chefe;
        this.anoFundacao = anoFundacao;
        this.titulos = titulos;
    }

    // Getters
    public String getNome(){
        return nome;
    }

    public String getPais(){
        return pais;
    }

    public String getChefe(){
        return chefe;
    }

    public int getAnoFundacao(){
        return anoFundacao;
    }

    public int getTitulos(){
        return titulos;
    }

    // Setters
    public void setNome(String nome){
        this.nome = nome;
    }

    public void setPais(String pais){
        this.pais = pais;
    }

    public void setChefe(String chefe){
        this.chefe = chefe;
    }

    public void setAnoFundacao(int anoFundacao){
        this.anoFundacao = anoFundacao;
    }

    public void setTitulos(int titulos){
        this.titulos = titulos;
    }

    // toString
    @Override
    public String toString(){
        return "\n----------------------------------------" +
                "\n Equipe: " + nome +
                "\n----------------------------------------" +
                "\n País: " + pais +
                "\n Chefe: " + chefe +
                "\n Ano de Fundação: " + anoFundacao +
                "\n Títulos: " + titulos +
                "\n----------------------------------------";
    }
}