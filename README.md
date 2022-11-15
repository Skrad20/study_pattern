# Паттерны проектирования 
Паттерны проектирования с примерами


# Краткое описание
В репозитории лежат подпроекты по паттерна проектирования. Они выполнены на Java, JacaScript, Python и C++
Сейчас добавлены паттерны:
* Стратегия
* Наблюдатели


# Паттерны
## Стратегия 
Стратегия — поведенческий шаблон проектирования, предназначенный для определения семейства алгоритмов, инкапсуляции каждого из них и обеспечения их взаимозаменяемости.

## Наблюдатель
Паттерн Наблюдатель определяет отношение «один-ко-многим» между объектами таким образом, 
что при изменении состояния одного объекта происходит автоматическое оповещение и обновление всех зависимых объектов.

## Декоратор
Паттерн Декоратор динамически наделяет объект новыми возможностями и является гибкой альтернативой субклассированию в области расширения функциональн


## Фабричный Метод 
Паттерн Фабричный Методопределяет интерфейс создания объекта, но позволяет субклассам выбрать класс создаваемого экземпляра. Таким образом, Фабричный Метод делегирует операцию создания экземпляра субклассам

## Абстрактная фабрика

# Принципы проектирования
* Cтремитесь к слабой связанности взаимодействующих объектов.
* Отдавайте предпочтение композиции перед наследованием: 
- Отношения наблюдателей с субъектом не определяются иерархией наследования, а задаются во время выполнения посредством композиции!
* Программируйте на уровне интерфейса, а не на уровне реализации:
- И субъект, и наблюдатели используют интерфейсы. Субъект отслеживает объекты, реализующие интерфейс Observer, 
а наблюдатели регистрируются и оповещаются через интерфейс Subject
* Выделите аспекты приложения, которые могут изменяться, и отделите их от тех, которые всегда остаются постоянными: 
- Переменные аспекты — состояние субъекта, количество и тип наблюдателей. Паттерн позволяет изменять объекты, зависящие от состояния субъекта, без изменения самого субъекта.
* Классы должны быть открыты для расширения, но закрыты для изменения.
- Согласно принципу открытости/закрытости системы должны проектироваться так, чтобы их закрытые компоненты были изолированы от новых расширений.
* Код должен зависеть от абстракций, а не от конкретных классов.