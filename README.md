### Hexlet tests and linter status:
[![Actions Status](https://github.com/ev1-av1-ness/java-project-61/workflows/hexlet-check/badge.svg)](https://github.com/ev1-av1-ness/java-project-61/actions)

[![Maintainability](https://api.codeclimate.com/v1/badges/5dcf7435c37ca5569f99/maintainability)](https://codeclimate.com/github/ev1-av1-ness/java-project-61/maintainability)

# GAMES asciinemas:

## Список использованных технологий:
 * Java 17
 * Gradle 7.5.1

## Описание:
Brain Games это консольное приложение из 5 игр типа "квиз". 
Для выйгрыша игрок должен правильно ответить правильно на 3 вопроса подряд.

#### Чтобы запустить игры у себя, надо:
 1. Склонировать проект
 2. Открыть его в IDE
 3. Перейти из корня проекта в папку app ```cd app```
 4. Собрать дистрибутив командой installDist ```gradle installDist```
 5. Запустить игры  ```make run-dist```

#### Проект состоит из следующих игр:

##### Even Game ("Проверка на чётность")
Суть игры в следующем: пользователю показывается случайное число. 
И ему нужно ответить yes, если число чётное, или no — если нечётное

https://asciinema.org/a/yzmwv1TbtFyofi1sdRbP8BU5m
##### Calculator Game ("Калькулятор")
Суть игры в следующем: пользователю показывается случайное математическое выражение, которое нужно вычислить 
и записать правильный ответ.
Реализованы следующие операции: +, - и *.
Операции, как и числа, выбираются случайным образом.

https://asciinema.org/a/fcZmy6zQr41ErCGmfSAbindZN
##### The Greatest Common Divisor Game ("НОД")
Необходимо реализовать игру "наибольший общий делитель (НОД)".
Суть игры в следующем: пользователю показывается два случайных числа. 
Пользователь должен вычислить и ввести наибольший общий делитель этих чисел

https://asciinema.org/a/E9Z6nOAumIy7ACkPPSvX3tNs4
##### The Arithmetic Progression Game ("Арифметическая прогрессия")
Игроку показывается ряд чисел, образующий арифметическую прогрессию. Одно из чисел заменено двумя точками. 
Игрок должен определить это число.

https://asciinema.org/a/POZHgUZmvQsnM1qjO3mt8duFA
##### Prime Gameс("Простое ли число?")
Суть игры в следующем: пользователю показывается случайное число.
И ему нужно ответить yes, если число простое, или no — если нет.

https://asciinema.org/a/mPwVuurkZOpU7WQbczu68u6Ab
