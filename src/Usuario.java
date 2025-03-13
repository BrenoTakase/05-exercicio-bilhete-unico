public class Usuario {

    //Variavel
    String nome;
    //Ele é long e não int por que o tamanho de um CPF é maior do que o int suporta
    long cpf;
    String perfil;

    //Construtor que pega os dados do Bilhete Unico e passa para o objeto
    public Usuario(String nome, long cpf, String perfil){
        this.nome = nome;
        this.cpf = cpf;
        this.perfil = perfil;
    }


}
