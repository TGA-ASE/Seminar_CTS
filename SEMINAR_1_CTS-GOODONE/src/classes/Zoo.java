package classes;

import java.util.ArrayList;
import java.util.List;

public class Zoo {
	private List<Animal> animals;
	private Zookeeper zookeeper;
	
	public List<Animal> getAnimals() {
		return animals;
	}

	public void setAnimals(List<Animal> animals) {
		this.animals = animals;
	}

	public Zoo() {
		super();
		animals=new ArrayList<Animal>();
		zookeeper=new Zookeeper("Gigi");
		
	}

	public Zookeeper getZookeper() {
		return zookeeper;
	}

	public void setZookeper(Zookeeper zookeeper) {
		this.zookeeper = zookeeper;
	}

	public Zoo(List<Animal> animals, Zookeeper zookeper) {
		super();
		this.animals = animals;
		this.zookeeper = zookeper;
	}

	public void feedallanimals()
	{
		
		for(Animal a: animals)
		{zookeeper.feed(a);}
		
	}
	
	public void addAnimal(Animal a)
	{
		
		animals.add(a);
		
	}
}
