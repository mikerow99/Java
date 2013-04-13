/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.eurojava;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author jarek
 */
public final class nbp {

    /**
     * @param args the command line arguments
     */
    private FileReader fileReader;
    private String fileName;

    /**
     * Get the value of superString
     *
     * @return the value of superString
     */
    public nbp() throws FileNotFoundException {
        try {
            fileName = "C:\\Users\\jarek\\Documents\\NetBeansProjects\\Dżawa\\Java\\NBP\\a.txt";
            this.loadFile(fileName);

            File somefile = new File(fileName);
            File dwa = new File("jestę folderę");
            if (!dwa.exists()) {
                dwa.mkdir();
            }
            System.out.println(dwa.getAbsolutePath());
            Scanner scan = new Scanner(somefile);
            String linia = scan.nextLine();
            System.out.println(linia);
        } catch (IOException ex) {
            Logger.getLogger(nbp.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public nbp(String name) throws FileNotFoundException {
        //File plik = new File(name);
    }

    public void loadFile(String fileName) throws FileNotFoundException, IOException {
        fileReader = new FileReader(fileName);
        System.out.println(readFile());
        //if(fileReader.read(null))

    }

    public String readFile() throws IOException {
        BufferedReader br = new BufferedReader(fileReader);

        String s;
        String whole = "";
        while ((s = br.readLine()) != null) {
            whole += s + "\n";
        }
        return whole;
    }

    /**
     * Set the value of superString
     *
     * @param superString new value of superString
     */
    public static void main(String[] args) throws FileNotFoundException, IOException {
        // TODO code application logic here

        //System.out.println("czesc");
        nbp n = new nbp();

    }
}
