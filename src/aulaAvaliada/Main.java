package aulaaval;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        IPetShelter shelter = new PetShelter("AnimalFriends");

        String choice;
        do {
            System.out.println("1. Add animal");
            System.out.println("2. Remove animal");
            System.out.println("3. Search for animal");
            System.out.println("4. Sponsor an animal");
            System.out.println("5. View all animals");
            System.out.println("6. Exit");
            System.out.println("Choose an option:");

            choice = sc.nextLine();

            switch (choice) {
                case "1":
		            // adicionar animal
                    // add animal
                    Animal animal = null;
                    System.out.print("Choose animal type (dog, rabbit, bird): ");
                    String animalSpicies = sc.nextLine();
                    System.out.print("Animal's name: ");
                    String nome = sc.nextLine();
                    if (animalSpicies.equalsIgnoreCase("dog")) {
                        System.out.print("Breed: ");
                        String breed = sc.nextLine();
                        System.out.print("Weight: ");
                        int peso = sc.nextInt();
                        System.out.print("Age: ");
                        int idade = sc.nextInt();
                        System.out.print("Sponsor name: ");
                        String SponsorName = sc.nextLine();
                        animal = new Dog(nome, idade, peso, breed, SponsorName);
                    }
                    else if(animalSpicies.equalsIgnoreCase("rabbit")){
                        System.out.print("Is it's fur short? (confirm with YES): ");
                        boolean shortFur = false;
                        if (sc.nextLine().equalsIgnoreCase("yes")) {
                            shortFur = true;
                        }
                        else{
                            shortFur = false;
                        }

                        System.out.print("Weight: ");
                        int peso = sc.nextInt();
                        System.out.print("Age: ");
                        int idade = sc.nextInt();
                        System.out.print("Sponsor name: ");
                        String SponsorName = sc.nextLine();
                        animal = new Rabbit(nome, idade, peso, shortFur, SponsorName);
                    } 
                    else if(animalSpicies.equalsIgnoreCase("bird")){
                        System.out.print("Is it diurnal? (confirm with YES): ");
                        boolean isDiurnal = false;
                        if (sc.nextLine().equalsIgnoreCase("yes")) {
                            isDiurnal = true;
                        }
                        else{
                            isDiurnal = false;
                        }
                        System.out.print("Weight: ");
                        int peso = sc.nextInt();
                        System.out.print("Age: ");
                        int idade = sc.nextInt();
                        System.out.print("Sponsor name: ");
                        String SponsorName = sc.nextLine();
                        animal = new Bird(nome, idade, peso, isDiurnal, SponsorName);
                    
                    }
                    else{
                        System.out.println("Invalid animal type");
                    }
                    System.out.println("item created " + animal);
                    shelter.addAnimal(animal);
                    break;
                case "2":
                    // remover animal
                    // remove animal
                    System.out.print("Animal's name: ");

                    String nomeR = sc.nextLine();
                    
                    shelter.removeAnimal(shelter.searchForAnimal(nomeR));
                    break;
                case "3":
                    // procurar animal
                    // search for animal
                    System.out.print("Animal's name: ");
                    String nomeS = sc.nextLine();
                    System.out.println(shelter.searchForAnimal(nomeS));
                    break;
                case "4":
                    // apadrinhar animal
                    // sponsor an animal
                    int animalId;
                    do {
                        System.out.print("Animal's ID: ");
                        animalId = sc.nextInt();
                        if (animalId < 0) {
                            System.out.println("Invalid ID");
                        }
                    } while (animalId < 1001); //falta validar a sua existência
                    


                    System.out.print("Sponsor's name:");
                    String SponsorName = sc.nextLine();

                    shelter.sponsorAnimal(animalId, SponsorName); //falta finalizar
                case "5":
                    // imprimir a informação de todos os animais
                    // print all animals information
                    shelter.listAllAnimals();
                case "6":
                    System.out.println("Goodbye!");
                    break;
                default:
                    // imprimir mensagem de erro
                    System.out.println("ERROR!");
                    // print error message
            }

        } while (choice != "6");

        sc.close(); //fechar o scanner :)
    }
}
