import javax.swing.*;
import java.awt.*;

public class Game extends JFrame {
    public static void main(String[] args) {
         new Game();

    }

    public Game(){
        this.init();
        //this.rules();
        // this.agreeButton();
    }

    private void init(){
        this.setVisible(true);
        this.setSize(Definition.WINDOW_WIDTH, Definition.WINDOW_HIGHT);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(null);
        this.setLocationRelativeTo(null);
        this.setResizable(false);
        this.setTitle("Crazy bird");
        GameScene gameScene = new GameScene();
        gameScene.setBounds(Definition.GAME_SCENE_BOUNDS, Definition.GAME_SCENE_BOUNDS, Definition.WINDOW_WIDTH, Definition.WINDOW_HIGHT);
        this.add(gameScene);

    }

    /*private void rules(){
        JLabel welcome = new JLabel();
        welcome.setText("Welcome to Crazy bird ! ! rules of the game:");
        welcome.setBounds(Definition.TEXT_X,Definition.TEXT_Y,Definition.TEXT_WIDTH,Definition.TEXT_HIGHT);
        this.add(welcome);
        JLabel gameRules1 = new JLabel();
        gameRules1.setText("1. use the arrows on the keyboard keys");
        gameRules1.setBounds(Definition.TEXT_X1,Definition.TEXT_Y1,Definition.TEXT_WIDTH1,Definition.TEXT_HIGHT1);
        this.add(gameRules1);
        JLabel gameRules2 = new JLabel();
        gameRules2.setText("2. don't touch the walls or you lose!!");
        gameRules2.setBounds(Definition.TEXT_X2,Definition.TEXT_Y2,Definition.TEXT_WIDTH2,Definition.TEXT_HIGHT2);
        this.add(gameRules2);
        JLabel gameRules3 = new JLabel();
        gameRules3.setText("3. point will be counted according to the obstacles you pass");
        gameRules3.setBounds(Definition.TEXT_X3,Definition.TEXT_Y3,Definition.TEXT_WIDTH3,Definition.TEXT_HIGHT3);
        this.add(gameRules3);
    }*/

   /* public void agreeButton(){
        JButton iAgree = new JButton("i agree");
        iAgree.setBounds(Definition.BUTTON_X,Definition.BUTTON_Y,Definition.BUTTON_WIDTH,Definition.BUTTON_HIGHT);
        iAgree.addActionListener((event) -> {

        });
        this.add(iAgree);
        iAgree.setBackground(Color.CYAN);
    }*/


}
