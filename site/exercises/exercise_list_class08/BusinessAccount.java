/**
 * Representa uma conta empresarial, uma especialização da conta bancária.
 * Esta classe herda de {@link Account} e implementa a interface {@link Payment}
 * para permitir processamento de pagamentos com limites específicos.
 */
public class BusinessAccount extends Account implements Payment {
    private String cnpj;
    private double creditLimit;
    private String companyName;

    /**
     * Construtor para criar uma conta empresarial com nome do titular, nome da empresa e CNPJ.
     * 
     * @param holderName O nome do titular da conta.
     * @param companyName O nome da empresa.
     * @param cnpj O CNPJ da empresa.
     * @throws Exception Se o nome do titular, nome da empresa ou CNPJ forem vazios.
     */
    public BusinessAccount(String holderName, String companyName, String cnpj) throws Exception {
        super(holderName);
        if (holderName == null || holderName.isBlank()) {
            throw new Exception("The holder's name cannot be empty!");
        }

        if (companyName == null || companyName.isBlank()) {
            throw new Exception("The company name cannot be empty!");
        }

        if (cnpj == null || cnpj.isBlank()) {
            throw new Exception("The CNPJ cannot be empty!");
        }

        this.companyName = companyName;
        this.cnpj = cnpj;
    }

    /**
     * Obtém o CNPJ da empresa.
     * 
     * @return O CNPJ da empresa.
     */
    public String getCnpj() {
        return cnpj;
    }

    /**
     * Define o CNPJ da empresa.
     * 
     * @param cnpj O novo CNPJ da empresa.
     * @throws Exception Se o CNPJ for vazio.
     */
    public void setCnpj(String cnpj) throws Exception {
        if (cnpj == null || cnpj.isBlank()) {
            throw new Exception("The CNPJ cannot be empty!");
        }

        this.cnpj = cnpj;
    }

    /**
     * Obtém o limite de crédito da conta.
     * 
     * @return O valor do limite de crédito.
     */
    public double getCreditLimit() {
        return creditLimit;
    }

    /**
     * Define o limite de crédito da conta.
     * 
     * @param creditLimit O novo valor do limite de crédito.
     * @throws Exception Se o limite for negativo.
     */
    public void setCreditLimit(double creditLimit) throws Exception {
        if (creditLimit < 0) {
            throw new Exception("The credit limit cannot be negative!");
        }

        this.creditLimit = creditLimit;
    }

    /**
     * Obtém o nome da empresa titular da conta.
     * 
     * @return O nome da empresa.
     */
    public String getCompanyName() {
        return companyName;
    }

    /**
     * Define o nome da empresa titular da conta.
     * 
     * @param companyName O novo nome da empresa.
     * @throws Exception Se o nome da empresa for vazio.
     */
    public void setCompanyName(String companyName) throws Exception {
        if (companyName == null || companyName.isBlank()) {
            throw new Exception("The company name cannot be empty!");
        }

        this.companyName = companyName;
    }

    /**
     * Processa um pagamento para esta conta empresarial.
     * Valida os limites antes de realizar o depósito.
     * 
     * @param value O valor a ser recebido.
     * @param modality A modalidade do pagamento (ex: pix, credit card).
     * @throws Exception Se a validação dos limites falhar.
     */
    @Override
    public void processPayment(double value, String modality) throws Exception {
        validateLimits(value, modality);
        double valueWithInterest = value * 1.02;
        deposit(valueWithInterest);
    }

    /**
     * Retorna o tipo específico de conta.
     * 
     * @return Uma string indicando que esta é uma conta empresarial.
     */
    @Override
    public String showTypeOfAccount() {
        return "Business Account";
    }

    /**
     * Retorna uma representação em texto da conta empresarial.
     * 
     * @return Uma string formatada com as informações da conta.
     */
    @Override
    public String toString() {
        return String.format("Business Account - Company: %s, CNPJ: %s, Holder: %s, Balance: $ %.2f",
                companyName, cnpj, getHolder(), getBalance());
    }
}
