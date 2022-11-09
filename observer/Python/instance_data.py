from pattern import Subject


class WeatherData(Subject):
    def __init__(self) -> None:
        super().__init__()
        self.data: dict[str, float] = {
            "temperature": 0.0,
            "humidity": 0.0,
            "pressure":0.0,
        }

    def get_temperature(self) -> float:
        return self.temperature

    def get_humidity(self) -> float:
        return self.humidity

    def get_pressure(self) -> float:
        return self.pressure

    def set_measurements(self, *, temperature: float, humidity: float, pressure: float) -> None:
        self.data["temperature"] = temperature
        self.data["humidity"] = humidity
        self.data["pressure"] = pressure
        self.measurements_changed()
