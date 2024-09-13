package Mains;
import Classes.Produto;

import java.util.Scanner;

public class inventário {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //Produtos intânciados por contrutores
         //Produto 1
        System.out.println("Qual o nome do produto: ");
        String nome = scanner.nextLine();
        System.out.println("Qual o preço do produto: ");
        double preco = scanner.nextDouble();
        System.out.println("Qual a quantidade em estoque: ");
        int qtn_estoque = scanner.nextInt();
        System.out.println("Qual o número do item: ");
        int numero_item = scanner.nextInt();


        Produto produto = new Produto(nome,preco,qtn_estoque,numero_item);
        produto.setAtivo(false);
        String string = produto.toString();
        System.out.println(produto);

        //Produto 2
        System.out.println("Qual o nome do produto: ");
        String nome1 = scanner.next();
        System.out.println("Qual o preço do produto: ");
        double preco1 = scanner.nextDouble();
        System.out.println("Qual a quantidade em estoque: ");
        int qtn_estoque1 = scanner.nextInt();
        System.out.println("Qual o número do item: ");
        int numero_item1 = scanner.nextInt();

        Produto produto1 = new Produto(nome1,preco1,qtn_estoque1,numero_item1);
        produto1.setAtivo(false);
        String string1 = produto1.toString();
        System.out.println(produto1);



    }
}
