# PROGRAMA - ESTACIONAMENTO

## CLASSE ESTACIONAMENTO
- **Atributos**:
-- name : *String*
-- parkingSpaces : *List*
-- priceHour : *Double*

- **Atríbutos do Construtor**:
-- Todos

- **Métodos**:
-- parkCar()
-- leaveCar()
-- totalValue()
-- verifyIfParked()
-- msgToCustomer()

## CLASSE VEÍCULO
- **Atributos**:
-- model : *String*
-- manufacturer : *String*
-- plate : *String*
-- time : *Integer*
-- parked : *boolean*

- **Atríbutos do Construtor**:
-- Sem construtor, pois será uma classe abstrata

- **Métodos**:
-- 
## CLASSE CARRO
- **Atributos**:
-- type: *Char*

- **Atríbutos do Construtor**:
-- *model*, *manufacturer*, *plate* e estado em *parked*

-**Métodos**:

## CLASSE MOTO
- **Atributos**:
-- type: *Char*

- **Atríbutos do Construtor**:
-- *model*, *manufacturer*, *plate* e estado em *parked*

-**Métodos**:

## ALGORITMO
-- Instanciar a classe *Estacionamento* através do objeto **estacionamento**, definindo o atríbuto *name*, as vagas disponíveis através da lista *parkingSpaces* e o valor fixo por hora estacionada em *priceHour*
-- Instaciar a classe *Carro*, que herda a classe *Veiculo*, através do objeto **carro**, definindo os atríbutos *model*, *manufacturer*, *plate* e estado *parked* exigidos pelo construtor
