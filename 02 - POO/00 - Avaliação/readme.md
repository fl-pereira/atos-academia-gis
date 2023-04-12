# PROGRAMA - ESTACIONAMENTO

## CLASSE PARKINGLOT
- **Atributos**:
-- name : *String*
-- listVehicle : *List*
-- priceHour : *Double*

- **Atríbutos do Construtor**:
-- *name* e *priceHour*

- **Métodos**:
 -- add()
 -- park()
 -- leave()
 -- getAllPlatesToPark()
 -- getAllParkedPlates()
 -- getIndexOfVehicle()
 -- printMsg()
 -- totalValue()

## CLASSE VEHICLE
- **Atributos**:
 .-- model : *String*
 -- manufacturer : *String*
 -- plate : *String*
 -- type: *String*
 -- parked : *boolean*

- **Atríbutos do Construtor**:
 -- *type*, *model*, *manufacturer*, *plate*

- **Métodos**:
 --  Sem métodos

## INTERFACE PARKINGLOTINTERFACE
- **Métodos**
 -- totalValue()

## ALGORITMO
-  Instanciar a classe *ParkingLot* através do objeto **parkingLot**, definindo os atríbutos *name* e o valor fixo por hora estacionada em *priceHour*

-  Receber os dados através de entrada do usuário e instaciar a classe *Vehicle*, definindo os atríbutos *type*, *model*, *manufacturer*, *plate*, exigidos pelo construtor, inserindo o objeto na lista *listVehicle* através do método *parkingLot.add()*. Ao final será questionado se o usuário deseja inserir outro veículo

- Será impressa a lista com placas de carros disponíveis para estacionar através do método *parkingLot.getAllPlatesToPark()*

-  Solicitar ao usuário que informe a placa do objeto-veículo que deseja estacionar, dentre os disponíveis na listagem

-  Estacionar o objeto-veículo informado utilizando o método *parkingLot.park()*. Dentro do método *parkingLot.park()*, através do método *vehicle.isParked()* do veículo, será checado se o mesmo se encontra estacionado ou não, como forma de validação

-  Estando apto para ser estacionado, o método *parkingLot.park()* irá atribuir *parked = true*

-  Perguntar ao usuário se deseja estacionar outro veículo. Caso sim, inserir o nome do objeto-veículo e repetir os passos anteriores referentes a estacionar o veículo, caso não, inserir N para sair e prosseguir.

- Será impressa a lista com placas de carros disponíveis para retirar através do método *parkingLot.getAllParkedPlates()*

-  Solicitar ao usuário que informe a placa do objeto-veículo que deseja retirar, dentre os disponíveis na listagem

-  Ao encontrar objeto-veículo, solicitar que o usuário informe o tempo de permanência em número inteiro. Realizar o cálculo de valor total através do método *parkingLot.totalValue()*, exibir a mensagem completa contendo a placa, tipo de veículo, vaga ocupada, tempo de permanência e valor total através do método *parkingLot.printMsg*

-  Perguntar ao usuário se deseja remover outro veículo. Caso sim, inserir o nome do objeto-veículo para repetir o passo anterior e caso não, inserir N para encerrar.
