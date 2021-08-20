/*
  LABORATORIO INTERDISCIPLINARE B - Como AA20-21

  BANCORA Davide       | 743662 | Como
  CASALNOVO Giacomo    | 740003 | Como
  DONATO Benedetta     | 742957 | Como
  DUBINI Emanuele      | 740954 | Como

 */

package org.example.common.exceptions;



/**
 * Eccezione che gestisce il server quando non parte
 *
 */
public class ServerNotFoundException extends Exception {

    //todo javadoc
    public ServerNotFoundException() {
        System.err.println("Server non rilevato in rete! \nVerificare la sua integrità");
        //System.exit(-1);    // stoppa il programma ed esce
    }

}//END
