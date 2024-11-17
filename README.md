# Projeto Quinta do Ypuã API
Esta API está pronta para receber requisições do crud repositório para solicitação de cadastramento de
clientes,e requisições de lista de quartos disponíveis e serviços prestados, também de reserva de hospedagem.
Através dos endpoints os clientes podem ter seus dados cadastrados no banco (mySql jdbc driver) através do endpoint 
post /cadastrarCliente e depois fazer login através do ep get /validarCliente, após o cliente pode solicitar um array 
List com o ep get /listQuartos e List serviços e selecionar o quarto e o serviço através do ep post /realizar hopedagem.

O administrador será uma classe singleton e podera gerenciar o crud das classes funcionário, estoque, quartos e serviços.

