# **Tesztjegyzőkönyv**

## *Backend tesztelés*

A szoftver backend része unit tesztekkel lett ellátva.

A különböző aritmetikai operátorok minden része le lett fedve.

Tesztelve lettek az összeadás/kivonás/szorzás/osztás/hatványozás/gyökvonás operátorok.

Az operátorok bementül kaptak egész illetve lebegőpontos számokat is.

Így az egységtesztelés eredményét tekintve teljes lefedettséget nyújt a programunk a lebegőpontos és az egész számok esetén is. 

## **Elvárások**
Jelen dokumentum célja, hogy az Számológép megvalósítása projektben a program
tesztelési elvárásait ismertesse. \
A projekt sikeres befejezésének eszköze a tesztelési terv és a tesztelési jegyzőkönyvek. A
tesztelési jegyzőkönyvekben részletezett tulajdonságok megfelelése, valamint a
Szerződésben hivatkozott dokumentációk átadása esetén kerül sor a Szerződésben szereplő
végteljesítés-igazolás Végső Kedvezményezett általi ellenjegyzésre. \

Összefoglalásként kiemelhető, hogy akkor tekinthető egy adott részrendszer tesztelése
sikeresnek, ha
- a tesztelési jegyzőkönyvek mezői 98%-ban MEGFELELT minősítésűek, azaz
- a specifikációban elfogadott funkciók működnek (a rendszer az előre definiált
eredményt adja előre definiált bemeneti adatok esetében – funkcionális teszt),
- a rendszerfunkciók specifikált paramétereinek mért értékei az elvárásoknak
megfelelő teljesítmény-határértékek között vannak (mért válaszidő vagy elvégzési
idő kisebb az előre definiált válasz- vagy elvégzési időnél – terheléses teszt).
- a manuális tesztek során legalább 98%-ban MEGFELELT a program

## *Tesztelés menete*

### *Rendszerteszteléshez kapcsolódó határidők*
| *Sorszám* | *Tevékenység részletezése* | *Határidő* |
| ----------- | ----------- | ----------- |
| 1.| A kifejlesztett funkcionalitás szállító oldali tesztelésének lezárása, az átadás-átvételi folyamat megkezdése.  | - |
| 2.| A rendszerek átadás-átvételi folyamatának lezárása. (Rendszerspecifikus átadás-átvételi tesztek elvégzése, eredmények ellenőrzése és ellenjegyzése.)  | - |
| 3.| A kifejlesztett funkcionalitás éles üzembe állítása | - |

## *Tesztelési folyamat leírása*

A tesztelési folyamat váza:
- előzetes tesztek validálása, elfogadása: termék megfelelőségek vizsgálata, összevetés az
adott specifikációkkal (amennyire lehet, ki kell terjednie a felhasznált eszközök szintjére),
- tesztelési folyamatok ellenőrzése, elfogadása
- tesztek műszaki kiértékelése – a kapott eredmények megfelelősségének vizsgálata.

A jelenlegi projektben kialakított rendszerek tesztelését szoftverfejlesztői csapat végzi. A tesztelési tervek kitérnek az elvégezendő fejlesztői, felhasználói, funkcionálási és egyéb tesztek folyamatára, ütemezésére. \
A tesztelés jelen projektben funkcionális tesztelést jelent. \ 
A tesztek fő szempontja funkcionális és technikai ellenőrzés, melyeket
követően a szükséges javítások elvégzésére kerül sor. A tesztekről tesztelési jegyzőkönyvek
készülnek.
Az átadás-átvételi tesztek megkezdését kezdeményezni a sikeres, előzetesen Végső
kedvezményezettnek átadott és előzetesen egyeztetett tesztelési metódus alapján végzett vállalkozói
tesztelési jegyzőkönyvek birtokában lehetséges. \
Az átadás-átvételi tesztek lebonyolítása Végső kedvezményezett minőségbiztosítójának a feladata, itt
a Vállalkozó részéről csak a tesztekben való közreműködés és a feltárt hibák elhárítása az elvárt. A
teszteket a Minőségbiztosítási tervnek megfelelően kell elvégezni. \
Az átadás-átvétel akkor tekinthető sikeresnek, ha az átadás-átvételre felajánlott rendszerek a
Rendszertervekben, valamint a Minőségbiztosítási tervben foglalt feltételeknek megfelelnek.

<h2>Funkciótesztjegyzőkönyv</h2>
<table>
    <tr>
        <td>Rendszer megnevezése</td>
        <td>Számológép</td>
    </tr>
    <tr>
        <td>Tesztelés várható időtartama</td>
        <td>1 nap</td>
    </tr>
    <tr>
        <td>Tesztelés erőforrás-szükséglete Vállalkozó oldalon</td>
        <td>Alacsony</td>
    </tr>
    <tr>
        <td>Tesztelés erőforrás-szükséglete Végső Kedvezményezett oldalán</td>
        <td>Alacsony</td>
    </tr>
</table>

<table>
    <tr>
        <td>Sorszám</td>
        <td>Funkció leírása</td>
        <td>Vizsgálat módja/eszköze</td>
        <td>Elvárt eredmény</td>
        <td>Eredmény</td>
        <td>Megfelelősség státusza [Megfelelő, Pótlás határideje:]</td>
    </tr>
    <tr>
        <td>Általános funkcionális teszt</td>
    </tr>
    <tr>
        <td>1.</td>
        <td>Összeadás</td>
        <td>JUnit teszt során teszteljük az összeadás függvényt a következő számokkal: 10, 10</td>
        <td>20</td>
        <td>20</td>
        <td>Megfelelő</td>
    </tr>
    <tr>
        <td>2.</td>
        <td>Összeadás</td>
        <td>JUnit teszt során teszteljük az összeadás függvényt a következő számokkal: 10.5, 10.5</td>
        <td>21</td>
        <td>21</td>
        <td>Megfelelő</td>
    </tr>
    <tr>
        <td>3.</td>
        <td>Összeadás</td>
        <td>JUnit teszt során teszteljük az összeadás függvényt a következő számokkal: 10, 10.5</td>
        <td>20.5</td>
        <td>20.5</td>
        <td>Megfelelő</td>
    </tr>
    <tr>
        <td>4.</td>
        <td>Összeadás</td>
        <td>JUnit teszt során teszteljük az összeadás függvényt a következő számokkal: 10.5, 10</td>
        <td>20.5</td>
        <td>20.5</td>
        <td>Megfelelő</td>
    </tr>
    <tr>
        <td>5.</td>
        <td>Kivonás</td>
        <td>JUnit teszt során teszteljük az kivonás függvényt a következő számokkal: 20, 10</td>
        <td>10</td>
        <td>10</td>
        <td>Megfelelő</td>
    </tr>
    <tr>
        <td>6.</td>
        <td>Kivonás</td>
        <td>JUnit teszt során teszteljük az kivonás függvényt a következő számokkal: 20, 10.5</td>
        <td>9.5</td>
        <td>9.5</td>
        <td>Megfelelő</td>
    </tr>
    <tr>
        <td>7.</td>
        <td>Kivonás</td>
        <td>JUnit teszt során teszteljük az kivonás függvényt a következő számokkal: 20.5, 10</td>
        <td>10.5</td>
        <td>10.5</td>
        <td>Megfelelő</td>
    </tr>
    <tr>
        <td>8.</td>
        <td>Kivonás</td>
        <td>JUnit teszt során teszteljük az kivonás függvényt a következő számokkal: 20.5, 10.5</td>
        <td>10</td>
        <td>10</td>
        <td>Megfelelő</td>
    </tr>
    <tr>
        <td>9.</td>
        <td>Szorzás</td>
        <td>JUnit teszt során teszteljük az szorzás függvényt a következő számokkal: 5, 5</td>
        <td>25</td>
        <td>25</td>
        <td>Megfelelő</td>
    </tr>
    <tr>
        <td>10.</td>
        <td>Szorzás</td>
        <td>JUnit teszt során teszteljük az szorzás függvényt a következő számokkal: 5.5, 5.2</td>
        <td>28.6</td>
        <td>28.6</td>
        <td>Megfelelő</td>
    </tr>
    <tr>
        <td>11.</td>
        <td>Szorzás</td>
        <td>JUnit teszt során teszteljük az szorzás függvényt a következő számokkal: 5, 5.5</td>
        <td>27.5</td>
        <td>27.5</td>
        <td>Megfelelő</td>
    </tr>
    <tr>
        <td>12.</td>
        <td>Szorzás</td>
        <td>JUnit teszt során teszteljük az szorzás függvényt a következő számokkal: 5.5, 5</td>
        <td>27.5</td>
        <td>27.5</td>
        <td>Megfelelő</td>
    </tr>
    <tr>
        <td>13.</td>
        <td>Osztás</td>
        <td>JUnit teszt során teszteljük az osztás függvényt a következő számokkal: 10, 10</td>
        <td>1</td>
        <td>1</td>
        <td>Megfelelő</td>
    </tr>
    <tr>
        <td>14.</td>
        <td>Osztás</td>
        <td>JUnit teszt során teszteljük az osztás függvényt a következő számokkal: 10.5, 3.5</td>
        <td>3</td>
        <td>3</td>
        <td>Megfelelő</td>
    </tr>
    <tr>
        <td>15.</td>
        <td>Osztás</td>
        <td>JUnit teszt során teszteljük az osztás függvényt a következő számokkal: 10.5, 2</td>
        <td>3.5</td>
        <td>3.5</td>
        <td>Megfelelő</td>
    </tr>
    <tr>
        <td>16.</td>
        <td>Osztás</td>
        <td>JUnit teszt során teszteljük az osztás függvényt a következő számokkal: 10, 2.5</td>
        <td>4</td>
        <td>4</td>
        <td>Megfelelő</td>
    </tr>
    <tr>
        <td>17.</td>
        <td>Hatványozás</td>
        <td>JUnit teszt során teszteljük az hatványozás függvényt a következő számokkal: 10, 2</td>
        <td>100</td>
        <td>100</td>
        <td>Megfelelő</td>
    </tr>
    <tr>
        <td>18.</td>
        <td>Hatványozás</td>
        <td>JUnit teszt során teszteljük az hatványozás függvényt a következő számokkal: 10.2, 2.2</td>
        <td>165.546</td>
        <td>165.546</td>
        <td>Megfelelő</td>
    </tr>
    <tr>
        <td>19.</td>
        <td>Hatványozás</td>
        <td>JUnit teszt során teszteljük az hatványozás függvényt a következő számokkal: 10.2, 2</td>
        <td>104.04</td>
        <td>104.04</td>
        <td>Megfelelő</td>
    </tr>
    <tr>
        <td>20.</td>
        <td>Hatványozás</td>
        <td>JUnit teszt során teszteljük az hatványozás függvényt a következő számokkal: 10, 2.2</td>
        <td>4.54</td>
        <td>4.54</td>
        <td>Megfelelő</td>
    </tr>
    <tr>
        <td>21.</td>
        <td>Gyökvonás</td>
        <td>JUnit teszt során teszteljük az gyökvonás függvényt a következő számokkal: 9, 2</td>
        <td>3</td>
        <td>3</td>
        <td>Megfelelő</td>
    </tr>
    <tr>
        <td>22.</td>
        <td>Gyökvonás</td>
        <td>JUnit teszt során teszteljük az gyökvonás függvényt a következő számokkal: 9.5, 2.5</td>
        <td>2.46</td>
        <td>2.46</td>
        <td>Megfelelő</td>
    </tr>
</table>