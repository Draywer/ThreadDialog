#### Домашнее задание к занятию 1.1 Многопоточное (параллельное) программирование. Работа с потоками
#### Задача 1. Межпоточный диалог

```text
"C:\Program Files\JetBrains\IntelliJ IDEA 2019.2\jbr\bin\java.exe" "-javaagent:C:\Program Files\JetBrains\IntelliJ IDEA 2019.2\lib\idea_rt.jar=53822:C:\Program Files\JetBrains\IntelliJ IDEA 2019.2\bin" -Dfile.encoding=UTF-8 -classpath C:\Users\User\IdeaProjects\ThreadDialog\target\classes;C:\Users\User\.m2\repository\org\apache\httpcomponents\httpclient\4.5.12\httpclient-4.5.12.jar;C:\Users\User\.m2\repository\org\apache\httpcomponents\httpcore\4.4.13\httpcore-4.4.13.jar;C:\Users\User\.m2\repository\commons-logging\commons-logging\1.2\commons-logging-1.2.jar;C:\Users\User\.m2\repository\commons-codec\commons-codec\1.11\commons-codec-1.11.jar;C:\Users\User\.m2\repository\com\fasterxml\jackson\core\jackson-databind\2.12.1\jackson-databind-2.12.1.jar;C:\Users\User\.m2\repository\com\fasterxml\jackson\core\jackson-annotations\2.12.1\jackson-annotations-2.12.1.jar;C:\Users\User\.m2\repository\com\fasterxml\jackson\core\jackson-core\2.12.1\jackson-core-2.12.1.jar;C:\Users\User\.m2\repository\org\hamcrest\hamcrest-all\1.3\hamcrest-all-1.3.jar ru.idcore.Main
Thread-1 стартовал...
Thread-5 стартовал...
Thread-5: Сообщение 0
Thread-3 стартовал...
Thread-3: Сообщение 0
Thread-1: Сообщение 0
Thread-3: Сообщение 1
Thread-1: Сообщение 1
Thread-5: Сообщение 1
Thread-1: Сообщение 2
Thread-3: Сообщение 2
Thread-5: Сообщение 2
Thread-3 прерван...
Thread-5 прерван...
Thread-1 прерван...

Process finished with exit code 0
```