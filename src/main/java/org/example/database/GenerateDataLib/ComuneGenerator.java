/*
  LABORATORIO INTERDISCIPLINARE B - Como AA20-21

  BANCORA Davide       | 743662 | Como
  CASALNOVO Giacomo    | 740003 | Como
  DONATO Benedetta     | 742957 | Como
  DUBINI Emanuele      | 740954 | Como

 */

package org.example.database.GenerateDataLib;

import org.example.database.GenerateDataLib.BaseElement.Generator;
import org.example.database.GenerateDataLib.BaseElement.GeneratorWrapperBase;
import org.example.database.GenerateDataLib.BaseElement.RandomSequenceArrayBasedGenerator;

/**
 * Generatore casuale di nomi di comuni
 * La lista dei nomi &egrave; stata presa da vari comuni italiani
 *
 */
public class ComuneGenerator extends GeneratorWrapperBase<String> implements Generator {
    /**
     * Alcuni nomi di comuni in Italia
     */
    private static final String[] names= {"Cermenate", "Vertemate con minoprio", "Milano", "Arese", "Verona", "Como", "Cernobbio", "Erba", "Meda", "Saronno",
                                            "Guanzate", "Cucciago", "Arezzo", "Arenzano", "Argegno", "Arosio", "Assisi", "Alassio", "Asso", "Avellino", "Bagnasco",
                                            "Balocco", "Barzago", "Belluno", "Brindisi", "Canegrate", "Carbonate", "Carugo", "Cervino", "Cremona", "Crema", "Lecco",
                                            "Monza", "Seriate", "Pavia", "Verona", "Bolzano", "Sarentino", "Ortisei", "Trento"
    };


    /**
     * Costruttore
     */
    public ComuneGenerator() {
        super(new RandomSequenceArrayBasedGenerator<>(names));
    }

    /*
     * (non-Javadoc)
     */
    @Override
    public Object generate() {
        return generator.generate();
    }

}
