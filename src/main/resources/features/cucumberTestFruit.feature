#language: ru

Функция: Добавление товара типа 'Фрукт' в список

@all
Сценарий: Успешное добавление товара типа "Фрукт"
* загружен драйвер
* открыт сайт "https://qualit.appline.ru/"
* страница загружена
* окно браузера настроено
* перейти во вкладку "Песочница" и выбрать раздел "Товары"
* нажать на кнопку "Добавить"
* ввести название "Маракуйя" в поле ввода имени товара
* выбрать тип товара "Фрукт"
* поставить галочку "Экзотический" если "нажать_на_чек_бокс" равно "Да"
* нажать на кнопку сохранить
* проверить что добавленный товар отображается в таблице под номером 5
* перейти во вкладку "Песочница" и выбрать раздел "Товары"
* нажать на кнопку "Добавить"
* ввести название "Груша" в поле ввода имени товара
* выбрать тип товара "Фрукт"
* нажать на кнопку сохранить
* проверить что добавленный товар отображается в таблице под номером 6
* перейти во вкладку "Песочница" и выбираю раздел "Сброс данных"
* закрыть страницу