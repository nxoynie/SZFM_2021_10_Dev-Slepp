# Rendszerterv
<h2>Fizikai környezet</h2>
<ul>
<li> Az számológép a könnyű hozzáférhetőség és gyors működés érdekében több operációs rendszer környezetében is futtatható alkalmazás lesz</li>
<ul>
    <li>Windows környezet alatt</li>
    <li>Linux környezet alatt</li>
    </ul>
<li>Ajánlott Architektúrák:</li>
    <ul>
    <li>ARM</li> 
    <li>ARM64</li>
    <li>x64</li>
    <li>x86</li>
    </ul>
<li> Csak saját komponenseket használunk fel</li>
<li>Fejlesztői eszközök:</li>
<ul>
    <li>Visual Studio</li>
    <li>Intellij</li>
    <li>Github</li>
    <li>Trello</li>
    </ul>
</ul>
<h2>Implementációs terv</h2>
<ul>
<li>Az alkalmazás megirásához a Java programozási nyelvet használjuk fel. Ennek főbb okai:</li>
<ul>
<li>A Java egy moduláris nyelv, megkönnyíti a csapatban való munkát
<li>Platform független. Működik bármilyen operációs rendszeren, ha azon van egy JVM (Java Virtual Machine)
<li>Objektum orientált
</ul>
<li>A számológép kinézetét JavaFX Scene Builderrel valósítjuk meg</li>
<ul><li>A kinézet a Funkcionális specifikációban megaddottak alapján fog kinézni</li></ul>
<li>A programban osztályok segítségével jutunk el a célhoz
</ul>