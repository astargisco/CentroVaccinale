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
 * Generatore casuale di numeri civici. The list of names was taken from the top 200
 * La lista dei numeri civici è stata presa da varie vie in Italia
 *
 */
public class NumeroCivicoGenerator extends GeneratorWrapperBase<String> implements Generator {
    /**
     * Alcuni numeri civici Italiani
     */
    private static final String[] names= {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16",
            "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31", "32", "33", "34", "35", "36",
            "37", "38", "39", "40", "41", "42", "43", "44", "45", "46", "47", "48", "49", "50", "51", "52", "53", "54", "55", "56",
            "57", "58", "59", "60", "61", "62" ,"63" ,"64" ,"65", "66", "67", "68", "69", "70", "71", "72", "73", "74", "75", "76",
            "77", "78", "79", "80", "81", "82", "83", "84", "85", "86", "87", "88", "89", "90", "91", "92", "93", "94", "95", "96",
            "97", "98", "99", "100", "101", "102", "103", "104", "105", "106", "107", "108", "109", "110", "111", "112", "113", "114",
            "115", "116", "117", "118", "119", "120", "121", "122", "123", "124", "125", "126", "127", "128", "129", "130", "131",
            "132", "133", "134", "135", "136", "137", "138", "139", "140", "141", "142", "143", "144", "145", "146", "147", "148", "149", "150",
            "1A","2A","3A","4A","5A","6A","7A","8A","9A","10A","11A","12A","13A","14A","15A","16A","17A","18A","19A","20A","21A","22A",
            "23A","24A","25A","26A","27A","28A","29A","30A","31A","32A","33A","34A","35A","36A","37A","38A","39A","40A","41A","42A","43A",
            "44A","45A","46A","47A","48A","49A","50A","51A","52A","53A","54A","55A","56A","57A","58A","59A","60A","61A","62A","63A","64A",
            "65A","66A","67A","68A","69A","70A","71A","72A","73A","74A","75A","76A","77A","78A","79A","80A","81A","82A","83A","84A","85A",
            "86A","87A","88A","89A","90A","91A","92A","93A","94A","95A","96A","97A","98A","99A","100A","101A","102A","103A","104A","105A",
            "106A","107A","108A","109A","110A","111A","112A","113A","114A","115A","116A","117A","118A","119A","120A","121A","122A","123A",
            "124A","125A","126A","127A","128A","129A","130A","131A","132A","133A","134A","135A","136A","137A","138A","139A","140A","141A",
            "142A","143A","144A","145A","146A","147A","148A","149A","150A","1B","2B","3B","4B","5B","6B","7B","8B","9B","10B","11B","12B",
            "13B","14B","15B","16B","17B","18B","19B","20B","21B","22B","23B","24B","25B","26B","27B","28B","29B","30B","31B","32B","33B",
            "34B","35B","36B","37B","38B","39B","40B","41B","42B","43B","44B","45B","46B","47B","48B","49B","50B","51B","52B","53B","54B",
            "55B","56B","57B","58B","59B","60B","61B","62B","63B","64B","65B","66B","67B","68B","69B","70B","71B","72B","73B","74B","75B",
            "76B","77B","78B","79B","80B","81B","82B","83B","84B","85B","86B","87B","88B","89B","90B","91B","92B","93B","94B","95B","96B",
            "97B","98B","99B","100B","101B","102B","103B","104B","105B","106B","107B","108B","109B","110B","111B","112B","113B","114B","115B",
            "116B","117B","118B","119B","120B","121B","122B","123B","124B","125B","126B","127B","128B","129B","130B","131B","132B","133B",
            "134B","135B","136B","137B","138B","139B","140B","141B","142B","143B","144B","145B","146B","147B","148B","149B","150B","1C",
            "2C","3C","4C","5C","6C","7C","8C","9C","10C","11C","12C","13C","14C","15C","16C","17C","18C","19C","20C","21C","22C","23C",
            "24C","25C","26C","27C","28C","29C","30C","31C","32C","33C","34C","35C","36C","37C","38C","39C","40C","41C","42C","43C","44C",
            "45C","46C","47C","48C","49C","50C","51C","52C","53C","54C","55C","56C","57C","58C","59C","60C","61C","62C","63C","64C","65C",
            "66C","67C","68C","69C","70C","71C","72C","73C","74C","75C","76C","77C","78C","79C","80C","81C","82C","83C","84C","85C","86C",
            "87C","88C","89C","90C","91C","92C","93C","94C","95C","96C","97C","98C","99C","100C","101C","102C","103C","104C","105C","106C",
            "107C","108C","109C","110C","111C","112C","113C","114C","115C","116C","117C","118C","119C","120C","121C","122C","123C","124C",
            "125C","126C","127C","128C","129C","130C","131C","132C","133C","134C","135C","136C","137C","138C","139C","140C","141C","142C",
            "143C","144C","145C","146C","147C","148C","149C","150C"};


    /**
     * Costruttore
     */
    public NumeroCivicoGenerator() {
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
