/*
  LABORATORIO INTERDISCIPLINARE B - Como AA20-21

  BANCORA Davide       | 743662 | Como
  CASALNOVO Giacomo    | 740003 | Como
  DONATO Benedetta     | 742957 | Como
  DUBINI Emanuele      | 740954 | Como

 */

package org.example.database.GenerateDataLib;

import java.security.SecureRandom;
import java.util.Random;

//todo javadoc
public class UIDGenerator {

    String Alphabet = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    Random rng = new SecureRandom();

    //todo javadoc
    char randomChar(boolean numeric){
        if(numeric){
            String numeric1 = "0123456789";
            return numeric1.charAt(rng.nextInt(numeric1.length()));
        }else{
            return Alphabet.charAt(rng.nextInt(Alphabet.length()));
        }

    }

    //todo javadoc
    public String randomUUID(int lunghezza, int spaziatura, char carSpaziatore, boolean numeric){
        StringBuilder sb = new StringBuilder();
        int spacer = 0;
        while(lunghezza > 0){
            if(spacer == spaziatura){
                sb.append(carSpaziatore);
                spacer = 0;
            }
            lunghezza--;
            spacer++;
            sb.append(randomChar(numeric));
        }
        return sb.toString();
    }
}
