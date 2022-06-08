package hexlet.code;

import picocli.CommandLine;
import picocli.CommandLine.Command;
import picocli.CommandLine.Option;
import picocli.CommandLine.Parameters;
@Command(name = "gendiff", mixinStandardHelpOptions = true, version = "1.0",
        description = "Compares the two configuration files and shows the difference between them.")

public class App implements Runnable {

    @Parameters(index = "filepath1", description = "path to first file")
    private int filepath1;

    @Parameters(index = "filepath2", description = "path to second file")
    private int filepath2;

    @Option(names = {"-f", "--format"}, defaultValue = "stylish", description = "output format [default: stylish]")
    private String format = "";

    @Option(names = { "-h", "--help" }, usageHelp = true, description = "Show this help message and exit.")
    private boolean helpRequested = false;

    @Option(names = {"-V", "--version"}, versionHelp = true, description = "Print version information and exit.")
    boolean versionInfoRequested;

    @Override
    public void run() {
        System.out.println("Hello, world!");
    }
    public static void main(String[] args) {
        int exitCode = new CommandLine(new App()).execute(args);
        System.exit(exitCode);
    }
}
