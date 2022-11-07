from flys import FlyBehavior, FlyNotWay, FlyRocket
from quacks import QuackBehavior, QuackNotWay, QuackRocket

class Duck:
    fly_behavior = FlyBehavior
    quack_behavior = QuackBehavior

    def __init__(self) -> None:
        self.display()

    def display(self):
        print(self.__class__)

    def set_fly_behavior(self, fly_behavior: FlyBehavior):
        self.fly_behavior = fly_behavior

    def set_quack_behavior(self, quack_behavior: QuackBehavior):
        self.quack_behavior = quack_behavior

    def preform_fly(self):
        self.fly_behavior.fly(None)

    def preform_quack(self):
        self.quack_behavior.quack(None)

    def swim(self):
        print("I am swim!")


class ModelDuck(Duck):
    fly_behavior = FlyNotWay
    quack_behavior = QuackNotWay


class MallardDuck(Duck):
    fly_behavior = FlyRocket
    quack_behavior = QuackRocket
