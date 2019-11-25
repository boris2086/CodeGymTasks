package com.codegym.task.task06.task0621;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Cat relations

*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String grandfatherName = reader.readLine();
        Cat catGrandfather = new Cat(grandfatherName,null,null);

        String grandmotherName = reader.readLine();
        Cat catGrandmother = new Cat(grandmotherName,null, null);

        String fatherName = reader.readLine();
        Cat catFather = new Cat(fatherName,catGrandfather, null);

        String motherName = reader.readLine();
        Cat catMother = new Cat(motherName,null, catGrandmother);

        String sonName = reader.readLine();
        Cat catSon = new Cat(sonName, catFather, catMother);

        String daughterName = reader.readLine();
        Cat catDaughter = new Cat(daughterName, catFather, catMother);

        System.out.println(catGrandfather);
        System.out.println(catGrandmother);
        System.out.println(catFather);
        System.out.println(catMother);
        System.out.println(catSon);
        System.out.println(catDaughter);
    }

    public static class Cat {
        private String name;
        private Cat mother;
        private Cat father;

       // Cat(String name) {
          //  this.name = name;
        //}

        Cat(String name,Cat father ,Cat mother) {
            this.name = name;
            this.mother = mother;
            this.father = father;
        }

        @Override
        public String toString() {
            if (mother == null && father!=null) {
                return "The cat's name is " + name + ", no mother, " +this.father.name+" is the father";
            }
            else if (father==null && mother!=null) {
                return "The cat's name is " + name + ", " + this.mother.name + " is the mother" + ", no father";
            }
            else if (father != null && mother != null) {
                return "The cat`s name is " + name + ", " + this.mother.name + " is the mother, " + this.father.name +
                        " is the father";
            }
            else {
                return "The cat's name is " + name + ", "  + "no mother, " +  "no father";
            }
        }
    }

}
//he cat's name is Son Simba, Mother Missy is the mother, Father Oscar is the father
//The cat's name is Daughter Coco, Mother Missy is the mother, Father Oscar is the father