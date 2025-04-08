package org.ShareAbleAPIAutomationFramework.payloads.response;

import com.google.gson.Gson;
import org.ShareAbleAPIAutomationFramework.pojo.response.Post_Response;

public class PostResponsePayload {

    public static Gson gson = new Gson();

    public static Post_Response getDeSerializedPostPayload(String response){
        return gson.fromJson(response, Post_Response.class);
    }

    public static Post_Response getConvertedPostResponse(String response){
        Post_Response postFinalResponse = PostResponsePayload.getDeSerializedPostPayload(response);

        return postFinalResponse;
    }


}
