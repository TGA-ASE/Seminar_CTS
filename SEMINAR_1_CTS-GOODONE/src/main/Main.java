package main;

import classes.*;


public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println("hello");


Zookeeper zk=new Zookeeper("Marta");
Zoo zoo= new Zoo();
zoo.setZookeper(zk);

	}

}
