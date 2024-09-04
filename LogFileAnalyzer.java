import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.io.*;

public class LogFileAnalyzer {

    public static List<String> readLogFile(String filePath) throws IOException {
        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            return reader.lines().collect(Collectors.toList());
        }
    }

    public static String extractIPAddress(String logLine) {
        return logLine.split(" ")[0]; // IP adress the data of each log line // keep hacking
    }

    public static void main(String[] args) throws IOException {
        List<String> loglines = readLogFile("dataset-dummy-data.log");
        Map<String, Long> ipCounts = loglines.parallelStream()
        .map(LogFileAnalyzer::extractIPAddress)
        .collect(Collectors.groupingByConcurrent(ip -> ip, Collectors.counting()));

        ipCounts.forEach((ip, count ) -> 
        System.out.println("IP Address: " + ip + " - occurences: " + count));
    }
}