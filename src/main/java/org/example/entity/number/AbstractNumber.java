package org.example.entity.number;

import javax.persistence.*;

@Entity
public abstract class AbstractNumber {


    private Long id;

    public abstract AbstractNumber sum(AbstractNumber number);
    public abstract AbstractNumber sub(AbstractNumber number);
    public abstract AbstractNumber div(AbstractNumber number);
    public abstract AbstractNumber mult(AbstractNumber number);


    public void setId(Long id) {
        this.id = id;
    }

    @Id
    public Long getId() {
        return id;
    }
}
