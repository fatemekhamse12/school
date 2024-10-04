public class student {
    long studentID;
    String studentName;
    int GPA;

    public student(long studentID, String studentName, int GPA) {
        this.studentID = studentID;
        this.studentName = studentName;
        this.GPA = GPA;
    }

    public long getStudentID() {
        return studentID;
    }

    public void setStudentID(long studentID) {
        this.studentID = studentID;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public int getGPA() {
        return GPA;
    }

    public void setGPA(int GPA) {
        this.GPA = GPA;
    }

    @Override
    public String toString() {
        return "student{" +
                "studentID=" + studentID +
                ", studentName='" + studentName + '\'' +
                ", GPA=" + GPA +
                '}';
    }
}
