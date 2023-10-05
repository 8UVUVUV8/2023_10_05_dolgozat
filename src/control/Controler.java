/*
* File: Controler.java
* Author: Szekeres András
* Copyright: 2023 Szekeres András
* Group: Szoft I/II
* Date: 2023-10-05
* Github: https://github.com/UVUVUV/
* Licenc: GNU GPL
*/

package control;


import model.Model_Filereader;
import view.Inputs;
import view.MainConsole;

public class Controler {
    public Controler() {
        Inputs.userinput();
        Model_Filereader.fileReader();
        //Output.output();
    }
}
