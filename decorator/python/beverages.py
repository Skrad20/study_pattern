
class Beverage:
    description: str = """Unknow"""
    price: float = 1.5

    def get_description(self) -> str:
        return self.description
    
    def cost(self) -> float:
        return self.price

class Espresso(Beverage):
    description: str = """Espresso"""
    price: float = 2

class HouseBlend(Beverage):
    description: str = """HouseBlend"""
    price: float = 3.1
