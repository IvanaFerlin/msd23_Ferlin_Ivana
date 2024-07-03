# UEBUNG06: DOCUMENTATION

## Was ist notwendig um Maven Site Dokumentation zu generieren? Welche unterschiedlichen Aspekte, Konfigurationen, Informationen, usw. werden in site.xml bzw. pom.xml konfiguriert?

### pom.xml

*Projektmetadaten:*

- groupId, artifactId, version: Identifizieren das Maven-Projekt eindeutig.
- name, description: Beschreibung des Projekts.
- packaging: Art der Erstellung (z.B. jar, war, pom).

*Abhängigkeiten (Dependencies):*

- dependencies: Listet alle externen Bibliotheken und deren Versionen auf, die das Projekt benötigt.

*Build-Konfiguration:*

- build: Konfiguration des Build-Prozesses, einschließlich Plugins, die während des Builds ausgeführt werden sollen.
- plugins: Spezifische Maven-Plugins und deren Konfiguration für bestimmte Aufgaben wie Kompilieren, Testen, Verpacken usw.

*Repositories:*

- repositories, pluginRepositories: Definitionen von Maven-Repositories, aus denen Abhängigkeiten und Plugins heruntergeladen werden können.

*Profil-Definitionen:*

- profiles: Profile für unterschiedliche Umgebungen oder Anforderungen, die spezifische Konfigurationen (wie Abhängigkeiten, Plugins) enthalten können.

*Konfiguration von Maven-Plugins:*

- Spezifische Konfigurationen für verschiedene Maven-Plugins, die im Build-Prozess verwendet werden.

**pom.xml: Wird in jedem Maven-Projekt verwendet, um die Projektmetadaten, Abhängigkeiten, Build-Konfigurationen und Maven-Plugins zu definieren, die für den Bau des Projekts benötigt werden.**


### site.xml

*Site-Dokumentation:*

- Konfiguration der Maven Site-Generierung, z.B. die Struktur der generierten Dokumentation, die Seitenlayouts, das Aussehen usw.

*Erweiterungen der Maven Site:*

- Anpassungen oder Erweiterungen der Standard-Maven-Site, z.B. Integration von benutzerdefinierten Berichten, Grafiken, zusätzlichen Informationen usw.

*Navigation und Inhalte:*

- Definition der Navigationsstruktur der Maven Site, einschließlich der Seiten, Menüs, Seitentitel, Verweise usw.

*Dokumentation der Konfiguration:*

- Beschreibung der Konfigurationsoptionen und der Funktionalität der Maven Site, die für die Endnutzer oder Entwickler relevant sein könnten.

**site.xml: Wird optional verwendet, um die Konfiguration und Anpassung der Maven Site zu steuern und zu definieren, wie die Projektdokumentation und -berichte auf der Maven Site präsentiert werden sollen.**

**Zusammenfassend** 
lässt sich sagen, dass pom.xml die Kernkonfigurationsdatei für jedes Maven-Projekt ist, während site.xml spezifische Anpassungen und Erweiterungen für die Maven Site-Dokumentation und Präsentation ermöglicht, die für die Benutzer der Projekte von Interesse sein könnten.


### Abbildungen
![good_style verlinkt](resources\images\ex6_1.png)
![Javadoc API-Hilfe](resources\images\ex6_2.png)
![Testauswertung](resources\images\ex6_3.png)
