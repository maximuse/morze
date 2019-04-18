package hu.nyirszikszi;

import java.io.RandomAccessFile;
import java.util.ArrayList;
import java.util.Scanner;

class Actions {
    static ArrayList<MorseABC> readMorseABC(String fileName) {
        ArrayList<MorseABC> morseABC = new ArrayList<>();

        try {
            RandomAccessFile raf = new RandomAccessFile(fileName, "r");
            String row = raf.readLine();
            row = raf.readLine();
            String[] slices;
            String utf;

            while (row != null) {
                utf = new String(row.getBytes("ISO-8859-1"), "UTF-8");
                slices = utf.split("\t");

                morseABC.add(new MorseABC(slices[0].charAt(0), slices[1]));

                row = raf.readLine();
            }

            raf.close();
        }
        catch (Exception e) {
            System.out.println(e.getMessage());
        }

        return morseABC;
    }

    static void char2Signal(ArrayList<MorseABC> morseABC) {
        try {
            Scanner s = new Scanner(System.in);

            System.out.print("Kérek egy karaktert: ");
            char c = s.next().charAt(0);
            c = Character.toLowerCase(c);
            String msg = "";

            for (MorseABC abc : morseABC) {
                if (abc.getLetter() == c) {
                    msg = "A(z) \"" + c + "\" karakter Morze kódja: " + abc.getSignal();
                    break;
                } else {
                    msg = "A(z) \"" + c + "\" karakter Morze kódja nem található a kódtárban!";
                }
            }

            System.out.println(msg);
        }
        catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}