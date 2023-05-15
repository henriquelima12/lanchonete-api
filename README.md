# lanchonete-api


## Ferramentas necessárias para compilação:

### IDE (Eclipse, IntelliJ, etc...)
### Java 8 ou superior
### Maven 3.5 ou superior
### MYSQL versão 5.6 ou superior
### HTTP Client (Postman, Insomnia, etc...)


*Obs: Antes de executar, criar um novo banco de dados chamado "lanchonete", com nome de usuario "root" e sem senha para acesso


## Endpoints da aplicação

###obter os pedidos criados
### GET http://localhost:8082/pedidos


###calcular preço pela lista de pedidos
### GET http://localhost:8082/pedidos/calcularPreco/{id}


calcular preço pelo id
### GET http://localhost:8082/pedidos/calcularPrecoById/{id}


criar novo pedido
### POST http://localhost:8082/pedidos
{
"id": 1,
"produtos": [],
"precoTotal": 0.00,
"totalPago": 0.00,
"troco": 0.00,
"fechado": false
}


adicionar produto
### PUT http://localhost:8082/pedidos/adicionarProduto/{idPedido}/{idProduto}/{quantidade}
{
"id": 1,
"produtos": [
  {
  "id": 1,
  "nome": "xburger",
  "preco": 10.00,
  "quantidade": 2
  }
],
"precoTotal": 20.00,
"totalPago": 25.00,
"troco": 5.00,
"fechado": true
}


remover produto
### PUT http://localhost:8082/pedidos/removerProduto/{idPedido}/{idProduto}/{quantidade}
{
"id": 1,
"produtos": [
  {
  "id": 1,
  "nome": "xburger",
  "preco": 10.00,
  "quantidade": 1
  }
],
"precoTotal": 10.00,
"totalPago": 15.00,
"troco": 5.00,
"fechado": true
}


fechar pedido
### PUT http://localhost:8082/pedidos/fecharPedido/{id}
{
"id": 1,
"produtos": [
  {
  "id": 1,
  "nome": "xburger",
  "preco": 10.00,
  "quantidade": 1
  }
],
"precoTotal": 10.00,
"totalPago": 15.00,
"troco": 5.00,
"fechado": true
}


obter os produtos criados
### GET http://localhost:8082/produtos


criar novo produto
### POST http://localhost:8082/produtos
{
"id": 1,
"nome": "xburger",
"preco": 5.00,
"quantidade": 2
}
