public class AplicacaoCliente {
    public static void main(String[] args) {
        ClienteDoBanco cliente = new ClienteDoBanco("Fernando Lopes Da Silva ");
        ContaBancaria conta = new ContaBancaria("19875-9");

        Fachada facade = new Fachada();
        facade.fazerDeposito(600, cliente, conta);
    }
}
