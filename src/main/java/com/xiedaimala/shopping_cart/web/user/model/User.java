package com.xiedaimala.shopping_cart.web.user.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.xiedaimala.shopping_cart.web.cart.model.CartItem;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "user")
@JsonIgnoreProperties(value = { "hibernateLazyInitializer", "handler" })
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "name")
    private String name;

    @Column(name = "password")
    private String password;

    /*
    //购物车里的记录!
    //可以把多个产品放入到购物车里 --> 记录
    @OneToMany(cascade = CascadeType.ALL,
            fetch = FetchType.EAGER,
            mappedBy = "user")
    private List<CartItem> cartItems;
    */

    public User() {
    }

    public User(String name, String password) {
        this.name = name;
        this.password = password;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
