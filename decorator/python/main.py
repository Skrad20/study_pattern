from decorators import Soy, Mocha, Whip
from beverages import Espresso, HouseBlend

def main():
    beverage = Espresso()
    beverage = Mocha(beverage)
    beverage = Mocha(beverage)
    beverage = Mocha(beverage)
    print(beverage.get_description() + " $ " + str(beverage.cost()))

    beverage = HouseBlend()
    beverage = Mocha(beverage)
    beverage = Soy(beverage)
    beverage = Whip(beverage)
    print(beverage.get_description() + " $ " + str(beverage.cost()))


if __name__ =="__main__":
    main()