# Rendszerterv

Az alábbi specifikáció tartalmazza az Önök által megálmodott renszert, amely leírja, hogy
mit (rendszer), miért (rendszer célja), hogyan (terv), mikor (időpont) és miből
(erőforrások) akarunk a jövőben létrehozni. 

A fejezetek részletes tájékoztatót nyújtanak az elképzeléseinkről az Önök specifikációja alapján.


## Üzleti folyamatok modellje

A rendszer üzleti modellje tartalmazza mindazon műveleteket amelyeket a felhasználó végre tud majd hajtani. 
- Műveletek végrehajtása
- Nincs közvetlen elérése a hibakezeléshez.
- A számítás végrehajtása után a felhasználó számára biztosított az eredmémy megjelenítése. 

A lent megjelenített ábra vizuálisan tartalmazza ezeknek a folyamatoknak egy gráfos ábrázolását.

A közvetlen elérhető modulok nyíllal kapcsolódnak egymáshoz.
<br />
<p align="center">
  <img src="images/uzleti_logika.png">
</p>

## Funkcionális terv

A funkcionális tervezet alapján a jogosultságok és modulok elérése van szerepkörökre bontva.
A termék felhasználása szempontjából egy jogosultság és szerepkiosztás társul:

### Felhasználó

A felhasználó képes kezelni a szoftver teljes egészét.
Az alábbi szempontok elérhetőek számára:
- Számok összeadása
- Számok kivonása
- Számok szorzása
- Számok osztása
- Törlés


Miután a felhasználó az adott műveleteket elvégezte az egyenlőségjel lenyomásával látni fogja az eredményt megjelenítve.