package frogger;

/**
 * Refactor Task 1.
 *
 * @author Zishen Wen (F22), Deyuan Chen (S22)
 */
public class Road {

    private boolean[] occupied;

    public Road(boolean[] occupied) {
        this.occupied = occupied;
    }

    public boolean isOccupied(int position) {
        return isValid(position) && occupied[position];
    }

    public boolean isValid(int position) {
        return position >= 0 && position < occupied.length;
    }
}
