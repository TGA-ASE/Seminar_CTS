package main;

import classes.*;


public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println("hello");


Zookeeper zk=new Zookeeper("Marta");
Zoo zoo= new Zoo();
zoo.setZookeper(zk);
Giraffe g1=new Giraffe("Girafa1",10);
Giraffe g2=new Giraffe("Girafa2",20,200);
Zebra z1=new Zebra("Zebra1",10,6);
Zebra z2=new Zebra("Zebra2",20,16);
zoo.addAnimal(g1);
zoo.addAnimal(g2);
zoo.addAnimal(z1);
zoo.addAnimal(z2);

zoo.feedallanimals();
	}

}
