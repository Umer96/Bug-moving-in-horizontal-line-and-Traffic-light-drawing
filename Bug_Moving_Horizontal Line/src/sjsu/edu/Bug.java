//Muhammad Umer Sheikh
//Assignment 2.2: Bug moving along horizontal line
//CS 49J

package sjsu.edu;

public class Bug {
    private int position;
    private boolean direction;

    public static void main(String[] args) {
        Bug bug = new Bug(10); //we can change initial position from 10 to any value we wish.
        System.out.println("Expected position = 10, Actual position = " + bug.getPosition()); //Start Position
        bug.move();
        System.out.println("Expected position = 11, Actual position = " + bug.getPosition());
        bug.move();
        bug.move();
        bug.move();
        bug.move();
        System.out.println("Expected position = 15, Actual position = " + bug.getPosition());
        bug.turn();
        bug.move();
        bug.move();
        bug.move();
        System.out.println("Expected position = 12, Actual position = " + bug.getPosition());
        bug.turn();
        bug.move();
        System.out.println("Expected position = 13, Actual position = " + bug.getPosition());
        bug.turn();
        bug.move();
        bug.move();
        bug.move();
        System.out.println("Expected position = 10, Actual position = " + bug.getPosition()); //back the original position
    }

    public Bug(int initialPosition) {
        this.position = initialPosition;
        this.direction = true;
    }

    public void turn() {
        if (this.direction) {
            this.direction = false;
        }
        else {
            this.direction = true;
        }
    }

    public void move() {
        if (this.direction) {
            this.position += 1;
        }
        else {
            this.position -= 1;
        }
    }

    public int getPosition() {
        return this.position;
    }
}