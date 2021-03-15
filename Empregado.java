import javax.xml.stream.events.StartDocument;

public class Empregado{
    private int tipo;
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
    public double getSalario() {
        return salario;
    }
    public double getBonus() {
        return bonus;
    }
    public double getComissao() {
        return comissao;
    }
    public String getIdade() {
        return idade;
    }
    public String getNome() {
    
        return nome;
    }
    public int getTipo() {
    
        return tipo;
    }
    public void setSalario(double salario) {
        this.salario = salario;
    }
    public void setComissao(double comissao) {
        this.comissao = comissao;
    }
    public void setBonus(double bonus) {
        this.bonus = bonus;
    }
    public void setIdade(String idade) {
        this.idade = idade;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    public void setTipo(int tipo) {
        this.tipo = tipo;
    }
    
}