# Produktion

Man stelle sich vor, ein Unternehmen möchte seine Produktion objektorientiert in Java darstellen.

Das Unternehmen stellt gewisse **Komponenten** her, die es an andere Unternehmen verkauft. Die einzelnen Komponenten bestehen jeweils aus beliebig vielen **Kleinteilen**, welche atomar sind, also selbst aus keinen weiteren Teilen bestehen. Das Unternehmen besitzt 2 **Produktionsstandorte,** Berlin und Potsdam mit jeweils 50 bzw. 30 Mitarbeitern und möchte wissen, welche Komponenten sie gleichzeitig an welchem Standort herstellen können.

Implementiere dafür die Klassen **Komponente**, **Kleinteil** und **Produktionsstandort** mit folgenden Eigenschaften:

Ein Kleinteil speichert seinen **Namen** und die Anzahl der **benötigten Mitarbeiter**, um dieses herzustellen. Diese sollen nach erstellen nicht mehr verändert werden könne, aber von anderen Klassen abrufbar sein.

Eine Komponente speichert seinen **Namen** und verwaltet ein **Feld mit Kleinteilen**, die benötigt werden, um dieses herzustellen. Ebenfalls soll es eine Methode **benoetigteMitarbeiter** besitzen, die ausrechnet, wie viele Mitarbeiter benötigt werden, um die Komponente herzustellen.

Außerdem sollen beide Teile (Kleinteil und Komponente) über eine Methode **istGleichesTeil** verfügen, die jeweils ein gleiches Teil (Kleinteil oder Komponente) als Parameter annehmen und schauen, ob es identisch ist.
Dabei wird bei einem Kleinteil geschaut, ob sowohl der **Name** als auch die **Anzahl an benötigten Mitarbeiten gleich** sind.
Bei einer Komponente wird geschaut, ob es aus den **gleichen Kleinteilen** besteht, wie die zu vergleichende Komponente.

Dafür bietet es sich an ein **Interface Teil (Tipp: Das Interface ist generisch)** zu erstellen, welches sowohl im Kleinteil als auch in der Komponente dafür sorgt, dass die Methode implementiert wird und genutzt werden kann

Der Produktionsstandort soll über einen **Namen**, **die Anzahl an Mitarbeiten** und einer **Liste von herstellbaren Kleinteilen** verfügen und dessen Zugriff ermöglichen. Zusätzlich soll gespeichert werden können, **ob sich ein Kleinteil in Produktion (Hier muss überlegt werden, wie gespeichert werden kann, dass sich ein Kleinteil in Produktion befindet, ohne dass die ursprüngliche Klasse Kleinteil verändert wird. Tipp: Vererbung) und** wie viele Mitarbeiter demnach aktuell verfügbar sind.

Dafür sollen folgende Methoden implementiert werden:

**addProduziertesTeil** nimmt ein Teil und fügt es der Liste an herstellbaren Komponenten an.

**kannProduziertWerden** überprüft, ob ein **Kleinteil** an dem Standort gebaut werden kann.

**kannProduktionStarten** überprüft, ob eine **Komponente** an dem Standort gebaut werden kann und genügend Mitarbeiter zur Verfügung stehen, um die Produktion zu starten.

**starteProduktion** nimmt eine Komponente als Input und startet, falls sie produziert werden kann, die Produktion der zugehörigen Kleinteile und speichert, dass sich diese in Produktion befinden. Sie reduziert ebenfalls die Anzahl der verfügbaren Mitarbeiter um die für jedes Kleinteil benötigten Mitarbeiter. Für den Fall, dass nicht genügend Mitarbeiter zur Verfügung stehen, um die Komponente zu produzieren schmeißt die Methode eine **MangelndeMitarbeiterExecption**, in welche die von Exception geerbte Methode **getMessage** überschrieben wird und eine passende Fehlermeldung zurückgibt, die angibt wie viele Mitarbeiter dem Standort fehlen, um die Komponente zu produzieren. Ebenfalls soll eine Methode **getDefizit** hinzugefügt werden, die die fehlenden Mitarbeiter als Zahl zurückgibt.

**beendeProduktion** beendet die Produktion eines Kleinteils und passt die Anzahl an verfügbaren Mitarbeitern an.

**istInProduktion** gibt Auskunft darüber, ob sich ein Kleinteil an dem Standort in Produktion befindet.

In einer neuen Klasse **Main** sollen nun in der main Methode zwei Radios hergestellt werden. Dafür werden die beiden Produktionsstandorte Berlin und Potsdam mit jeweils 50 bzw. 30 Mitarbeitern angelegt. Beide Radios haben die identischen Kleinteile, aber unterschiedliche Namen:

Kleinteil lautstaerkeRegler = new Kleinteil("lautstärkeRegler", 2);
Kleinteil antenne = new Kleinteil("antenne", 2);
Kleinteil fmEmpfaenger = new Kleinteil("fmEmpfänger", 5);
Kleinteil amEmpfaenger = new Kleinteil("amEmpfänger", 5);
Kleinteil bildschirm = new Kleinteil("Bildschirm", 10);

Anhand der Implementation der Methode **istGleichesTeil** sind die beiden Radios gleich?

Danach sollen die Kleinteile den beiden Produktionsstandorten Berlin und Potsdam, welche zuvor als Objekt initialisiert wurden hinzugefügt werden und dessen Produktion gestartet werden.
Wenn das starten der Produktion der beiden Radios an einem der beiden Standorte fehschlägt soll die Fehlermeldung der geschmissenen Exception ausgegeben werden.

Ansonsten kann man gerne noch mit den erstellten Klassen und Methoden rumspielen, aber ich denke man hat auch so ein besseres Gefühl fürs Programmieren bekommen.

Ein Variante der Implementierung findet sich hier:


[https://github.com/ItsZiroy/hwg_prog1/tree/master/src/Autoproduktion](https://github.com/ItsZiroy/hwg_prog1/tree/master/src/Autoproduktion)


**