package org.ShareAbleAPIAutomationFramework.payloads.request;

import com.google.gson.Gson;
import org.ShareAbleAPIAutomationFramework.pojo.request.PostBookingDatesPojo;
import org.ShareAbleAPIAutomationFramework.pojo.request.PostPojo;

public class PostPayload {

    public static Gson gson = new Gson();

    public static String firstName;
    public static String lastName;
    public static Integer totalprice;

    public static String getPostPayload(){

        PostPojo postPojo = new PostPojo();
//        postPojo.setFirstname("Deepak");
        postPojo.setFirstname(firstName);
//        postPojo.setLastname("Mamidi");
        postPojo.setLastname(lastName);
//        postPojo.setTotalprice(567890);
        postPojo.setTotalprice(totalprice);
        postPojo.setDepositpaid(true);

        PostBookingDatesPojo postBookingDatesPojo = new PostBookingDatesPojo();
        postBookingDatesPojo.setCheckin("2025-04-10");
        postBookingDatesPojo.setCheckout("2025-04-20");

        postPojo.setBookingdates(postBookingDatesPojo);
        postPojo.setAdditionalneeds("Dinner");

//        convert the payload....
         return gson.toJson(postPojo);
    }
}
