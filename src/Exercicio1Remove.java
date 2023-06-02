import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Exercicio1Remove {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        List<Integer> lista = new ArrayList<>();
        lista.add(10);
        lista.add(20);
        lista.add(30);
        lista.add(40);
        lista.add(50);

        System.out.println("++++++++++++++++++++++++++++++++++++++++++");
        System.out.println(lista);

        System.out.println("Em qual posição deseja remover o elemento?");
        int elementoRemover = input.nextInt();
        lista.remove(elementoRemover);


        System.out.println("Lista de array modificada : " + lista);
    }




}
