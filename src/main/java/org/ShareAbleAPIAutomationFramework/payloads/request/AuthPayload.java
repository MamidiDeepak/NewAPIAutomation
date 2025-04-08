package org.ShareAbleAPIAutomationFramework.payloads.request;

import org.ShareAbleAPIAutomationFramework.pojo.request.Auth;

public class AuthPayload {

    public static Auth getAuthPayload(){

        Auth auth = new Auth();
        auth.setUsername("admin");
        auth.setPassword("password123");

        return auth;
    }
}