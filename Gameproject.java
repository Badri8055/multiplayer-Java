import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class GameProject extends JFrame implements ActionListener {
    JButton ticTacToeButton;
    JButton pingpong;
    JButton guess;
    JButton quitButton;


    public GameProject() {
        super("Game Project");

        ticTacToeButton = new JButton("Tic Tac Toe");
        pingpong = new JButton("pingpong");
        guess =new JButton("guessgame");

        quitButton = new JButton("Quit");

        ticTacToeButton.addActionListener(this);
        guess.addActionListener(this);
        pingpong.addActionListener(this);
        quitButton.addActionListener(this);

        JPanel panel = new JPanel(new GridLayout(2, 2));
        panel.add(ticTacToeButton);
        panel.add(pingpong);
        panel.add(guess);
        panel.add(quitButton);

        getContentPane().add(panel);
        pack();
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == ticTacToeButton) {
            TicTacToe game = new TicTacToe();
        } else if (e.getSource() == pingpong) {
            PongGame game = new PongGame();{
            GameFrame frame = new GameFrame();}
        }
        else if (e.getSource() == guess) {
            guessGame game = new guessGame();
        }else if (e.getSource() == quitButton) {
            System.exit(0);
        }
    }

    public static void main(String[] args) {
        GameProject project = new GameProject();
    }
}