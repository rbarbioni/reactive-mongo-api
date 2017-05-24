package br.com.rbarbioni.netty.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.TypeAlias;
import org.springframework.data.mongodb.core.mapping.Document;

import java.io.Serializable;

/**
 * Created by renan on 23/05/17.
 */

@Document(collection = "user")
@TypeAlias("user")
public class User implements Serializable{

    private static final long serialVersionUID = 8860980640517255440L;

    @Id
    private String id;

    private String name;

    private String email;

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
