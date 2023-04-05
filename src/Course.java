public class Course {

    private String name;
    private int period;
    private College college;
    private Classgroup classgroup;
    private Teacher professor;

    public Course() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPeriod() {
        return period;
    }

    public void setPeriod(int period) {
        this.period = period;
    }

    public College getCollege() {
        return college;
    }

    public void setCollege(College college) {
        this.college = college;
    }

    public Classgroup getClassgroup() {
        return classgroup;
    }

    public void setClassgroup(Classgroup classgroup) {
        this.classgroup = classgroup;
    }

    public Teacher getProfessor() {
        return professor;
    }

    public void setProfessor(Teacher professor) {
        this.professor = professor;
    }

}
