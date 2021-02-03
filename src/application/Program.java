package application;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

import entitie.Aluno;

public class Program {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Set<Aluno> alunos = new HashSet<>();
		
		System.out.print("How many students for course A? ");
		int n = sc.nextInt();
		
		for(int i = 0; i < n; i++) {
			int al = sc.nextInt();
			alunos.add(new Aluno(al));
		}
		
		System.out.print("How many students for course B? ");
		n = sc.nextInt();
		
		for(int i = 0; i < n; i++) {
			int al = sc.nextInt();
			alunos.add(new Aluno(al));
		}
		
		System.out.print("How many students for course C? ");
		n = sc.nextInt();
		
		for(int i = 0; i < n; i++) {
			int al = sc.nextInt();
			alunos.add(new Aluno(al));
		}
		
		System.out.println("Total students: " + alunos.size());
		
		
		
		
		
		
		
		sc.close();

	}

}
