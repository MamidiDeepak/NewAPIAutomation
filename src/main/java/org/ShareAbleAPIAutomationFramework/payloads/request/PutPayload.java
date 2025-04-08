package org.ShareAbleAPIAutomationFramework.payloads.request;

import com.google.gson.Gson;
import org.ShareAbleAPIAutomationFramework.pojo.request.PostBookingDatesPojo;
import org.ShareAbleAPIAutomationFramework.pojo.request.PostPojo;

public class PutPayload {

    public static Gson gson = new Gson();

    public static String getPutPayload(){

        PostPojo postPojo = new PostPojo();
        postPojo.setFirstname("kiran");
        postPojo.setLastname("kumar");
        postPojo.setTotalprice(91115);
        postPojo.setDepositpaid(false);

        PostBookingDatesPojo postBookingDatesPojo = new PostBookingDatesPojo();
        postBookingDatesPojo.setCheckin("2025-04-10");
        postBookingDatesPojo.setCheckout("2025-04-20");

        postPojo.setBookingdates(postBookingDatesPojo);
        postPojo.setAdditionalneeds("Lunch");

//        convert the payload....

         return gson.toJson(postPojo);
    }
}
