package AnalisisGenomico;

import javax.swing.*;

public class AnalisisGenomico {
    public AnalisisGenomico() {
        JFrame frame = new JFrame("Análisis Genómico");
        frame.setSize(600, 400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }

    // Sumatoria de números naturales
    public int sumatoria(int n) {
        if (n <= 0) {
            return 0;
        } else {
            return n + sumatoria(n - 1);
        }
    }

    // Listado de números en un rango
    public void listado(int start, int end) {
        if (start <= end) {
            System.out.println(start);
            listado(start + 1, end);
        }
    }

    // Cálculo de potencias
    public int potencia(int base, int exponente) {
        if (exponente == 0) {
            return 1;
        } else {
            return base * potencia(base, exponente - 1);
        }
    }

    // Encontrar el valor máximo
    public int maximo(int[] array, int length) {
        if (length == 1) {
            return array[0];
        } else {
            return Math.max(array[length - 1], maximo(array, length - 1));
        }
    }

    // Quicksort optimizado
    public void quicksort(int[] array, int low, int high) {
        if (low < high) {
            int pivot = partition(array, low, high);
            quicksort(array, low, pivot - 1);
            quicksort(array, pivot + 1, high);
        }
    }

    private int partition(int[] array, int low, int high) {
        int pivot = array[high];
        int i = low - 1;
        for (int j = low; j < high; j++) {
            if (array[j] <= pivot) {
                i++;
                int temp = array[i];
                array[i] = array[j];
                array[j] = temp;
            }
        }
        int temp = array[i + 1];
        array[i + 1] = array[high];
        array[high] = temp;
        return i + 1;
    }

    // Conteo de genes
    public int conteoGenes(String dna) {
        if (dna.length() < 3) {
            return 0;
        } else if (dna.substring(0, 3).equals("ATG")) {
            return 1 + conteoGenes(dna.substring(3));
        } else {
            return conteoGenes(dna.substring(1));
        }
    }

    // Cálculo de combinaciones genéticas
    public int combinacionesGeneticas(int n) {
        if (n == 0) {
            return 1;
        } else {
            return n * combinacionesGeneticas(n - 1);
        }
    }
}