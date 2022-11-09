from pattern import Observer, DisplayElement

class DisplayCurrentConditions(Observer, DisplayElement):
    def __init__(self) -> None:
        super().__init__()

    def update(self, *, data: dict[str, float])  -> None:
        self.data = data
        self.display()

    def display(self) -> None:
        print(
            "Current conditions: " + str(self.data.get("temperature"))
            + "F degrees and " + str(self.data.get("humidity"))
            + r"% humidity"
        )

class DisplayTest(Observer, DisplayElement):
    def __init__(self) -> None:
        super().__init__()
    
    def update(self, *, data: dict[str, float])  -> None:
        self.data = data
        self.display()

    def display(self) -> None:
        print(
            "Test: " + str(self.data.get("temperature"))
            + "F degrees and " + str(self.data.get("humidity"))
            + r"% humidity " + str(self.data.get("pressure"))
        )

