cd observer/Java
javac -d bin ./src/*
java -classpath ./bin observer.Java.src.WeatherStation
jar -cmf manifest.mf WeatherStation.jar  -C bin .