package exercicios.dadosFuncionario;

public class FuncionarioTeste {
    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario("Sérgio", 6000.0);
        funcionario.taxarSalario();
        funcionario.incrementarSalario(0.10);

        
    }
}
