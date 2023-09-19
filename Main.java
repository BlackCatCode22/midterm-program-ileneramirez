 //Ilene Ramirez
 //9/19/23
 //zooWarmUp
 //


import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;


public class Main {
    //Create the genUniqueIDFunction

    //values for theSpecies:
    // lion
    String genUniqueID(String theSpecies ) {
        if (theSpecies.equals("lion")) {
            // do something

        }

    }

    public static void main(String[] args) {

        System.out.println("Welcome to my Zoo Warmup!");

        // Create an animal object.
        Animal myNewAnimal = new Animal();

        myNewAnimal.desc = " this is my description";

        System.out.println("\n the desc of the new animal is: " + myNewAnimal.desc);

        // open the arriving animal text file
        // Define the file path
        String filePath = "c:\\users\\BE218\\IdeaProjects\\zooWarmUp\\files\\arrivingAnimals.txt";


        ArrayList<Animal> animalList = new ArrayList<>();

        try {
            // Create a FileReader to read the file
            FileReader fileReader = new FileReader(filePath);

            // Wrap the FileReader in a BufferedReader for efficient reading
            BufferedReader bufferedReader = new BufferedReader(fileReader);

            String line;



            // Read and print each line from the file
            while ((line = bufferedReader.readLine()) != null) {
                System.out.println(line);
                // Split the line into 6 substring
                String[] myArray = line.split(",");
                System.out.println("\n myArray[0] is " + myArray[0]);
                System.out.println("\n myArray[1] is " + myArray[1]);

                //Create an Animal object from the Animal class.

                Animal anyOldAnimal = new Animal();
                // Increment the static Animal Count
                Animal.


                // fill the object's data fields
                anyOldAnimal.desc = myArray[0];
                anyOldAnimal.birthSeason = myArray[1];
                anyOldAnimal.color = myArray[2];
                anyOldAnimal.weight = myArray[3];
                anyOldAnimal.origin01= myArray[4];
                anyOldAnimal.origin02= myArray[5];

                //Add the newly created animal object to the array list.
                animalList.add(anyOldAnimal);

            }

            // Close the BufferedReader and FileReader
            bufferedReader.close();
            fileReader.close();
        } catch (IOException e) {
            // Handle any potential IOException that may occur
            e.printStackTrace();
            System.err.println("An error occured while reading the file.");
        }

        // We are done with the text file.
        // Output the ArrayList!

        for (Animal animal: animalList) {
            System.out.println(animal.desc);
            System.out.println(animal.birthSeason);
            System.out.println(animal.color);
            System.out.println(animal.weight);
            System.out.println(animal.origin01);
            System.out.println(animal.origin02);
            System.out.println("\n\n");


        }

        System.out.println(" The number of animals is: + Animal." + Animal.numOfAnimals);

    }
}

