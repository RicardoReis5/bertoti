# 1. Comentários do livro Software Engineering at Google

## Texto 1

Within Google, we sometimes say, “Software engineering is programming integrated over time.” Programming is certainly a significant part of software engineering: after all, programming is how you generate new software in the first place. If you accept this distinction, it also becomes clear that we might need to delineate between programming tasks (development) and software engineering tasks (development, modification, maintenance). The addition of time adds an important new dimension to programming. Cubes aren’t squares, distance isn’t velocity. Software engineering isn’t programming.

### Comentário 1

Engenharia de software não só é composto pelo ato de programar, mas também à visão para criação de um software como um todo, tanto em suas características físicas e/ou lógicas que afetam o tempo e verba, como a facilidade de manutenção baseado na complexidade, ou a possibilidade de adicionar funções sem ultrapassar os recursos do projeto.

## Texto 2

We see three critical differences between programming and software engineering: time, scale, and the trade-offs at play. On a software engineering project, engineers need to be more concerned with the passage of time and the eventual need for change. In a software engineering organization, we need to be more concerned about scale and efficiency, both for the software we produce as well as for the organization that is producing it. Finally, as software engineers, we are asked to make more complex decisions with higher-stakes outcomes, often based on imprecise estimates of time and growth.

### Comentário 2

Trade-offs são os sacrifícios que o engenheiro de software precisa mentalizar antes de iniciar um projeto, começando pela linguagem que será utilizada, deve-se pensar na mão de obra disponível, nível de conversação com o hardware no qual o software será utilizado, complexidade/legibilidade de sintaxe e agilidade na manutenção do código.

# 2. Três exemplos de trade-offs

#### Performance x Utilização de Recursos:
O game Atomic Heart produzido pelo estúdio Mundfish, inicialmente contaria com o recurso de ray-tracing (iluminação e reflexos calculados em tempo real por meio de raios de luz), porém devido ao alto custo de recursos do hardware e a instabilidade do mercado de placas de video, fez o estúdio tomar a decisão de não adicionar esse recurso não só para priorizar outras funcionalidades, mas também como a acessibildade por meio de um jogo que pode rodar em um escopo maior de computadores.

#### Complexidade de interface x Facilidade de Uso:
Os softwares Photoshop e Lightroom da Adobe podem servir como um exemplo desta diferença, o Photoshop sendo um editor de imagens completo de recursos para a realização de montagens, desenhos, etc, para um amplo número de usuários podendo tornar a inteface muito complexa e cheia de recursos específicos que talvez o usuário sequer venha a utilizar, enquanto que o Lightroom busca uma experiência mais simples para quem somente trabalha com fotografia e busca fazer correções de cores e enquadramento, assim a Adobe consegue atingir ambos os públicos através de softwares construidos de maneira que atenda suas necessdidades.

#### Autenticação em Dois-fatores x Login Básico com Senha:
A autenticação em dois-fatores ou login básico com senha podem incorporar a segurança de um site baseado na sensibilidade dos dados que são guardados nos servidores, ou pela simples preocupação da empresa com esses dados. Atualmente sites de email, ou que podem solicitar dados bancários como lojas, fazem a solicitação da atenticação em dois fatores, devido a maior segurança que traz para o usuário, e sites que não utilizam de dados importantes pedem somente pelo login básico com senha, inclusive para não proporcionar a possível inconveniencia que a autorização em dois fatoes pode trazer.

# 3. Requisito não funcional de usabilidade (referência ao texto "10 Usability Heuristics for User Interface Design")

#### 1: Visibility of system status

![Requisito1](https://github.com/RicardoReis5/bertoti/blob/main/EngenhariadeSoftware/resources/Requisito1.png)

Acerto: Instalação de software no Linux, lá aparece tudo que está acontencendo via console.
Erro: Configuração inicial na instalação e atualização do Windows, onde simplesmente aparecem frases que não dizem o que está acontecendo com o sistema.

#### 2:Match between system and the real world

![Requisito2](https://github.com/RicardoReis5/bertoti/blob/main/EngenhariadeSoftware/resources/Requisito2.png)

Acerto: Arquivos e pastas, essa nomenclatura trouxe dos documentos da vida real ao mundo dos softwares a fácil identificação do que os conteúdos do computador são e o que fazem, o mais conhecido exemplo seria a do Explorador de Arquviso do Windows.
Erro: O uso de termos muito específicos da área de desenvolvimento, por exemplo o uso de erros com um código, como error 404 em websites, e o error 0xc0000142 no Windows.

#### 3:User control and freedom

![Requisito3](https://github.com/RicardoReis5/bertoti/blob/main/EngenhariadeSoftware/resources/Requisito3.png)

Acerto: Botões desfazer e refazer em aplicações em que o usuário possa cometer erros, Photoshop, Pacote Office, Softwares de Ilustação, etc.
Erro: Quando não há desfazer uma ação já realizada, como mandar um email via Outlook.

#### 4:Consistency and standards

![Requisito4](https://github.com/RicardoReis5/bertoti/blob/main/EngenhariadeSoftware/resources/Requisito4.png)

Acerto: Consistência de UI em softwares relacionados e/ou dependentes um do outro, como o Mercado Livre e Mercado Pago, não só há consistencia nos termos utilizados para se referir os recurosos, mas também a própria logo dos serviços são conscisos um com ou outro.
Erro: Inconsistência nos termos utilizados para se referir aos recuros do software, 

#### 5: Error prevention

![Requisito5](https://github.com/RicardoReis5/bertoti/blob/main/EngenhariadeSoftware/resources/Requisito5.png)

Acerto: Limitar número de caracteres de uma caixa de texto que deve ser preenchida, no aplicativo do banco Itau o número da agência e conta já são pré formatados na tela inicial, só requirindo que o usuário coloque os números.
Erro: Não colocar avisos em casos no qual erros não poderão ser desfeitos, como a exclusão de dados, sem pedir confirmação. Isso pode resultar em erros irreversíveis, já que os usuários podem acidentalmente excluir informações importantes sem a oportunidade de revisar ou confirmar a ação.

#### 6: Recognition rather than recall

![Requisito6](https://github.com/RicardoReis5/bertoti/blob/main/EngenhariadeSoftware/resources/Requisito6.png)

Acerto: O sistema utiliza atalhos de teclado amplamente reconhecidos e fornece uma interface de usuário intuitiva, tornando mais fácil para os usuários realizar tarefas sem a necessidade de memorizar comandos específicos.
Erro: Um sistema de software exige que os usuários memorizem um grande número de comandos de teclado complexos, em vez de utilizar atalhos familiares, como Ctrl+C para copiar e Ctrl+V para colar.

#### 7:Flexibility and efficiency of use

![Requisito7](https://github.com/RicardoReis5/bertoti/blob/main/EngenhariadeSoftware/resources/Requisito7.png)

Acerto: O software CAD oferece uma interface com opções simplificadas para iniciantes, mas permite que usuários avançados acessem funcionalidades avançadas, oferecendo assim flexibilidade para diferentes níveis de habilidade.
Erro: Um software CAD (Computer-Aided Design) fornece apenas uma interface de usuário avançada, tornando-a difícil de usar para iniciantes que desejam tarefas básicas de desenho.

#### 8: Aesthetic and minimalist design

![Requisito8](https://github.com/RicardoReis5/bertoti/blob/main/EngenhariadeSoftware/resources/Requisito8.png)

Acerto: O aplicativo de produtividade segue um design minimalista, utilizando espaços em branco, cores sutis e layout limpo para criar uma interface de usuário agradável e sem distrações.
Erro: Um aplicativo de produtividade é sobrecarregado com gráficos, animações e informações desnecessárias, tornando a interface poluída e confusa.

#### 9: Help users recognize, diagnose, and recover from errors

![Requisito9](https://github.com/RicardoReis5/bertoti/blob/main/EngenhariadeSoftware/resources/Requisito9.png)

Acerto: O sistema gera mensagens de erro amigáveis e informativas que explicam o problema de maneira simples e oferecem soluções sugeridas ou links para recursos de suporte, ajudando os usuários a entender e resolver problemas.
Erro: Um sistema emite mensagens de erro técnicas e incompreensíveis quando ocorre um problema, sem fornecer orientações sobre como o usuário pode resolver o erro.

#### 10: Help and documentation

![Requisito10](https://github.com/RicardoReis5/bertoti/blob/main/EngenhariadeSoftware/resources/Requisito10.png)

Acerto: O software inclui uma extensa documentação on-line, tutoriais interativos e suporte de chat ao vivo para ajudar os usuários a aprender a usar o software e resolver problemas rapidamente.
Erro: Um software complexo não fornece documentação ou assistência, deixando os usuários sem recursos para aprender a usar o sistema.
