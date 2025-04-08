package org.ShareAbleAPIAutomationFramework.tests;

import io.restassured.RestAssured;
import org.ShareAbleAPIAutomationFramework.base.BaseClass;
import org.ShareAbleAPIAutomationFramework.endPoints.APIConstants;
import org.ShareAbleAPIAutomationFramework.payloads.request.PutPayload;
import org.testng.annotations.Test;

public class TestPUTAPI extends BaseClass {

    @Test
    public void testPUTAPI(){

        String token = BaseClass.generatedToken;
        String id = BaseClass.bookedId;

        System.out.println("id in put api class is "+id);

        requestSpecification.basePath(APIConstants.PUT_URL+id)
                .cookie("token",token);

        response = RestAssured.given(requestSpecification)
                .when().body(PutPayload.getPutPayload()).put();

        response.then().log().all();

    }
}
