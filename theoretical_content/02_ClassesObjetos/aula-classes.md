# ☕ Orientação a Objetos: Classes

Nesta aula, vamos entender o conceito de **Classes**, que são os moldes para a criação de objetos no Java. Imagine que a Classe é a planta de uma casa, e o Objeto é a casa construída.

---

### 🎯 Conceitos Fundamentais

| Termo | O que é? | Exemplo (Carro) |
| :--- | :--- | :--- |
| **Classe** | O molde/modelo do objeto. | `public class Carro { ... }` |
| **Atributos** | As características (variáveis). | `String cor`, `String modelo` |
| **Métodos** | As ações (funções). | `acelerar()`, `frear()` |
| **Instância** | O ato de criar um objeto real. | `new Carro()` |

---

### 💻 Exemplo de Código

Aqui está a estrutura básica de uma classe que define um **Aluno** (útil para nossos exemplos de monitoria):

```java
public class Aluno {
    // 1. Atributos (O que o aluno TEM)
    String nome;
    String matricula;
    double nota;

    // 2. Construtor (Como o aluno é CRIADO)
    public Aluno(String nome, String matricula, double nota) {
        this.nome = nome;
        this.matricula = matricula;
        this.nota = nota;
    }

    // 3. Método (O que o aluno FAZ)
    void exibirDados() {
        System.out.println("Nome: " + nome + " | Nota: " + nota);
    }
}