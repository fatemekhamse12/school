public class teacher {
    long TeacherID;
    String TeacherName;

    public teacher(long teacherID, String teacherName) {
        TeacherID = teacherID;
        TeacherName = teacherName;
    }

    public long getTeacherID() {
        return TeacherID;
    }

    public void setTeacherID(long teacherID) {
        TeacherID = teacherID;
    }

    public String getTeacherName() {
        return TeacherName;
    }

    public void setTeacherName(String teacherName) {
        TeacherName = teacherName;
    }

    @Override
    public String toString() {
        return "teacher{" +
                "TeacherID=" + TeacherID +
                ", TeacherName='" + TeacherName + '\'' +
                '}';
    }
}
