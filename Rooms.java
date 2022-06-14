public class Rooms {
  private int difficulty;
  private int progression;
  private int level;

  public Rooms(int a) {
    progression = a;
    
    if (progression <= 20) {
      level = 1;
    }
    else if (progression <= 70) {
      level = 2;
    }
    else if (progression < 100) {
      level = 3;
    } 
    else {
      level = 4;
    }
  }
  
  public Rooms(int a, int b) {
    progression = a;
    difficulty = b;
    
    switch (difficulty) {
      case 0:
        progression -= 10;
        break;
      case 1:
        progression -= 20;
        break;
      case 2:
        progression /= 2;
        break;
      case 3:
        progression /= 3;
        break;
      default:
        break;
    }
    
    if (progression <= 20) {
      level = 1;
    }
    else if (progression <= 70) {
      level = 2;
    }
    else if (progression < 100) {
      level = 3;
    } 
    else {
      level = 4;
    }
  }
    
  public String toString() {
    switch (level) {
      case 1:   
        switch (Utils.randInt(0, 2)) {
          case 0:
            return "Unfortunately, the room was filled with fire so you burned to death.";
          
          case 1:
            return "Unfortunately, the room was rigged to explode so you blew up violently.";

          case 2:
            return "Unfortunately, the room was filled with water so you drowned to death.";
        }
      case 2:
        switch (Utils.randInt(0, 4)) {
          case 0:
            return "You stepped on a banana and fell... There are no items in the room of value ):";

          case 1:
            return "You hit your head on the door frame... There are no items in the room of value ):";

          case 2:
            return "You trip and fell over a string... There are no items in the room of value ):";

          case 3:
            return "You had an existential crisis and got depression... There are no items in the room of value ):";
            
          case 4:
            return "You had an asthma attack and had to use your inhaler... There are no items in the room of value ):";
        }
      case 3:
        switch (Utils.randInt(0, 3)) {
          case 0:
            return "There is ice cream in your room! You are happy now :>";

          case 1:
            return "The room is filled with cute puppies :D";

          case 2:
            return "The room turns into an all you can eat buffet, all with your favorite foods.";   
        }
      default:
        return "Congrats! You #girlbossed that room and won the game!";
    }
  }
}
