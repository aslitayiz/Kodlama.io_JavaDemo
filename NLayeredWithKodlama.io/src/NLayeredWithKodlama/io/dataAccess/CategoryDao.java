package NLayeredWithKodlama.io.dataAccess;

import NLayeredWithKodlama.io.entities.Category;

public interface CategoryDao {
    void add (Category category);
    void delete (Category category);
    void update (Category category);
}
