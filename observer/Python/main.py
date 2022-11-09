from displays_example import DisplayCurrentConditions, DisplayTest
from instance_data import WeatherData

def main():
    WD = WeatherData()
    DCC = DisplayCurrentConditions()
    DT = DisplayTest()
    DCC.subscribe(WD)
    DT.subscribe(WD)
    WD.set_measurements(temperature=5.0, humidity=5.0, pressure=6.0)

if __name__ =="__main__":
    main()