package DAO;

import Entities.Tag;
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

public class DAOTags extends DAOBase<Tag> {

    MongoCollection<Tag> tags;

    public DAOTags() {
        super();
        this.tags = dataBase.getCollection("tags", Tag.class);
    }

    @Override
    public boolean insert(Tag tag) {
        try {
            this.tags.insertOne(tag);
            return true;
        } catch (MongoServerException ex) {
            return false;
        }
    }

    @Override
    public boolean update(Tag tag) {
        Tag update = findById(tag.getId());
        if (update != null) {
            update.setName(tag.getName());;
            this.tags.updateOne(new Document("_id", tag.getId()), new Document("$set", update));
            return true;
        } else {
            return false;
        }
    }

    @Override
    public boolean remove(Tag tag) {
        try {
            this.tags.deleteOne(new Document("_id", tag.getId()));
            return true;
        } catch (MongoServerException ex) {
            return false;
        }
    }

    @Override
    public List<Tag> find(String search) {
        ArrayList<Tag> findTags = new ArrayList<>();
        if (search == null || search.isEmpty()) {
            for (Tag tag : tags.find()) {
                findTags.add(tag);
            }
        } else {
            for (Tag tag : tags.find(eq("name", search))) {
                findTags.add(tag);
            }

        }
        return findTags;
    }

    public List<Tag> find() {
        ArrayList<Tag> findTags = new ArrayList<>();

        for (Tag tag : tags.find()) {
            findTags.add(tag);
        }

        return findTags;
    }

    @Override
    public Tag findById(ObjectId id) {
        return tags.find(eq("_id", id)).first();
    }

    @Override
    public boolean addElement(Tag tag, Object obj, String edit) {
        try {
            tags.updateOne(new Document("_id", tag.getId()), new Document("$addToSet", new Document(edit, obj)));
            return true;
        } catch (MongoServerException ex) {
            return false;
        }
    }

    @Override
    public boolean removeElement(Tag tag, Object obj, String edit) {
        try {
            tags.updateOne(new Document("_id", tag.getId()), new Document("$pull", new Document(edit, obj)));
            return true;
        } catch (MongoServerException ex) {
            return false;
        }
    }

}
