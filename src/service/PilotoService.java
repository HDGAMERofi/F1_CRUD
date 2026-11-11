package src.service;

import src.model.Piloto;
import java.util.ArrayList;

public class PilotoService {
    private ArrayList<Piloto> pilotos = new ArrayList<>();

    // Cadastrar
    public void cadastrarPiloto(Piloto piloto){
        pilotos.add(piloto);
    }

    // Listar
    public void listarPilotos(){
        for(Piloto piloto : pilotos){
            System.out.println(piloto);
            System.out.println("----------------------");
        }
    }

    // Buscar
    public Piloto buscarPiloto(int numero){
        for(Piloto piloto : pilotos){
            if (piloto.getNumero() == numero) {
                return piloto;
            }
        }
        return null;
    }

    // Editar
    public void editarPiloto(int numero, String nome, String nacionalidade, String equipe, int titulos){
        Piloto piloto = buscarPiloto(numero);

        if (piloto != null){
            piloto.setNome(nome);
            piloto.setNacionalidade(nacionalidade);
            piloto.setEquipe(equipe);
            piloto.setTitulos(titulos);

            System.out.println("Piloto atualizado com sucesso!");
        } else {
            System.out.println("Piloto não encontrado! Tente novamente!");
        }
    }

    // Delete
    public void excluirPiloto(int numero){
        Piloto piloto = buscarPiloto(numero);

        if (piloto != null) {
            pilotos.remove(piloto);
            System.out.println("Piloto removido com sucesso!");
        } else {
            System.out.println("Piloto não encontrado! Tente novamente!");
        }
    }
}