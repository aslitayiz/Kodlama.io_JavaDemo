package NLayeredWithKodlama.io.dataAccess;

import NLayeredWithKodlama.io.entities.Course;

public class JdbcCourseDao implements CourseDao{
    @Override
    public void add(Course course) {
        System.out.println(course.getCourseName()+" kursu Jdbc ile veritabanına eklendi.");
    }

    @Override
    public void delete(Course course) {
        System.out.println(course.getCourseName()+" kursu Jdbc ile veritabanından silindi.");

    }

    @Override
    public void update(Course course) {
        System.out.println(course.getCourseName()+" kursu Jdbc ile veritabanında güncellendi.");

    }
}
