import generate.*;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        University university = new University("ВГУ");
        Faculty faculty = new Faculty("ФКН");
        Institute institute = new Institute("Кафедра", "Адрес");
        university.setFaculties(getArrayList(faculty));
        faculty.setInstitutes(getArrayList(institute));
        Dean dean = new Dean("А. А. Крыловецкий", 1, "kryl@mail.ru", 1);

        faculty.setDean(dean);

        ResearchEmployee researchEmployeeFirst = new ResearchEmployee("Научный персонал", 2, "email2@gmail.com", 2);
        ResearchEmployee researchEmployeeSecond = new ResearchEmployee("Научный персонал", 3, "email3@gmail.com", 3);

        institute.setResearchEmployees(getArrayList(researchEmployeeFirst, researchEmployeeSecond));
        researchEmployeeFirst.setInstitute(institute);
        researchEmployeeSecond.setInstitute(institute);

        Project projectFirst = new Project("1 проект", 140, new Date(), new Date(System.currentTimeMillis() + 1000 * 60 * 60 * 140));
        Project projectSecond = new Project("2 проект", 370, new Date(), new Date(System.currentTimeMillis() + 1000 * 60 * 60 * 370));

        researchEmployeeFirst.setProjects(getArrayList(projectFirst, projectSecond));

        AdministrativeEmployee administrativeEmployee = new AdministrativeEmployee("Имя", 4, "admin@vsu.ru", 4);

        Lecturer lecturer = new Lecturer("Имя", 4, "@gmail.com", 5);

        Course courseFirst = new Course(1, "первый курс", 2);
        Course courseSecond = new Course(2, "второй курс", 3);

        lecturer.setCourses(getArrayList(courseFirst, courseSecond));
        System.out.println("Работа выполнена успешно");
    }

    @SafeVarargs
    private static <T> ArrayList<T> getArrayList(T ...elements) {
        return new ArrayList<>(List.of(elements));
    }

}