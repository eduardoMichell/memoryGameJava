package br.univali.edu.memoryGame.game;

public class Player {
    private int points;

    public Player() {
        this.points = 0;
    }

    /**
     * Getter of points
     *
     * @return points
     */
    public int getPoints() {
        return points;
    }

    /**
     * Setter of points
     *
     * @param points new points
     */
    public void setPoints(int points) {
        this.points = points;
    }

}
