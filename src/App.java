public class App {
    public static void main(String[] args) {

        College college = new College();
        college.setName("Universidade Católica de Pernambuco");
        college.setLocation("Rua do Príncipe, Recife.");

        Discipline discipline = new Discipline();
        discipline.setName("Programação Orientada à Objetos");

        Classgroup classgroup = new Classgroup();
        classgroup.setRegistration(123);
        classgroup.setDiscipline(discipline);

        Teacher teacher = new Teacher();
        teacher.setName("Iago Rodrigues");
        teacher.setRegistration(456);
        teacher.setCollege(college);

        Course course = new Course();
        course.setName("Sistemas para Internet");
        course.setPeriod(3);
        course.setCollege(college);
        course.setClassgroup(classgroup);
        course.setProfessor(teacher);

        System.out.println("Nome do curso: " + course.getName());
        System.out.println("Período: " + course.getPeriod());
        System.out.println("Faculdade: " + course.getCollege().getName());
        System.out.println("Localização da faculdade: " + course.getCollege().getLocation());
        System.out.println("Disciplina: " + course.getClassgroup().getDiscipline().getName());
        System.out.println("Código da turma: " + course.getClassgroup().getRegistration());
        System.out.println("Professor: " + course.getProfessor().getName());
        System.out.println("Matrícula do professor: " + course.getProfessor().getRegistration());
    }
}
