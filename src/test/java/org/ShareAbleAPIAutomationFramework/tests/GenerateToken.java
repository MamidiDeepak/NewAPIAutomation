package org.ShareAbleAPIAutomationFramework.tests;

import io.restassured.RestAssured;
import org.ShareAbleAPIAutomationFramework.base.BaseClass;
import org.ShareAbleAPIAutomationFramework.endPoints.APIConstants;
import org.ShareAbleAPIAutomationFramework.payloads.request.AuthPayload;
import org.ShareAbleAPIAutomationFramework.payloads.response.AuthResponsePayload;
import org.ShareAbleAPIAutomationFramework.pojo.response.Auth_Response;
import org.testng.annotations.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class GenerateToken extends BaseClass {



    @Test
    public void generateToken(){

        requestSpecification.basePath(APIConstants.AUTH);

        response = RestAssured.given(requestSpecification)
                .when().body(AuthPayload.getAuthPayload()).post();

        response.then().log().all();

        assertThat(response.statusCode()).isEqualTo(200);

        assertThat(response.statusLine()).isEqualTo("HTTP/1.1 200 OK");

        assertThat(response.getTime()).isLessThan(3000);

        String head = response.getHeader("Content-Type");
        System.out.println("Expected Headers =>> "+head);

        Auth_Response convertedResponseAuth = AuthResponsePayload.getConvertedResponseAuth(response.asString());

        generatedToken = convertedResponseAuth.getToken();

        System.out.println("Generated token "+convertedResponseAuth.getToken());
    }
}