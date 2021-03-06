package com.andrewkravets.model;

import javax.persistence.*;
import java.io.Serializable;

/**
 * Created by Andrew Kravets.
 * Date: 12/31/13.
 * Url: andrewkravets.com
 */
@Entity
@Access(AccessType.FIELD)
public class Pills implements Serializable {
    @Id
    @GeneratedValue
    Long id;

    String title;

    public Pills(String title) {
        this.title = title;
    }

    public Pills() {
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
