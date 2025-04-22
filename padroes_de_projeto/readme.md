# Padrões de Projeto

Este repositório contém exemplos de padrões de projeto (Design Patterns) e seus respectivos anti-patterns. Abaixo, você encontrará um resumo de cada padrão, as diferenças entre o padrão e o anti-pattern correspondente, e diagramas UML para facilitar o entendimento.

---

## 1. Singleton

### Resumo
O padrão Singleton garante que uma classe tenha apenas uma instância e fornece um ponto global de acesso a ela. É útil para gerenciar recursos compartilhados, como conexões de banco de dados ou configurações globais.

### Diferenças entre Singleton e Anti-pattern
- **Singleton**: Controla o número de instâncias, garantindo que apenas uma seja criada.
- **Anti-pattern**: Não controla a criação de instâncias, o que pode levar a inconsistências e problemas de concorrência.

### UML
#### Singleton
![Singleton UML](./uml/singleton_pattern.png)

#### Anti-pattern
![Singleton Anti-pattern UML](./uml/singleton_anti_pattern.png)

---

## 2. Factory Method

### Resumo
O padrão Factory Method define uma interface para criar objetos, mas permite que as subclasses decidam qual classe instanciar. Ele promove o princípio de programação para interfaces, não para implementações.

### Diferenças entre Factory Method e Anti-pattern
- **Factory Method**: Centraliza a criação de objetos e facilita a manutenção e extensão do código.
- **Anti-pattern**: Criação de objetos espalhada pelo código, dificultando a manutenção e aumentando o acoplamento.

### UML
#### Factory Method
![Factory Method UML](./uml/factory_method_pattern.png)

#### Anti-pattern
![Factory Method Anti-pattern UML](./uml/factory_method_anti_pattern.png)

---

## 3. Observer

### Resumo
O padrão Observer define uma dependência um-para-muitos entre objetos, de forma que, quando um objeto muda de estado, todos os seus dependentes são notificados automaticamente.

### Diferenças entre Observer e Anti-pattern
- **Observer**: Promove o desacoplamento entre os objetos, facilitando a escalabilidade.
- **Anti-pattern**: Dependências diretas entre objetos, dificultando a manutenção e introduzindo fragilidade no sistema.

### UML
#### Observer
![Observer UML](./uml/observer_pattern.png)

#### Anti-pattern
![Observer Anti-pattern UML](./uml/observer_anti_pattern.png)

---

## 4. Strategy

### Resumo
O padrão Strategy define uma família de algoritmos, encapsula cada um deles e os torna intercambiáveis. Ele permite que o algoritmo varie independentemente dos clientes que o utilizam.

### Diferenças entre Strategy e Anti-pattern
- **Strategy**: Encapsula a lógica em classes separadas, promovendo a reutilização e a flexibilidade.
- **Anti-pattern**: Lógica de decisão embutida no código do cliente, dificultando a manutenção e a extensão.

### UML
#### Strategy
![Strategy UML](./uml/strategy_pattern.png)

#### Anti-pattern
![Strategy Anti-pattern UML](./uml/strategy_anti_pattern.png)

---

## 5. Decorator

### Resumo
O padrão Decorator permite adicionar funcionalidades a um objeto dinamicamente, sem alterar sua estrutura. Ele é útil para evitar a criação de subclasses desnecessárias.

### Diferenças entre Decorator e Anti-pattern
- **Decorator**: Adiciona responsabilidades de forma flexível e reutilizável.
- **Anti-pattern**: Uso excessivo de herança, resultando em um código rígido e difícil de modificar.

### UML
#### Decorator
![Decorator UML](./uml/decorator_pattern.png)

#### Anti-pattern
![Decorator Anti-pattern UML](./uml/decorator_anti_pattern.png)

---