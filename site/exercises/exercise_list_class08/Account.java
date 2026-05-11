/**
 * Representa uma conta bancária abstrata com operações comuns.
 */
public abstract class Account {
    protected String holder;
    protected double balance = 0.0;
    protected AccountStatus status = AccountStatus.ACTIVE;

    /**
     * Construtor padrão da conta.
     */
    public Account() {}

    /**
     * Construtor da conta com nome do titular.
     *
     * @param holderName O nome do titular da conta.
     * @throws Exception Se o nome do titular for vazio ou nulo.
     */
    public Account(String holderName) throws Exception {
        try {
            if (holderName == null || holderName.isBlank()) {
                throw new Exception("The holder's name can't be empty!");
            } else {
                this.holder = holderName;
            }
        } catch(Exception error) {
            System.err.println("❌ Error: " + error.getMessage());
            throw error;
        }
    }

    /**
     * Define o nome do titular da conta.
     *
     * @param holderName O nome do titular.
     * @throws Exception Se o nome do titular for vazio ou nulo.
     */
    public void setHolder(String holderName) throws Exception {
        try {
            if (holderName == null || holderName.isBlank()) {
                throw new Exception("The holder's name can't be empty!");
            } else {
                this.holder = holderName;
            }
        } catch(Exception error) {
            System.err.println("❌ Error " + error.getMessage());
            throw error;
        }
    }

    /**
     * Define o saldo da conta.
     *
     * @param balanceValue O valor do saldo.
     * @throws Exception Se o valor for negativo.
     */
    public void setBalance(double balanceValue) throws Exception {
        try {
            if (balanceValue < 0) {
                throw new Exception("The value can't be negative!");
            } else {
                this.balance = balanceValue;
            }
        } catch(Exception error) {
            System.err.println("❌ Error: " + error.getMessage());
            throw error;
        }
    }

    /**
     * Obtém o nome do titular da conta.
     *
     * @return O nome do titular.
     */
    public String getHolder() {
        return this.holder;
    }

    /**
     * Obtém o saldo atual da conta.
     *
     * @return O valor do saldo.
     */
    public double getBalance() {
        return this.balance;
    }

    /**
     * Realiza um depósito na conta.
     *
     * @param value O valor a ser depositado.
     * @throws Exception Se o valor for negativo ou a conta não estiver ativa.
     */
    public void deposit(double value) throws Exception {
        try {
            if (status != AccountStatus.ACTIVE) {
                throw new Exception("❌ Cannot deposit: account is not active!");
            }
            if (value < 0) {
                throw new Exception("Can't deposit negative values!");
            } else {
                this.balance += value;
            }
        } catch(Exception error) {
            System.err.println("❌ Error: " + error.getMessage());
            throw error;
        }
    }

    /**
     * Realiza um saque na conta.
     *
     * @param value O valor a ser sacado.
     * @return true se o saque for bem-sucedido, false caso contrário.
     * @throws Exception Se o valor for maior que o saldo, negativo ou a conta não estiver ativa.
     */
    public boolean withdrawValue(double value) throws Exception {
        try {
            if (status != AccountStatus.ACTIVE) {
                throw new Exception("❌ Cannot withdraw: account is not active!");
            }
            if (value < 0) {
                throw new Exception("❌ Can't withdraw negative values!");
            }
            if (value > this.balance) {
                throw new Exception("This value is bigger than you have on your balance!");
            } else {
                this.balance -= value;
                return true;
            }
        } catch(Exception error) {
            System.err.println("❌ Error: " + error.getMessage());
            throw error;
        }
    }

    /**
     * Realiza uma transferência para outra conta.
     *
     * @param destine A conta de destino.
     * @param value O valor a ser transferido.
     * @throws Exception Se a conta de destino for inválida, o valor for negativo, ou houver erro no saque.
     */
    public void transfer(Account destine, double value) throws Exception {
        try {
            if (status != AccountStatus.ACTIVE) {
                throw new Exception("❌ Cannot transfer: account is not active!");
            }
            if (destine == null || destine.getHolder() == null || destine.getHolder().isBlank()) {
                throw new Exception("Cannot locate empty destine!");
            }
            if (destine.status != AccountStatus.ACTIVE) {
                throw new Exception("❌ Cannot transfer to a non-active account!");
            }
            if (value < 0) {
                throw new Exception("Can't transfer negative values!");
            }
            if (this.withdrawValue(value)) {
                destine.deposit(value);
            } else {
                throw new Exception("An error founded on withdraw! Please, put a correct value.");
            }
        } catch(Exception error) {
            System.err.println("❌ Error: " + error.getMessage());
            throw error;
        }
    }

    /**
     * Retorna o tipo específico da conta.
     *
     * @return Uma string representando o tipo da conta.
     */
    public abstract String showTypeOfAccount();

    /**
     * Retorna uma representação em texto da conta.
     *
     * @return Uma string formatada com as informações da conta.
     */
    public abstract String toString();

    /**
     * Obtém o status atual da conta.
     *
     * @return O status da conta (ACTIVE, BLOCKED, FINISHED).
     */
    public AccountStatus getStatus() {
        return status;
    }

    /**
     * Define o status da conta.
     *
     * @param status O novo status da conta.
     */
    public void setStatus(AccountStatus status) {
        this.status = status;
    }
}
