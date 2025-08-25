# Design e Arquitetura de Software 1 - 2025/2 Turma B
- Aluno: Thales Pedri

# Bibliografia
- Design patterns https://refactoring.guru/design-patterns/observer
- Clean code https://integrada.minhabiblioteca.com.br/reader/books/9788550816043/pageid/0
- https://engsoftmoderna.info/cap5.html
- https://integrada.minhabiblioteca.com.br/reader/books/9788550819754/epubcfi/6/2%5B%3Bvnd.vst.idref%3Dcover%5D!/4/2/2%4051:1

# Aula 31/07
- Abstração e Complexidade:
É o ato de entender um problema real e representá-lo no código de forma simplificada, focando apenas nos aspectos essenciais para sua resolução.  Isso permite transformar situações do mundo real em estruturas lógicas e funcionais dentro do software, facilitando a construção de sistemas mais claros. Softwares são abstrações de um problema do mundo real, que tendem a serem complexos por esse motivo, e essa complexidade é um problema porque torna o sistema mais difícil de entender, manter e evoluir. Quanto mais complicado o código, mais difícil fica para os desenvolvedores entenderem como ele funciona, corrigirem erros, fazerem alterações com segurança e trabalharem em equipe.

- Frameworks: 
Frameworks são conjuntos de ferramentas, bibliotecas e convenções que fornecem uma estrutura pronta para o desenvolvimento de software, facilitando a criação de aplicações ao oferecer soluções já implementadas para problemas comuns, elas são praticemente uma cópia uma das outras e o ideal é se acostumar com pelo menos uma para conseguir ter produtividade, experiência e até um entendimento base para usar outras caso for necessário.

- Padronização de código:
É a prática de seguir convenções uniformes na escrita do código dependendo da linguagem usada, com nome de variaveis e funções padronizadas por exemplo, camelCase (ex: minhaVariavel) ou snake_case (ex: minha_variavel). Isso facilita a leitura, entendimento e manutenção do software, especialmente em equipes, pois todos seguem um mesmo padrão que torna o código mais claro e organizado.

- POO:
A orientação a objetos é a base para tudo, que organiza o código em classes e objetos, com uma estrutura lógica e coesa para o desenvolvimento de software. Esse modelo permite encapsular dados, reutilizar o código e compor sistemas divididos em módulos, facilitando o desenvolvimento em grupos, a manutenção e a escalabilidade, deixando mais organizado por saber o que cada parte realiza.  

- Estrutura de Dados:
A estruturas de dados, como listas, filas, árvores, grafos, e outras são fundamentais para armazenar, acessar e manipular informações de forma eficiente, servindo como base para algoritmos rápidos e sistemas com alta performance, sendo mais utilizado árvores e grafos para aplicações que atendam e suportem milhões de usuarios simultaneamente de empresas como a Google, Amazon entre outras. 

- Ocultação:
Acontece por exemplo, ao esconder a implementação interna de uma função, classe ou módulo, permitindo que outras partes do sistema usem seus recursos sem precisar saber como são por dentro.

- Mais comentários:
 O esperado de um código é que você possa remover uma parte do código e ainda assim fazer com que o sistema nao quebre, podendo evoluir no futuro o sistema sem que ele falhe.

# Aula 04/08
- Getters e Setters:
 São encapsulamentos, e servem para proteger a informação.

- Coesao:
manter uma única responsabilidade por classe ou até método, para fazer com que realize uma única coisa bem feita, utilizado com bom senso torna torna o código mais fácil de entender e manter, sendo coeso.

- Acoplamento: 
É a força da conexão entre duas classes. Alto acoplamento é quando um grupo de classes é altamente dependente umas das outras. E algo com baixo acoplamento é quando os componentes de um sistema têm pouca ou nenhuma dependência um do outro. O ideal é nao ter um alto acoplamento, porque uma mudança em um componente pode exigir modificações em vários outros, dificultando a manutenção, a reutilização e os testes.

Na engenharia de software o ideal é ter um software altamente coeso e com baixo acoplamento.

# Aula 07/08

- SOLID:
É programar orientado a objetos do jeito certo, usar da melhor forma que ela foi pensada para ser utilizada.

  - Single Responsibility Principle: É uma aplicação direta da ideia da coesão, cada parte do seu codigo tem uma unica responsabilidade, ou seja, uma razão para mudar.

  - Open/Closed Principle: Classes, módulos e funções devem estar abertos para extensão, mas fechados para modificação, permitindo adicionar novas funcionalidades sem alterar o código existente.

  - Interface Segregation Principle: Toda comunicação do sistema deveria ter uma interface e cada interface deveria ter uma única responsabilidade, como por exemplo se quiser ver os movimentos do mouse em um botão, teria uma interface para isso da mesma maneira que teria uma interface para os cliques no botão.

- Dependency Inversion Principle: Módulos de alto nível não devem depender de módulos de baixo nível, ambos devem depender de abstrações (interfaces), invertendo a dependência para tornar o código mais flexível e desacoplado.

# importante
 - Herança (generalização/especialização) → linha sólida com seta aberta apontando para a classe pai.

 - Associação → linha sólida, pode ter seta fechada indicando direção, mostra relacionamento entre classes.

 - Interface (realização/implementação) → linha tracejada/vazada com seta aberta apontando para a interface que está sendo implementada.

# Aula 14/08
- SOLID
  - Liskov Substitution Principle: Objetos de uma classe derivada devem poder substituir objetos da classe base sem quebrar o funcionamento do sistema, garantindo que subclasses preservem o comportamento esperado.

# Aula 18/08

- Singleton: É único, só pode haver um dele. A ideia dele é vc criar um ponto unico global de acesso, como se fosse uma variavel global, considerado hoje um anti-pattern.

# Aula 21/08
- Observer:  É um padrão de projeto que define uma relação um-para-muitos entre objetos. Quando o objeto principal muda de estado, todos os objetos dependentes são notificados automaticamente.




