package principal;

import contabilidade.Contabilidade;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import pessoafisica.FuncionarioPrivado;
import pessoafisica.PessoaFisica;
import pessoafisica.ServidorPublico;

public class Principal 
{
    public static void main(String[] args) 
    {
         ArrayList <PessoaFisica> listaPessoaFisica;   
         listaPessoaFisica = new ArrayList();
         int opc1=0, opc2;
         String impRenda;
         
         while(opc1 != 10)
         {
             System.out.print("\n --- MENU --- ");
             System.out.print("\n 1- Inserir");
             System.out.print("\n 2- Mostrar");
             System.out.print("\n 3- Número de pessoas");
             System.out.print("\n 4- Somar todos salários");
             System.out.print("\n 10- Sair");
             opc1 = Integer.parseInt(JOptionPane.showInputDialog("[Opção escolhida]: "));
             switch(opc1)
             {
                 case 1:
                     System.out.print("\n\t --- SUBMENU --- ");
                     System.out.print("\n\t 1- Público");
                     System.out.print("\n\t 2- Privado");
                     opc2 = Integer.parseInt(JOptionPane.showInputDialog("[Opção escolhida]: "));
                     if(opc2 == 1)
                     {
                         ServidorPublico servPub = new ServidorPublico();
                         servPub.setCpf(JOptionPane.showInputDialog("CPF "));
                         servPub.setNome(JOptionPane.showInputDialog("Nome "));
                         if(validarNome(servPub.getNome()))
                         {
                             System.out.print("\n Nome válido...");
                         }else{
                             System.out.print("\n Nome inválido...");
                         }
                         servPub.setEndereco(JOptionPane.showInputDialog("Endereço "));
                         servPub.setSexo(JOptionPane.showInputDialog("Sexo "));
                         if(validarSexo(servPub.getSexo()))
                         {
                             System.out.print("\n Sexo válido...");
                         }else{
                             System.out.print("\n Sexo inválido...");
                         }
                         servPub.setTelefone(JOptionPane.showInputDialog("Telefone "));
                         servPub.setIdade(Integer.parseInt(JOptionPane.showInputDialog("Idade ")));
                         impRenda = JOptionPane.showInputDialog("Declara imposto de renda (sim / não) ");
                         if(impRenda.equalsIgnoreCase("sim"))                         
                         {
                             servPub.setImpostoDeRenda(true);
                         }else{
                             servPub.setImpostoDeRenda(false);
                         }
                         servPub.setSalario(Float.parseFloat(JOptionPane.showInputDialog("Salário ")));
                         servPub.setOrgao(JOptionPane.showInputDialog("Órgão "));
                         listaPessoaFisica.add(servPub);
                     }
                     if(opc2 == 2)
                     {
                         FuncionarioPrivado funcPriv = new FuncionarioPrivado();
                         funcPriv.setCpf(JOptionPane.showInputDialog("CPF "));
                         funcPriv.setNome(JOptionPane.showInputDialog("Nome "));
                         if(validarNome(funcPriv.getNome()))
                         {
                             System.out.print("\n Nome válido...");
                         }else{
                             System.out.print("\n Nome inválido...");
                         }
                         funcPriv.setEndereco(JOptionPane.showInputDialog("Endereço "));
                         funcPriv.setSexo(JOptionPane.showInputDialog("Sexo "));
                         if(validarSexo(funcPriv.getSexo()))
                         {
                             System.out.print("\n Sexo válido...");
                         }else{
                             System.out.print("\n Sexo inválido...");
                         }
                         funcPriv.setTelefone(JOptionPane.showInputDialog("Telefone "));
                         funcPriv.setIdade(Integer.parseInt(JOptionPane.showInputDialog("Idade ")));
                         impRenda = JOptionPane.showInputDialog("Declara imposto de renda (sim / não) ");
                         if(impRenda.equalsIgnoreCase("sim"))                         
                         {
                             funcPriv.setImpostoDeRenda(true);
                         }else{
                             funcPriv.setImpostoDeRenda(false);
                         }
                         funcPriv.setSalario(Float.parseFloat(JOptionPane.showInputDialog("Salário ")));
                         funcPriv.setNumeroCarteiraTrab(JOptionPane.showInputDialog("Número da carteira de trabalho "));   
                         listaPessoaFisica.add(funcPriv);
                     }
                 break;
                 case 2:
                     listaPessoaFisica.forEach(pesfis -> {
                         System.out.print("\n -> "+pesfis);
                     });
                 break;
                 case 3:
                     System.out.print("\n "+PessoaFisica.getQtde());
                 break;
                 case 4:
                     System.out.print("\n "+Contabilidade.somarTodosSalarios(listaPessoaFisica));
                 break;
             }
         }
    }
    public static boolean validarNome(String nome)
    {
        int qtdeEspbr = 0;
        boolean vNome = false;
        for(int i=0; i<nome.length();i++)
        {
            char caracter = nome.charAt(i);
            if(caracter == ' ')
            {
                qtdeEspbr++;
            }
        }
        if(qtdeEspbr > 0)
        {
            vNome = true;
        }
        return(vNome);
    }
    public static boolean validarSexo(String nome)
    {
        boolean vSexo = false;
        if (nome.length() == 1)
        {
            if((nome.charAt(0) == 'M')||(nome.charAt(0) == 'F'))
            {
                vSexo = true;
            }
        }
        return(vSexo);
    }
}
