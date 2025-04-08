package org.ShareAbleAPIAutomationFramework.tests;

import io.restassured.RestAssured;
import org.ShareAbleAPIAutomationFramework.base.BaseClass;
import org.ShareAbleAPIAutomationFramework.endPoints.APIConstants;
import org.ShareAbleAPIAutomationFramework.listeners.ReTryAnalyzer;
import org.ShareAbleAPIAutomationFramework.payloads.request.PostPayload;
import org.ShareAbleAPIAutomationFramework.payloads.response.PostResponsePayload;
import org.ShareAbleAPIAutomationFramework.pojo.response.Post_Response;
import org.ShareAbleAPIAutomationFramework.utils.ReadDataFromExcel;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestPOSTAPI extends BaseClass {

    @Test(retryAnalyzer = ReTryAnalyzer.class, dataProvider = "runDDT", dataProviderClass = ReadDataFromExcel.class)
    public void testPostAPI(String Fname, String Lname, String totalPrice){

        PostPayload.firstName = Fname;
        PostPayload.lastName = Lname;
        PostPayload.totalprice = Integer.parseInt(totalPrice);
        
        requestSpecification.basePath(APIConstants.POST_URL);

        response = RestAssured.given(requestSpecification)
                .when().body(PostPayload.getPostPayload()).post();

        response.then().log().all();

        Post_Response postResp = PostResponsePayload.getConvertedPostResponse(response.asString());

        bookedId = postResp.getBookingid();

        System.out.println("Booked Id is : "+bookedId);

        Assert.assertEquals(response.statusCode(),200);

    }
}
