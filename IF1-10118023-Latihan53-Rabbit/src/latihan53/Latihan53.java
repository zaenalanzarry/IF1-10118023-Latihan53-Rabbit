/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package latihan53;

/**
 * @author Zaenal PC
 * NAMA              : Zaenal Anzarry
 * KELAS             : IF-01
 * NIM               : 10118023
 * Deskripsi Program : Rabbit
 */

public class Latihan53 {

    public static void main(String[] args) {
        Animal animal = new Animal(false, "grass", 4);
        Rabbit rabbit = new Rabbit("Peter", animal.isVegetarian(), animal.getEats(), animal.getNoOfLegs(), "grey");
        System.out.println(rabbit.getName() + " has " + rabbit.getNoOfLegs() + " legs");
        System.out.println(rabbit.getName() + " color is " + rabbit.getColor() );
    }
    
}
