Projeto TQI: API para Sistema de Avaliação de Créditos

" NÃO PENSE QUE É CAPAZ. SAIBA QUE É "


 Desafio Proposto
Dado o cenário abaixo, elabore uma sugestão para o back-end necessária para resolver o problema. Use a criatividade! Você pode explorar aqui todos os seus conhecimentos, demonstrando fluxos, telas, protótipos e/ou codificação. É importante sabermos por que você decidiu fazer a solução, portanto deixe clara a motivação das suas escolhas.

Uma empresa de empréstimo precisa criar um sistema de análise de crédito para fornecer aos seus clientes as seguintes funcionalidades:

 01. Cadastro de clientes
O cliente pode cadastrar: nome, e-mail, CPF, RG, endereço completo, renda e senha.

 02. Login
A autenticação será realizada por e-mail e senha.

 03. Solicitação de empréstimo
Para solicitar um empréstimo, precisamos do valor do empréstimo, data da primeira parcela e quantidade de parcelas.
O máximo de parcelas será 60 e a data da primeira parcela deve ser no máximo 3 meses após o dia atual.

 iv. Acompanhamento das solicitações de empréstimo
O cliente pode visualizar a lista de empréstimos solicitados por ele mesmo e também os detalhes de um de seus empréstimos.
Na listagem, devemos retornar no mínimo o código do empréstimo, o valor e a quantidade de parcelas.
No detalhe do empréstimo, devemos retornar: código do empréstimo, valor, quantidade de parcelas, data da primeira parcela, e-mail do cliente e renda do cliente.

Restrição
A implementação deve utilizar linguagem Java ou Kotlin.


Minha Solução
  Minha sugestão para para a empresa de Emprestimos TQI  , é um sistema contendo cadastro de funcionários ,  cadastro de emprestimos , onde tanto o cliente quanto a financeira terão acesso aos emprestimos solicitados pelo cliente . Foi utilizado a Ferramenta NetBeans , Banco de dados Mysql e linguagem JAVA . 

 DESENVOLVIMENTO:
![01-Tela Login](https://user-images.githubusercontent.com/84757811/148665019-564825e3-f438-415b-887e-c686bf038577.png)
![02-Tela Principal](https://user-images.githubusercontent.com/84757811/148665046-caf6ad26-ae02-44ab-bd7d-9f47b5cd94d3.png)
![03-Tela Cadastro de clientes](https://user-images.githubusercontent.com/84757811/148665035-ccd17a02-bf66-469f-b07b-ed20e6835e6a.png)
![04-Tela Cadastro de Emprestimo](https://user-images.githubusercontent.com/84757811/148665061-f31ef5cd-9411-4e18-9c74-a81ce2f4e3fb.png)
![05-Tela de  Status](https://user-images.githubusercontent.com/84757811/148665066-94566ced-075a-4047-b66a-54776dd0b9cb.png)
![06-Tela Cliente Sql](https://user-images.githubusercontent.com/84757811/148665069-bba5f60f-3d56-4c81-8ed4-77144e82c061.png)
![07-Tela Cliente Sql2](https://user-images.githubusercontent.com/84757811/148665074-c773b44a-50ea-462d-b8a0-e0658dea819f.png)



