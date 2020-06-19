package academy.learnprogramming.challenges

import academy.learnprogramming.challenges.challenge3parte2.KotlinBicycle

//recriar as classes Java abaixo em Kotlin

//public class Bicycle {
//
//    private int cadence;
//    private int gear;
//    private int speed;
//
//    public Bicycle(int cadence, int speed, int gear) {
//        this.gear = gear;
//        this.cadence = cadence;
//        this.speed = speed;
//    }
//
//    public int getCadence() {
//        return cadence;
//    }
//
//    public void setCadence(int cadence) {
//        this.cadence = cadence;
//    }
//
//    public int getGear() {
//        return gear;
//    }
//
//    public void setGear(int gear) {
//        this.gear = gear;
//    }
//
//    public int getSpeed() {
//        return speed;
//    }
//
//    public void setSpeed(int speed) {
//        this.speed = speed;
//    }
//
//    public void applyBrake(int decrement) {
//        speed -= decrement;
//    }
//
//    public void speedUp(int increment) {
//        speed += increment;
//    }
//
//    public void printDescription() {
//        System.out.println("Bike is in gear " + gear +
//                            " with a cadence of " + cadence +
//                            " travelling at a speed of " + speed + ".");
//    }
//}

open class KotlinBicycle(var cadence: Int, var speed: Int, var gear: Int) {

    fun applyBrake(decrement: Int) {
        speed -= decrement
    }

    fun speedUp(increment: Int) {
        speed += increment
    }

    open fun printDescription() {
        println("Bike is in gear $gear with a cadence of $cadence " +
                "travelling at a speed of $speed.")
    }

}

//public class MountainBike extends Bicycle {
//
//    private int seatHeight;
//
//    public MountainBike(int seatHeight,
//    int cadence,
//    int speed,
//    int gear) {
//        super(cadence, speed, gear);
//        this.seatHeight = seatHeight;
//    }
//
//    public int getSeatHeight() {
//        return seatHeight;
//    }
//
//    public void setSeatHeight(int seatHeight) {
//        this.seatHeight = seatHeight;
//    }
//
//    public void printDescription() {
//        super.printDescription();
//        System.out.println("The mountain bike has a seat height of " + seatHeight + " inches.");
//    }
//}

class KotlinMountainBike(var seatHeight: Int, cadence: Int, speed: Int, gear: Int):
        KotlinBicycle(cadence, speed, gear) {


    override fun printDescription() {
        super.printDescription()
        println("The mountain bike has a seat height of $seatHeight inches.")
    }

}

//public class RoadBike extends Bicycle {
//
//    private int tireWidth;
//
//    public RoadBike(int cadence,
//    int speed,
//    int gear,
//    int tireWidth) {
//        super(cadence, speed, gear);
//        this.tireWidth = tireWidth;
//    }
//
//    public int getTireWidth() {
//        return tireWidth;
//    }
//
//    public void printDescription() {
//        super.printDescription();
//        System.out.println("The road bike has a tire width of " + tireWidth + " MM.");
//    }
//
//}

class KotlinRoadBike(val tireWidth: Int, cadence: Int, speed: Int, gear: Int):
        KotlinBicycle(cadence, speed, gear) {

    override fun printDescription() {
        super.printDescription()
        println("The road bike has a tire width of $tireWidth MM.")
    }
}
