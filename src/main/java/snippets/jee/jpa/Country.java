package snippets.jee.jpa;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;
import javax.persistence.OneToOne;
import static javax.persistence.CascadeType.MERGE;
import static javax.persistence.CascadeType.REFRESH;
import javax.persistence.JoinColumn;

@Entity(name="tb_country")
public class Country implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name="id")
    private int id;

    @NotNull
    @Column(name="c_name")
    private String name;

    @Column(name="location")
    private String location;

    @OneToOne(cascade = { MERGE, REFRESH })
    @JoinColumn(name = "president_id", referencedColumnName = "id")
    private President president;

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getLocation() {
        return location;
    }
    public void setLocation(String location) {
        this.location = location;
    }
    public President getPresident() {
        return president;
    }
    public void setPresident(President president) {
        this.president = president;
    }

}
