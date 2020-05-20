package Entities;

import Enums.Gender;
import Enums.MovieGenre;
import Enums.MusicalGenre;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.List;
import org.bson.codecs.pojo.annotations.BsonIgnore;
import org.bson.types.ObjectId;

/**
 *
 * @author Brenda Bojorquez
 */
public class User extends EntityBase {

    private String name;
    private String email;
    private String password;
    private Date dateOfBirth;
    private Gender gender;
    private List<MusicalGenre> musicalGenres;
    private List<MovieGenre> movieGenres;

    public User() {
        super();
        musicalGenres = new ArrayList<>();
        movieGenres = new ArrayList<>();
    }

    public User(ObjectId _id) {
        this();
        this.setId(_id);
    }

    public User(ObjectId _id, String name, String email, String password, Date dateOfBirth, Gender gender, List<MusicalGenre> musicalGenres, List<MovieGenre> movieGenres) {
        super(_id);
        this.name = name;
        this.email = email;
        this.password = password;
        this.dateOfBirth = dateOfBirth;
        this.gender = gender;
        this.musicalGenres = musicalGenres;
        this.movieGenres = movieGenres;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public List<MusicalGenre> getMusicalGenres() {
        return musicalGenres;
    }

    public void setMusicalGenres(List<MusicalGenre> musicalGenres) {
        this.musicalGenres = musicalGenres;
    }

    public List<MovieGenre> getMovieGenres() {
        return movieGenres;
    }

    public void setMovieGenres(List<MovieGenre> movieGenres) {
        this.movieGenres = movieGenres;
    }

    @BsonIgnore
    public int getAge() {
        GregorianCalendar today = new GregorianCalendar();
        GregorianCalendar dateOfBith = new GregorianCalendar();
        dateOfBith.setTime(this.dateOfBirth);
        int diffYear = today.get(Calendar.YEAR) - dateOfBith.get(Calendar.YEAR);
        int diffMonth = today.get(Calendar.MONTH) - dateOfBith.get(Calendar.MONTH);
        int diffDay = today.get(Calendar.DAY_OF_MONTH) - dateOfBith.get(Calendar.DAY_OF_MONTH);
        if (diffMonth < 0 || (diffMonth == 0 && diffDay < 0)) {
            diffYear--;
        }
        return diffYear;
    }

    @Override
    public String toString() {
        return "User{" + "_id=" + this.getId() + ", name=" + name + ", email=" + email + ", password=" + password + ", dateOfBirth=" + dateOfBirth + ", gender=" + gender + ", musicalGenres=" + musicalGenres + ", movieGenres=" + movieGenres + '}';
    }
}
