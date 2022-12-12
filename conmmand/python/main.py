class ObjectHous:
    def __init__(self) -> None:
        self.output_text_on = "Test"
        self.output_text_off = "Test undo"

    def on(self):
        print(self.output_text_on)

    def off(self):
        print(self.output_text_off)



class Light(ObjectHous):
    def __init__(self) -> None:
        self.output_text_on = "Light "
        self.output_text_off = "Not light"


class Command:
    def __init__(self) -> None:
        self.object_command = ObjectHous()


class CommandOn(Command):
    def execute(self):
        self.object_command.on()

    def undo(self):
        self.object_command.off()


class CommandOff(Command):
    def execute(self):
        self.object_command.off()

    def undo(self):
        self.object_command.on()


class LightCommandOff(CommandOff):
    def __init__(self) -> None:
        self.object_command = Light()


class LightCommandOn(CommandOn):
    def __init__(self) -> None:
        self.object_command = Light()


class Controler:
    def __init__(self) -> None:
        self.commands_off: list[CommandOff] = [None for x in range(7)]
        self.commands_on: list[CommandOn] = [None for x in range(7)]

    def set_command(self, slot, on_func: CommandOn, off_func: CommandOff):
        if slot < 7 and slot > 0:
            self.commands_off[slot] = off_func
            self.commands_on[slot] = on_func

    def pushed_undo(self, slot):
        self.commands_off[slot].undo()

    def pushed_execute(self, slot):
        self.commands_on[slot].execute()




class Loader:
    def __init__(self) -> None:
        self.conroler = Controler()
        light_off = LightCommandOff()
        light_on = LightCommandOn()
        self.conroler.set_command(1, light_on, light_off)

    def button_on(self, slot):
        if slot < 7 and slot > -7:
            if slot > 0:
                self.conroler.pushed_execute(slot)
            else:
                self.conroler.pushed_undo(abs(slot))
    
    def button_off(self, slot):
        if slot < 7 and slot > -7:
            if slot > 0:
                self.conroler.pushed_undo(slot)
            else:
                self.conroler.pushed_execute(abs(slot))




if __name__ == "__main__":
    loader = Loader()
    operation = -9999
    while operation != 154:
   
        operation = int(input())
        loader.button_on(operation)