package studentmanagementapp;

import java.util.Scanner;

public class Student {
	//Metodos a serem utilizados
	
	private String firstName;
	private String lastName;
	private int gradeYear;
	private String studentID;
	private String courses;
	private int tuitionBalance = 0;
	private int costTuition = 600;
	private static int id  = 1001;
	
	
	
	//Constructor: solicitar ao usuario nome do estudante e ano.
	
		public Student() {
			Scanner sc = new Scanner(System.in);
			System.out.print("Digite o primeiro nome do estudante:  ");
			this.firstName = sc.nextLine();
			
			System.out.print("Digite o sobrenome do estudante:  ");
			this.lastName = sc.nextLine();
			
			System.out.print("Digite o nível do estudante: \n 1- Primeiro ano\n 2- Segundo Ano \n 3 - Terceiro Ano \n 4 - Quarto ano ");
			this.gradeYear = sc.nextInt();
			setStudentID();
			
				
		}
	
	//Gerar um ID
		private void setStudentID() {
			id++;
			//GRade LEvel + ID
			this.studentID = gradeYear  + "" +id;
			
		}
		
	
	//Inscrição em cursos
		
		public void enrollCourse() {
			
			do {
			System.out.println( "Digite o  curso que você quer se inscrever: ");
			System.out.println( "Q - para sair");
			Scanner sc = new Scanner(System.in);
			String course = sc.nextLine();
			if ( !course.equals("Q")) {
				courses = courses + "\n" + course;
				tuitionBalance = tuitionBalance + costTuition;
			}
			else { 
				break;
			}
			
			} while ( 1 != 0);
			
				
		}
	
	//Ver saldo
		
		public void viewBalance () {
			System.out.println("O valor restante para pagamento é:  $" + tuitionBalance);
		}
	
	//Pagar matricula
		
		public void payTuition () {
			viewBalance();
			System.out.println("Entre com o valor do pagamento: ");
			Scanner sc = new Scanner (System.in);
			int payment = sc.nextInt();
			tuitionBalance = tuitionBalance - payment;
			System.out.println ("Obrigado pelo seu pagamento de : $" + payment);
			viewBalance();
			
			
		}
		
	
	//Mostrar Status
		public String toString () {
			return "Nome: " + firstName + " \n Sobrenome: " + lastName +
					"\n Nível: "+ gradeYear +
					"\n ID do estudante: "+ studentID +
					"\n Cursos  Inscritos: " + courses +
					"\n Valor Restante: $" + tuitionBalance;
		}
	


}
