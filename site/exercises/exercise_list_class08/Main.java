/**
 * Classe principal para testar o sistema bancário completo.
 * Demonstra operações com diferentes tipos de contas e modalidades de pagamento.
 */
public class Main {
    public static void main(String[] args) {
        try {
            CheckingAccount cc = new CheckingAccount("Alice", 1000.0);
            BusinessAccount ce = new BusinessAccount("Empresa Ltda", "Tech Corp", "12.345.678/0001-90");
            SavingsAccount cp = new SavingsAccount("Bob", 2.5);

            System.out.println("=== Testando Pagamentos com Juros ===");
            cc.processPayment(2000.0, "Pix");
            ce.processPayment(5000.0, "Cartão de Crédito");
            System.out.println("Conta Corrente: " + cc.getBalance());
            System.out.println("Conta Empresarial: " + ce.getBalance());

            System.out.println("\n=== Testando Transferência ===");
            cc.transfer(ce, 500.0);
            System.out.println("Após transferência:");
            System.out.println("Conta Corrente: " + cc.getBalance());
            System.out.println("Conta Empresarial: " + ce.getBalance());

            System.out.println("\n=== Testando Bloqueio de Conta ===");
            ce.setStatus(AccountStatus.BLOCKED);
            try {
                ce.deposit(1000.0);
            } catch (Exception e) {
                System.err.println("Erro esperado: " + e.getMessage());
            }

            System.out.println("\n=== Informações Finais ===");
            System.out.println(cc.toString());
            System.out.println(ce.toString());
            System.out.println(cp.toString());

        } catch (Exception e) {
            System.err.println("Erro inesperado: " + e.getMessage());
        }
    }
}   