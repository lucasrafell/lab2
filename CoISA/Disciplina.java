public class Disciplina {
    private String nome;
    private int horasEstudadas;
    private double[] notas;

    public Disciplina(String nome) {
        this.nome = nome;
        this.horasEstudadas = 0;
        this.notas = new double[4];
    }

    public void cadastraHoras(int horas) {
        this.horasEstudadas += horas;
    }

    public void cadastraNota(int indice, double nota) {
        this.notas[indice - 1] = nota;
    }

    private double calcularMedia() {
        double soma = 0;
        for (double nota : notas) {
            soma += nota;
        }
        return soma / notas.length;
    }

    public boolean aprovado() {
        return calcularMedia() >= 7.0;
    }

    @Override
    public String toString() {
        return nome + " - " + horasEstudadas + " horas - Média: " + calcularMedia();
    }
}