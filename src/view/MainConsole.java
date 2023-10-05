/*
* File: MainConsole.java
* Author: Szekeres András
* Copyright: 2023 Szekeres András
* Group: Szoft I/II
* Date: 2023-10-05
* Github: https://github.com/UVUVUV/
* Licenc: GNU GPL
*/


package view;

import java.util.ArrayList;

import model.Model_Employe;
import model.Model_Rowhandler;

public class MainConsole {
    public static void showData(ArrayList<Model_Employe> employeesArrayList){
        for (Model_Employe model_Employe : employeesArrayList) {
            System.out.println("Név: "+model_Employe.getName()+" | Város: "+model_Employe.getCity()+" | Házszám: "+model_Employe.getStreat()+" | Születési idö: "+model_Employe.getBirth()+ " | Fizetés: "+model_Employe.getSalary());
        }
    }

}
