public class FastestRunner {
// Written by: Mike Baldwin
// Project 6 - Part 4 - Scanning Text
// This program prints a list of runners and their times.
// It then prints the name and time of the fastest runner.

public static void main(String[] args) {
    final int numRunners = 16;
    String[] names = {"Elena", "Thomas", "Hamilton", "Suzie", "Phil",
            "Matt", "Alex", "Emma", "John", "James", "Jane", "Emily",
            "Daniel", "Neda", "Aaron", "Kate"};
    int[] times = {341, 273, 278, 329, 445, 402, 388, 275, 243, 334,
            412, 393, 299, 343, 317, 265};

    System.out.println("Name        Time (minutes)");
    for (int i = 0; i < numRunners; i++)
        System.out.println(names[i] + getLeftoverSpaces(names[i], 12) +
                times[i]);

    System.out.println("The fastest runner is " +
            names[getLowestTimeIndex(times)] + " with a time of " +
            times[getLowestTimeIndex(times)]);
}

private static int getLowestTimeIndex(int[] times) {
    int lowestIndex;
    lowestIndex = 0;
    for (int i = 0; i < times.length; i++)
        if (times[i] < times[lowestIndex])
            lowestIndex = i;
    return lowestIndex;
}

private static String getLeftoverSpaces(String name, int totalLength) {
    String spaces;
    spaces = "";
    for (int i = 0; i < totalLength - name.length(); i++)
        spaces += " ";
    return spaces;
}
}
