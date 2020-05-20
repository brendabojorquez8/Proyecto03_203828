package Entities;

import org.bson.types.ObjectId;

/**
 *
 * @author Brenda Bojorquez
 */
public class Tag extends EntityBase {

    private String name;

    public Tag() {
        super();
    }

    public Tag(ObjectId _id) {
        super(_id);
    }

    public Tag(String name, ObjectId _id) {
        super(_id);
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Tag{" + "_id=" + this.getId() + "name=" + name + '}';
    }
}
