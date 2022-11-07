class FlyBehavior:
    def fly(self):
        print("I am fly")


class FlyRocket(FlyBehavior):
    def fly(self):
        print("I am fly with a rocket")


class FlyNotWay(FlyBehavior):
    def fly(self):
        print("I am not fly")

