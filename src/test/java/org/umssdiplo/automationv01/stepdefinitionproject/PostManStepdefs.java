package org.umssdiplo.automationv01.stepdefinitionproject;

import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import io.restassured.response.Response;
import org.testng.Assert;
import org.umssdiplo.automationv01.core.customrestassure.HandleRequest;

/**
 * @autor Marcelo Garay
 */
public class PostManStepdefs {
    private Response response;
    private Response response1;

    @Given("^GET \"([^\"]*)\" postman endpoint is configured$")
    public void getPostmanEndpointIsConfigured(String headerEndpoint) throws Throwable {
        response = HandleRequest.get(headerEndpoint);
    }

    @Then("^the status code should be (\\d+)$")
    public void theStatusCodeShouldBe(int statusCode) throws Throwable {
        Assert.assertEquals(response.getStatusCode(), statusCode);

    }
    @And("^The \"([^\"]*)\" content in the body$")
    public void theContentInTheBody(String arg0) throws Throwable {
        Assert.assertTrue(response.body().prettyPrint().contains("carmen"));
    }

    @Given("^POST \"([^\"]*)\" postman endpoint is configured with \"([^\"]*)\"$")
    public void postPostmanEndpointIsConfiguredWith(String bodyEndPoint, String data) throws Throwable {
        String Responsive=   "{\"accidentAgentId\": 8,\"accidentDate\": \"2019-05-04T08:55:33.655Z\",\"accidentDay\": \"Tuesday\",\"accidentSite\": \"aaaaa\",\"accidentTime\": \"\",\"affectedPart\": \"bbbb\",\"employeeId\": 2,\"incidentId\": 0,\"incidentTypeId\": 1,\"lesionTypeId\": 1,\"workingTurn\": \"EXTRA_HOURS\" }" ;
        response= HandleRequest.post(bodyEndPoint,Responsive);
    }
    @Then("^the responde 'data' value is \"([^\"]*)\"$")
    public void theRespondeDataValueIs(String esperado) throws Throwable {
        boolean actual = response.getBody().print().contains(esperado);
        Assert.assertTrue(actual, "diplomado testing existe en body  de la respuesta");
    }

    @And("^the status code post should be (\\d+)$")
    public void theStatusCodePostShouldBe(int statusCode1) {

        Assert.assertEquals(response.getStatusCode(), statusCode1);
    }
}

