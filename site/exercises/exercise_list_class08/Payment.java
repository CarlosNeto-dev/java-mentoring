/**
Representa a interface de Pagamento do sistema bancário.
Essa interface poderá ser implementada em qualquer classe.
*/

public interface Payment {
/**
 * Esta função servirá para processar o pagamento e definir a modalidade.
 * @param value O valor a ser recebido.
 * @param modality A modalidade a ser recebido, ex: pix, credit card etc.
 * @throws Exception Se a modalidade for vazia ou o valor menor que zero ou se o limite das modalidades forem superadas.
 */
default void validateLimits(double value, String modality) throws Exception {
    if (modality == null || modality.isBlank()) {
        throw new Exception("You need to specify the modality!");}

        if (value < 0) {
            throw new Exception("Negative values isn't allowed!");
        }

        // Para Pix

        if (modality.equalsIgnoreCase("pix") && value > 5000) {
            throw new Exception("The max value of modality pix is R$ 5000,00!");
        }

        // Para Cartão de Crédito

        if (modality.equalsIgnoreCase("credit card") && value > 20000) {
            throw new Exception("The max value of modality credit card is R$ 20000,00!");
        }
    }


    void processPayment(double value, String modality) throws Exception;
}
