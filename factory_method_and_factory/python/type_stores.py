from general import PizzaStore
from type_pizzes import Pizza, CheesPizza
from factoryes import NYIngredientFactory, ChicagoIngredientFactory, IngredientFactory


class ChicagoPizzaStore(PizzaStore):
    def create_pizza(self, type_pizza: str):
        ingredientFactory: IngredientFactory = ChicagoIngredientFactory()
        dict_pizza: dict = {
            "chees": CheesPizza(ingredientFactory)
        }
        pizza: Pizza = dict_pizza.get(type_pizza)
        return pizza


class NYPizzaStore(PizzaStore):
    def create_pizza(self, type_pizza: str):
        ingredientFactory: IngredientFactory = NYIngredientFactory()
        dict_pizza: dict = {
            "chees": CheesPizza(ingredientFactory)
        }
        pizza: Pizza = dict_pizza.get(type_pizza)
        return pizza

