package academy.learnprogramming.challenges.challenge6;

import java.util.Arrays;

public class EmpregadoJavaClass {

    private String nome;
    private String sobrenome;
    private int anoInicio;
    private float[] salario3UltimosAnos;

    public EmpregadoJavaClass(String nome, String sobrenome, int anoInicio) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.anoInicio = anoInicio;
        this.salario3UltimosAnos = new float[3];
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public float[] getSalario3UltimosAnos() {
        return salario3UltimosAnos;
    }

    public void setSalario3UltimosAnos(float[] salario3UltimosAnos) {
        this.salario3UltimosAnos = salario3UltimosAnos;
    }

    @Override
    public String toString() {
        return "EmployeeJavaClass{" +
                "firstName='" + nome + '\'' +
                ", lastName='" + sobrenome + '\'' +
                ", startYear=" + anoInicio +
                ", salaryLast3Years=" + Arrays.toString(salario3UltimosAnos) +
                '}';
    }
}