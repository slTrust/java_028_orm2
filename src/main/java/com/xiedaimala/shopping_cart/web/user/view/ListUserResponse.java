package com.xiedaimala.shopping_cart.web.user.view;

import com.xiedaimala.shopping_cart.web.user.model.User;

import java.util.List;

public class ListUserResponse {
    private List<User> users;

    public ListUserResponse() {
    }

    public ListUserResponse(List<User> users) {
        this.users = users;
    }

    public List<User> getUsers() {
        return users;
    }

    public void setUsers(List<User> users) {
        this.users = users;
    }
}
