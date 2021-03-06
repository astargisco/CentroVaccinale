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
 * Generatore casuale di nomi maschili
 * La lista dei nomi è stata presa dai 200 nomi più comuni negli Stati Uniti
 *
 */
public class MaleNameGenerator extends GeneratorWrapperBase<String> implements Generator {
    /**
     * I più comuni nomi maschili degli Stati Uniti
     */
    private static final String[] names = new String[] { "James", "John",
            "Robert", "Michael", "William", "David", "Richard", "Charles",
            "Joseph", "Thomas", "Christopher", "Daniel", "Paul", "Mark",
            "Donald", "George", "Kenneth", "Steven", "Edward", "Brian",
            "Ronald", "Anthony", "Kevin", "Jason", "Matthew", "Gary",
            "Timothy", "Jose", "Larry", "Jeffrey", "Frank", "Scott", "Eric",
            "Stephen", "Andrew", "Raymond", "Gregory", "Joshua", "Jerry",
            "Dennis", "Walter", "Patrick", "Peter", "Harold", "Douglas",
            "Henry", "Carl", "Arthur", "Ryan", "Roger", "Joe", "Juan", "Jack",
            "Albert", "Jonathan", "Justin", "Terry", "Gerald", "Keith",
            "Samuel", "Willie", "Ralph", "Lawrence", "Nicholas", "Roy",
            "Benjamin", "Bruce", "Brandon", "Adam", "Harry", "Fred", "Wayne",
            "Billy", "Steve", "Louis", "Jeremy", "Aaron", "Randy", "Howard",
            "Eugene", "Carlos", "Russell", "Bobby", "Victor", "Martin",
            "Ernest", "Phillip", "Todd", "Jesse", "Craig", "Alan", "Shawn",
            "Clarence", "Sean", "Philip", "Chris", "Johnny", "Earl", "Jimmy",
            "Antonio", "Danny", "Bryan", "Tony", "Luis", "Mike", "Stanley",
            "Leonard", "Nathan", "Dale", "Manuel", "Rodney", "Curtis",
            "Norman", "Allen", "Marvin", "Vincent", "Glenn", "Jeffery",
            "Travis", "Jeff", "Chad", "Jacob", "Lee", "Melvin", "Alfred",
            "Kyle", "Francis", "Bradley", "Jesus", "Herbert", "Frederick",
            "Ray", "Joel", "Edwin", "Don", "Eddie", "Ricky", "Troy", "Randall",
            "Barry", "Alexander", "Bernard", "Mario", "Leroy", "Francisco",
            "Marcus", "Micheal", "Theodore", "Clifford", "Miguel", "Oscar",
            "Jay", "Jim", "Tom", "Calvin", "Alex", "Jon", "Ronnie", "Bill",
            "Lloyd", "Tommy", "Leon", "Derek", "Warren", "Darrell", "Jerome",
            "Floyd", "Leo", "Alvin", "Tim", "Wesley", "Gordon", "Dean", "Greg",
            "Jorge", "Dustin", "Pedro", "Derrick", "Dan", "Lewis", "Zachary",
            "Corey", "Herman", "Maurice", "Vernon", "Roberto", "Clyde", "Glen",
            "Hector", "Shane", "Ricardo", "Sam", "Rick", "Lester", "Brent",
            "Ramon", "Charlie", "Tyler", "Gilbert", "Gene", "Marc", "Reginald",
            "Ruben", "Brett", "Angel", "Nathaniel", "Rafael", "Leslie",
            "Edgar", "Milton", "Raul", "Ben", "Chester", "Cecil", "Duane",
            "Franklin", "Andre", "Elmer", "Brad", "Gabriel", "Ron", "Mitchell",
            "Roland", "Arnold", "Harvey", "Jared", "Adrian", "Karl", "Cory",
            "Claude", "Erik", "Darryl", "Jamie", "Neil", "Jessie", "Christian",
            "Javier", "Fernando", "Clinton", "Ted", "Mathew", "Tyrone",
            "Darren", "Lonnie", "Lance", "Cody", "Julio", "Kelly", "Kurt",
            "Allan" };

    /**
     * Costruttore
     */
    public MaleNameGenerator() {
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
