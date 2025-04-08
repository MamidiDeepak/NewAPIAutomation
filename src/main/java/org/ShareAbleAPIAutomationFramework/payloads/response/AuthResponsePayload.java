package org.ShareAbleAPIAutomationFramework.payloads.response;

import com.google.gson.Gson;
import org.ShareAbleAPIAutomationFramework.pojo.response.Auth_Response;

public class AuthResponsePayload {

    public static Gson gson = new Gson();

    public static Auth_Response getDeSerializedAuthPayload(String response){

       return gson.fromJson(response, Auth_Response.class);

    }

    public static Auth_Response getConvertedResponseAuth(String response){
        Auth_Response authResponse = AuthResponsePayload.getDeSerializedAuthPayload(response);

        return authResponse;
    }

}
