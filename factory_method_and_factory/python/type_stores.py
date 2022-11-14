from general import PizzaStore
from type_pizzes import ChicagoTypeCheesPizza, NYTypeCheesPizza, Pizza


class ChicagoPizzaStore(PizzaStore):
    def create_pizza(self, type_pizza: str):
        pizza: Pizza = None
        dict_pizza: dict = {
            "chees": ChicagoTypeCheesPizza
        }
        pizza: Pizza = dict_pizza.get(type_pizza)
        return pizza()


class NYPizzaStore(PizzaStore):
    def create_pizza(self, type_pizza: str):
        pizza: Pizza = None
        dict_pizza: dict = {
            "chees": NYTypeCheesPizza
        }
        pizza: Pizza = dict_pizza.get(type_pizza)
        return pizza()

