# Design e Arquitetura de Software 1 - 2025/2 Turma B

**Aluno:** Thales Pedri

---

## Bibliografia

- [Design Patterns - Observer](https://refactoring.guru/design-patterns/observer)
- [Clean Code](https://integrada.minhabiblioteca.com.br/reader/books/9788550816043/pageid/0)
- [Engenharia de Software Moderna - Cap. 5](https://engsoftmoderna.info/cap5.html)
- [Livro Integrada](https://integrada.minhabiblioteca.com.br/reader/books/9788550819754/epubcfi/6/2%5B%3Bvnd.vst.idref%3Dcover%5D!/4/2/2%4051:1)

---

## Aula 31/07

- **Abstração e Complexidade**  
  É o ato de entender um problema real e representá-lo no código de forma simplificada, focando apenas nos aspectos essenciais. Softwares são abstrações de problemas do mundo real, o que naturalmente gera complexidade.  
  Quanto maior a complexidade, mais difícil fica entender, manter, evoluir e trabalhar em equipe.

- **Frameworks**  
  Conjuntos de ferramentas, bibliotecas e convenções que fornecem uma estrutura pronta para desenvolvimento. São semelhantes entre si. Recomenda-se dominar pelo menos um para ganhar produtividade e base para aprender outros.

- **Padronização de Código**  
  Prática de seguir convenções uniformes na escrita do código (ex.: `camelCase` ou `snake_case`). Facilita leitura, manutenção e trabalho em equipe.

- **Programação Orientada a Objetos (POO)**  
  Base para organização do código em classes e objetos. Promove encapsulamento, reutilização e modularidade, facilitando desenvolvimento em grupo, manutenção e escalabilidade.

- **Estruturas de Dados**  
  Fundamentais para armazenar, acessar e manipular informações de forma eficiente. Árvores e grafos são amplamente utilizados em sistemas de grande escala (Google, Amazon etc.).

- **Ocultação (Information Hiding)**  
  Esconder a implementação interna de uma função, classe ou módulo, permitindo que outras partes usem seus recursos sem conhecer os detalhes internos.

- **Comentários e Manutenibilidade**  
  O código ideal permite remover ou alterar partes sem quebrar o sistema, facilitando evolução futura.

---

## Aula 04/08

- **Getters e Setters**  
  Mecanismos de encapsulamento para proteger os dados internos da classe.

- **Coesão**  
  Manter uma única responsabilidade por classe ou método. Alta coesão torna o código mais fácil de entender e manter.

- **Acoplamento**  
  Grau de dependência entre classes ou módulos.  
  **Ideal:** Alta coesão + Baixo acoplamento.  
  Alto acoplamento dificulta manutenção, reutilização e testes.

---

## Aula 07/08

### SOLID

Princípios para programar Orientado a Objetos de forma correta:

- **S - Single Responsibility Principle**  
  Cada classe deve ter apenas uma razão para mudar (única responsabilidade).

- **O - Open/Closed Principle**  
  Classes devem estar abertas para extensão, mas fechadas para modificação.

- **I - Interface Segregation Principle**  
  Interfaces devem ser específicas e ter uma única responsabilidade.

- **D - Dependency Inversion Principle**  
  Módulos de alto nível não devem depender de módulos de baixo nível. Ambos devem depender de abstrações (interfaces).

### Diagramas UML (relacionamentos importantes)

- **Herança**: Linha sólida com seta aberta apontando para a classe pai.
- **Associação**: Linha sólida (pode ter seta para indicar direção).
- **Implementação**: Linha tracejada com seta aberta apontando para a interface.

---

## Aula 11/08

- **Herança**  
  Uma classe filha herda atributos e métodos da classe pai.  
  **Problema:** Cria forte acoplamento e hierarquias rígidas.

- **Composição**  
  Em vez de herdar, combina objetos. Oferece maior flexibilidade e menor acoplamento.

- **Princípio de Demeter (Law of Demeter)**  
  Uma classe deve conhecer o mínimo possível de outras classes. Deve interagir apenas com seus colaboradores diretos.

---

## Aula 14/08

### SOLID (continuação)

- **L - Liskov Substitution Principle**  
  Objetos de subclasses devem poder substituir objetos da classe base sem alterar o comportamento esperado do sistema.

---

## Aula 18/08

- **Singleton**  
  Garante que uma classe tenha apenas uma instância e fornece um ponto de acesso global.  
  Útil para recursos compartilhados (ex.: conexão com banco, configurações).  
  **Observação:** Atualmente considerado um anti-pattern quando usado em excesso.

---

## Aula 21/08 e 25/08

- **Observer (Publisher-Subscriber)**  
  Define uma relação um-para-muitos entre objetos. Quando o objeto observado (publisher) muda de estado, todos os observadores são notificados automaticamente.  
  Promove baixo acoplamento e facilita a adição de novas funcionalidades.  
  **Referência:** [Refactoring Guru - Observer](https://refactoring.guru/design-patterns/observer)

---

## Aula 28/08

- **Arquitetura de Software**  
  É o esqueleto do sistema, guiado por princípios e materializado em decisões técnicas para atender aos requisitos funcionais e não funcionais.

---

## Aula 01/09

### Expectativas de um Arquiteto de Software

- Tomar decisões técnicas de longo prazo.
- Garantir que a arquitetura suporte requisitos funcionais e não funcionais.
- Facilitar a comunicação técnica dentro da equipe.
- Manter-se atualizado com novas tecnologias e práticas.
- Conhecer profundamente o domínio do negócio.

**DevOps**  
Abordagem que elimina silos entre Desenvolvimento e Operações, promovendo equipes multidisciplinares, integração contínua e entrega rápida e confiável.

---

## Aula 04/09

### Diferença entre Arquitetura e Design

- **Arquitetura**: Foca na estrutura geral e no comportamento do sistema como um todo.
- **Design**: Foca na implementação detalhada das decisões arquiteturais.  
  Devem trabalhar em conjunto para evitar problemas de integração.

### Arquiteto Modelo T

- **Profundidade técnica** em algumas áreas (perna vertical do T).
- **Amplitude técnica** em diversas áreas (barra horizontal do T) — essencial para comunicação e visão geral.

---

## Aula 08/09 e 11/09

- **Análise de Trade-offs**  
  Processo de avaliar prós e contras de cada decisão arquitetural para escolher a melhor opção no contexto específico do projeto.

---

## 2º Bimestre

## Aula 06/10

### Características da Arquitetura

#### 1. Características Operacionais
- **Desempenho**: Tempo de resposta e throughput.
- **Escalabilidade**: Capacidade de crescer (horizontal ou vertical).
- **Disponibilidade**: Tempo que o sistema permanece operacional.
- **Confiabilidade**: Capacidade de funcionar corretamente por longos períodos.

#### 2. Características Estruturais
- **Modularidade**
- **Coesão**
- **Acoplamento**
- **Separação de Preocupações**

#### 3. Características Transversais
- **Segurança**
- **Monitoramento**
- **Tratamento de Erros**
- **Conformidade** (LGPD, normas etc.)

**Arquitetura Menos Pior**  
Abordagem pragmática: escolher a opção menos ruim diante de restrições reais (tempo, orçamento, tecnologia).

---

## Aula 09/10

- **Circuit Breaker**  
  Padrão para lidar com falhas temporárias em serviços externos. Evita chamadas repetidas a serviços com problemas, aumentando a resiliência do sistema.

---

## Aula 13/10

- **CQRS (Command Query Responsibility Segregation)**  
  Separação entre operações de escrita (Command) e leitura (Query). Permite otimizar cada modelo independentemente.

---

## Aula 16/10

- **Retry Pattern**  
  Padrão para lidar com falhas transitórias.  
  **Estratégias:** Cancelar, Retry Imediato, Retry com Atraso, Retry Incremental e Exponential Backoff.

---

## Aula 20/10 e 23/10

### Estilo Arquitetura em Camadas

Organiza a aplicação em camadas horizontais (Apresentação → Negócio → Persistência → Banco de Dados).

**Benefícios:** Simples, baixo custo, boa organização.  
**Limitações:** Menos ágil para mudanças, pode gerar alto acoplamento.

---

## Aula 27/10 e 30/10

### Estilo Arquitetura em Pipeline

Divide o processamento em filtros independentes conectados por canais unidirecionais. Ideal para fluxos sequenciais (ETL, processamento de logs, etc.).

---

## Aula 03/11 e 06/11

### Estilo Arquitetura Microkernel

Separa o núcleo essencial (Microkernel) dos plugins/extensões. Excelente para sistemas altamente extensíveis.

---

## Aula 10/11 e 13/11

### Estilo Arquitetura de Microsserviços

Divide a aplicação em serviços pequenos, independentes, com banco de dados próprio e deploy autônomo. Alta escalabilidade, mas maior complexidade operacional.
