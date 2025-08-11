package br.com.fiap;

import java.util.HashMap;
import java.util.Map;

public class NavegaHashMap {
    public static void main(String[] args) {
        HashMap<String, Integer> pessoas = new HashMap<>();
        pessoas.put("Astrogildo",18);
        pessoas.put("Milena",19);
        pessoas.put("Carolina",22);
        pessoas.put("Evojeda",21);
        //System.out.println(pessoas);
        for (Map.Entry<String, Integer> i : pessoas.entrySet()) {
            System.out.println("Chave:" + i.getKey() + "\nValor:" + i.getValue());
        }
    }
}
