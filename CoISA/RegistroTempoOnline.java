public class RegistroTempoOnline {
    private String nome;
    private int metaMinutos;
    private int tempoOnline;

    public RegistroTempoOnline(String nome, int metaMinutos) {
        this.nome = nome;
        this.metaMinutos = metaMinutos;
        this.tempoOnline = 0;
    }

    public RegistroTempoOnline(String nome) {
        this.nome = nome;
        this.metaMinutos = 60;
        this.tempoOnline = 0;
    }

    public void adicionaTempoOnline(int minutos) {
        this.tempoOnline += minutos;
    }

    public boolean atingiuMetaTempoOnline() {
        return tempoOnline >= metaMinutos;
    }

    @Override
    public String toString() {
        return nome + " - " + tempoOnline + "/" + metaMinutos + " minutos";
    }
}