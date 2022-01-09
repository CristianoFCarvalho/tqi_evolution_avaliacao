Projeto TQI: API para Sistema de Avaliação de Créditos
‼️ NÃO PENSE QUE É CAPAZ. SAIBA QUE É ‼️
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
Minha idéia de solução para o desafio proposto foi de desenvolver uma API Rest com conexão com Banco de dados para servir de
Back-End para um site que pode ser desenvolvido pela equipe de Front-End.

 DESENVOLVIMENTO:
Eu tentei criar esta API utilizando todo o conhecimento adquirido no bootcamp e em outros conteúdos assistidos anteriormente, utilizando boas práticas de desenvolvimento, programação em camadas, injeção de depenência, invesão de controle, atribuição de responsabilidades as classes e interfaces e etc.
