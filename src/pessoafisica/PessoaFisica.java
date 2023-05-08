package pessoafisica;
public abstract class PessoaFisica 
{
    private String cpf;
    private String nome;
    private String endereco;
    private String sexo;
    private String telefone;
    private int idade;
    private boolean impostoDeRenda;
    private double salario;
    private static int qtde;
    
    public PessoaFisica(String cpf, String nome, String endereco, String sexo, String telefone, int idade, boolean impostoDeRenda, double salario) 
    {
        this.cpf = cpf;
        this.nome = nome;
        this.endereco = endereco;
        this.sexo = sexo;
        this.telefone = telefone;
        this.idade = idade;
        this.impostoDeRenda = impostoDeRenda;
        this.salario = salario;
        PessoaFisica.qtde++;
    }
    public PessoaFisica() 
    {
        this.cpf = "sem CPF";
        this.nome = "sem nome";
        this.endereco = "sem endereço";
        this.sexo = "sem sexo";
        this.telefone = "sem telefone";
        this.idade = 0;
        this.impostoDeRenda = false;
        this.salario = 0;
        PessoaFisica.qtde++;
    }
    public static int getQtde() 
    {
        return qtde;
    }    
    public String getCpf() 
    {
        return cpf;
    }
    public void setCpf(String cpf) 
    {
        this.cpf = cpf;
    }
    public String getNome() 
    {
        return nome;
    }
    public void setNome(String nome) 
    {
        this.nome = nome;
    }
    public String getEndereco() 
    {
        return endereco;
    }
    public void setEndereco(String endereco) 
    {
        this.endereco = endereco;
    }
    public String getSexo() 
    {
        return sexo;
    }
    public void setSexo(String sexo) 
    {
        this.sexo = sexo;
    }
    public String getTelefone() 
    {
        return telefone;
    }
    public void setTelefone(String telefone) 
    {
        this.telefone = telefone;
    }
    public int getIdade() 
    {
        return idade;
    }
    public void setIdade(int idade) 
    {
        this.idade = idade;
    }
    public boolean isImpostoDeRenda() 
    {
        return impostoDeRenda;
    }
    public void setImpostoDeRenda(boolean impostoDeRenda) 
    {
        this.impostoDeRenda = impostoDeRenda;
    }
    public double getSalario() 
    {
        return salario;
    }
    public void setSalario(double salario) 
    {
        this.salario = salario;
    }
    public abstract void aumentarSalario();
    @Override
    public String toString() 
    {
        return "Cpf = " + cpf + ", Nome = " + nome + ", Endereco = " + endereco + ", Sexo = " + sexo + ", Telefone = " + telefone + ", idade = " + idade + ", ImpostoDeRenda = " + impostoDeRenda + ", Salario = " + salario;
    }
}
