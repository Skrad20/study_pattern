class Singelton:
    __instance = None
    def __init__(self, number) -> None:
        self.number = number

    def __new__(cls, *args, **kwargs):
        if cls.__instance is None:
            cls.__instance = super().__new__(cls)
        
        return cls.__instance



def main():
    cls_1 = Singelton(1)
    print(cls_1.number)
    cls_2 = Singelton(2)
    print(cls_2.number)
    print(cls_1 is cls_2)
    cls_3 = Singelton(3)
    print(cls_3.number)
    cls_4 = Singelton().get_instance()

if __name__ == "__main__":
    print(__name__)
    main()