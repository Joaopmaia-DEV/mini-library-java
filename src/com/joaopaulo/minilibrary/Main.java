package com.joaopaulo.minilibrary;

public class Main {
    public static void main(String[] args) {

        System.out.println("=== MINI LIBRARY LIST===");

        System.out.println("\n=== INITIAL BOOK LIST===");

        byte[] book = new byte[3];

        String[] authorBook = new String[]{"James Clear", "Machado de Assis", "Miguel de Cervantes"};

        String[] title = new String[]{"Atomic Habits", "Dom Casmurro", "Don Quixote"};

        short[] year = new short[]{2018, 1899, 1605, 1615};

        String[] yearDonQuixote = new String[]{"Part 01: ", "Part 02: "};

        for (int i = 0; i < book.length; i++) {

            if (i == 2) {
                System.out.println("Book " + (i+1) + "\nTitle: " + title[i] + "\nAuthor: "+ authorBook[i]+"\nYear(s):\n"+yearDonQuixote[0] +year[2]+ "\n"+yearDonQuixote[1] + year[3]);

            } else System.out.println("Book " + i + "\nTitle: " + title[i] + "\nAuthor: "+ authorBook[i]+"\nYear: "+year[i]);
        }
    }
}