from general import Pizza, PizzaStore
from type_stores import NYPizzaStore, ChicagoPizzaStore


def main():
    nt_store: PizzaStore = NYPizzaStore()
    chicago_store: PizzaStore = ChicagoPizzaStore()

    pizza: Pizza = nt_store.order_pizza("chees")
    print(pizza.get_name())

    pizza: Pizza = chicago_store.order_pizza("chees")
    print(pizza.get_name())

if __name__ == "__main__":
    main()