from ducks import MallardDuck, ModelDuck
from flys import FlyNotWay


def main():
    print("Mallard Duck")
    model = MallardDuck()
    model.preform_fly()
    model.preform_quack()
    model.set_fly_behavior(FlyNotWay)
    model.preform_fly()
    model.swim()
    print(10 * "-")
    print("Model Duck")
    model = ModelDuck()
    model.preform_fly()
    model.preform_quack()
    model.swim()

if __name__ == "__main__":
    main()

