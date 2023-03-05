public class MGMain {
    private GameController ctrl;
    public static void main(String[] args) {
        MGMain main = new MGMain();
        main.playGame();
    }

    public void playGame() {
        this.ctrl = new GameController();
        ctrl.playGame();
    }
}
