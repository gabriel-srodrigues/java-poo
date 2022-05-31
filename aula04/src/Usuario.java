public class Usuario {
    private String nome;
    private CartaoCredito cartaoCredito;
    private CartaoDebito cartaoDebito;


    public Usuario(String nome, CartaoCredito cartaoCredito, CartaoDebito cartaoDebito) {
        this.nome = nome;
        this.cartaoCredito = cartaoCredito;
        this.cartaoDebito = cartaoDebito;
    }

    public Usuario(String nome, CartaoDebito cartaoDebito) {
        this.nome = "[TESTE]" + nome;
        this.cartaoDebito = cartaoDebito;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public CartaoCredito getCartaoCredito() {
        return cartaoCredito;
    }

    public void setCartaoCredito(CartaoCredito cartaoCredito) {
        this.cartaoCredito = cartaoCredito;
    }

    public CartaoDebito getCartaoDebito() {
        return cartaoDebito;
    }

    public void setCartaoDebito(CartaoDebito cartaoDebito) {
        this.cartaoDebito = cartaoDebito;
    }
}
