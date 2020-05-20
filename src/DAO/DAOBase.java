package DAO;

import com.mongodb.MongoClientSettings;
import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoDatabase;
import java.util.List;
import org.bson.codecs.configuration.CodecRegistries;
import org.bson.codecs.configuration.CodecRegistry;
import org.bson.codecs.pojo.PojoCodecProvider;
import org.bson.types.ObjectId;
/**
 *
 * @author Brenda Bojorquez
 */
public abstract class DAOBase<T> {
    MongoClientSettings settings; 
    MongoClient cliente;
    MongoDatabase dataBase;

    public DAOBase() {
        this.settings = DAOBase.getMongoClientSettings();
        this.cliente = MongoClients.create(settings);
        this.dataBase = cliente.getDatabase("facebootDB");
    }

    public abstract boolean insert(T entity);

    public abstract boolean update(T entity);

    public abstract boolean remove(T entity);

    public abstract List<T> find(String find);

    public abstract T findById(ObjectId id);
    
    public abstract boolean addElement(T element, Object obj, String edit);
    
    public abstract boolean removeElement(T element, Object obj, String edit);

    public MongoDatabase getDataBase() {

        return dataBase;
    }
    
    public static MongoClientSettings getMongoClientSettings() {
        CodecRegistry pojoCodecRegistry = CodecRegistries.fromRegistries(com.mongodb.MongoClient.getDefaultCodecRegistry(),
                CodecRegistries.fromProviders(PojoCodecProvider.builder().automatic(true).build()));
        MongoClientSettings configuracion= MongoClientSettings.builder().codecRegistry(pojoCodecRegistry).build();
        return configuracion;
    }
}
