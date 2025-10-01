package nl.bioinf;

import nl.bioinf.rpg.World;
import nl.bioinf.rpg.WorldBuilderFromConfig;
import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.core.config.Configurator;
import picocli.CommandLine.*;

@Command(name = "RPG NullPointer Quest", version = "0.1", mixinStandardHelpOptions = true)
public class CommandLineParser implements Runnable {
    private static final Logger logger = LogManager.getLogger(CommandLineParser.class.getName());

    @Option(names = {"-g", "--grid-size"}, description = "Size of the game world (x by x matrix) [default: ${DEFAULT-VALUE}]")
    int gridSize = 12;
    
    @Parameters(paramLabel = "World Configuration", description = "File containing initial game world contents")
    String[] inputFile;

    @Option(names = {"-v"}, description = "Verbosity level")
    private boolean[] verbose = new boolean[0];

    @Override
    public void run() {
        // Verbosity; change level depending on the amount of 'v's
        if (verbose.length > 2) {
            Configurator.setAllLevels(LogManager.getRootLogger().getName(), Level.DEBUG);
            logger.debug("Verbosity level changed to DEBUG");
        } else if (verbose.length > 1) {
            Configurator.setAllLevels(LogManager.getRootLogger().getName(), Level.INFO);
            logger.info("Verbosity level set to INFO");
        } else if (verbose.length > 0) {
            Configurator.setAllLevels(LogManager.getRootLogger().getName(), Level.WARN);
            logger.warn("Verbosity level set to WARN");
        }

        // FIXME: include sufficient tests here or in the called method before trying to read the file!
        World world = WorldBuilderFromConfig.createWorldFromConfig(inputFile[0]);
        System.out.println("A world has been created with " + world.getCharacters().size() +
                " characters and " + world.getItems().size() + " items.");

        logger.debug("Application finished...");
    }
}
