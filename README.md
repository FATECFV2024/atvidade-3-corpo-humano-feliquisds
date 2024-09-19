[![Review Assignment Due Date](https://classroom.github.com/assets/deadline-readme-button-22041afd0340ce965d47ae6ef1cefeee28c7c493a6346c4f15d667ab976d596c.svg)](https://classroom.github.com/a/3YVg2wK-)
[![Open in Visual Studio Code](https://classroom.github.com/assets/open-in-vscode-2e0aaae1b6195c2367325f4f02e2d04e9abb55f0b24a779b69b11b9e10269abc.svg)](https://classroom.github.com/online_ide?assignment_repo_id=16027896&assignment_repo_type=AssignmentRepo)

# Atividade 3

## Escopo da Atividade 🛠️

- Implementar uma classe que seja capaz de simular atuação dos modificadores de acesso e respectivamente os métodos getters/setters: 
- Implemente a Classe Corpo Humano e o Construtor  
- Implemente os métodos Getters
- Implemente os métodos Setters
- Implemente uma classe main que inclua as seguintes informações: Massa, Volume e Densidade

&nbsp;

### Após essa implementação responda:

- Na classe Corpo_Humano inclua a linha c1.massa = "2"; logo depois de instanciar o objeto c1. Qual foi a ocorrência? Qual a conclusão sobre o que aconteceu?

R: A ação não será aceita, pois o atributo "massa" não é visível. Para realizar essa ação corretamente, seria necessário um atributo com modificador de acesso "public".

&nbsp;

- Na classe Corpo_Humano altere a linha private float Massa para public float Massa; Qual foi a ocorrência? Qual a conclusão sobre o que aconteceu?

R: Não haverá problemas na classe CorpoHumano, mas a ação da pergunta anterior continuará incorreta, dessa vez por um erro de Type mismatch. Para realizar essa ação corretamente, seria necessário que o valor sendo registrado seja um número inteiro, escrito sem aspas.

&nbsp;

- Na classe Corpo_Humano altere a linha public setVolume (float volume) para private setVolume (float volume). Qual foi a ocorrência? Qual a conclusão sobre o que aconteceu?

R: Isso causará problemas no método main e na classe de testes, pois o setter do atributo "volume" não é visível. Neste caso, seria necessário reverter a mudança do modificador de acesso, ou tornar o atributo "volume" público, em vez de privado, e realizar as mudanças necessárias.

&nbsp;

## DESAFIO 🚀

Implementar o Atributo e os Metodos de acesso para Altura;
Criar um método para calcular o Indíce de Massa Corporal (IMC), sendo:

IMC = Massa / Altura²

Exibir/Imprimir o IMC na classe main