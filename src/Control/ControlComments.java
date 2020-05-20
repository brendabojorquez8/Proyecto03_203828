package Control;

import DAO.DAOComments;
import Entities.Comment;
import java.util.List;
import org.bson.types.ObjectId;

/**
 *
 * @author Brenda Bojorquez
 */
public class ControlComments implements ControlBase<Comment> {

    DAOComments comment = new DAOComments();

    @Override
    public boolean insert(Comment comment) {
        return this.comment.insert(comment);
    }

    @Override
    public List<Comment> find(String search) {
        return this.comment.find(search);
    }

    @Override
    public List<Comment> find() {
        return this.comment.find();
    }

    @Override
    public Comment findById(ObjectId id) {
        return this.comment.findById(id);
    }

    @Override
    public boolean update(Comment comment) {
        return this.comment.update(comment);
    }

    @Override
    public boolean remove(Comment comment) {
        return this.comment.remove(comment);
    }

    @Override
    public boolean addElement(Comment comment, Object obj, String edit) {
        return this.comment.addElement(comment, obj, edit);
    }

    @Override
    public boolean removeElement(Comment comment, Object obj, String edit) {
        return this.comment.removeElement(comment, obj, edit);
    }

}    
