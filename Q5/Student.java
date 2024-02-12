class Student {
    private String name;
    private int id;
    private int[] courseMarks;

    
    public Student(String name, int id, int[] courseMarks) {
        this.name = name;
        this.id = id;
        this.courseMarks = courseMarks;
    }

    public double calculateAverageMarks() {
        int sum = 0;
        for (int mark : courseMarks) {
            sum += mark;
        }
        return (double) sum / courseMarks.length;
    }

   
    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }
    public String toString() {
        return "Name: " + name + "\nID: " + id + "\nAverage Grade: " + calculateAverageMarks();
    }
}

    






