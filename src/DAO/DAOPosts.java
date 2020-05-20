package DAO;

import Entities.Post;
import com.mongodb.MongoServerException;
import com.mongodb.client.MongoCollection;
import static com.mongodb.client.model.Filters.eq;
import java.util.ArrayList;
import java.util.List;
import org.bson.Document;
import org.bson.types.ObjectId;

/**
 *
 * @author Brenda Bojorquez
 */
public class DAOPosts extends DAOBase<Post> {

    MongoCollection<Post> posts;

    public DAOPosts() {
        super();
        this.posts = dataBase.getCollection("posts", Post.class);
    }

    @Override
    public boolean insert(Post post) {
        try {
            this.posts.insertOne(post);
            return true;
        } catch (MongoServerException ex) {
            return false;
        }
    }

    @Override
    public boolean update(Post post) {
        Post update = findById(post.getId());
        if (update != null) {
            update.setDateHour(post.getDateHour());
            update.setTags(post.getTags());
            update.setText(post.getText());
            update.setComments(post.getComments());
            update.setUser(post.getUser());
            this.posts.updateOne(new Document("_id", post.getId()), new Document("$set", update));
            return true;
        } else {
            return false;
        }
    }

    @Override
    public boolean remove(Post post) {
        try {
            this.posts.deleteOne(new Document("_id", post.getId()));
            return true;
        } catch (MongoServerException ex) {
            return false;
        }
    }

    @Override
    public List<Post> find(String search) {
        ArrayList<Post> findPosts = new ArrayList<>();
        if (search == null || search.isEmpty()) {
            for (Post post : posts.find()) {
                findPosts.add(post);
            }
        } else {
            for (Post post : posts.find(eq("name", search))) {
                findPosts.add(post);
            }

        }
        return findPosts;
    }

    public List<Post> find() {
        ArrayList<Post> findPosts = new ArrayList<>();

        for (Post post : posts.find()) {
            findPosts.add(post);
        }

        return findPosts;
    }

    @Override
    public Post findById(ObjectId id) {
        return posts.find(eq("_id", id)).first();
    }

    @Override
    public boolean addElement(Post post, Object obj, String edit) {
        try {
            this.posts.updateOne(new Document("_id", post.getId()), new Document("$addToSet", new Document(edit, obj)));
            return true;
        } catch (MongoServerException ex) {
            return false;
        }
    }

    @Override
    public boolean removeElement(Post post, Object obj, String edit) {
        try {
            this.posts.updateOne(new Document("_id", post.getId()), new Document("$pull", new Document(edit, obj)));
            return true;
        } catch (MongoServerException ex) {
            return false;
        }
    }

}
