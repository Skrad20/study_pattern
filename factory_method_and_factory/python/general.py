class PizzaStore:
    def order_pizza(self, type_pizza: str):
        pizza: Pizza = None
        pizza = self.create_pizza(type_pizza)
        pizza.prepare()
        pizza.bake()
        pizza.cut()
        pizza.box()

        return pizza

    def create_pizza(self, type_pizza: str):
        pizza: Pizza = None 
        return pizza


class Pizza:
    name: str = "Pizza"
    dough: str = "New"
    sauce: str = "Arabika"
    toppings: list = []


    def prepare(self):
        print("Preparing")
        for ingred in self.toppings:
            print(ingred)
    
    def bake(self):
        print("Bake")
    
    def box(self):
        print("box")
    
    def cut(self):
        print("cut")

    def get_name(self):
        return self.name
