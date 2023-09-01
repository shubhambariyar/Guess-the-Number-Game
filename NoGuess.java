import java.util.Scanner;
import java.util.Random;
class GameLogic{
    int n;
    int RandomNo;
    public void setNo() {
        System.out.println("Enter no:");
        Scanner sc = new Scanner(System.in);
        this.n = sc.nextInt();
    }
    public int getNo(){
        return this.n;
    }

    public void setRandomNo(){
        Random rd = new Random();
        System.out.println("System decided the number");
        this.RandomNo = rd.nextInt(100);
    }

    public void Compare(){
        if(this.n<this.RandomNo) {
            System.out.println("No. is less");
        }
        else if(this.n>this.RandomNo){
            System.out.println("No. is more");
        }
        else if(this.n==this.RandomNo){
            System.out.println("No. matched");
        }
        else{
            System.out.println("invalid Number");
        }
    }
}

public class NoGuess {
    public static void main(String[] args) {
        GameLogic gl = new GameLogic();
        int count=0;
        gl.setRandomNo();

        while(gl.n!=gl.RandomNo) {
            gl.setNo();
            gl.Compare();
            count++;
        }
        System.out.println("Random no was "+gl.RandomNo);
        System.out.println("Score:"+(100-count));
    }
}
