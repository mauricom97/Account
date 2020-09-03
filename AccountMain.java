import java.util.Scanner;

public class AccountMain
{
	public static void main(String[] args)
	{
		Account a1 = new Account("Mauricio"); //constroi um objeto de conta e armazena em 'a'
        Account a2 = new Account("Irineu");
		
		/*
		Scanner input = new Scanner(System.in);
		System.out.print("Entre um nome para a conta:	");
		String name = input.nextLine();
		a.setName(name); //armazenar o 'name' na conta 'a'
		
		//imprime o resultado da getName
        */
		System.out.println("o nome na conta 1:	"+ a1.getName());
        System.out.println("o nome na conta 2:	"+ a2.getName());
	}
}