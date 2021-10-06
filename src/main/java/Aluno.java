public class Aluno {
    private String nome;
    private String endereco;
    private int matricula;


    public Aluno(String nome, String endereco, int matricula) {
        this.setNome(nome);
        this.setEndereco(endereco);
        this.setMatricula(matricula);

    }


    public String getNome() {
        return nome;
    }


    public void setNome(String nome) {
        this.nome = nome;
    }


    public String getEndereco() {
        return endereco;
    }


    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }


    public int getMatricula() {
        return matricula;
    }


    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }



}
