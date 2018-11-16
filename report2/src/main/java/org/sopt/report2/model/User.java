package org.sopt.report2.model;

import lombok.Data;

@Data
public class User {
    private int user_idx;
    private String name;
    private String part;

    public User() {}

    public User(final int user_idx, final String name, final String part) {
        this.user_idx = user_idx;
        this.name = name;
        this.part = part;
    }

    @Override
    public String toString() {
        return "User{" +
                "user_idx=" + user_idx +
                ", name='" + name + '\'' +
                ", part='" + part + '\'' +
                '}';
    }
}

