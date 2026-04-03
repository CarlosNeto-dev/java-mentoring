# 🌿 Orientação a Objetos: Herança (O Pilar da Reutilização)

Nesta aula, exploramos o poder da **Herança**. Ela permite que criemos uma hierarquia entre classes, onde uma **Subclasse** herda todos os comportamentos e características de uma **Superclasse**, permitindo o reaproveitamento de código e uma organização muito mais profissional.

---

### 🎯 1. Conceitos Fundamentais e Regras de Ouro

| Termo | Definição | Exemplo no Código |
| :--- | :--- | :--- |
| **Superclasse (Pai)** | A classe base que contém o que é comum. | `public class Pessoa { ... }` |
| **Subclasse (Filha)** | A classe que herda e adiciona especializações. | `public class Funcionario extends Pessoa` |
| **Extends** | Palavra-chave que estabelece o vínculo de herança. | `class Aluno extends Pessoa` |
| **Super()** | Método para acionar o construtor da classe pai. | `super(nome, idade);` |
| **Protected** | Modificador de acesso exclusivo para a "família". | `protected String nome;` |

---

### 🏛️ 2. A Superclasse: Pessoa (A Base de Tudo)

A superclasse define os atributos e métodos que todas as subclasses terão em comum. Usamos `protected` para que os filhos acessem os dados diretamente.

```java
// Classe superclasse
public class Pessoa {

    // Atributos protegidos para a subclasse acessar
    protected String nome;
    protected int idade;

    // Construtor vazio
    public Pessoa() {}

    // Construtor preenchido
    public Pessoa(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    // Getters e Setters
    public String getNome() { return nome; }
    public void setNome(String nome) { this.nome = nome; }
    public int getIdade() { return idade; }
    public void setIdade(int idade) { this.idade = idade; }
} 
```
 ### 👶 3. A Subclasse: Funcionario (A Especialização)

A subclasse usa extends para ganhar os poderes da classe pai e adiciona seus próprios atributos (como salario).
```java
// Classe derivada Funcionario que herda de Pessoa
public class Funcionario extends Pessoa {
    
    // Atributo privado, somente acessível dentro desta classe
    private double salario;

    // Construtor vazio
    public Funcionario() {}

    // Construtor preenchido
    public Funcionario(String nome, int idade, double salario) {
        // Chama o construtor da superclasse Pessoa
        // REGRA CRÍTICA: deve ser a PRIMEIRA linha do construtor
        super(nome, idade); 
        this.salario = salario;
    }

    // Getter e Setter para o salário
    public double getSalario() { return salario; }
    public void setSalario(double salario) { this.salario = salario; }

    // Método para calcular aumento de salário
    public void aumentarSalario(double percentual) {
        this.salario += this.salario * (percentual / 100);
    }
} 
```


### 🚀 4. A Classe Main 

Aqui vemos o Scanner em ação, demonstrando como instanciar objetos usando tanto o construtor vazio quanto o preenchido conforme o exemplo da professora:
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Importação e instância da biblioteca do teclado
        Scanner scanner = new Scanner(System.in);

        // 1. Instanciando um 1º objeto Funcionario para usar os métodos de acesso (Setters)
        Funcionario funcionario1 = new Funcionario();
        
        System.out.print("Digite o nome do funcionário: ");
        funcionario1.setNome(scanner.nextLine());
        
        System.out.print("Digite a idade do funcionário: ");
        funcionario1.setIdade(scanner.nextInt());
        
        System.out.print("Digite o salário inicial do funcionário: ");
        funcionario1.setSalario(scanner.nextDouble());

        // 2. Instanciando um 2º objeto Funcionario para usar o construtor preenchido
        Funcionario funcionario2 = new Funcionario("Joao", 30, 8000.0);

        // 3. Aplicando aumento de salário ao Funcionário 1
        funcionario1.aumentarSalario(30);

        // 4. Exibindo dados dos funcionários usando Getters
        System.out.println("\n--- Dados do Funcionário 1 ---");
        System.out.println("Nome: " + funcionario1.getNome());
        System.out.println("Salário Atualizado: R$ " + funcionario1.getSalario());

        System.out.println("\n--- Dados do Funcionário 2 ---");
        System.out.println("Nome: " + funcionario2.getNome());
        System.out.println("Salário: R$ " + funcionario2.getSalario());

        scanner.close();
    }
}
