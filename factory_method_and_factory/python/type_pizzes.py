from general import Pizza
from factoryes import IngredientFactory

class CheesPizza(Pizza):

    def __init__(self, ingredient_factory) -> None:
        super().__init__()
        self.ingredient_factory: IngredientFactory = ingredient_factory

    def prepare(self):
        print("Preparing " + self.name)
        self.sauce = self.ingredient_factory.create_sauce()
        self.dough = self.ingredient_factory.create_dought()
        self.cheese = self.ingredient_factory.create_cheese()

class NYTypeCheesPizza(Pizza):
    def __init__(self) -> None:
        super().__init__()
        self.name = "NY Style Sauce and Cheese Pizza"
        self.dough = "Thin Crust Dough"
        self.sauce = "Marinara Sauce"   
        self.toppings.append("Grated Reggiano Cheese")


class ChicagoTypeCheesPizza(Pizza):
    def __init__(self) -> None:
        super().__init__()
        self.name = "Chicago Style Sauce and Cheese Pizza"
        self.dough = "Extra Thick Crust Dough"
        self.sauce = "Plum Tomato Sauce"
        self.toppings.append("Shredded Mozzarella Cheese")
    
    def prepare(self):
        print("Cutting the pizza into square slices")

