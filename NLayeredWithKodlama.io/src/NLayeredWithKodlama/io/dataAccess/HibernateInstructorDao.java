package NLayeredWithKodlama.io.dataAccess;

import NLayeredWithKodlama.io.entities.Instructor;

public class HibernateInstructorDao implements InstructorDao{
    @Override
    public void add(Instructor instructor) {
        System.out.println("Veritabanında "+instructor.getName()+" ekleme yaptı.");
    }

    @Override
    public void delete(Instructor instructor) {
        System.out.println("Veritabanında "+instructor.getName()+" silme yaptı.");
    }

    @Override
    public void update(Instructor instructor) {
        System.out.println("Veritabanında "+instructor.getName()+" güncelleme yaptı.");
    }
}
