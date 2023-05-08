package pessoafisica;
public class ServidorPublico extends PessoaFisica
{
    private String orgao;
    public ServidorPublico(String orgao, String cpf, String nome, String endereco, String sexo, String telefone, int idade, boolean impostoDeRenda, double salario) 
    {
        super(cpf, nome, endereco, sexo, telefone, idade, impostoDeRenda, salario);
        this.orgao = orgao;
    }
    public ServidorPublico() 
    {
        super();
        this.orgao = "sem órgão";
    }
    public String getOrgao() 
    {
        return orgao;
    }
    public void setOrgao(String orgao) 
    {
        this.orgao = orgao;
    }
    @Override
    public void aumentarSalario()
    {
        super.setSalario(super.getSalario()*1.04);
    }
    @Override
    public String toString() 
    {
        return super.toString() + ", orgao = " + orgao;
    }
    
}
