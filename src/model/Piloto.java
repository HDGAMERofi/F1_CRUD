package src.model;

public class Piloto {

    private String nome;
    private int numero;
    private String nacionalidade;
    private String equipe;
    private int titulos;

    // Construtor
    public Piloto(String nome, int numero, String nacionalidade, String equipe, int titulos) {
        this.nome = nome;
        this.numero = numero;
        this.nacionalidade = nacionalidade;
        this.equipe = equipe;
        this.titulos = titulos;
    }

    // Getters
    public String getNome(){
        return nome;
    }

    public int getNumero(){
        return numero;
    }

    public String getNacionalidade(){
        return nacionalidade;
    }

    public String getEquipe(){
        return equipe;
    }

    public int getTitulos(){
        return titulos;
    }

    // Setters
    public void setNome(String nome){
        this.nome = nome;
    }

    public void setNumero(int numero){
        this.numero = numero;
    }

    public void setNacionalidade(String nacionalidade){
        this.nacionalidade = nacionalidade;
    }

    public void setEquipe(String equipe){
        this.equipe = equipe;
    }

    public void setTitulos(int titulos){
        this.titulos = titulos;
    }
    
    // toString
    @Override
    public String toString(){
        return "\n----------------------------------------" +
                "\n PILOTO: " + nome +
                "\n----------------------------------------" +
                "\n Número: " + numero +
                "\n Nacionalidade: " + nacionalidade +
                "\n Equipe: " + equipe +
                "\n Títulos: " + titulos +
                "\n----------------------------------------";
    }
}