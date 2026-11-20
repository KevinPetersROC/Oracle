package animalshop;

public class AnimalTester
{
    static void main(String[] args)
    {
        Dog dog2 = new Dog("Bailey", "Boerboel", "arf-arf", 80.2, "Brown");
        Fish fish1 = new Fish("Goldfish", "Cold", "red");

        System.out.println("-Dog Information Panel-");
        System.out.println("Dog Name: " + dog2.getName());
        System.out.println("Dog Breed: " + dog2.getBreed());
        System.out.print("Dog Barking Noise: ");
        dog2.bark();
        System.out.println("Dog Weight: " + dog2.getWeight() + "\n");

        System.out.println("-Fish Information Panel-");
        System.out.println("Fish Breed: " + fish1.getBreed());
        System.out.println("Fish Watertype: " + fish1.getWaterType());
        System.out.println("Fish Color: " + fish1.getColor()    );
        System.out.println("fih");

    }
}
