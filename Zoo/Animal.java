/*
Creator: Maggie Z
         Katty S
Project: Animal.java
*/

import java.util.*;

public class Animal { //Animal class, store info of animals, will not run Animal.java

  double size; //size of the animal
  String name; //name of that species
  int danger; //danger level of that species
  String nick; //nickname or what we call the species in the zoo

 public void setSize(double s){ //method to set size
   size = s;
 }

 public void setName(String n){ //method to set name
   name = n;
 }

 public void setDanger(int d){ //method to set danger
   danger = d;
 }

 public void setNick(String c){ //method to set nick
   nick = c;
 }

 public double getSize(){ //method to get size
   return size;
 }

 public String getName(){ //method to get name
   return name;
 }

 public Integer getDanger(){ //method to get danger
   return danger;
 }

 public String getNick(){ //method to get nick
   return nick;
 }

 public Animal(String name, String nick, double size, Integer danger) { //maps out what will be stored later in zoo.java of animals, orders will follow "name" then "nick" then "size" then "danger"
    this.name = name;
    this.nick = nick;
    this.size = size;
    this.danger = danger;
  }
}
