package org.ShareAbleAPIAutomationFramework.base;

import com.google.gson.Gson;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.ShareAbleAPIAutomationFramework.asserts.AssertActions;
import org.ShareAbleAPIAutomationFramework.endPoints.APIConstants;
import org.ShareAbleAPIAutomationFramework.listeners.ReTryAnalyzer;
import org.ShareAbleAPIAutomationFramework.listeners.ReTryListeners;
import org.ShareAbleAPIAutomationFramework.payloads.request.AuthPayload;
import org.ShareAbleAPIAutomationFramework.utils.ReadKeyFromFile;
import org.testng.annotations.BeforeClass;

public class BaseClass {

    APIConstants apiConstants;
    AuthPayload authPayload;
    AssertActions assertActions;
    ReTryAnalyzer reTryAnalyzer;
    ReTryListeners reTryListeners;
    ReadKeyFromFile readKeyFromFile;
    public RequestSpecification requestSpecification;
    public Response response;
    public Gson gson;

    public static String generatedToken;
    public static String bookedId;

    @BeforeClass
    public void initiateBaseUrl(){

        requestSpecification = RestAssured.given()
                .baseUri(APIConstants.BASE_URL)
                .contentType("application/json")
                .log().all();

    }
}
