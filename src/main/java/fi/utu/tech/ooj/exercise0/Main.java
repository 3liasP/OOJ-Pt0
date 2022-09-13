package fi.utu.tech.ooj.exercise0;

import java.util.Scanner;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.lang.Math;

public class Main {

    /**
     * Taulukot, joita voi käyttää mikäli ei teen kaikkia tehtäviä. Ohjeet tehtävänannossa.
     */
    // static int[][] teht4Array = {{1,456,6,-5678,23},{23,22,6,-2,2},{3,1,-5,44,6},{55,3,-8,3,2}};
    // static String[][] teht5Array = {{"1","456","6","5678","23"},{"23","22","6","2","2"},{"3","1","5","44","6"},{"55","3","8","3","2"}};

    /**
     * Tehtävä 2
     *
     * Metodi lukee syötteenä kaksi lukua 1 suurempaa kokonaislukua ja palauttaa ne taulukkona.
     *
     * @return Kokonaislukutyyppinen taulukko, jossa on kaksi arvoa 1 suurempaa alkiota
     */

    // TEE TÄHÄN TEHTÄVÄ 2

    // Tämä metodi toimii apuna metodille readArraySize()
    // Yksinkertainen toiminto, jolla tarkastetaan onko syöte tyyppiä int
    static boolean isInt(String s){
        try {
            int i = Integer.parseInt(s); return true; }
        catch(NumberFormatException er){
            return false; }
    }
    static int[] readArraySize() {
        Scanner sc = new Scanner(System.in);
        int num1;
        int num2;
        while(true){
            System.out.print("Anna 1. kokonaisluku (=>1) (leveys): ");
            String s = sc.nextLine();
            if(isInt(s)){
                num1 = Integer.valueOf(s);
                if (num1 < 1) {
                    System.out.println("Anna suurempi kokonaisluku tai yhtä suuri kuin 1!");
                } else {
                    break;
                }
            } else {
                System.out.println("Anna kokonaisluku!");
            }
        }
        while(true){
                System.out.print("Anna 2. kokonaisluku (=>1) (korkeus): ");
                String s = sc.nextLine();
                if(isInt(s)){
                    num2 = Integer.valueOf(s);
                    if (num2 < 1) {
                        System.out.println("Anna suurempi kokonaisluku tai yhtä suuri kuin 1!");
                    } else {
                        break;
                    }
                } else {
                    System.out.println("Anna kokonaisluku!");
                }
            }
        int[] arr={num1, num2};
        return arr;
    }

    /**
     * Tehtävä 3
     *
     * Metodi lukee syötteenä xSize*ySize kappaletta kokonaislukuja ja sijoittaa ne kokonaislukutyyppiseen
     * taulukkoon, joka palautetaan metodista.
     *
     * @param xSize Taulukon sarakemäärä
     * @param ySize Taulukon rivimäärä
     * @return xSize*ySize kokoinen kokonaislukutyyppinen taulukko, joka on täytetty kokonaisluvuilla
     */

    // TEE TÄHÄN TEHTÄVÄ 3
    static int[][] readArrayData(int xSize, int ySize){
        Scanner sc = new Scanner(System.in);
        int num;
        int[][] a = new int[xSize][ySize];
        int x = 0;
        int y = 0;
        int t = xSize * ySize;
        while (t > 0){
            while(true) {
                System.out.print("Anna kokonaisluku: ");
                String s = sc.nextLine();
                if(isInt(s)){
                    num = Integer.valueOf(s);
                        break;
                } else {
                    System.out.println("Tarkista syöte!");
                }
            }
            if (x < xSize) {
                a[x][y] = num;
            }
            x++;
            if (x == xSize) {
                y++;
                x = 0;
            }
            t--;
        }
        return a;
    }
    /**
     * Tehtävä 4
     *
     * Metodi tarkastaa, että argumenttina saadun taulukon kaikki alkiot ovat positiivisia. Jos jokin luku ei ole
     * positiivinen, se vaihdetaan itseisarvokseen.
     *
     * @param inputArray Kokonaislukutyyppinen taulukko
     * @return parametrinä saadun taulukon kokoinen merkkijonotyyppinen taulukko
     */

    // TEE TÄHÄN TEHTÄVÄ 4
    static String[][] checkArrayData(int[][] inputArray) {
        int[][] copiedInputArray = inputArray;
        for(int i=0; i<inputArray.length; i++) {
            for(int j=0; j<inputArray[i].length; j++) {
                if(inputArray[i][j] < 0){
                    int neg = Integer.valueOf(inputArray[i][j]);
                    copiedInputArray[i][j] = Math.abs(neg);
                }
            }
        }
        String[][] stringArray = new String[inputArray.length][];
        for(int i = 0; i < inputArray.length; i++){
            stringArray[i] = new String[inputArray[i].length];
            for(int j=0; j<inputArray[i].length; j++){
                stringArray[i][j] = Integer.toString(inputArray[i][j]); 
            }
        }
        return stringArray;
    }
    /**
     * Tehtävä 5
     * Metodi tulostaa argumenttina saamansa taulukon muotoillen sen taulukkomuotoon ja tasaten sarakkeet oikealle.
     *
     * @param inputArray Merkkijonotyyppinen taulukko
     * @return void
     */

    // TEE TÄHÄN TEHTÄVÄ 5
    // Metodi, jonka avulla sisennetään taulukon tuloste oikealle.
    static int alingRight(String[][] teht4Array, String num, int j) {
        int longest = 0;
        for(int i = 0; i < teht4Array.length; i++) {
            if (teht4Array[i][j].length() > longest) {
                longest = teht4Array[i][j].length();
            }
        }
        int indent = longest - num.length();
        return indent;
    }
    static void printArray(String[][] teht4Array) {
        String space = " ";
        for(int i = 0; i < teht4Array.length; i++) {
            for(int j = 0; j < teht4Array[i].length; j++) {
                if(j < teht4Array[i].length - 1) {
                    int indent = alingRight(teht4Array, teht4Array[i][j], j);
                    System.out.print(" " + (space.repeat(indent)) + teht4Array[i][j]);
                } else {
                    int indent = alingRight(teht4Array, teht4Array[i][j], j);
                    System.out.println(" " + (space.repeat(indent)) + teht4Array[i][j]);
                }
            }
        }
    }
    /**
     * Main class.
     *
     * @param args Command line arguments
     */
    public static void main(String[] args) {
        /*
          FizzBuzz-luokan runFizzBuzz()-metodilla voi tarkistaa harjoitustyöpohjan toimivuuden omassa koneessa
          ennen tehtävien tekemistä. Testin jälkeen alla olevan rivin voi joko kommentoida tai poistaa.
         */
        // FizzBuzz.runFizzBuzz();

        // Tehtävät 2-5
        // Kirjoita tähän tarvittavat metodikutsu ja muut toiminteet.

        int[] teht2Array = readArraySize();
         // System.out.println(Arrays.toString(teht2Array));                                            // omaa testiä
        int ySize = Array.getInt(teht2Array,0);
        int xSize = Array.getInt(teht2Array,1);
        int[][] teht3Array = readArrayData(xSize, ySize);
        // System.out.println("Alkuperäinen:");                                                         // omaa testiä
        // System.out.println(Arrays.deepToString(teht3Array).replace("], ", "]\n"));                   // omaa testiä
        String [][] teht4Array = checkArrayData(teht3Array);
        // System.out.println("Korjattu:");                                                             // omaa testiä
        // System.out.println(Arrays.deepToString(teht4Array).replace("], ", "]\n"));                   // omaa testiä
        printArray(teht4Array);
		RajoitettuLista l = new RajoitettuLista(10);
		l.lisaa(6);
		System.out.println(l);
		l.lisaa(5);
		System.out.println(l);
		l.lisaa(3);
		System.out.println(l);
		l.lisaa(1);
		System.out.println(l);

        //Tehtävä 6
        // Kirjoita tähän tarvittavat metodikutsu ja muut toiminteet.
        // Osa tehtävästä 6 tehdään RajoitettuLista luokkaan

    }

}
