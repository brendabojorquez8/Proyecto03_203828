package Control;

import DAO.DAOPosts;
import Entities.Post;
import java.util.List;
import org.bson.types.ObjectId;

/**
 *
 * @author Brenda Bojorquez
 */
public class ControlPosts implements ControlBase<Post> {

    DAOPosts post = new DAOPosts();

    @Override
    public boolean insert(Post post) {
        while(post.getText().contains("#")){
            int index=post.getText().indexOf("#");
        }
        return this.post.insert(post);
    }

    @Override
    public List<Post> find(String search) {
        return this.post.find(search);
    }

    @Override
    public List<Post> find() {
        return this.post.find();
    }

    @Override
    public Post findById(ObjectId id) {
        return this.post.findById(id);
    }

    @Override
    public boolean update(Post post) {
        return this.post.update(post);
    }

    @Override
    public boolean remove(Post post) {
        return this.post.remove(post);
    }

    @Override
    public boolean addElement(Post post, Object obj, String edit) {
        return this.post.addElement(post, obj, edit);
    }

    @Override
    public boolean removeElement(Post post, Object obj, String edit) {
        return this.post.removeElement(post, obj, edit);
    }

}    

