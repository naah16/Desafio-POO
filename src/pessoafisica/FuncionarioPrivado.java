package pessoafisica;
public class FuncionarioPrivado extends PessoaFisica
{
    private String numeroCarteiraTrab;
    public FuncionarioPrivado(String numeroCarteiraTrab, String cpf, String nome, String endereco, String sexo, String telefone, int idade, boolean impostoDeRenda, double salario) 
    {
        super(cpf, nome, endereco, sexo, telefone, idade, impostoDeRenda, salario);
        this.numeroCarteiraTrab = numeroCarteiraTrab;
    }
    public FuncionarioPrivado() 
    {
        super();
        this.numeroCarteiraTrab = "sem carteira de trabalho";
    }
    public String getNumeroCarteiraTrab() 
    {
        return numeroCarteiraTrab;
    }
    public void setNumeroCarteiraTrab(String numeroCarteiraTrab) 
    {
        this.numeroCarteiraTrab = numeroCarteiraTrab;
    }   
    @Override
    public void aumentarSalario()
    {
         super.setSalario(super.getSalario()*1.09);       
    }
    @Override
    public String toString() 
    {
        return super.toString() + ", numeroCarteiraTrab = " + numeroCarteiraTrab;
    }
    
}
