package Control;

import java.util.List;
import org.bson.types.ObjectId;

/**
 *
 * @author Brenda Bojorquez
 */
public interface ControlBase<T> {

    public boolean insert(T entity);

    public List<T> find(String search);

    public List<T> find();

    public T findById(ObjectId id);

    public boolean update(T entity);
    
    public abstract boolean remove(T entity);
    
    public abstract boolean addElement(T element, Object obj, String edit);
    
    public abstract boolean removeElement(T element, Object obj, String edit);

}
