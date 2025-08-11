package br.com.fiap;

import javax.swing.*;
import java.util.HashMap;

public class ExemplosHashMap {
    public static void main(String[] args) {
        HashMap<String, String> mapa = new HashMap<>();
        do {
            try {
                String sigla, estado;
                //Primeira parte: Cadastro de estados
                do {
                    sigla = JOptionPane.showInputDialog("Digite uma Unidade Federal(UL) de um estado ou digite \"FIM\" para finalizar.").toUpperCase();
                    if (!sigla.equals("FIM")) {
                        if (mapa.containsKey(sigla)) {
                            JOptionPane.showMessageDialog(null, "Essa sigla já foi cadastrada");
                        } else {
                            estado = JOptionPane.showInputDialog("Digite o nome completo deste estado informado.");
                            mapa.put(sigla, estado);
                        }
                    }
                } while (!sigla.equals("FIM"));
                //Segunda parte: Buscando um nome de estado pela sua sigla
                String escolha = JOptionPane.showInputDialog("Digite uma UF para buscar pelo seu nome").toUpperCase();
                if (mapa.containsKey(escolha)) {
                    JOptionPane.showMessageDialog(null, "Nome do Estado: " + mapa.get(escolha), "Nome do Estado", JOptionPane.INFORMATION_MESSAGE);
                } else {
                    JOptionPane.showMessageDialog(null, "Estado não cadastrado!");
                }
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, e.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);
            }
        } while (JOptionPane.showConfirmDialog(null, "Deseja continuar?", "Atenção", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE)== 0);
        JOptionPane.showMessageDialog(null, "Fim do programa", "Adeus", JOptionPane.WARNING_MESSAGE);
    }
}
