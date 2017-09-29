/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vehicle;

/**
 *
 * @author crowl
 */
public class AeroPlane extends Vehicle{
    public void walk(){
        System.out.println("AeroPlane is Flying");
    }
    public static void main(String []args){
        AeroPlane garuda = new AeroPlane();
        garuda.function();
        garuda.fuel();
        garuda.walk();
    }

    @Override
    public void fuel() {
        AeroPlane fuel  = new AeroPlane();
        fuel.function();
        fuel.walk();
        System.out.println("Bensin keadaan penuh");
    }
}
