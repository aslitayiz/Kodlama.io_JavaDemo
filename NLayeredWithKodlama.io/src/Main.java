import NLayeredWithKodlama.io.business.*;
import NLayeredWithKodlama.io.core.logging.*;
import NLayeredWithKodlama.io.dataAccess.*;
import NLayeredWithKodlama.io.entities.Category;
import NLayeredWithKodlama.io.entities.Course;
import NLayeredWithKodlama.io.entities.Instructor;


import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws Exception {
        Course course1 = new Course(1,"Java",200);
        Course course2 = new Course(2,"Javascript",0);
        List<Logger> loggers = new ArrayList<>();
        loggers.add(new FileLogger());
        loggers.add(new MailLogger());
        loggers.add(new DatabaseLogger());

        CourseManager courseManager = new CourseManager(new HibernateCourseDao(),loggers);

        courseManager.add(course1);
        System.out.println("***********************");
        courseManager.add(course2);
        System.out.println("***********************");

        Category category1 = new Category(1,"Tüm Kurslar");
        Category category2 = new Category(2,"Sık Sorulan Sorular");


        CategoryManager categoryManager = new CategoryManager(new HibernateCategoryDao(),loggers);
        categoryManager.add(category1);
        System.out.println("***********************");
        categoryManager.add(category2);
        
        System.out.println("***********************");
        Instructor instructor = new Instructor(1,"Engin Demiroğ");
        InstructorManager instructorManager = new InstructorManager(new HibernateInstructorDao());
        instructorManager.add(instructor);





    }
}