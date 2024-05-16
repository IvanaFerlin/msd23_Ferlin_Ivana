# Arbeitsschritte dokumentieren

**neue Datei exercise3.md erstellen**

*der .gitignore Datei den .idea Ordner hinzufügen*

## Neues Projekt in IntelliJ anlegen

- Java-Klasse Calculator erstellen
- Die Java-Klasse soll im Package gespeichert werden
- eine Main-Klasse innerhalb des gleichen Packages erstellen

## zusätzlicher Ordner im Projekt

![screenshot](resources\images\ex3_1.png)

>Target-Ordner enthält kompilierte Klassen, (enthält die generierten .class-Dateien, die aus dem Quellcode erstellt wurden)
und Ressourcen und andere Artefakte, die während des Build-Prozesses erstellt werden.

## Build-Plugin

### mvn compile

![screenshot](resources\images\ex3_2.png)
![screenshot](resources\images\ex3_2b.png)
![screenshot](resources\images\ex3_2a.png)

## Demo-Beispiel in der Konsole

Durchlauf mittels mvn exec:java

![screenshot](resources\images\ex3_3.png)

####  welche Dateien ins Repository gelangen sollen

*bzw. welche nicht hinzugefügt werden sollen. (gitignore)*