package src.service;

import java.util.ArrayList;
import src.model.Equipe;

public class EquipeService {
    private ArrayList<Equipe> equipes = new ArrayList<>();

    // Cadastrar
    public void cadastrarEquipe(Equipe equipe){
        equipes.add(equipe);
    }

    // Listar
    public void listarEquipes(){
        for(Equipe equipe : equipes){
            System.out.println(equipe);
            System.out.println("----------------------");
        }
    }

    // Buscar
    public Equipe buscarEquipe(String nome){
        for(Equipe equipe : equipes){
            if (equipe.getNome().equalsIgnoreCase(nome)){
                return equipe;
            }
        }

        return null;
    }
    
    // Editar
    public void editarEquipe(String nome, String novoPais, String novoChefe, int novoAnoFundacao, int novosTitulos){
        Equipe equipe = buscarEquipe(nome);

        if (equipe != null){ 
            equipe.setPais(novoPais);
            equipe.setChefe(novoChefe);
            equipe.setAnoFundacao(novoAnoFundacao);
            equipe.setTitulos(novosTitulos);

            System.out.println("Equipe atualizada com sucesso!");
        } else {
            System.out.println("Equipe não encontrada! Tente novamente!");
        }
    }

    // Delete
    public void excluirEquipe(String nome){

        Equipe equipe = buscarEquipe(nome);

        if (equipe != null){
            equipes.remove(equipe);
            System.out.println("Equipe removida com sucesso!");
        } else {
            System.out.println("Equipe não encontrada! Tente novamente!");
        }
    }
}