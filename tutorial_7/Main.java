import javax.swing.SwingUtilities;

public class Main {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            QuizBattleGUI gui = new QuizBattleGUI();
            gui.setVisible(true);
        });
    }
}