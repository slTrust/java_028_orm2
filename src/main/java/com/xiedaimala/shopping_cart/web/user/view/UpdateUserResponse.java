package com.xiedaimala.shopping_cart.web.user.view;

import com.xiedaimala.shopping_cart.web.user.model.User;

public class UpdateUserResponse {
    private User user;

    public UpdateUserResponse(User user) {
        this.user = user;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
