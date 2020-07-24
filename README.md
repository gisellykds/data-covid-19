# data-covid-19
Api de mapeamento de casos (COVID-19) no Brasil (com seleção por estado) utilizando Java, Spring Boot e Feign Client

APIS Utilizadas:
  - https://servicodados.ibge.gov.br/
  - https://covid19-brazil-api.now.sh/


  
## Endpoints data-covid-19

### Requisição - busca casos BR

`GET /`
  
````
  http://localhost:8080/api/v1/covid/data
````
  
`[Response]`
````
{
    "pais": "Brazil",
    "casos": 583080,
    "mortes": 84082,
    "recuperados": 1620313,
    "data_atualizacao": "23/07/2020 21:35:16"
}

````

### Requisição - busca casos BR por UF

  `GET /{uf}`
  
````
  http://localhost:8080/api/v1/covid/data/{uf}
````
  
`[Response]`
````
{
    "UF": "SP",
    "estado": "São Paulo",
    "casos": 439446,
    "mortes": 20532,
    "suspeitas": 5334,
    "data_atualizacao": "22/07/2020 19:33:56"
}
````
