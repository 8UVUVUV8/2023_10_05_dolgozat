/*
* File: Model_Rowhandler.java
* Author: Szekeres András
* Copyright: 2023 Szekeres András
* Group: Szoft I/II
* Date: 2023-10-05
* Github: https://github.com/UVUVUV/
* Licenc: GNU GPL
*/


package model;

import java.util.ArrayList;

import view.MainConsole;

public class Model_Rowhandler {

    
    protected static void rowSpliter(ArrayList<String> sorok){
        
        ArrayList<Model_Employe> employeArrayList = new ArrayList<Model_Employe>();

        for (String row : sorok) {
            Model_Employe employe = new Model_Employe();
            String[] splitedRow = row.split(":");
            employe.setName(splitedRow[0]);
            employe.setCity(splitedRow[1]);
            employe.setStreat(splitedRow[2]);
            employe.setBirth(splitedRow[3]);
            employe.setSalary(splitedRow[4]);
            employeArrayList.add(employe);
            }
        
        MainConsole.showData(employeArrayList);
    }


}

