
# Euromillionen

**Dieses Programm generiert eine Anzahl von Tipps für die Euromillionen. Es verwendet die aktuelle Systemzeit in Millisekunden und berechnet die Summe der Ziffern um die Anzahl der Tipps zu bestimmen. Für jeden Tipp generiert es 5 zufällige Zahlen von 1 bis 50 und 2 Sternzahlen von 1 bis 12. Jeder Tipp wird in aufsteigender Reihenfolge sortiert. Schließlich werden die Tipps auf eine bestimmtern Art ausgegeben.**

## Installation

> Klone das Repository oder lade die Datei Euromillionen.java herunter.     
> Öffne ein Terminal oder eine Befehlszeile und navigiere zum Verzeichnis, in dem sich die Euromillionen.java-Datei befindet.   
> Kompiliere die Java-Datei mit dem Befehl: javac Euromillionen.java   
> Führe das kompilierte Programm aus mit dem Befehl: java Euromillionen

## Verwendung

Aktuelle Zeit in Millisekunden
````
long currentMs = System.currentTimeMillis();
````
Methode um die Anzahl der Tipss zu bekommen
````
private static int getCount(long currentMs) {
````
Methode um die Tipps zu erstellen
````
private static ArrayList<String> getTips(int count) {
````
Ausgabe: zum Beispiel:
````
Tipp 1: # [16, 18, 22, 28, 50] * [1, 9]

Tipp 2: # [8, 22, 26, 45, 47] * [2, 11]
````

### Möglichkeiten der Mitarbeit

- Fehlerberichte: Wenn du Fehler im Code findest oder unerwartetes Verhalten bemerkst, erstelle einen Fehlerbericht, damit ich das Problem beheben kann.
- Verbesserungsvorschläge: Wenn du Ideen hast, wie das Programm verbessert werden kann, teile sie gerne mit. Ich bin offen für Vorschläge zur Erweiterung oder Optimierung der Funktionalität.

## Hinweise

- *Unterstützung: Wenn du Fragen hast oder Unterstützung beim Verständnis des Codes benötigst, stehe ich gerne zur Verfügung, um zu helfen und weitere Informationen bereitzustellen.*
- *Feedback: Ich bin immer offen für Feedback und Vorschläge zur Verbesserung.*

## Autorinnen Informationen

[Meine Profilseite](https://github.com/IvanaFerlin/msd23_Ferlin_Ivana.git)  Link zur GitHub Profilseite

[FH Joanneum](https://www.fh-joanneum.at) Link zur Hochschule

# Übungen

- [Exercise 1](exercise1.md) Erstes README verfassen
- [Exercise 2](exercise2.md) Erste GIT Befehle anwenden
- [Exercise 3](exercise3.md) Maven (Java) Projektstruktur und Git
- [Exercise 4](exercise4.md) Source Code Testen