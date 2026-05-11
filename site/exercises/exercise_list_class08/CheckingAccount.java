/**
 * Representa uma conta corrente, uma especialização da conta bancária.
 * Esta classe herda de {@link Account} e implementa a interface {@link Payment}
 * para permitir operações com cheque especial e processamento de pagamentos.
 */
public class CheckingAccount extends Account implements Payment {
    private double specialCheckLimit;

    /**
     * Construtor para criar uma conta corrente com nome do titular e limite de cheque especial.
     * 
     * @param holderName O nome do titular da conta.
     * @param specialCheckLimit O valor do limite de cheque especial.
     * @throws Exception Se o nome do titular for vazio ou o limite for negativo.
     */
    public CheckingAccount(String holderName, double specialCheckLimit) throws Exception {
        super(holderName);
        if (holderName == null || holderName.isBlank()) {
            throw new Exception("The holder's name cannot be empty!");
        }
        if (specialCheckLimit < 0) {
            throw new Exception("The special check limit cannot be negative!");
        }
        this.specialCheckLimit = specialCheckLimit;
    }

    /**
     * Obtém o limite do cheque especial da conta.
     * 
     * @return O valor do limite do cheque especial.
     */
    public double getSpecialCheckLimit() {
        return specialCheckLimit;
    }

    /**
     * Define o limite do cheque especial da conta.
     * 
     * @param specialCheckLimit O novo valor do limite de cheque especial.
     * @throws Exception Se o limite for negativo.
     */
    public void setSpecialCheckLimit(double specialCheckLimit) throws Exception {
        if (specialCheckLimit < 0) {
            throw new Exception("The special check limit cannot be negative!");
        }
        this.specialCheckLimit = specialCheckLimit;
    }

    /**
     * Realiza um saque na conta, considerando o saldo e o limite do cheque especial.
     * 
     * @param value O valor a ser sacado.
     * @return true se o saque for bem-sucedido, false caso contrário.
     * @throws Exception Se o valor for negativo.
     */
    @Override
    public boolean withdrawValue(double value) throws Exception {
        if (value < 0) {
            throw new Exception("Can't withdraw negative values!");
        }
        double maxWithdrawal = this.getBalance() + this.specialCheckLimit;
        if (value > maxWithdrawal) {
            System.err.println("❌ Error: This value is bigger than your balance and special check limit!");
            return false;
        }
        this.setBalance(this.getBalance() - value);
        return true;
    }

/**
 * Processa um pagamento para esta conta corrente.
 * Valida os limites e aplica juros sobre o valor antes do depósito.
 * 
 * @param value O valor a ser recebido.
 * @param modality A modalidade do pagamento (ex: pix, credit card).
 * @throws Exception Se a validação dos limites falhar.
 */
    @Override
    public void processPayment(double value, String modality) throws Exception {
        validateLimits(value, modality);
        double valueWithInterest = value * 1.015;
        deposit(valueWithInterest);
    }

    /**
     * Retorna o tipo específico de conta.
     * 
     * @return Uma string indicando que esta é uma conta corrente.
     */
    @Override
    public String showTypeOfAccount() {
        return "Checking Account";
    }

    /**
     * Retorna uma representação em texto da conta corrente.
     * 
     * @return Uma string formatada com as informações da conta.
     */
    @Override
    public String toString() {
        return String.format("Checking Account - Holder: %s, Balance: $ %.2f, Special Check Limit: $ %.2f",
                getHolder(), getBalance(), specialCheckLimit);
    }
}   
