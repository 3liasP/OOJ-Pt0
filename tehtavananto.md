# Tehtävänanto - Kertaustehtävät

## Tehtävä 1

Asenna joko kurssin virtuaalinen kehitysalusta tai omaan järjestelmääsi kurssin työkalut `javac`,
`git` ja `mvn`. Työkalujen teoria ja asennuslinkit (ohjaa kurssin DTEK0065 sivulle) sijaitsevat 
luentomateriaalin osassa 2 (kurssiportaalin kurssisivun yläreunassa navigointi).

Kun olet saanut ohjelmat käyttövalmiiksi, aja seuraavat komennot ja ota talteen komentojen tulosteet:
```
$ mvn --version
$ javac -version
```

Seuraavaa komentoa varten sinun tulee konfiguroida myös tarvittaessa gitiin oma 
käyttäjätunnuksesi (kuvattu DTEK0065-materiaalissa). Varmista myös että testi-hakemistoa ei ole olemassa jo 
ennalta tai ohjeistus ei todennäköisesti toimi.

```
$ git init testi
$ cd testi
$ echo testi > testi
$ git add testi
$ git commit -m testi
$ git log
```

Aja nyt jshell, jolla luot muuttujat a ja b arvoihin 12 ja 34 alustettuna sekä koodin, jolla
tulostat kummankin muuttujan sisällön (Jshelliin voi kirjoittaa suoraan java-koodia interaktiivisesti). 
Kopioi talteen esim. hiirellä maalaamalla kaikki kirjoittamasi syöte ja koneen tulosteet
siinä muodossa kuin ne näkyvät komentorivi-ikkunassa. 

Kokoa em. tekstit dokumentiksi, jonka sisällytät palautettavaan zip-tiedostoon. Mikäli et tee
muita tehtäviä, palauta pelkkä dokumentti pdf-muodossa. Muussa tapauksessa helpointa lienee
sisällyttää dokumentti git-projektiin tiedostoksi (`git add dokumentti.pdf`) ja zipata projekti
normaalisti.

### Pisteytys

- Kaikkien vaadittujen ohjelmien onnistunut asennus, 1 piste
- Git-komentojen käyttö lokin ja oikeanlaisen zip-paketin tuottamiseksi, 1 piste 
- yhteensä: 2 pistettä

---

## Tehtävä 2

Tee projektin mukana tulevaan `Main`-luokkaan uusi metodi nimeltään `readArraySize`. 
Laadi metodiin toiminnallisuus, joka lukee käyttäjältä kaksi positiivista kokonaislukua, jotka ovat 
arvoltaan vähintään yksi ja tulkitsee syötteen luvuiksi (Javan tyyppi `int`). Muista varmistaa, 
että syötteenä saatu luku on suurempi tai yhtä suuri kuin yksi. Jos syöte ei täytä vaatimuksia, 
pyydetään lukua uudelleen.

Palauta luvut metodista `int`-tyyppisenä taulukkona (`Array`). Kutsu luomaasi metodia main-metodissa ja 
talleta paluuarvo muuttujaan.

### Pisteytys

- metodi luotu oikein ja sitä käytetään `main`-metodissa oikein, 1 piste
- syöte luetaan oikein, 1 piste 
- virhetilanteet käsitellään (luettu syöte ei ole kokonaisluku tai arvo on < 1), 1 piste
- luetut merkkijonot muunnetaan oikein kokonaisluvuiksi, 1 piste
- yhteensä: 4 pistettä

---

## Tehtävä 3

Tee `Main`-luokkaan uusi metodi nimeltään `readArrayData`, joka ottaa 
vastaan kaksi kokonaislukutyyppistä parametria `xSize` ja `ySize`. 
Metodin tarkoitus on pyytää käyttäjältä syötteenä kokonaislukuja ja 
täyttää niillä `xSize` x `ySize` -kokoinen taulukko.

Laadi metodiin toiminnallisuus, joka lukee käyttäjältä niin monta 
kokonaislukua, että edellä mainittu taulukko saadaan täyteen. Jos syöte 
ei ole luku, pyydetään lukua uudelleen. Palauta luvut metodista `int`-tyyppisenä taulukkona (`Array`). 
Taulukon koon tulee vastata metodille parametrinä annettua kokoa. 

Kutsu luomaasi metodia `main`-metodissa ja anna sille syötteeksi tehtävässä 
2 luetut luvut. Jos et ole tehnyt tehtävää 2, anna syötteeksi kaksi satunnaista, 
itse keksimääsi lukua. Talleta paluuarvo muuttujaan.

### Pisteytys

- metodi luotu oikein ja sitä käytetään `main`-metodissa oikein, 1 piste
- syöte luetaan oikein ja luodun taulukon koko on oikein, 1 piste
- virhetilanteet käsitellään (luettu syöte ei ole kokonaisluku tai arvo on < 1), 1 piste
- luetut merkkijonot muunnetaan oikein kokonaisluvuiksi, 1 piste
- yhteensä: 4 pistettä

---

## Tehtävä 4

Tee `Main`-luokkaan uusi metodi nimeltään `checkArrayData`. Metodi ottaa parametrinä vastaan
kokonaislukutyyppisen taulukon. Luo metodiin toiminnallisuus, joka tarkastaa, ovatko taulukon 
kaikki jäsenet positiivisia. Jos taulukosta löytyy negatiivinen luku, se muutetaan itseisarvokseen.

Palauta luvut metodista `String`-tyyppisenä taulukkona (`Array`). Taulukon koon
tulee vastata metodille parametrinä annetun taulukon kokoa.

Kutsu luomaasi metodia `main`-metodissa. Anna metodille argumentiksi Tehtävässä 3 luettu taulukko.
Jos et ole tehnyt tehtävää 3, anna argumentiksi muuttuja `teht4Array`. Talleta paluuarvo muuttujaan.

### Pisteytys

- metodi luotu oikein ja sitä käytetään main-metodissa oikein, 1 piste
- positiivisuus vaatimus käsitelty oikein, 1 piste
- taulukko muunnettu merkkijonotyyppiseksi, 1 piste
- yhteensä: 3 pistettä

---

## Tehtävä 5

Tee Main-luokkaan uusi metodi nimeltään `printArray`. Metodi ottaa parametrina vastaan
merkkijonotyyppisen taulukon. Tulosta metodissa syötteenä saatu taulukko taulukkomuotoon. 
Sarakkeet tasataan oikealle.

Jos syötteenä saadaan 4x5-taulukko, tulee tulosteen muotoilun näyttää esimerkiksi tältä:
```
 1 456 6 5678 23
23  22 6    2  2
 3   1 5   44  6
55   3 8    3  2
```

Kutsu luomaasi metodia `main`-metodissa. Anna metodille argumentiksi tehtävässä 3 luettu taulukko.
Jos et ole tehnyt tehtävää 3, anna argumentiksi muuttuja `teht5Array`.


### Pisteytys

- metodi luotu oikein ja sitä käytetään `main`-metodissa oikein, 1 piste
- numerot tulostuvat oikeassa järjestyksessä riveittäin, 1 piste
- taulukon muotoilu on oikein, 1 piste
- yhteensä: 3 pistettä

---

## Tehtävä 6

Kuvitellaan, että meillä on tarvetta esittää lukukokoelmia sellaisella erikoisella vaatimuksella, että 
kokoelmaan tallennettujen lukujen summa saa olla enintään annetun ylärajan suuruinen. Tätä tarkoitusta
varten toteutamme luokan `RajoitettuLista`, jonka alkiot ovat kokonaislukuja. 

Listaa luotaessa annetaan yläraja (`maxSum`) sille, kuinka suuri listan sisältämien lukujen summa saa olla.
Uuden alkion lisääminen listaan onnistuu, mikäli listan sisältämien alkioiden summa olisi lisäyksen
jälkeen enintään `maxSum`. Muussa tapauksessa lisäys estetään, ja lista siis pysyy ennallaan.
Alkion lisäävä metodi palauttaa lisäksi totuusarvon `true`, mikäli lisäys onnistui, muussa tapauksessa
se palauttaa epätoden.

Ohessa on osittain toteutettu `RajoitettuLista`-luokka. Toteuta siihen metodit `laskeSumma` (laskee listan
alkioiden summan) ja `lisaa` (lisää uuden alkion listaan). Muuta toiminnallisuutta kuin nämä metodit ei 
tarvitse toteuttaa (luokasta puuttuu ja saa puuttua varsin tärkeitäkin metodeita). Voit testata listan
toimintaa vaikkapa seuraavanlaisella ohjelmanpätkällä:

```
public class Main {
	public static void main(String[] args) {
		RajoitettuLista l = new RajoitettuLista(10);
		l.lisaa(6);
		System.out.println(l);
		l.lisaa(5);
		System.out.println(l);
		l.lisaa(3);
		System.out.println(l);
		l.lisaa(1);
		System.out.println(l);
	}
}
```
Ohjelman pitäisi tulostaa seuraavanlaiset listan tilat: `[6] -> [6] -> [6, 3] -> [6, 3, 1]`, missä `"->"` ei
ole osa ohjelman tulostusta.

Lisätietoa: tehtävässä käytetään Javan standardikirjaston luokkaa `ArrayList`, josta löytyy tietoa mm.
seuraavilta sivuilta: https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/ArrayList.html
(Oraclen API-dokumentaatio), https://www.w3schools.com/java/java_arraylist.asp (esimerkkejä). Tehtävässä on
mahdollista käyttää myös ns. luokkaa `Stream` summan laskemiseen.

### Pisteytys

- Molemmista metodeista kaksi pistettä, jos ne on toteutettu oikein tai yksi piste, jos toteutuksessa on hyvin vähäisiä virheitä (esimerkiksi se voidaan hyväksyä, että lisäysmetodi vaatiikin, että alkioiden summan täytyy jäädä pienemmäksi kuin annettu yläraja, sen sijaan että yhtäsuuruus sallittaisiin tehtävänannon mukaisesti).
- yhteensä: 4 pistettä
