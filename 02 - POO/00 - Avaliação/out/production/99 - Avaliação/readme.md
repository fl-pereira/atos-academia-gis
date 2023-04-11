# PROGRAMA - ESTACIONAMENTO

## CLASSE PARKINGLOT
- **Atributos**:
-- name : *String*
-- parkingSpaces : *List*
-- vehiclesToPark : *List*
-- priceHour : *Double*

- **Atríbutos do Construtor**:
-- *name* e *priceHour*

- **Métodos**:
-- add()
 -- park()
 -- leave()
 -- getAllPlatesToPark()
 -- getAllParkedPlates()
 -- getAllParkedPlates()
 -- totalValue()

## CLASSE VEHICLE
- **Atributos**:
-- model : *String*
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
-  Instanciar a classe *ParkingLot* através do objeto **parkingLot**, definindo o atríbuto *name* e o valor fixo por hora estacionada em *priceHour*

-  Receber os dados através de entrada do usuário e instaciar a classe *Vehicle*, definindo os atríbutos *type*, *model*, *manufacturer*, *plate*, exigidos pelo construtor, inserindo o objeto na lista *listVehicle* através do método *add()*

-  Solicitar ao usuário que informe a placa do objeto-veículo que deseja estacionar. Se não encontrar o objeto-veículo informado, exibir uma mensagem de erro e solicitar a entrada novamente. Caso encontre, prossiga

-  Estacionar o objeto-veículo informado utilizando o método *parkingLot.park()*. Dentro do método *parkingLot.park()*, através do método *vehicle.isParked()* do veículo, será checado se o mesmo se encontra estacionado ou não, como forma de validação

-  Estando apto para ser estacionado, o método *parkingLot.park()* irá atribuir *parked = true*

-  Perguntar ao usuário se deseja estacionar outro veículo. Caso sim, inserir o nome do objeto-veículo e repetir os passos anteriores referentes a estacionar o veículo, caso não, inserir 0 (zero) para prosseguir.

-  Solicitar ao usuário que informe o nome do objeto-veículo que deseja retirar e verificar se o mesmo se encontra na lista *parkingSpaces* para ser retirado através do método *parkingLot.verifyIfParked()*. Se não encontrar o objeto-veículo informado, exibir uma mensagem de erro e solicitar a entrada novamente. Caso encontre, prossiga

-  Ao encontrar objeto-veículo, solicitar que o usuário informe o tempo de permanência em número inteiro. Realizar o cálculo de valor total através do método *parkingLot.totalValue()*, exibir a mensagem completa contendo a placa, tipo de veículo, vaga ocupada, tempo de permanência e valor total

-  Perguntar ao usuário se deseja remover outro veículo. Caso sim, inserir o nome do objeto-veículo para repetir o passo anterior e caso não, inserir 0 (zero) para encerrar.
