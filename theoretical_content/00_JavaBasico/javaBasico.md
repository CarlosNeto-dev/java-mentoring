# ☕ Java Core: Sintaxe, Scanner e Estruturas de Repetição

Nesta aula, vamos revisar os fundamentos da linguagem Java. Antes de avançarmos para a Orientação a Objetos, é essencial entender como a máquina processa dados, interage com o usuário e controla o fluxo de execução através de laços de repetição.

---

### 🎯 Conceitos Fundamentais

| Termo | O que é? | Exemplo |
| :--- | :--- | :--- |
| **Scanner** | Classe usada para ler dados do teclado. | `Scanner sc = new Scanner(System.in);` |
| **Loops (While)** | Repete **enquanto** a condição for verdadeira. | `while (saldo > 0) { ... }` |
| **Do-While** | Executa o código **antes** de testar a condição. | `do { ... } while (opcao != 0);` |
| **Loops (For)** | Repetição usada quando sabemos o limite. | `for (int i=0; i<10; i++)` |
| **Condicionais** | Tomada de decisão no código (If/Else). | `if (nota >= 7) { ... }` |

---

### 💻 Exemplo de Código: Interação e Repetição

Este exemplo prático utiliza o `Scanner` para receber dados e demonstra a diferença entre os loops de forma interativa:

```java
import java.util.Scanner;

public class BasicoJava {
    public static void main(String[] args) {
        // 1. Instanciando o Scanner para leitura de dados
        Scanner leitor = new Scanner(System.in);
        int opcao;

        // 2. Estrutura Do-While (Garante que o menu apareça ao menos uma vez)
        do {
            System.out.println("\n--- MENU DE MONITORIA ---");
            System.out.println("1. Testar Loop WHILE (Enquanto)");
            System.out.println("2. Testar Loop FOR (Contagem)");
            System.out.println("3. Sair");
            System.out.print("Escolha uma opção: ");
            
            opcao = leitor.nextInt(); 

            if (opcao == 1) {
                System.out.println("Digite números para somar (ou 0 para parar):");
                int numero = -1;
                int soma = 0;
                
                // Loop WHILE: Testamos a condição NO INÍCIO
                while (numero != 0) {
                    numero = leitor.nextInt();
                    soma += numero;
                }
                System.out.println("Soma total: " + soma);
            } 
            else if (opcao == 2) {
                System.out.println("Contagem Progressiva:");
                // Loop FOR: Início, Fim e Incremento bem definidos
                for (int i = 1; i <= 5; i++) {
                    System.out.println("Passo: " + i);
                }
            }

        } while (opcao != 3); // Repete enquanto a opção for diferente de 3 (Sair)

        System.out.println("Programa encerrado. Bons estudos, Brunet!");
        
        leitor.close();
    }
}