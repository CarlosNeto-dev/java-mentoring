# ⚙️ Orientação a Objetos: Métodos e Parâmetros

Nesta aula, vamos entender como dar "vida" aos nossos objetos. Se a **Classe** é o molde e os **Atributos** são as características, os **Métodos** são as ações e comportamentos que o objeto pode realizar.

---

### 🎯 Conceitos Fundamentais

| Termo | O que é? | Exemplo (Calculadora) |
| :--- | :--- | :--- |
| **Método** | Uma ação ou função do objeto. | `public void somar() { ... }` |
| **Parâmetros** | Dados que o método recebe para trabalhar. | `int n1, int n2` |
| **Retorno** | O valor que o método devolve após o cálculo. | `return resultado;` |
| **Void** | Indica que o método não devolve nenhum valor. | `public void exibir() { ... }` |

---

### 💻 Exemplo de Código

Aqui está a estrutura de uma **Calculadora**, focada em como os dados entram e saem dos métodos (ideal para exercícios de lógica):

```java
public class Calculadora {

    // 1. Método Simples (Sem retorno e sem parâmetros)
    public void ligar() {
        System.out.println("Calculadora ligada e pronta para o uso!");
    }

    // 2. Método com Parâmetros (Recebe dados para processar)
    public void exibirSoma(int numA, int numB) {
        int soma = numA + numB;
        System.out.println("O resultado da soma direta é: " + soma);
    }

    // 3. Método com Retorno (Devolve um valor para quem chamou)
    public double calcularMedia(double nota1, double nota2) {
        double media = (nota1 + nota2) / 2;
        return media; // Retorna o resultado para ser usado em outra parte do código
    }
}