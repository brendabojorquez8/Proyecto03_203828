package Control;

import DAO.DAOUsers;
import Entities.User;
import java.util.List;
import org.bson.types.ObjectId;

/**
 *
 * @author Brenda Bojorquez
 */
public class ControlUsers implements ControlBase<User> {

    DAOUsers user = new DAOUsers();

    @Override
    public boolean insert(User user) {
        return this.user.insert(user);
    }

    @Override
    public List<User> find(String search) {
        return this.user.find(search);
    }

    @Override
    public List<User> find() {
        return this.user.find();
    }

    @Override
    public User findById(ObjectId id) {
        return this.user.findById(id);
    }
    
    public User findByEmail(String email){
        return this.user.findByEmail(email);
    }

    @Override
    public boolean update(User user) {
        return this.user.update(user);
    }

    @Override
    public boolean remove(User user) {
        return this.user.remove(user);
    }

    @Override
    public boolean addElement(User user, Object obj, String edit) {
        return this.user.addElement(user, obj, edit);
    }

    @Override
    public boolean removeElement(User user, Object obj, String edit) {
        return this.user.removeElement(user, obj, edit);
    }

}
