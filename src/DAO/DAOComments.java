package DAO;

import Entities.Comment;
import Entities.User;
import com.mongodb.MongoServerException;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.model.Filters;
import static com.mongodb.client.model.Filters.eq;
import java.util.ArrayList;
import java.util.List;
import org.bson.Document;
import org.bson.types.ObjectId;

/**
 *
 * @author Brenda Bojorquez
 */

public class DAOComments extends DAOBase<Comment> {

    MongoCollection<Comment> comments;

    public DAOComments() {
        super();
        this.comments = dataBase.getCollection("comments", Comment.class);
    }

    @Override
    public boolean insert(Comment comment) {
        try {
            this.comments.insertOne(comment);
            return true;
        } catch (MongoServerException ex) {
            return false;
        }
    }

    @Override
    public boolean update(Comment comment) {
        Comment update = findById(comment.getId());
        if (update != null) {
            update.setDateHour(comment.getDateHour());
            update.setText(comment.getText());
            update.setUser(comment.getUser());
            this.comments.updateOne(new Document("_id", comment.getId()), new Document("$set", update));
            return true;
        } else {
            return false;
        }
    }

    @Override
    public boolean remove(Comment comment) {
        try {
            this.comments.deleteOne(new Document("_id", comment.getId()));
            return true;
        } catch (MongoServerException ex) {
            return false;
        }
    }
    
     public boolean removeByUser(User user) {
        try {
            this.comments.deleteMany(Filters.eq("user",user.getId()));
            return true;
        } catch (MongoServerException ex) {
            return false;
        }
    }

    @Override
    public List<Comment> find(String search) {
        ArrayList<Comment> findComments = new ArrayList<>();
        if (search == null || search.isEmpty()) {
            for (Comment comment : comments.find()) {
                findComments.add(comment);
            }
        } else {
            for (Comment comment : comments.find(eq("name", search))) {
                findComments.add(comment);
            }

        }
        return findComments;
    }

    public List<Comment> find() {
        ArrayList<Comment> findComments = new ArrayList<>();

        for (Comment comment : comments.find()) {
            findComments.add(comment);
        }

        return findComments;
    }

    @Override
    public Comment findById(ObjectId id) {
        return comments.find(eq("_id", id)).first();
    }

    @Override
    public boolean addElement(Comment comment, Object obj, String edit) {
        try {
            comments.updateOne(new Document("_id", comment.getId()), new Document("$addToSet", new Document(edit, obj)));
            return true;
        } catch (MongoServerException ex) {
            return false;
        }
    }

    @Override
    public boolean removeElement(Comment comment, Object obj, String edit) {
        try {
            comments.updateOne(new Document("_id", comment.getId()), new Document("$pull", new Document(edit, obj)));
            return true;
        } catch (MongoServerException ex) {
            return false;
        }
    }

}
