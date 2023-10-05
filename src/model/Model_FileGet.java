/*
* File: Model_FileGet.java
* Author: Szekeres András
* Copyright: 2023 Szekeres András
* Group: Szoft I/II
* Date: 2023-10-05
* Github: https://github.com/UVUVUV/
* Licenc: GNU GPL
*/

package model;

import java.io.File;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Model_FileGet {

    private File file = null;

    public void setFilename(String filename) {

        Pattern p = Pattern.compile("[a-zA-Z].txt", Pattern.CASE_INSENSITIVE);
        Matcher m = p.matcher(filename);
        boolean matchFound = m.find();
        if(matchFound) {
            createFileObj(filename);
        } else {
            System.out.println("Hibás file név!");
            System.err.println("Hibás file név!");
        }
    }

    protected void createFileObj(String filename){

        this.file = new File("./files/"+filename);

    }

    public File getFile() {
        return file;
    }

    



    
}
