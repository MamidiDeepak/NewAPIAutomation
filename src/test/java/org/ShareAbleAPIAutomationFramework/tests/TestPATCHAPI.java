package org.ShareAbleAPIAutomationFramework.tests;

import io.restassured.RestAssured;
import org.ShareAbleAPIAutomationFramework.base.BaseClass;
import org.ShareAbleAPIAutomationFramework.endPoints.APIConstants;
import org.ShareAbleAPIAutomationFramework.payloads.request.PatchPayload;
import org.ShareAbleAPIAutomationFramework.payloads.request.PutPayload;
import org.testng.annotations.Test;

public class TestPATCHAPI extends BaseClass {

    @Test
    public void testPATCHAPI(){

        String token = BaseClass.generatedToken;
        String id = BaseClass.bookedId;

        System.out.println("id in patch api class is "+id);

        requestSpecification.basePath(APIConstants.PATCH_URL+id)
                .cookie("token",token);

        response = RestAssured.given(requestSpecification)
                .when().body(PatchPayload.getPatchPayload()).patch();

        response.then().log().all();

    }
}
