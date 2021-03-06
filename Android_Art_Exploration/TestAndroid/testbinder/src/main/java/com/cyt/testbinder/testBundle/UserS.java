package com.cyt.testbinder.testBundle;

import java.io.Serializable;

/**
 * @author 122668
 */
public class UserS implements Serializable {

    private static final long serialVersionUID = 519067123721295773L;

    public int userId;
    public String userName;
    public boolean isMale;

    public UserS() {
    }

    public UserS(int userId, String userName, boolean isMale) {
        this.userId = userId;
        this.userName = userName;
        this.isMale = isMale;
    }

    @Override
    public String toString() {
        return "UserS{" +
                "userId=" + userId +
                ", userName='" + userName + '\'' +
                ", isMale=" + isMale +
                '}';
    }
}
