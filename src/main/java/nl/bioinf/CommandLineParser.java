package nl.bioinf;

import nl.bioinf.rpg.World;
import nl.bioinf.rpg.WorldBuilderFromConfig;
import picocli.CommandLine.*;

@Command(name = "RPG NullPointer Quest", version = "0.1", mixinStandardHelpOptions = true)
public class CommandLineParser implements Runnable {

    @Option(names = {"-g", "--grid-size"}, description = "Size of the game world (x by x matrix)")
    int gridSize = 12;

    @Parameters(paramLabel = "World Configuration", description = "File containing initial game world contents")
    String inputFile;

    @Override
    public void run() {
        // FIXME: include sufficient tests here or in the called method before trying to read the file!
        World world = WorldBuilderFromConfig.createWorldFromConfig(inputFile);
        System.out.println("A world has been created with " + world.getCharacters().size() +
                " characters and " + world.getItems().size() + " items.");
    }
}
