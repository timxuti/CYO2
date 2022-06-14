/*
Game class - text based adventure game
In this game, the player is presented with a selection of rooms, where a fate will await -  randomly generated for every room

Author - Tim Xu

Change history:
5/13: Created
*/

import java.util.HashMap;

public class Game {
  // Private instance variables to store the facts and score
  private HashMap<Integer, Rooms> rooms;

  // Constructor, to initialize the instance variable
  public Game() {
    System.out.println("\nHey there player! In this game, you will chose between rooms to test your luck! \nYou may die, you may live, and you may even win!\n");

    rooms = new HashMap <Integer, Rooms>();
    
    rooms.put(1,new Rooms(Utils.randInt(10,100)));
    rooms.put(2,new Rooms(Utils.randInt(10,100)));
    rooms.put(3,new Rooms(Utils.randInt(0,100)));
    rooms.put(4,new Rooms(Utils.randInt(0,100),0));
    rooms.put(5,new Rooms(Utils.randInt(0,100),0));
    rooms.put(6,new Rooms(Utils.randInt(0,100),1));
    rooms.put(7,new Rooms(Utils.randInt(0,100),2));
    rooms.put(8,new Rooms(Utils.randInt(0,100),3));
  }

  // Method to let a user create/modify/delete facts
  public void play() {
    System.out.print("Which level would you like to play? ");
    int command = Utils.inputNum("Choose a level from 1 - 3:\n");
    int roomNum = 0;
    switch (command) {
      case 1:
        System.out.println("Which room would you like to enter?");
        int a = Utils.inputNum("Choose a room between 1 and 2:\n");
        switch (a) {
          // Marc - this code is not very efficient. Also - the default case says "lets go with room X", but then actually picks a different room (another random int) - same for your other nested cases.
          // I would consider just saying:
          // if (a >= 1 and a <= 2)
          //  System.out.println (rooms.get(a));
          // else {
          //  a = Utils.randInt(1,2);
          //  // then print let's go with room a and go with it.
          // }
            
          case 1:
            System.out.println(rooms.get(1));
            break;
          case 2:
            System.out.println(rooms.get(2));
            break;
          default:
            roomNum = Utils.randInt(1,2);
            System.out.println("Let's just go with room " + roomNum + "...");
            System.out.println(rooms.get(roomNum));
            break;
        }
      case 2:
        System.out.println("Which room would you like to enter?");
        int b = Utils.inputNum("Choose a room from 1 - 3:\n");
        switch (b) {
          case 1:
            System.out.println(rooms.get(1));
            break;
          case 2:
            System.out.println(rooms.get(2));
            break;
          case 3:
            System.out.println(rooms.get(3));
            break;
          default:
            roomNum = Utils.randInt(1,3);
            System.out.println("Let's just go with room " + roomNum + "...");
            System.out.println(rooms.get(roomNum));
            break;
        }
      case 3:
        System.out.println("Which room would you like to enter?");
        int c = Utils.inputNum("Choose a room from 1 - 5:\n");
        switch (c) {
          case 1:
            System.out.println(rooms.get(1));
            break;
          case 2:
            System.out.println(rooms.get(2));
            break;
          case 3:
            System.out.println(rooms.get(3));
            break;
          case 4:
            System.out.println(rooms.get(4));
            break;
          case 5:
            System.out.println(rooms.get(5));
            break;  
          default:
            roomNum = Utils.randInt(1,5);
            System.out.println("Let's just go with room " + roomNum + "...");
            System.out.println(rooms.get(roomNum));
            break;
        }
      default:
          System.out.println("Fine then. Let's just go with level 4 >:(");
          System.out.println("Which room would you like to enter?");
          int d = Utils.inputNum("Choose a room from 1 - 10:\n");
          switch (d) {
            case 1:
              System.out.println(rooms.get(1));
              break;
            case 2:
              System.out.println(rooms.get(2));
              break;
            case 3:
              System.out.println(rooms.get(3));
              break;
            case 4:
              System.out.println(rooms.get(4));
              break;
            case 5:
              System.out.println(rooms.get(5));
              break;  
            case 6:
              System.out.println(rooms.get(6));
              break;  
            case 7:
              System.out.println(rooms.get(7));
              break; 
            case 8:
              System.out.println(rooms.get(8));
              break;
            default:
              roomNum = Utils.randInt(1,5);
              System.out.println("Let's just go with room " + roomNum + "...");
              System.out.println(rooms.get(roomNum));
              break;
          }    
    }
  }
}