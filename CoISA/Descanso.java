public class Descanso {
    private int horasDescanso;
    private int numeroSemanas;

    public Descanso() {
        this.horasDescanso = 0;
        this.numeroSemanas = 0;
    }

    public void defineHorasDescanso(int horas) {
        this.horasDescanso = horas;
    }

    public void defineNumeroSemanas(int semanas) {
        this.numeroSemanas = semanas;
    }

    public String getStatusGeral() {
        if (numeroSemanas == 0) {
            return "Nunca descansou";
        }

        int mediaHorasPorSemana = horasDescanso / numeroSemanas;

        if (mediaHorasPorSemana >= 26) {
            return "Descansado";
        } else {
            return "Cansado";
        }
    }
}