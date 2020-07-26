package br.com.lambda.classesforeach;

public class ClassePrincipal {
	public static void main(String args[]) {
	    Lambda java8 = new Lambda();
	    java8.inserirPalavras();
	    
		System.out.println("--- forEach Palavras---");
	    java8.forEachPalavras();
	    
		System.out.println("--- comparator ---");
	    java8.comparator();
	    
		System.out.println("--- melhorando comparator ---");
		java8.melhorandoComparator();
		
		System.out.println("--- melhorando comparator com method reference---");
		java8.melhorandoComparatorComMethodReference();
		
		System.out.println("--- melhorando comparator static comparing---");
		java8.melhorandoComparatorStaticComparing();

		System.out.println("--- melhorando comparator alternativo---");
		java8.melhorandoComparatorAlternativo();
		
		java8.inserirCursos();
		
		System.out.println("--- forEach cursos---");
	    java8.forEachCursos();
		
		System.out.println("ordenar lista de cursos pela quantidade de alunos > 50");
		java8.filtroDeCursosMaisDeCinquentaAlunos();
				
		System.out.println("transformar o Stream<Curso> em um Stream<String> contendo apenas os nomes dos cursos");
		java8.recuperarPorNomeDeCursoParaListaString();
		
		System.out.println("transformar o Stream<Curso> em um Stream<String> contendo apenas os nomes dos cursos - Recupera primeiro da Lista");
		java8.filtroDeCursosMaisDeCinquentaAlunosPrimeiroDaLista();
		
		System.out.println("Calcule a quantidade média de alunos de todos os seus cursos utilizando a API de Stream.");
		java8.calcularMediaAlunos();
				
		System.out.println("--- thread ---");
		java8.thread();
	}
}