package br.com.lambda.classesforeach;

import static java.util.Comparator.comparing;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Lambda {
	List<String> palavras = new ArrayList<>();
	List<Curso> cursos = new ArrayList<>();

	public void inserirPalavras() {
		palavras.add("alura online");
		palavras.add("casa do código");
		palavras.add("caelum");
	}
	
	public void inserirCursos() {
		cursos.add(new Curso("Python", 45));
		cursos.add(new Curso("JavaScript", 150));
		cursos.add(new Curso("Java 8", 113));
		cursos.add(new Curso("C", 55));
	}
	
	public void forEachPalavras() {
		palavras.forEach(System.out::println);
	}
	
	public void forEachCursos() {
		cursos.forEach(c -> System.out.println(c.getNome()));
	}
	
	public void comparator() {
		palavras.sort((s1, s2) -> s1.length() - s2.length());
		forEachPalavras();
	}
	
	public void melhorandoComparator() {
		palavras.sort(Comparator.comparing(s -> s.length()));
		forEachPalavras();
	}
	
	public void melhorandoComparatorComMethodReference() {
		palavras.sort(Comparator.comparing(String::length));
		forEachPalavras();
	}
	
	public void melhorandoComparatorStaticComparing() {
		palavras.sort(comparing(String::length));
		forEachPalavras();
	}
	
	public void melhorandoComparatorAlternativo() {
		palavras.sort(String.CASE_INSENSITIVE_ORDER);
		forEachPalavras();
	}
	
	public void sortPorCursos() {
		cursos.sort(Comparator.comparingInt(Curso::getAlunos));
	}

	public void filtroDeCursosMaisDeCinquentaAlunos(){
		cursos.stream()
		   .filter(c -> c.getAlunos() > 50)
		   .forEach(c -> System.out.println(c.getNome()));
	}
	
	public void recuperarPorNomeDeCursoParaListaString(){
		Stream<String> nomes = cursos.stream().map(Curso::getNome);
		nomes.forEach(nome -> System.out.println(nome));
	}
	
	public void filtroDeCursosMaisDeCinquentaAlunosPrimeiroDaLista(){
		cursos.stream()
			.filter(c -> c.getAlunos() > 50)
			.findFirst()
			.ifPresent(c -> System.out.println(c.getNome()));
	}

	public void calcularMediaAlunos(){
		cursos.stream()
			.mapToInt(c -> c.getAlunos())
			.average()
			.ifPresent(System.out::print);
	}
	
	public void converteStreamParaList() {
		cursos.stream()
			.filter(c -> c.getAlunos() > 50)
			.collect(Collectors.toList())
			.forEach(c -> System.out.println(c.getNome()));;
	}
		
	public void thread() {
		new Thread(() -> System.out.println("Executando um Runnable")).start();
	}
}