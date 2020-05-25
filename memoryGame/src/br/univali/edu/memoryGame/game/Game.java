package br.univali.edu.memoryGame.game;

public class Game {
   private Player player;
   private Table table;
   private Difficulty difficulty;

    public Game(Difficulty difficulty) {
        this.difficulty = difficulty;
        this.player = new Player();
        this.table = new Table();
        table.generateTableCards(difficulty.getNumberOfCards());
    }

    /**
     * Getter of Player
     * @return player
     */
    public Player getPlayer() {
        return player;
    }

    /**
     * Setter of player
     * @param player new player
     */
    public void setPlayer(Player player) {
        this.player = player;
    }

    /**
     * Getter of table
     * @return table
     */
    public Table getTable() {
        return table;
    }

    /**
     * Setter of table
     * @param table new table
     */
    public void setTable(Table table) {
        this.table = table;
    }

    /**
     * Getter of difficulty
     * @return difficulty
     */
    public Difficulty getDifficulty() {
        return difficulty;
    }

    /**
     * Setter of difficulty
     * @param difficulty new difficulty
     */
    public void setDifficulty(Difficulty difficulty) {
        this.difficulty = difficulty;
    }

}
