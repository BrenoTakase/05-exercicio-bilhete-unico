import java.util.Random;

public class BilheteUnico {

    //Variavel
    //final faz a variavel ser constante
    static final double TARIFA = 5.20;
    long numero;
    double saldo;
    //Chamar a variavel usuario vai referenciar o endereço de memória da mesma
    Usuario usuario;

    //Chama o construtor para colocar os dados do usuário dentro do cartão
    public BilheteUnico(String nome, long cpf, String perfil){
        //Cria um metodo para conseguir colocar um número aleatório
        Random random = new Random();
        numero = random.nextLong(1000, 10000);
        //Cria o metodo Usuário, que antes disso ainda não tinha sido chamado
        usuario = new Usuario(nome, cpf, perfil);
    }

    //método para carregar o bilhete
    public double CarregarBilhete(double valor){
    this.saldo += valor;
    return saldo;
    }

    //método para consultar o saldo do bilhete
    public double ConsultaSaldo(){
        return saldo;
    }

    //método para passar na catraca
    public String PassarCatraca(){
        double debito = (TARIFA/2);
        if(usuario.perfil.equalsIgnoreCase("comum")){
            debito=TARIFA;
        }
        if (saldo >= debito){
            saldo -= debito;
            return "Catraca liberada";
        }
        return "Catraca bloqueada, saldo insuficiente";
    }

}
