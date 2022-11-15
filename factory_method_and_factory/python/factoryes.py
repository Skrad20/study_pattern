from ingredients import Dough, Sauce, Cheese, Clams, Veggies, Pepperoni, Ingredient

class IngredientFactory:
    def create_dought(self) -> Ingredient:
        raise

    def create_sauce(self) -> Ingredient:
        raise

    def create_cheese(self) -> Ingredient:
        raise

    def create_veggies(self) -> Ingredient:
        raise

    def create_pepperoni(self) -> Ingredient:
        raise

    def create_clams(self) -> Ingredient:
        raise


class ChicagoIngredientFactory(IngredientFactory):
    def create_dought(self) -> Ingredient:
        return Dough()

    def create_sauce(self) -> Ingredient:
        return Sauce()

    def create_cheese(self) -> Ingredient:
        return Cheese()

    def create_veggies(self) -> Ingredient:
        return Veggies

    def create_pepperoni(self) -> Ingredient:
        return Pepperoni()

    def create_clams(self) -> Ingredient:
        return Clams


class NYIngredientFactory(IngredientFactory):
    def create_dought(self) -> Ingredient:
        return Dough()

    def create_sauce(self) -> Ingredient:
        return Sauce()

    def create_cheese(self) -> Ingredient:
        return Cheese()

    def create_veggies(self) -> Ingredient:
        return Veggies

    def create_pepperoni(self) -> Ingredient:
        return Pepperoni()

    def create_clams(self) -> Ingredient:
        return Clams
