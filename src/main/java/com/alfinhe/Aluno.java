package com.alfinhe;

public class Aluno {

    private String nome;
    private int totalAulas;
    private int faltas;

    public Aluno( String nome, int totalAulas ) {
        this.nome = nome;
        this.totalAulas = totalAulas;
        this.faltas = 0;
    }

    public void adicionarFalta( ) {
        this.faltas++;
    }

    public int calcularPresencas( ) {
        return totalAulas - faltas;
    }

    public double calcularPorcentagemPresenca( ) {
        return ( calcularPresencas ( ) / ( double ) totalAulas ) * 100;
    }

    public double calcularPorcentagemFaltas( ) {
        return ( faltas / ( double ) totalAulas ) * 100;
    }

    public void exibirResumo( ) {
        System.out.println ( "Nome: " + nome );
        System.out.println ( "Total de Aulas: " + totalAulas );
        System.out.println ( "Faltas: " + faltas );
        System.out.println ( "Presenças: " + calcularPresencas ( ) );
        System.out.println ( "Porcentagem de Presença: " + calcularPorcentagemPresenca ( ) + "%" );
        System.out.println ( "Porcentagem de Faltas: " + calcularPorcentagemFaltas ( ) + "%" );
    }
    public static void main(String[] args) {
        Aluno aluno = new Aluno("João", 200);
        aluno.adicionarFalta();
        aluno.adicionarFalta();
        aluno.exibirResumo();
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public int getTotalAulas() {
        return totalAulas;
    }
    public void setTotalAulas(int totalAulas) {
        this.totalAulas = totalAulas;
    }
    public int getFaltas() {
        return faltas;
    }
    public void setFaltas(int faltas) {
        this.faltas = faltas;
    }
    public void adicionarFaltas(int faltas) {
        this.faltas += faltas;
    }

    @Override
    public String toString( ) {
        return "Aluno{" +
                "nome='" + nome + '\'' +
                ", totalAulas=" + totalAulas +
                ", faltas=" + faltas +
                '}';
    }
}

