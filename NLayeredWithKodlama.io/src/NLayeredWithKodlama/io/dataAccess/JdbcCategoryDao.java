package NLayeredWithKodlama.io.dataAccess;

import NLayeredWithKodlama.io.entities.Category;

public class JdbcCategoryDao implements CategoryDao{
    @Override
    public void add(Category category) {
        System.out.println(category.getCategoryName()+" kategorisi Jdbc ile veritabanına eklendi.");

    }

    @Override
    public void delete(Category category) {
        System.out.println(category.getCategoryName()+" kategorisi Jdbc ile veritabanından silindi.");
    }

    @Override
    public void update(Category category) {
        System.out.println(category.getCategoryName()+" kategorisi Jdbc ile veritabanında güncellendi.");

    }
}
