# Sistema de Controle de Pedidos - Lanchonete

## Tabelas (Classes)

- Produto
  - nome
  - descricao
  - preco

- Pedido
  - lista de produtos
  - data
  - finalizado

- Sistema
  - lista de pedidos

## Regras de Negócio

- Não permitir produto com nome vazio
- Não permitir produto com preço negativo
- Pedido deve ter pelo menos um produto para ser finalizado
- Permitir múltiplos produtos no pedido
- Calcular automaticamente o valor total
- Consultar pedidos por data
- Calcular faturamento por dia (somente pedidos finalizados)
