# 🏗️ Orientação a Objetos: Construtores

Nesta aula, vamos entender como os objetos são "fabricados". O **Construtor** é um método especial que é executado automaticamente no momento em que usamos a palavra-chave `new`. Ele serve para garantir que o objeto comece com os dados necessários.

---

### 🎯 Conceitos Fundamentais

| Termo | O que é? | Regra de Ouro |
| :--- | :--- | :--- |
| **Construtor** | O método que inicializa o objeto. | Deve ter o **mesmo nome** da Classe. |
| **Instanciação** | O ato de criar o objeto com `new`. | Chama o construtor na memória. |
| **Parâmetros** | Dados enviados na hora da criação. | Preenchem os atributos iniciais. |
| **This** | Referência ao próprio objeto. | Diferencia `atributo` de `parâmetro`. |

---

### ⚙️ Regras do Construtor

1. **Nome:** O nome do construtor precisa ser EXATAMENTE igual ao nome da classe.
2. **Sem Retorno:** Construtores **não possuem** tipo de retorno (nem mesmo `void`).
3. **Execução:** Ele só roda uma vez: no momento do `new`.

---

### 💻 Exemplo : A Classe e Main (O Molde)

Veja como definimos o construtor para obrigar que todo `Celular` nasça com uma marca e um modelo:

```java
// CLASSE CELULAR 
public class Celular {
    String marca;
    String modelo;

    // CONSTRUTOR: Repare que o nome é igual ao da Classe e não tem 'void'
    public Celular(String marca, String modelo) {
        this.marca = marca;   // Atributo da classe recebe o parâmetro
        this.modelo = modelo; 
        System.out.println("Objeto Celular criado com sucesso!");
    }

    void exibirInfo() {
        System.out.println("Celular: " + marca + " | Modelo: " + modelo);
    }
}



// --------- EXEMPLO DE CODIGO NA MAIN --------- :
public class Main {
    public static void main(String[] args) {
        // 1. Criando o objeto e passando os dados diretamente para o CONSTRUTOR
        Celular meuCelular = new Celular("Apple", "iPhone 15");

        // 2. Chamando um método para testar se os dados foram salvos
        meuCelular.exibirInfo();
    }
}

