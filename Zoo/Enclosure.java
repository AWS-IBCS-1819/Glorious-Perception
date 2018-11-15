/*
Creator: Maggie Z
         Katty S
Project: Enclosure.java
*/

import java.util.*;

public class Enclosure { //Enclosure class, store info of enclosures, will not run Enclosure.java

  int popularity; //visitor's ratings
  String origin; //name of each enclosure
  int animalsize; //contains how many animals

  public void setPopularity(int p) { //method to set popularity
    popularity = p;
  }

  public void setOrigin(String o) { //method to set origin
    origin = o;
  }

  public void setAnimalsize(int a) { //method to set animalsize
    animalsize = a;
  }

  public Integer getPopularity() { //method to get popularity
    return popularity;
  }

  public String getOrigin() { //method to get origin
    return origin;
  }

  public Integer getAnimalsize() { //method to get animalsize
    return animalsize;
  }

  public Enclosure(String origin, int animalsize, int popularity) { //maps out what will be stored later in zoo.java of enclosures, orders will follow "origin" then "animalsize" then "popularity"
    this.popularity = popularity;
    this.origin = origin;
    this.animalsize = animalsize;
  }

}
