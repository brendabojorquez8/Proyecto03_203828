package Entities;

import java.util.Date;
import java.util.Objects;
import org.bson.types.ObjectId;

/**
 *
 * @author Brenda Bojorquez
 */
public class Comment extends EntityBase {
    private String text;
    private Date dateHour;
    private ObjectId user;

    public Comment() {
        super();
    }

    public Comment(ObjectId _id) {
        super(_id);
    }

    public Comment(ObjectId _id, String text, Date dateHour, ObjectId user) {
        super(_id);
        this.text = text;
        this.dateHour = dateHour;
        this.user = user;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public Date getDateHour() {
        return dateHour;
    }

    public void setDateHour(Date dateHour) {
        this.dateHour = dateHour;
    }

    public ObjectId getUser() {
        return user;
    }

    public void setUser(ObjectId user) {
        this.user = user;
    }

    @Override
    public String toString() {
        return "Comment{" + "_id=" + this.getId() + ", text=" + text + ", dateHour=" + dateHour + ", user=" + user + '}';
    }

}
