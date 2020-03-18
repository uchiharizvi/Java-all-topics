package mostvalubaleplayer;

import mostvalubaleplayer.model.input.Player;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class MostValuablePlayer {

    public static void main(String[] args) throws FileNotFoundException {


        System.out.println("Reading the inputs from text file...");
        File file = new File("C:\\Users\\user\\Desktop\\input.txt");
        Scanner scanner = new Scanner(file);

        scanner.useDelimiter("\\Z");
        String teamData= scanner.next();
        System.out.println(teamData);
        /*Player player = new Player();
        player.setName(inputs.);*/
        String[] playerData= teamData.split("\n");

        findMvpPlayer(scanner);
    }

    private static void findMvpPlayer(Scanner scanner) {

    }


}
