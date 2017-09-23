package io.i5possible.game;


import static io.i5possible.game.InputUtils.in;

/**
 * Created by lianghong on 21/09/2017.
 */
public class GuessNumberGame {
    private boolean play = true;

    public static void main(String[] args) {
        new GuessNumberGame().Play();
    }

    public void Play(){
        System.out.println("Welcome to Guess Number Game!");

        while (play) {
            this.PlayOnce();
        }
    }

    public void PlayOnce(){
        System.out.println("Are you ready to play the game? [Y/N]");
        play = isPlay();
        if (!play) {
            System.out.println("Thanks for playing the game!");
            System.out.println("Good Bye!");
            return ;
        }
        this.PlayGame();
    }

    private void PlayGame() {
    }

    private boolean isPlay() {
        return in.hasNext() && in.next().trim().toLowerCase().equals("y");
    }
}
