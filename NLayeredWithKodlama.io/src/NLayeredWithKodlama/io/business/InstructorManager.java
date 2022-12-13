package NLayeredWithKodlama.io.business;

import NLayeredWithKodlama.io.dataAccess.InstructorDao;
import NLayeredWithKodlama.io.entities.Instructor;

public class InstructorManager {
    private InstructorDao instructorDao;

    public InstructorManager(InstructorDao instructorDao) {
        this.instructorDao = instructorDao;
    }
    public void add(Instructor instructor){
        instructorDao.add(instructor);
    }
    public void delete(Instructor instructor){
        instructorDao.delete(instructor);
    }
    public void update(Instructor instructor){
        instructorDao.update(instructor);
    }
}
