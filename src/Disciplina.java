public class Disciplina {
    private String nome;
    private Aluno aluno;
    private Professor professor;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Aluno getAluno() {
        return aluno;
    }

    public void setAluno(Aluno aluno) {
        this.aluno = aluno;
    }

    public Professor getProfessor() {
        return professor;
    }

    public void setProfessor(Professor professor) {
        this.professor = professor;
    }

    public Disciplina (){

    }
    public Disciplina (String nome, Aluno aluno, Professor professor){
        this.nome = nome;
        this.aluno = aluno;
        this.professor = professor;
    }

    public void cadastrarAluno(Aluno aluno) {
        this.aluno = aluno;
    }
    public void ministrarDisciplina(Professor professor){
        this.professor = professor;
    }

    @Override
    public String toString() {
        return "Disciplina{" +
                "nome='" + nome + '\'' +
                ", aluno=" + aluno +
                ", professor=" + professor +
                '}';
    }
}
