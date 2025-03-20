//Colocando static, você traz com o metodo com todas as funções da classe JOption;
//Fazendo assim, não vai precisar mais repetir o nome inteiro, tendo que ser JOption.Show...
//O normal seria import java.swing.*;
import java.text.DecimalFormat;

import static javax.swing.JOptionPane.*;
//O import Parse... traduz o valor de uma variavel para outra, como Int para Double ou String para Int, etc.
import static java.lang.Integer.parseInt;
import static java.lang.Long.parseLong;
import static java.lang.Double.parseDouble;

public class Util {
    //banco de dados
    private BilheteUnico[] bilhete = new BilheteUnico[5];
    private int index = 0;

    public  void menuPrincipal() {
        int opcao=0;
        String menu = "1. Administrador\n2. Usuário\n3.Finalizar";

        do {
            //O showInputDialog cria a janela onde a pessoa pode escrever a mensagem
            //Está substituindo o Scanner
            opcao = parseInt(showInputDialog(menu));


            switch (opcao){
                case 1:
                    menuAdministrador();
                break;

            }

        }while (opcao != 3);

    }

    private void menuAdministrador() {
        int opcao=0;
        String mensagem = " MENU ADMINISTRADOR\n 1. Emitir Bilhete\n";
        mensagem +="2.Lista Bilhetes\n 3.Excluir Bilhete\n 4. Sair";

        do {
            opcao = parseInt(showInputDialog(mensagem));

            switch (opcao){
                case 1:
                    emitirBilhete();
                break;
                case 2:
                    listaBilhete();
                break;

            }

        }while(opcao != 4);

    }

    private void emitirBilhete(){
        String nome, perfil;
        long cpf;
        if (index < bilhete.length){
            nome = showInputDialog("Nome do usuário: ");
            cpf = parseLong(showInputDialog("CPF: "));
            perfil = showInputDialog("Estudante ou Professor ou Comum: ");
            bilhete[index] = new BilheteUnico(nome, cpf, perfil);
            index++;
        }
        else {
            showMessageDialog(null, "Procure um posto de atendimento");
        }
    }

    private void listaBilhete(){
        DecimalFormat df = new DecimalFormat("0.00");
        String aux = "";
        for (int i=0; i< index; i++){
            aux += "Usuário: "+ bilhete[i].usuario.nome + "\n";
            aux += "CPF: "+ bilhete[i].usuario.cpf + "\n";
            aux += "Número do bilhete: "+ bilhete[i].numero + "\n";
            aux += "Saldo do bilhete: R$"+ df.format(bilhete[i].saldo)+ "\n" + "\n";
        }
        showMessageDialog(null, aux);
    }

}
