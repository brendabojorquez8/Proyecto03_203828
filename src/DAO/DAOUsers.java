package DAO;

import Entities.User;
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
public class DAOUsers extends DAOBase<User> {

    MongoCollection<User> users;

    public DAOUsers() {
        super();
        this.users = dataBase.getCollection("users", User.class);
    }

    @Override
    public boolean insert(User user) {
        try {
            this.users.insertOne(user);
            return true;
        } catch (MongoServerException ex) {
            return false;
        }
    }

    @Override
    public boolean update(User user) {
        User update = findById(user.getId());
        if (update != null) {
            update.setName(user.getName());
            update.setPassword(user.getPassword());
            update.setGender(user.getGender());
            update.setMusicalGenres(user.getMusicalGenres());
            update.setMovieGenres(user.getMovieGenres());
            this.users.updateOne(new Document("_id", user.getId()), new Document("$set", update));
            return true;
        } else {
            return false;
        }
    }

    @Override
    public boolean remove(User user) {
        try {
            this.users.deleteOne(new Document("_id", user.getId()));
            return true;
        } catch (MongoServerException ex) {
            return false;
        }
    }

    @Override
    public List<User> find(String search) {
        ArrayList<User> findUsers = new ArrayList<>();
        if (search == null || search.isEmpty()) {
            for (User user : users.find()) {
                findUsers.add(user);
            }
        } else {
            for (User user : users.find(eq("name", search))) {
                findUsers.add(user);
            }

        }
        return findUsers;
    }

    public List<User> find() {
        ArrayList<User> findUsers = new ArrayList<>();

        for (User user : users.find()) {
            findUsers.add(user);
        }

        return findUsers;
    }
    
    public User findByEmail(String email) {
        List<User> findUsers = find();

        for (User user : users.find()) {
            if(user.getEmail().equals(email)){
                return user;
            }
        }

        return null;
    }

    @Override
    public User findById(ObjectId id) {
        return users.find(eq("_id", id)).first();
    }

    @Override
    public boolean addElement(User user, Object obj, String edit) {
        try {
            users.updateOne(new Document("_id", user.getId()), new Document("$addToSet", new Document(edit, obj)));
            return true;
        } catch (MongoServerException ex) {
            return false;
        }
    }

    @Override
    public boolean removeElement(User user, Object obj, String edit) {
        try {
            users.updateOne(new Document("_id", user.getId()), new Document("$pull", new Document(edit, obj)));
            return true;
        } catch (MongoServerException ex) {
            return false;
        }
    }

}
