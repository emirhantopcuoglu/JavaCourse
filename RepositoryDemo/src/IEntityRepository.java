
public interface IEntityRepository<T extends IEntity>{
	
	void add(T entity); // entity genellikle veri tabani nesnesi anlamina gelir
	void delete(T entity);
	void update(T entity);
	

}
