package contabilidade;

import java.util.ArrayList;
import pessoafisica.PessoaFisica;

public class Contabilidade 
{
    public static double somarTodosSalarios(ArrayList <PessoaFisica> listaPessoaFisica)
    {
        double somatorioSalarios = 0;
        for(PessoaFisica pf : listaPessoaFisica)
        {
            somatorioSalarios= somatorioSalarios+ pf.getSalario();
        }
        return(somatorioSalarios);
    }
}
