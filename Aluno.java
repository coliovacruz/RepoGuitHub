

public class Aluno {
    private String curso;
    private String disciplina;
    private String aluno;
    private float nota1;
    private float nota2;
public Aluno(String curso, String disciplina, String aluno, float nota1, float nota2){
    this.aluno=aluno;
    this.curso =curso;
    this.disciplina=disciplina;
    this.nota1=nota1;
    this.nota2=nota2;

}


       public String getCurso() {
        return curso;
    }
       public void setCurso(String curso) {
        this.curso = curso;
    }

    public String getDisciplina() {
        return disciplina;
    }

    public void setDisciplina(String disciplina) {
        this.disciplina = disciplina;
    }

    public String getAluno() {
        return aluno;
    }

    public void setAluno(String aluno) {
        this.aluno = aluno;
    }

    public float getNota1() {
        return nota1;
    }

    public void setNota1(float nota1) {
        this.nota1 = nota1;
    }

    public float getNota2() {
        return nota2;
    }
   
    public void setNota2(float nota2) {
        this.nota2 = nota2;
    }
    public float calculamedia(float nota1, float nota2){
        return ((nota1+nota2)/2);
    }

}


