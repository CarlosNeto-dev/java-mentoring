# 🛡️ Orientação a Objetos: Encapsulamento (Getters e Setters)

Nesta aula, vamos entender como proteger os dados dos nossos objetos. O **Encapsulamento** serve para garantir que os atributos de uma classe não sejam acessados ou modificados de forma indevida, usando "portas de entrada" controladas.

---

### 🎯 Modificadores de Acesso

| Modificador | O que é? | Onde usar? |
| :--- | :--- | :--- |
| **Private** | O mais restritivo. Somente a própria classe enxerga. | Atributos de segurança (ex: saldo, senha). |
| **Protected** | Visível para a própria classe e suas classes filhas. | **Apenas na Classe Pai** para facilitar a herança. |
| **Public** | Visível de qualquer lugar do projeto. | Métodos que todos precisam usar (ex: sacar, depositar). |

---

### ⚙️ O Papel do Get e Set

| Método | Função | Exemplo Prático |
| :--- | :--- | :--- |
| **Getter** | Permite **pegar/ler** o valor de um atributo privado. | `public double getSaldo()` |
| **Setter** | Permite **definir/alterar** o valor de um atributo. | `public void setSaldo(double s)` |

---

### 💻 Exemplo de Código: Proteção e Acesso

O segredo do encapsulamento é: **Atributos são `private` (ou `protected` no pai) e o acesso é feito por métodos `public`**.

```java
public class Produto {
    // 1. Atributos PRIVADOS (Invisíveis fora da classe, usar GET e SET para manipular)
    private String nome;
    private double preco;
    
    // Atributo PROTECTED (Visível apenas para esta classe e suas futuras filhas)
    protected String categoria;

    // 2. Construtor
    public Produto(String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
    }

    // 3. MÉTODOS GETTERS (Leitura)
    public String getNome() {
        return nome;
    }

    public double getPreco() {
        return preco;
    }

    // 4. MÉTODOS SETTERS (Escrita)
    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }
}