class Subject:
    def __init__(self) -> None:
        self.list_observers: list[Observer] = []
        self.data: dict[str, float] = {}

    def measurements_changed(self) -> None:
        self.notify_observers()
    
    def notify_observers(self) -> None:
        for observer in self.list_observers:
            try:
                observer.update(
                    data = self.data
                )
            except Exception as e:
                print(e)
                print(f"Объект {observer} не имеет метода update")
    
    def register_observer(self, observer) -> None:
        self.list_observers.append(observer)
        
    
    def remove_observer(self, observer) -> None:
        if observer in self.list_observers:
            self.list_observers.remove(observer)
        else:
            print("Такой объект не подписан на обновления!")


class Observer:
    def __init__(self) -> None:
        self.obj: Subject = None

    def update(self, *, data: dict[str, float]) -> None:
        pass

    def subscribe(self, obj: Subject) -> None:
        self.obj = obj
        self.obj.register_observer(self)


class DisplayElement:
    def __init__(self) -> None:
        self.data: dict[str, float] = {}

    def display(self) -> None:
        print("Hello, I am start display function.")
