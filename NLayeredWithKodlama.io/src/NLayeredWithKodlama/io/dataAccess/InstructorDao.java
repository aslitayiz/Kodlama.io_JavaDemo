package NLayeredWithKodlama.io.dataAccess;

import NLayeredWithKodlama.io.entities.Instructor;

public interface InstructorDao {
    void add (Instructor instructor);
    void delete (Instructor instructor);
    void update (Instructor instructor);

}
