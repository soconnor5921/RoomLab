package Rooms;

import People.Person;

public class HauntedRoom extends Room
{
    public HauntedRoom(int x, int y)
    {
        super(x, y);
    }

    public void enterRoom(Person x)
    {
        occupant = x;
        x.setxLoc(this.xLoc);
        x.setyLoc(this.yLoc);
        System.out.println("You found the haunted room, get out fast before the ghosts get you!");
    }

    public void leaveRoom(Person x)
    {
        occupant = null;
    }
}
