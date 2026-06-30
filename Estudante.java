public class Estudante {

    private String nome;
    private String matricula;
    private boolean mensalidadeDia;

    public Estudante(String nome, String matricula, boolean mensalidadeDia) {
        this.nome = nome;
        this.matricula = matricula;
        this.mensalidadeDia = mensalidadeDia;
    }

    public String getNome() {
        return nome;
    }

    public String getMatricula() {
        return matricula;

    }

    public boolean isMensalidadeDia() {
        return mensalidadeDia;

    }
}