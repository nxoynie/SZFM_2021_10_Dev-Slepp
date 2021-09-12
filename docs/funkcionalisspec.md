<h1>Funkcionális specifikáció</h1>

<h2>Jelenlegi helyzet leírása</h2>
<p>
Az önök leírása alapján arra jutottunk, hogy rendszerük effektívé tételének megvalósítása könnyen végrehajtható feladat számunkra.</br>
A termék egy olyan letisztult szoftver lesz amely képes a hiányos számításokat megoldani, így a jelenlegi helyzet problémáit kiküszöböli.</br>
A hagyományos számológépekkel ellentétben szoftveres megoldásunk sokkal hatékonyabb és gyorsabb megoldást fog biztosítani Önöknek.</br>
Abból a szempontból, hogy az egyes számítások a lehető leggyorsabban hajtódjanak végre a lehető legjobb módszerekkel fogjuk biztosítani.</br>
A gyökök és hatványok számolásának hiánya is megvalósul. A termékünk operációs rendszer meglétét kívánja majd, viszont a megkívánt rendszer független bármely gyártótól.</br>
</p>

<h2>Igényelt üzleti folyamatok modellje.</h2>
<p>Azért, hogy egyszerűbbé tegyük önök feladatait és ügyfeleik elégedettségét növeljük, egy olyan számológépet hozunk létre Önöknek, amely platformfüggetlen, felhasználóbarát valamint könnyen kezelhető.</br>
Ahhoz, hogy az ügyfeleik várakozása megszűnjön a mi termékünk abból a szempontból tud hozzájárulni, hogy a lehető leggyorsabb módszerekkel fogja végrehajtani az adott számításokat.</br>
A kezelőfelület egyszerű és egyértelmű lesz, bárki használati útmutató nélkül használatba tudja majd venni. Az aritmetikai feladatokat különböző gombok fogják jelölni egyértelműen.</br>
</p>

<h2>Vágyálom rendszer leírása:</h2>
<p>
    Az Önök által leírt vágyálmokat figyelembevéve, a következő dolgokra jutottunk: <br>
    A számológép az alapvető összeadás és kivonás mellett képes lesz szorzásra, osztásra, gyökvonásra, hatványozásra is. <br>
    A számológép törlési funkcióval is rendelkezni fog. <br>
    Egyszerűen használható, és hatékony számológépet készítünk. <br>
    A felhasználói felületet is letisztult, barátságosra tervezzük. <br>
    A számológép pontosan, és hibátlanul fog működni. <br>
</p>

<h2>A rendszerre vonatkozó szabályok leírása</h2>
<p>
    Az igények szerint a rendszer szabványos eszközökkel fog készülni, Java programozási nyelvben. <br>

<h2>Követelmény lista</h2>

|Modul| ID | Név |V.| Kifejtés|
|---|---|---|---|---|
|-| K01| Képes osztani|-|A számológép képes az osztás művelet elvégzésére.|
|-| K02| Képes szorozni|-|A számológép képes a szorzás művelet elvégzésére.|
|-| K03| Képes gyökvonásra|-|A számológép képes a gyökvonás művelet elvégzésére.|
|-| K04| Egyszerűen kezelhető rendszer|-|A számológép egyszerűen kezelhető az end-user számára.|
|-| K05| Képes legyen törölni|-|A számológép képes a törlés műveletre.|
|-| K06| Pontosan hibátlanul működjön|-|A számológép hibátlanul működik és pontosan végzi el a műveleteket.|
</p>

<h2>Forgatókönyvek</h2>
<ul>
<li> Szám beírása </li>
<li> Művelet megadása </li>
<li> Szám beírása </li>
<li> Egyenlőség/Enter </li> 
<li> Eredmény </li>
</ul>

<h2>Jelenlegi üzleti folyamatok modellje</h2>

A jelenlegi helyzetünkben a számológépünk csak összeadni és kivonni tud, illetve ezeknek a műveleteknek az eredményét megjeleníteni.\
Megállapítottuk, hogy a jövőbeli feladataink elvégzéséhez több funkcióra lenne szükség.\
A számok törlése nem lehetséges, új szám beirása csak akkor lehetséges, ha elvégezzük a műveletet a hibásan beírt számokkal. \
A szorzás helyett eddig használt ismételt összeadás elavult és lassítja a folyamatot.\
Az osztás és a bonyolultabb műveletek elvégzése jelenleg lehetetlen.\
A kinézet elfogadható, de nem intuitív.

<h2>Használati esetek</h2>

Az alkalmazás felhasználói akkor használják azt, ha egy vagy több matematikai műveletet szeretnének elvégezni.\
Ezen műveletek elvégzése rendkivül fontos a cég számára, emiatt minden alkalmazottnak el kell érnie az alkalmazást és annak összes funkcióját.\
A felhasználók a múveletek elvégzése mellett már meglévő műveletek eredményét is ellenőrizhetik.\
Ha egy külső forrásból kapott művelet végeredménye gyanús, az alkalmazás lehetővé teszi ennek könnyed leelenőrzését.\
Az alkalmazást tehát fel lehet használni több módon is:\
1: Egy matematikai művelet kiszámitása, az eredmény késöbbi felhasználása céljából\
2: Egy művelet eredményének leelenőrzése, a hiba elkerülése végett



<h2>Fogalomszótár</h2>
   <p><strong>Összevonás:</strong> Az összeadás az a műveletet, melynek során két számból összeget képezünk.<br>
   <strong>Kivonás:</strong> Különbségnek nevezzük a kivonás eredményeként kapott számot.<br>
   <strong>Szorzás:</strong> Valamely mennyiséget, számot annyiszor veszünk összeadandóul, ahányszor a szorzó mutatja.<br>
   <strong>Osztás:</strong> Az osztás a szorzás fordított művelete. Osztást végzünk, ha tudjuk, hogy mennyi két szám szorzata, ismerjük az egyik tényezőt, és keressük a másikat.<br>
   <strong>Hatványozás:</strong> Ha a hatványozás kitevője pozitív egész szám, akkor a hatványozást egy olyan speciális szorzatként definiáltuk, amelyben a tényezők megegyeznek és a tényezők száma a hatványkitevő értékével egyezik<br>
   <strong>Gyökvonás:</strong> A gyökvonás egy matematikai művelet, a hatványozás egyik megfordított (inverz) művelete. Mikor egy számból n-edik gyököt vonunk, olyan számot keresünk, amelyet az n-edik hatványra emelve visszaadja az eredeti számot (ilyen szám nem mindig létezik).</p>


