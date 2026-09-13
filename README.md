## Teste

**1 - O que é uma classe?**
É um molde que define os atributos e métodos comuns a um conjunto de objetos. Exemplo no projeto: `AlunoRequest` define que todo aluno recebido tem `nome`, `nota1` e `nota2`.

**2 - O que é um Objeto?**
É uma instância concreta de uma classe, com valores próprios nos atributos. Cada vez que uma requisição chega, o Spring cria um objeto `AlunoRequest` novo, preenchido com os dados daquele JSON específico.

**3 - O que é assinatura de um método?**
É o conjunto formado pelo nome do método e pelos parâmetros que ele recebe (tipo, quantidade e ordem). Não inclui o tipo de retorno.

**4 - Descreva a assinatura de um método**
Exemplo do projeto: `calcularMedia(AlunoRequest request)`. A assinatura é `calcularMedia(AlunoRequest)` — nome do método mais o tipo do parâmetro recebido.

**5 - Descreva o retorno de um método**
É o tipo de dado que o método devolve ao terminar sua execução, declarado antes do nome do método. Exemplo: `public AlunoResponse calcularMedia(...)` retorna um objeto do tipo `AlunoResponse`. Quando um método não devolve nada, o retorno é `void`.

**6 - Defina o que é escopo**
É a região do código onde uma variável, método ou classe pode ser acessada. Fora dessa região, o elemento simplesmente não existe para quem está tentando usá-lo.

**7 - Defina variável global**
No contexto de uma classe Java, é o atributo declarado no nível da classe (fora de métodos), acessível por todos os métodos daquela classe durante toda a vida do objeto. Exemplo: `nome`, `nota1` e `nota2` em `AlunoRequest`.

**8 - Defina variável local**
É a variável declarada dentro de um método (ou bloco), existindo apenas durante a execução daquele método. Exemplo: a variável `media`, calculada dentro do método `calcularMedia`.

**9 - O que é um construtor?**
É um método especial, com o mesmo nome da classe e sem tipo de retorno, usado para inicializar um objeto no momento em que ele é criado com `new`. Exemplo: `public AlunoRequest(String nome, Double nota1, Double nota2)`.

**10 - O que é herança?**
É o mecanismo pelo qual uma classe (subclasse) herda atributos e métodos de outra classe (superclasse), usando a palavra-chave `extends`, permitindo reaproveitar e especializar comportamento.

**11 - O que é uma interface?**
É um contrato que define quais métodos uma classe deve implementar, sem obrigatoriamente dizer como (sem corpo, com exceção dos métodos `default`). Uma classe "assina" esse contrato usando `implements`.

**12 - O que é uma classe abstrata?**
É uma classe que não pode ser instanciada diretamente, servindo de base para outras classes. Pode ter métodos abstratos (sem implementação, que as subclasses são obrigadas a implementar) e métodos concretos (já implementados, para reaproveitamento).

**13 - O que é encapsulamento?**
É o princípio de esconder os detalhes internos de uma classe, protegendo os atributos como `private` e expondo o acesso controlado através de métodos públicos (getters e setters). No projeto, isso aparece em `AlunoRequest` e `AlunoResponse`.
=======
