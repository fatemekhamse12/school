public class course {
    long courseID;
    String courseName;
    int unit;

    public course(long courseID, String courseName, int unit) {
        this.courseID = courseID;
        this.courseName = courseName;
        this.unit = unit;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public int getUnit() {
        return unit;
    }

    public void setUnit(int unit) {
        this.unit = unit;
    }

    public long getCourseID() {
        return courseID;
    }

    public void setCourseID(long courseID) {
        this.courseID = courseID;
    }

    @Override
    public String toString() {
        return "course{" +
                "courseID=" + courseID +
                ", courseName='" + courseName + '\'' +
                ", unit=" + unit +
                '}';
    }
}
