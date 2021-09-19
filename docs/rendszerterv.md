# Rendszerterv
## A rendszer célja

Az általunk létrehozni kívánt rendszer célja, hogy az Önök elvárásait elégítse ki a lehető legnagyobb mértékben.
Ennek a rendszernek a céljai a következők:
- Egy egyszerűbb matematikai műveletet megoldó hatékony rendszer megvalósítása.
- Az Önök által elképzelt számológépet létrehozni mint kinézetre, mint működésre.
- Helyes, pontos működés biztosítása.
- Minden említett művelet pontos és helyes megvalósítása.
- Önök jelenlegi helyzetét a kívánt helyzetté alakítani.

## A rendszer követelményei

A rendszer követelményei javarészt az olyan követelményeket foglal magába, melyek megvalósítását megcélozza a rendszerterv.
Ezek a következők:

|Modul| ID | Név |V.| Kifejtés|
|---|---|---|---|---|
|-| K01| Képes osztani|-|A számológép képes az osztás művelet elvégzésére.|
|-| K02| Képes szorozni|-|A számológép képes a szorzás művelet elvégzésére.|
|-| K03| Képes gyökvonásra|-|A számológép képes a gyökvonás művelet elvégzésére.|
|-| K04| Képes hatványozásra|-|A számológép képes a hatványozás művelet elvégzésére.|
|-| K05| Egyszerűen kezelhető rendszer|-|A számológép egyszerűen kezelhető az end-user számára.|
|-| K06| Képes legyen törölni|-|A számológép képes a törlés műveletre.|
|-| K07| Pontosan hibátlanul működjön|-|A számológép hibátlanul működik és pontosan végzi el a műveleteket.|
|-| K08| Egy letisztult, átlátható rendszer|-|A számológép egy letisztult felhasználói felülettel rendelkezzen.|

## Absztrakt domain modell

A rendszer fogalmai:
- Összeadás művelete.
- Kivonás művelete.
- Osztás művelete.
- Szorzás művelete.
- Hatványozás művelete.
- Gyökvonás művelete.

Rendszerünk egy JavaFX alkalmazás, melyben az MVC architektúrát követjük, és a felhasználói felületet FXML-ben hozzuk létre. 
Az MVC architektúra lényege: A rendszer három különböző részre osztható fel, ez a Modell, Nézet, és Vezérlő.
- A modell a rendszer működését tartalmazza, illetve adatokat.
- A vezérlő kapcsolatot teremt a modell illetve a nézet között, információt továbbít a két komponens között.
- A nézet felelős a modellben lévő adat megjelenítéséért.

A rendszer a következőképpen működne egy példa esetben:
- A felhasználó a felhasználói felületen beüt egy számot. Ekkor ezt feldolgozva megjelenítjük a kijelzőn.
- Amint beüt egy műveletet, akkor eldőlt, hogy mi lesz a művelet. Ezt is elmentjük. Ezután következik a második szám beolvasása.
- A második szám beolvasása az egyenlőség gomb megnyomásával ér véget. Ekkor a Vezérlő a Modell segítségével kiszámolja a megadott feladatot, és a visszatérő eredményt a nézet felé továbbítva megjeleníti a kijelzőn.

A rendszer fontosabb komponensei:
- Egy fő komponens, mely az alkalmazás indításáért felelős, és az FXML elindításáért.
- Modellt tartalmazó komponens, mely a Modell részét valósítja meg az alkalmazásnak.
- Vezérlőt tartalmazó komponens, mely a Vezérlésért felelős, a felhasználó által generált eseményekre egy helyes választ adni a modell segítségével.
- Nézetet tartalmazó FXML-t megvalósító komponens.
- Nézetet stilizáló CSS-ben megírt rész.