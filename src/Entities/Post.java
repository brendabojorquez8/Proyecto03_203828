package Entities;

import Control.ControlUsers;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import org.bson.types.ObjectId;

/**
 *
 * @author Brenda Bojorquez
 */
public class Post extends EntityBase {

    private Date dateHour;
    private String text;
    private List<Tag> tags;
    private List<Comment> comments;
    private ObjectId user;

    public Post() {
        this.tags = new ArrayList<>();
        this.comments = new ArrayList<>();
    }

    public Post(ObjectId _id) {
        super(_id);
    }

    public Post(ObjectId _id, Date dateHour, String text, List<Tag> tags, List<Comment> comments) {
        super(_id);
        this.dateHour = dateHour;
        this.text = text;
        this.tags = tags;
        this.comments = comments;
    }

    public Date getDateHour() {
        return dateHour;
    }

    public void setDateHour(Date dateHour) {
        this.dateHour = dateHour;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public List<Tag> getTags() {
        return tags;
    }

    public void setTags(List<Tag> tags) {
        this.tags = tags;
    }

    public List<Comment> getComments() {
        return comments;
    }

    public void setComments(List<Comment> comments) {
        this.comments = comments;
    }

    public void addComment(Comment comment) {
        this.comments.add(comment);
    }

    public ObjectId getUser() {
        return user;
    }

    public void setUser(ObjectId user) {
        this.user = user;
    }

    @Override
    public String toString() {
        return "Post{" + "dateHour=" + dateHour + ", text=" + text + ", tags=" + tags + ", comments=" + comments + ", user=" + user + '}';
    }

}
