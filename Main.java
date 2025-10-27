
import java.util.Scanner;

public class Main {
    public static void main(String[] args){

      System.out.println("======MENU======");
      System.out.println("1- Cadastrar tarefa");
      System.out.println("2- Listar tarefa pendente");
        System.out.println("3- Buscar tarefas por titulo");
        System.out.println("4- Marcar tarefa como concluida");
        System.out.println("5- Remover uma tarefa");
        System.out.println("0- Sair");

        System.out.println();
        System.out.println("Digite uma opção");
        Scanner sc= new Scanner(System.in);
        int opcao= sc.nextInt();
        System.out.println();

        System.out.println("A opção escolhida foi "+ opcao);

        switch (opcao){
            case 1-> System.out.println("Tarefa cadastrada com sucesso");
            case 2-> System.out.println("Tarefa listada com sucesso");
            case 3-> System.out.println("Tarefa buscada com sucesso");
            case 4-> System.out.println("Tarefa marcada com sucesso");
            case 5-> System.out.println("Tarefa removida com sucesso");
            case 0-> System.out.println("Saindo do programa");


        }





    }
}
