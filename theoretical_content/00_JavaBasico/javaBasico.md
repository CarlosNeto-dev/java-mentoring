# ☕ Java Core: Condicionais, Scanner e Estruturas de Repetição

Nesta aula, vamos revisar os fundamentos da linguagem Java. Antes de avançarmos para a Orientação a Objetos, é essencial entender como a máquina processa dados, interage com o usuário e controla o fluxo de execução através de laços de repetição.

---

### 🎯 Conceitos Fundamentais

| Termo | O que é? | Exemplo |
| :--- | :--- | :--- |
| **Scanner** | Classe usada para ler dados do teclado. | `Scanner sc = new Scanner(System.in);` |
| **Loops (For)** | Repetição usada quando **sabemos o limite**. | `for (int i=0; i<10; i++)` |
| **Loops (While)** | Repete **enquanto** a condição for verdadeira. | `while (saldo > 0) { ... }` |
| **Do-While** | Executa o código **antes** de testar a condição. | `do { ... } while (opcao != 0);` |
| **Condicionais** | Tomada de decisão no código (If/Else). | `if (nota >= 7) { ... }` |

---

### ⚠️ Importante: Biblioteca Scanner
Para usar o `Scanner`, você **SEMPRE** deve importar a biblioteca no topo do seu arquivo `.java.util`, antes mesmo da declaração da classe:

Exemplo:
```java
import java.util.Scanner; // Sem isso, o Java não reconhece o Scanner!