package controller;

import model.ListaTarefas;

public class User {
    public static void main(String[] args) {
        ListaTarefas lista = new ListaTarefas();

        //Inserindo tarefas
        lista.adicionarTarefa("Comprar tomate");
        lista.adicionarTarefa("Matar 3 leões por dia");
        lista.adicionarTarefa("Cozinhar pra sogra");
        lista.adicionarTarefa("Organizar a área de serviço");
        lista.adicionarTarefa("Comprar amendoim");
        lista.adicionarTarefa("Limpar o banheiro");
        lista.adicionarTarefa("Regar as plantas");
        lista.adicionarTarefa("Cuidar do Montanha");

        //Exibindo e contando tarefas
        lista.exibirTarefas();
        System.out.println(lista.contarTarefas());

        //Removendo tarefas
        lista.removerTarefa("Matar 3 leões por dia");

        //Contando tarefas
        System.out.println(lista.contarTarefas());

        //Marcando como concluido
        lista.marcarTarefaConcluida("Cuidar do Montanha");
        lista.marcarTarefaConcluida("Limpar banheiro");
        lista.marcarTarefaConcluida("Regar as plantas");
        lista.marcarTarefaConcluida("Cozinhar pra sogra");
        lista.marcarTarefaConcluida("Comprar amendoim");
        lista.marcarTarefaConcluida("Comprar tomate");

        //Obtendo tarefas concluidas
        System.out.println(lista.obterTarefasConcluidas());

        //Marcando como pendente
        lista.marcarTarefaPendente("Regar as plantas");
        lista.marcarTarefaPendente("Cuidar do Montanha");

        //Obtendo tarefas pendentes
        System.out.println(lista.obterTarefasPendentes());

        //Exibindo tarefas
        lista.exibirTarefas();

        //Limpando lista de tarefas
        lista.limparListaTarefas();

        //Exibindo tarefas
        lista.exibirTarefas();
    }
}
