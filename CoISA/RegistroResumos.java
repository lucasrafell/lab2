public class RegistroResumos {
    private Resumo[] resumos;
    private int quantidade;

    public RegistroResumos(int tamanhoMaximo) {
        this.resumos = new Resumo[tamanhoMaximo];
        this.quantidade = 0;
    }

    public void adiciona(String tema, String conteudo) {
        resumos[quantidade] = new Resumo(tema, conteudo);
        quantidade++;
    }

    public String[] pegaResumos() {
        String[] resultado = new String[quantidade];
        for (int i = 0; i < quantidade; i++) {
            resultado[i] = resumos[i].toString();
        }
        return resultado;
    }

    public int conta() { return quantidade; }

    public String imprimeResumos() {
        String resultado = "";
        for (int i = 0; i < quantidade; i++) {
            resultado += resumos[i].toString() + "\n";
        }
        return resultado;
    }

    public boolean temResumo(String tema) {
        for (int i = 0; i < quantidade; i++) {
            if (resumos[i].getTema().equalsIgnoreCase(tema)) {
                return true;
            }
        }
        return false;
    }

    public String[] busca(String chaveDeBusca) {
        String chave = chaveDeBusca.toLowerCase();
        int count = 0;

        for (int i = 0; i < quantidade; i++) {
            if (resumos[i].getConteudo().toLowerCase().contains(chave)) {
                count++;
            }
        }

        String[] encontrados = new String[count];
        int idx = 0;
        for (int i = 0; i < quantidade; i++) {
            if (resumos[i].getConteudo().toLowerCase().contains(chave)) {
                encontrados[idx++] = resumos[i].getTema();
            }
        }

        java.util.Arrays.sort(encontrados);
        return encontrados;
    }
}