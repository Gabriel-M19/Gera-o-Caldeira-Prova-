package dados;

public class Usuario {
    String nome;
    int idade;

    public Usuario(String n, int i){
        nome = n;
        idade = i;
    }

    public static void main(String[] args) {
        Usuario pessoa = new Usuario("Joao", 25);
    }
}
