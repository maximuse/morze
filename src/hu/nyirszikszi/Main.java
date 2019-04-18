package hu.nyirszikszi;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<MorseABC> morseABC = Actions.readMorseABC("morzeabc.txt");
        /*for (MorseABC abc : morseABC) {
            System.out.println(abc);
        }*/

        System.out.println("3. feladat:\nA Morze abc " + morseABC.size() + " db karakter kódját tartalmazza.");

        System.out.println("4. feladat:");
        Actions.char2Signal(morseABC);
    }
}