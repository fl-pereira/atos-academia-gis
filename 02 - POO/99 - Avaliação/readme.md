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
-- park()
-- leave()
-- totalValue()
-- verifyIfAvailableToPark()
-- verifyIfParked()
-- msgToCustomer()

## CLASSE VEHICLE
- **Atributos**:
-- model : *String*
-- manufacturer : *String*
-- plate : *String*
-- type: *char*
-- time : *Integer*
-- parked : *boolean*

- **Atríbutos do Construtor**:
-- Sem construtor, pois será uma classe abstrata

- **Métodos**:
--  parkState()

## CLASSE CAR
- **Atributos**:
-- weight: *Double*

- **Atríbutos do Construtor**:
-- *model*, *manufacturer*, *plate* e estado em *parked*

-**Métodos**:

## CLASSE MOTORCYCLE
- **Atributos**:
-- engineCapacity: *Double*

- **Atríbutos do Construtor**:
-- *model*, *manufacturer*, *plate* e estado em *parked*

-**Métodos**:

## ALGORITMO
-- Instanciar a classe *ParkingLot* através do objeto **parkingLot**, definindo o atríbuto *name*, as vagas disponíveis através da lista *parkingSpaces* e o valor fixo por hora estacionada em *priceHour*

-- Receber os dados através de entrada do usuário e instaciar a classe *Car*, que herda a classe *Vehicle*, definindo os atríbutos *model*, *manufacturer*, *plate*, estado *parked* e *type*, exigidos pelo construtor, inserindo o objeto na lista *vehiclesToPark*

-- Receber os dados através de entrada do usuário e instaciar a classe *Motorcycle*, que herda a classe *Vehicle*, definindo os atríbutos *model*, *manufacturer*, *plate* e estado *parked* e *type* exigidos pelo construtor, inserindo o objeto na lista *vehiclesToPark*

-- Solicitar ao usuário que informe o nome do objeto-veículo que deseja estacionar e verificar se o mesmo se encontra na lista *vehiclesToPark* através do método *parkingLot.verifyIfAvailableToPark()* para ser estacionado. Se não encontrar o objeto-veículo informado, exibir uma mensagem de erro e solicitar a entrada novamente. Caso encontre, prossiga

-- Estacionar o objeto-veículo iformado utilizando o método *parkingLot.park()*. Dentro do método *parkingLot.park()*, através do método *vehicle.parkState()* do veículo, será checado se o mesmo se encontra estacionado ou não, como forma de validação

-- Estando apto para ser estacionado, o método *parkingLot.park()* irá alocar o objeto objeto-veículo à lista de vagas *parkingSpaces*

-- Perguntar ao usuário se deseja estacionar outro veículo. Caso sim, inserir o nome do objeto-veículo e repetir os passos anteriores referentes a estacionar o veículo, caso não, inserir 0 (zero) para prosseguir.

-- Solicitar ao usuário que informe o nome do objeto-veículo que deseja retirar e verificar se o mesmo se encontra na lista *parkingSpaces* para ser retirado através do método *parkingLot.verifyIfParked()*. Se não encontrar o objeto-veículo informado, exibir uma mensagem de erro e solicitar a entrada novamente. Caso encontre, prossiga

-- Ao encontrar objeto-veículo, solicitar que o usuário informe o tempo de permanência em número inteiro. Realizar o cálculo de valor total através do método *parkingLot.totalValue()*, exibir a mensagem completa contendo a placa, tipo de veículo, vaga ocupada, tempo de permanência e valor total com o método *parkingLot.msgToCustomer()*

-- Perguntar ao usuário se deseja remover outro veículo. Caso sim, inserir o nome do objeto-veículo para repetir o passo anterior e caso não, inserir 0 (zero) para encerrar.
