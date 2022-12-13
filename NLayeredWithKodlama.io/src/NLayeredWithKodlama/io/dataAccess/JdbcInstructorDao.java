package NLayeredWithKodlama.io.dataAccess;

import NLayeredWithKodlama.io.entities.Instructor;

public class JdbcInstructorDao implements InstructorDao{
    @Override
    public void add(Instructor instructor) {
        System.out.println(instructor.getName()+" Jdbc ile veritabanına ekleme yaptı.");
    }

    @Override
    public void delete(Instructor instructor) {
        System.out.println(instructor.getName()+" Jdbc ile veritabanından silme işlemi yaptı.");

    }

    @Override
    public void update(Instructor instructor) {
        System.out.println(instructor.getName()+" Jdbc ile veritabanında güncelleme yaptı.");

    }
}
