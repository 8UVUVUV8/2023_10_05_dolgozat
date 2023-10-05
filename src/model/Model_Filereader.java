/*
* File: Model_Filereader.java
* Author: Szekeres András
* Copyright: 2023 Szekeres András
* Group: Szoft I/II
* Date: 2023-10-05
* Github: https://github.com/UVUVUV/
* Licenc: GNU GPL
*/


package model;

import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;
import view.Inputs;

public class Model_Filereader extends Model_FileGet{

    protected static ArrayList<String> sorok = new ArrayList<String>();
    
    public static void fileReader(){
        try {
            loadData();
            
        } catch (FileNotFoundException ex) {
            System.err.println("A file olvasása nem lehetséges!");
            System.err.println(ex);
        }
    }

    private static void loadData() throws FileNotFoundException{
        Scanner scanner = new Scanner(Inputs.getFileGetApp().getFile(), "utf-8");
        while(scanner.hasNextLine()){
            sorok.add(scanner.nextLine());
        }
        Model_Rowhandler.rowSpliter(sorok);
        scanner.close();
    }

}
