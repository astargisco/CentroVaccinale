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
 * Generatore casuale di nomi femminili
 * La lista dei nomi &egrave; stata presa dai 200 nomi pi&ugrave; comuni negli Stati Uniti
 *
 */

public class FemaleNameGenerator extends GeneratorWrapperBase<String> implements Generator {
    /**
     * I pi&ugrave; comuni nomi femminili degli Stati Uniti
     */
    private static final String[] names = new String[] { "Mary", "Patricia",
            "Linda", "Barbara", "Elizabeth", "Jennifer", "Maria", "Susan",
            "Margaret", "Dorothy", "Lisa", "Nancy", "Karen", "Betty", "Helen",
            "Sandra", "Donna", "Carol", "Ruth", "Sharon", "Michelle", "Laura",
            "Sarah", "Kimberly", "Deborah", "Jessica", "Shirley", "Cynthia",
            "Angela", "Melissa", "Brenda", "Amy", "Anna", "Rebecca",
            "Virginia", "Kathleen", "Pamela", "Martha", "Debra", "Amanda",
            "Stephanie", "Carolyn", "Christine", "Marie", "Janet", "Catherine",
            "Frances", "Ann", "Joyce", "Diane", "Alice", "Julie", "Heather",
            "Teresa", "Doris", "Gloria", "Evelyn", "Jean", "Cheryl", "Mildred",
            "Katherine", "Joan", "Ashley", "Judith", "Rose", "Janice", "Kelly",
            "Nicole", "Judy", "Christina", "Kathy", "Theresa", "Beverly",
            "Denise", "Tammy", "Irene", "Jane", "Lori", "Rachel", "Marilyn",
            "Andrea", "Kathryn", "Louise", "Sara", "Anne", "Jacqueline",
            "Wanda", "Bonnie", "Julia", "Ruby", "Lois", "Tina", "Phyllis",
            "Norma", "Paula", "Diana", "Annie", "Lillian", "Emily", "Robin",
            "Peggy", "Crystal", "Gladys", "Rita", "Dawn", "Connie", "Florence",
            "Tracy", "Edna", "Tiffany", "Carmen", "Rosa", "Cindy", "Grace",
            "Wendy", "Victoria", "Edith", "Kim", "Sherry", "Sylvia",
            "Josephine", "Thelma", "Shannon", "Sheila", "Ethel", "Ellen",
            "Elaine", "Marjorie", "Carrie", "Charlotte", "Monica", "Esther",
            "Pauline", "Emma", "Juanita", "Anita", "Rhonda", "Hazel", "Amber",
            "Eva", "Debbie", "April", "Leslie", "Clara", "Lucille", "Jamie",
            "Joanne", "Eleanor", "Valerie", "Danielle", "Megan", "Alicia",
            "Suzanne", "Michele", "Gail", "Bertha", "Darlene", "Veronica",
            "Jill", "Erin", "Geraldine", "Lauren", "Cathy", "Joann",
            "Lorraine", "Lynn", "Sally", "Regina", "Erica", "Beatrice",
            "Dolores", "Bernice", "Audrey", "Yvonne", "Annette", "June",
            "Samantha", "Marion", "Dana", "Stacy", "Ana", "Renee", "Ida",
            "Vivian", "Roberta", "Holly", "Brittany", "Melanie", "Loretta",
            "Yolanda", "Jeanette", "Laurie", "Katie", "Kristen", "Vanessa",
            "Alma", "Sue", "Elsie", "Beth", "Jeanne", "Vicki", "Carla", "Tara",
            "Rosemary", "Eileen", "Terri", "Gertrude", "Lucy", "Tonya", "Ella",
            "Stacey", "Wilma", "Gina", "Kristin", "Jessie", "Natalie", "Agnes",
            "Vera", "Willie", "Charlene", "Bessie", "Delores", "Melinda",
            "Pearl", "Arlene", "Maureen", "Colleen", "Allison", "Tamara",
            "Joy", "Georgia", "Constance", "Lillie", "Claudia", "Jackie",
            "Marcia", "Tanya", "Nellie", "Minnie", "Marlene", "Heidi",
            "Glenda", "Lydia", "Viola", "Courtney", "Marian", "Stella",
            "Caroline", "Dora", "Jo" };

    /**
     * Costruttore
     */
    public FemaleNameGenerator() {
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
