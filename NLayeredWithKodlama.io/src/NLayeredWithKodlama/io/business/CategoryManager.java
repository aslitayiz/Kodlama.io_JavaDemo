package NLayeredWithKodlama.io.business;

import NLayeredWithKodlama.io.core.logging.Logger;
import NLayeredWithKodlama.io.dataAccess.CategoryDao;
import NLayeredWithKodlama.io.entities.Category;

import java.util.ArrayList;
import java.util.List;

public class CategoryManager {
    private CategoryDao categoryDao;
    private List<Logger> loggers;

    public CategoryManager(CategoryDao categoryDao, List<Logger> loggers) {
        this.categoryDao = categoryDao;
        this.loggers = loggers;
    }
    List<Category> categories = new ArrayList<>();

    public void add(Category category) throws Exception {
        for(Category categoryname: categories){
            if(categoryname.getCategoryName().equals(category.getCategoryName())){
                throw new Exception("Belirtilen isimde kategori mevcuttur.");
            }
        }
        categoryDao.add(category);


        for(Logger logging:loggers){
           logging.log(category.getCategoryName());

        }
    }
    public void delete(Category category){
        categoryDao.delete(category);
    }
    public void update(Category category){
        categoryDao.update(category);
    }
}
