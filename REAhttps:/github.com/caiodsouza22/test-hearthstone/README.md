

### Esse projeto é um teste , foram seguidas as orientações dada pela empresa :
1 - Criar uma API Rest com o path “/carta” usando JAXRS para cadastrar, consultar e excluir uma carta. Permitir consultar uma carta por nome, id, classe ou tipo. Utilize os padrões de mercado para criação da API Rest.

2 - O armazenamento pode ser feito em memória usando um mapa.

# Instruções

 ### 1 - Link do projeto no Heroku
 ```
 https://hearthstone-api-rest.herokuapp.com
 
 ```
 ### 2 - Como usar os endpoints
 
 ``` 
Adicionar carta (POST) : https://hearthstone-api-rest.herokuapp.com/cards

A adição deve ser feita no formato JSON como o exemplo a seguir:
   {
        "name": "dragon",
        "description": "this cards does something",
        "attack": 6,
        "defense": 9,
        "cardType": "Creature",
        "cardClass": "Druid"
    }
    
   
    

``` 
## A consulta pode ser feita por nome, id , tipo ou classe , conforme os exemplos a seguir:

## Consultar carta por id (GET) :
 https://hearthstone-api-rest.herokuapp.com/cards/id={id}

Carta onde id é igual a 1 : https://hearthstone-api-rest.herokuapp.com/cards/id=1



## Consultar carta por nome (GET) : 
https://hearthstone-api-rest.herokuapp.com/cards/name={name}

Carta onde nome é igual a black dragon: https://hearthstone-api-rest.herokuapp.com/cards/name=dragon

## Consultar carta por classe (GET) :
https://hearthstone-api-rest.herokuapp.com/cards/class={cardClass}

Carta onde classe é igual a Druida : https://hearthstone-api-rest.herokuapp.com/cards/class=Druid

## Consultar carta por tipo (GET) :

https://hearthstone-api-rest.herokuapp.com/cards/class={cardType}

Carta onde tipo é igual a Criatura : https://hearthstone-api-rest.herokuapp.com/cards/type=Creature


## Deletar carta por id (DELETE) :

https://hearthstone-api-rest.herokuapp.com/cards/

Deletar carta em que o id é igual a 1: https://hearthstone-api-rest.herokuapp.com/cards/id=1



