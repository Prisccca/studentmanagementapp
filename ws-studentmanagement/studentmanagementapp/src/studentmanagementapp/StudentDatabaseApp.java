package studentmanagementapp;

import java.util.Scanner;

public class StudentDatabaseApp {

	public static void main(String[] args) {
		
		// Perguntar quantos estudantes serão adicionados
		System.out.println("Digite o número de estudantes para inscrição: ");
		Scanner sc = new Scanner(System.in);
		int numberOfStudents = sc.nextInt()
;
		Student[] students = new Student[numberOfStudents];
		
		
		
		//Criar n número de estudantes
		for (int n= 0; n < numberOfStudents; n++) {
			
			students [n] = new Student();
			students [n].enrollCourse();
			students [n].payTuition();
			System.out.println(students[n].toString());
				
		}
		
		
		
		
		sc.close();
		

	}

}
