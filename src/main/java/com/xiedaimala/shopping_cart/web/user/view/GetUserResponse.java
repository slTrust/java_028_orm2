package com.xiedaimala.shopping_cart.web.user.view;

import com.xiedaimala.shopping_cart.web.user.model.User;

public class GetUserResponse {
    private User user;

    public GetUserResponse() {
    }

    public GetUserResponse(User user) {
        this.user = user;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
