# Cesta web services

APIs Rest do aplicativo Cesta.
> **_Sobre:_** O Cesta tem como objetivo facilitar o acesso à informação para que consumidores e vendedores possam tomar as melhores decisões.

## APIs disponíveis
- [/mercados](#/mercados)
- [/produtos](#/produtos)

## Estrutura
![Estrutura](docs/API_cesta_ideia.png)

## /mercados
API de informação sobre mercados para consumidores.

### [GET]
#### Requisição
```
Querystring: 
 - latitude : numérico
 - longitude: numério
```

#### Respostas
```
{
mercados: [ 
  {"nome": "MERCADINHO DA ESQUINA", "distancia": 0.2, "avaliacao": 5},
  {"nome": "MERCADINHO DO BAIRRO", "distancia": 1.5, "avaliacao": 4.5}
  ]
}
```

## /produtos
API de informação sobre produtos para consumidores.

### [GET]
#### Requisição
```
Querystring: 
 - latitude : numérico
 - longitude: numério
 - produto: alfanumérico
```

#### Respostas
```
{
produtos: [
  {"nome": "Arroz Marca Y 1kg", "preco": 4.50, "mercado": "MERCADINHO DO BAIRRO", "distancia": 1.5},
  {"nome": "Arroz Marca X 1kg", "preco": 5.00, "mercado": "MERCADINHO DA ESQUINA", "distancia": 0.2}
  ]
}
```
