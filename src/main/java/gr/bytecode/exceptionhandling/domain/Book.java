package gr.bytecode.exceptionhandling.domain;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * @author Dimi Balaouras
 */
@Entity
public class Book implements Serializable {

    /**
     * Required by the {@link Serializable} interface. Increase by 1 every time the class is
     * significantly changed on production.
     */
    private static final long serialVersionUID = 1L;

    /**
     * Record id
     */
    @Id
    @GeneratedValue
    private Long id;

    /**
     * Book name
     */
    @Column(nullable = false)
    private String name;

    /**
     * @return the id
     */
    public Long getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }
}
