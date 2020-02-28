// Michael Wise
// Project #1: A Classy Problem
// CMPT 220 Software Development 1

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

// Note: I tried to do this solely with normal arrays but I couldn't get the sorting/ranking methods
// to work, so I looked up how to use ArrayLists and the Comparable interface


public class AClassyProblem {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int caseNumber = input.nextInt();
        
        for (int i = 0; i < caseNumber; i++) {
        	int peopleTotal = input.nextInt();
        	input.nextLine();
        	
        	// Create list to add 'person' objects to so we can compare/sort
            ArrayList<person> peopleList = new ArrayList<>();
            for (int j = 0; j < peopleTotal; j++) {
            	// Split the input by white spaces
                String[] text = input.nextLine().split(" ");
                String classification = text[1];
                String name = text[0].replace(":", "");
                peopleList.add(new person(name, classification));
            }
            // Imported from the Collections class -> sorts list by rank
            Collections.sort(peopleList);
            for (person p : peopleList) {
                System.out.println(p.name);
            }
            System.out.println("==============================");
        }
    }
    // Create a person class so we can store instances of all the people into an array to sort/compare
    static class person implements Comparable<person> {

        public String name;
        // Create an empty list to store the integer classifications
        public ArrayList<Integer> classif;

        public person(String name, String classification) {
            this.name = name;
            this.classif = new ArrayList<>();
            String[] ranks = classification.split("-");
            
            // This will reverse the title string and assign integer values for each class
            // (upper = 3, middle = 2, lower = 1)
            for (int i = ranks.length - 1; i >= 0; i--) {
                if (ranks[i].equals("upper")) {
                    classif.add(3);
                } else if (ranks[i].equals("middle")) {
                    classif.add(2);
                } else {
                    classif.add(1);
                }
            }
            // Assuming that all further classes are the same as the middle level of the 
            // previous level of detail (2 = middle in the ranks not filled)
            for (int i = 0; i < 10; i++) {
                classif.add(2);
            }
        }

        // Compares object with specified object to determine ranking
        public int compareTo(person o) {
            person p = o;
            for (int i = 0; i < 10; i++) {
                if (this.classif.get(i) == p.classif.get(i))
                    continue;
                if (this.classif.get(i) > p.classif.get(i))
                    return -1;
                if (this.classif.get(i) < p.classif.get(i))
                    return 1;
            }
            return this.name.compareTo(p.name);
        }
    }

}
