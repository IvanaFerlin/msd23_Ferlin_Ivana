# UEBUNG05: GIT	BRANCHING

## Warum werden Logging	Bibliotheken verwendet?

Logging-Bibliotheken wie Log4J werden verwendet, weil sie eine strukturierte und flexible Möglichkeit bieten, Informationen über den Zustand und das Verhalten einer Anwendung aufzuzeichnen. 
Fehlerbehebung, Überwachung, Audit-Trails, Analyse, Sicherheit

## Welche Loglevel gibt	es in Log4J und was hat	es damit auf sich?

Log4J bietet verschiedene Loglevel, die zur Klassifizierung der Bedeutung und Dringlichkeit von Lognachrichten verwendet werden. Hier sind die Loglevel in aufsteigender Reihenfolge der Dringlichkeit:
- TRACE: Detaillierte Informationen, die hauptsächlich für die Diagnose von Problemen und das Debuggen verwendet werden. Diese Nachrichten sind sehr ausführlich und enthalten typischerweise Daten über den internen Zustand der Anwendung.
- DEBUG: Informationen, die für das Debugging der Anwendung nützlich sind. Diese Nachrichten sind weniger ausführlich als TRACE-Nachrichten, aber immer noch detailliert genug, um bei der Problemdiagnose zu helfen.
- INFO: Allgemeine Informationen über den normalen Betrieb der Anwendung. Diese Nachrichten geben Auskunft über den Fortschritt der Anwendung und wichtige Ereignisse.
- WARN: Warnungen über potenziell problematische Situationen, die jedoch nicht sofortige Maßnahmen erfordern. Diese Nachrichten weisen auf mögliche Probleme hin, die in Zukunft zu Fehlern führen könnten.
- ERROR: Fehler, die ein Problem in der Anwendung darstellen, aber die Anwendung nicht zum Absturz bringen. Diese Nachrichten weisen auf Bedingungen hin, die behoben werden müssen.
- FATAL: Schwere Fehler, die dazu führen, dass die Anwendung abstürzt oder nicht mehr weiterarbeiten kann. Diese Nachrichten weisen auf schwerwiegende Probleme hin, die sofortige Aufmerksamkeit erfordern.
- OFF: Diese Stufe wird verwendet, um das Logging vollständig zu deaktivieren.

## Was für Konfigurationsmöglichkeiten bietet Ihnen log4J?

- Appenders: Appenders definieren, wohin die Lognachrichten geschrieben werden sollen.
- Layouts: Layouts definieren das Format der Lognachrichten.
- Filters: Filter bestimmen, welche Lognachrichten basierend auf bestimmten Kriterien weitergegeben oder verworfen werden.
- Loggers: Loggers sind Objekte, die Lognachrichten erstellen. Sie können spezifisch für verschiedene Teile der Anwendung konfiguriert werden und haben eine Hierarchie, die eine feingranulare Steuerung des Loggings ermöglicht. Jeder Logger kann einen Loglevel und eine Liste von Appenders haben.
- Configuration File: Log4J kann mithilfe einer Konfigurationsdatei konfiguriert werden, die in verschiedenen Formaten vorliegen kann