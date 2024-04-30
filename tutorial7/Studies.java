public class Studies {
    private final String name;
    private final String description;
    private final int numberOfSemesters;
    private final int maxITNs;

    public Studies(String name, String description, int numberOfSemesters, int maxITNs) {
        this.name = name;
        this.description = description;
        this.numberOfSemesters = numberOfSemesters;
        this.maxITNs = maxITNs;
    }


    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public int getNumberOfSemesters() {
        return numberOfSemesters;
    }

    public int getMaxITNs() {
        return maxITNs;
    }
}
