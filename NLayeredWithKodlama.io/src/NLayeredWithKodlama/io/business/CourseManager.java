package NLayeredWithKodlama.io.business;

import NLayeredWithKodlama.io.core.logging.Logger;
import NLayeredWithKodlama.io.dataAccess.CourseDao;
import NLayeredWithKodlama.io.entities.Course;

import java.util.ArrayList;
import java.util.List;

public class CourseManager {
    private CourseDao courseDao;
    private List<Logger> loggers;

    public CourseManager(CourseDao courseDao, List<Logger> loggers) {
        this.courseDao = courseDao;
        this.loggers = loggers;
    }
    List<Course> courses = new ArrayList<>();
    public void add(Course course) throws Exception {
        for (Course courseItem: courses){
            if(courseItem.getCourseName().equals(course.getCourseName())){
                throw new Exception("Belirtilen isimde kurs mevcuttur.");
            }
            if(courseItem.getPrice()<0){
                throw new Exception("Kursun fiyatı 0'dan küçük olamaz.");
            }
        }
        courseDao.add(course);
        courses.add(course);

        for(Logger logger:loggers){
            logger.log(course.getCourseName());
        }
    }
    public void delete(Course course){
        courseDao.delete(course);
    }
    public void update(Course course){
        courseDao.update(course);
    }

}
