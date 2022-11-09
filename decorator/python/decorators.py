from beverages import Beverage


class Addition(Beverage):
    description: str = """Addition"""
    price: float = 0

    def __init__(self, beverage: Beverage) -> None:
        super().__init__()
        self.beverage: Beverage = beverage
    
    def get_description(self) -> str:
        return self.beverage.get_description() + ", " + self.description

    def cost(self) -> float:
        return self.beverage.cost() + self.price


class Mocha(Addition):
    description: str = """Mocha"""
    price: float = 0.7


class Soy(Addition):
    description: str = """Soy"""
    price: float = 0.5


class Whip(Addition):
    description: str = """Whip"""
    price: float = 0.3

