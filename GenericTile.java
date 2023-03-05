public class GenericTile {
    private boolean[] exits;

    public GenericTile() {
        this.exits = new boolean[4];
    }

    public void setExits() {
        for (int i = 0; i < 4; i++) {
            double random = Math.random();

            this.exits[i] = random < 0.5 ? true : false;
        }
    }

    public boolean getExit(int exitNumber) {
        return this.exits[exitNumber];
    }

    public String getExitStr(int exitNumber) {
        return this.exits[exitNumber] ? "L" : "U";
    }

}
