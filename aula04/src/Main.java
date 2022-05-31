public class Main {
    public static void main(String[] args) {
        CartaoDebito cartaoDebito =  CartaoDebito.novoCartao(500.0);

        cartaoDebito.debitar(20.0);

        System.out.println(cartaoDebito.getValorDaConta());
        cartaoDebito.debitar(600d);
        System.out.println(cartaoDebito.getValorDaConta());

        Usuario usuario = new Usuario("José carlos", cartaoDebito);

        System.out.println(usuario.getNome());
    }
}