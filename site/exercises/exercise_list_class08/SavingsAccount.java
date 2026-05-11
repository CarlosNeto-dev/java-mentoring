/**
 * Representa uma conta poupança, uma especialização da conta bancária.
 * Esta classe herda de {@link Account} e não implementa interfaces.
 */
public class SavingsAccount extends Account {
    private double yieldRate;

    /**
     * Construtor para criar uma conta poupança com nome do titular e taxa de rendimento.
     * 
     * @param holderName O nome do titular da conta.
     * @param yieldRate A taxa de rendimento da conta poupança.
     * @throws Exception Se o nome do titular for vazio ou a taxa for negativa.
     */
    public SavingsAccount(String holderName, double yieldRate) throws Exception {
        super(holderName);
        if (holderName == null || holderName.isBlank()) {
            throw new Exception("The holder's name cannot be empty!");
        }
        if (yieldRate < 0) {
            throw new Exception("The yield rate cannot be negative!");
        }
        this.yieldRate = yieldRate;
    }

    /**
     * Obtém a taxa de rendimento da conta.
     * 
     * @return O valor da taxa de rendimento.
     */
    public double getYieldRate() {
        return yieldRate;
    }

    /**
     * Define a taxa de rendimento da conta.
     * 
     * @param yieldRate O novo valor da taxa de rendimento.
     * @throws Exception Se a taxa for negativa.
     */
    public void setYieldRate(double yieldRate) throws Exception {
        if (yieldRate < 0) {
            throw new Exception("The yield rate cannot be negative!");
        }
        this.yieldRate = yieldRate;
    }

    /**
     * Retorna o tipo específico de conta.
     * 
     * @return Uma string indicando que esta é uma conta poupança.
     */
    @Override
    public String showTypeOfAccount() {
        return "Savings Account";
    }

    /**
     * Retorna uma representação em texto da conta poupança.
     * 
     * @return Uma string formatada com as informações da conta.
     */
    @Override
    public String toString() {
        return String.format("Savings Account - Holder: %s, Balance: $ %.2f, Yield Rate: %.2f%%",
                getHolder(), getBalance(), yieldRate);
    }
}   
