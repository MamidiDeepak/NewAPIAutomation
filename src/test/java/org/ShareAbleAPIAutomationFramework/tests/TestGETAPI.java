package org.ShareAbleAPIAutomationFramework.tests;

import io.restassured.RestAssured;
import org.ShareAbleAPIAutomationFramework.base.BaseClass;
import org.ShareAbleAPIAutomationFramework.endPoints.APIConstants;
import org.testng.ITestContext;
import org.testng.annotations.Test;

public class TestGETAPI extends BaseClass {

    @Test
    public void testGetAPI(ITestContext context){

//        String id = (String) context.getAttribute("id");

        String id = BaseClass.bookedId;

        System.out.println("id in get api class is "+id);

        requestSpecification.basePath(APIConstants.GET_URL+id);

        response = RestAssured.given(requestSpecification)
                .when().get();

        response.then().log().all();
    }
}
