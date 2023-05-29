package main;

import br.edu.fateczl.arvoreint.Arvore;

public class Principal {
    public static void main(String[] args) {
        int[] valores = {33, 15, 41, 38, 47, 34, 49, 43};
        
        Arvore arvore = new Arvore();
        
        for (int valor : valores) {
            arvore.insert(valor);
        }
        
        System.out.println("Atravessamento pré-fixado:");
        try {
            arvore.prefixSearch();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        
        System.out.println("\nAtravessamento in-fixado:");
        try {
            arvore.infixSearch();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        
        System.out.println("\nAtravessamento pós-fixado:");
        try {
            arvore.postfixSearch();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
