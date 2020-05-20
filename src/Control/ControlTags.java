package Control;

import DAO.DAOTags;
import Entities.Tag;
import java.util.List;
import org.bson.types.ObjectId;

/**
 *
 * @author Brenda Bojorquez
 */
public class ControlTags implements ControlBase<Tag> {

    DAOTags tag = new DAOTags();

    @Override
    public boolean insert(Tag tag) {
        return this.tag.insert(tag);
    }

    @Override
    public List<Tag> find(String search) {
        return this.tag.find(search);
    }

    @Override
    public List<Tag> find() {
        return this.tag.find();
    }

    @Override
    public Tag findById(ObjectId id) {
        return this.tag.findById(id);
    }

    @Override
    public boolean update(Tag tag) {
        return this.tag.update(tag);
    }

    @Override
    public boolean remove(Tag tag) {
        return this.tag.remove(tag);
    }

    @Override
    public boolean addElement(Tag tag, Object obj, String edit) {
        return this.tag.addElement(tag, obj, edit);
    }

    @Override
    public boolean removeElement(Tag tag, Object obj, String edit) {
        return this.tag.removeElement(tag, obj, edit);
    }

}    
