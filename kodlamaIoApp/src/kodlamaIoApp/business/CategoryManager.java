package kodlamaIoApp.business;

import kodlamaIoApp.core.logging.Logger;
import kodlamaIoApp.dataAccess.CategoryDao;

import kodlamaIoApp.entities.Category;


public class CategoryManager implements CategoryService{
	

	private CategoryDao categoryDao;
	private Category [] categories;
	private Logger [] loggers;
	
	public CategoryManager(CategoryDao categoryDao, Category[] categories,Logger [] loggers) {
		
		this.categoryDao = categoryDao;
		this.categories = categories;
		this.loggers = loggers;
	}

	@Override
	public void add(Category category) throws Exception {
		
		for(Category category1: categories) {
			if(category1.getCategoryName() == category.getCategoryName()) {
				throw new Exception("Kategori ismi ayný olamaz");
			}
		}
		categoryDao.add(category);
		
		for(Logger logger:loggers) {
			
			logger.log(category.getCategoryName());
		}
	}
	
	

	
	
	
	
	
	




	


	
		
	



	
}
	
