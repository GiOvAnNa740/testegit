import javax.xml.stream.events.StartDocument;

public class Empregado{
    private String nome;
    private String idade;
    private double salario;
    private double comissao;
    private double bonus;

    public double calcularSalario(){
        switch (tipo){
            case 1:
                return salario;

            case 2: 
            
            return salario + salario * comissao;
            
            case 3:
                return salario + bonus;

            default:
                return 0;
        }
    }

    public String getIdade() {
        return idade;
    }

    public String getNome() {
        return nome;
    }

    public void setIdade(String idade) {
        this.idade = idade;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}