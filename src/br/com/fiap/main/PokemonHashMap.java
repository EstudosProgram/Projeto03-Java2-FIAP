package br.com.fiap.main;

import javax.swing.*;
import java.util.HashMap;
import java.util.Map;

public class PokemonHashMap {
    public static void main(String[] args) {
        HashMap<String, String> pokemons = new HashMap<String, String>();
        do {
            try {
                String nome, tipo;
                do {
                    nome = JOptionPane.showInputDialog("Digite o nome de um Pokémon ou digite \"fim\" para encerrar").toUpperCase();
                    if (!nome.equals("FIM")) {
                        tipo = JOptionPane.showInputDialog("Digite o tipo do Pokémon informado anteriormente").toUpperCase();
                        if (pokemons.containsKey(nome)) {
                            JOptionPane.showMessageDialog(null, "Este Pokémon já foi cadastrado!", "Atenção", JOptionPane.WARNING_MESSAGE);
                        } else {
                            pokemons.put(nome, tipo);
                        }
                    }
                } while (!nome.equals("FIM"));
                String escolha = JOptionPane.showInputDialog("Digite um tipo qualquer a sua escolha").toUpperCase();
                String nomesEncontrados = "";
                for (Map.Entry<String, String> entrada : pokemons.entrySet()) {
                    if (entrada.getValue().equals(escolha)) {
                        nomesEncontrados += entrada.getKey() + "\n";
                    }
                }
                JOptionPane.showMessageDialog(null, String.format("Para o tipo: %s foram encontrado(s) o(s) pokémon(s):\n%s", escolha, nomesEncontrados), "Pokémons", JOptionPane.INFORMATION_MESSAGE);
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, e.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);
            }
        } while (JOptionPane.showConfirmDialog(null, "Deseja continuar?", "Atenção", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE) == 0);
        JOptionPane.showMessageDialog(null, "Fim de Programa!", "Adeus", JOptionPane.WARNING_MESSAGE);
    }
}