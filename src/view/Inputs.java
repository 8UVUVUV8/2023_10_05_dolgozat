/*
* File: Inputs.java
* Author: Szekeres András
* Copyright: 2023 Szekeres András
* Group: Szoft I/II
* Date: 2023-10-05
* Github: https://github.com/UVUVUV/
* Licenc: GNU GPL
*/


package view;

import java.util.Scanner;

import model.Model_FileGet;

public class Inputs {

    private static Model_FileGet fileGetApp = null;

    public static void userinput(){

        fileGetApp = new Model_FileGet();

        Scanner scanner = new Scanner(System.in);  // Create a Scanner object
        System.out.println("Használat elöt ajánlott a 'README.md' olvasása");
        System.out.println("File name: ");
        fileGetApp.setFilename(scanner.nextLine());
        scanner.close();
    }

    public static Model_FileGet getFileGetApp() {
        return fileGetApp;
    }

    
}
