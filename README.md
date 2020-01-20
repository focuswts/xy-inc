# xy-inc

Para testar a aplicação é necessário somente enviar a solicitação via REST.

------------------------------------------------
1 - Padrão teste API Criação ponto de interesse:
Enviar o JSON para : localhost:8081/pi/create
Exemplo Corpo do JSON:
{
"descricao" : "Loja",
"cordX" : 10,
"cordY": 20
}
------------------------------------------------
2 - Padrão teste API Listar Pontos interesse próximos
Enviar o JSON para: localhost:8081/pi/getNextPI
Exemplo Corpo do JSON:
{
	"cordX":10,
	"cordY":20
}
------------------------------------------------
3 - Padrão teste API Listar todos pontos interesse
Enviar o JSON para: localhost:8081/pi/all
Exemplo Resposta JSON:
    {
        "id": 1,
        "descricao": "Loja",
        "cordX": 10,
        "cordY": 20,
        "cordCalculated": 22
    }
------------------------------------------------

Felipe Bagatim
