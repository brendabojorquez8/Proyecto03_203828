package Entities;

import java.util.Objects;
import org.bson.types.ObjectId;

/**
 *
 * @author Brenda Bojorquez
 */
public class EntityBase {

    private ObjectId _id;

    public EntityBase() {
    }

    public EntityBase(ObjectId _id) {
        this._id = _id;
    }

    public ObjectId getId() {
        return _id;
    }

    public void setId(ObjectId _id) {
        this._id = _id;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 73 * hash + Objects.hashCode(this._id);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final EntityBase other = (EntityBase) obj;
        if (!Objects.equals(this._id, other._id)) {
            return false;
        }
        return true;
    }
}
