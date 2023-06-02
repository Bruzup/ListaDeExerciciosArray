import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Exercicio2Inserir {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        List<String> lista = new ArrayList<>();
        lista.add("Roupa");
        lista.add("Sapato");
        lista.add("Underwear");
        lista.add("Banheiro");
        lista.add("Roupa de cama");

        System.out.println("++++++++++++++++++++++++++++++++++++++++++");
        System.out.println("Lista original: " + lista);

        System.out.println("Qual elemento deseja remover da lista?");
        int removeIndice = input.nextInt();
        lista.remove(removeIndice);

        System.out.println("Lista de array modificada : " + lista);
    }

}
