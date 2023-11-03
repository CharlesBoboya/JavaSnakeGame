 import org.w3c.dom.ls.LSOutput;

 import javax.swing.*;

    public class Game extends JFrame {

        public Game() {
            this.add(new Graphics());
            this.setTitle("Snake Game");
            this.pack();
            this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            this.setResizable(false);
            this.setVisible(true);
            this.setLocationRelativeTo(null);
        }

        public static void main(String[] args) {
            new Game();
        }
    }


