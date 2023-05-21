package api.models.google_places;

import api.utils.NetworkCore;
import io.restassured.http.Method;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import java.util.HashMap;

import static constants.Constants.Endpoint.GOOGLE_PLACE_ENDPOINT_SEARCH;
import static constants.Constants.Path.GOOGLE_PLACE_PATH;
import static constants.Constants.ServerName.GOOGLE_PLACE_SERVER;

/**
 * @author Bohdan Brukhovets
 * @link https://www.linkedin.com/in/bohdan-brukhovets/
 */
public class GooglePlacesModel extends NetworkCore {
    @Getter
    @Setter
    @Builder
    public static class RequestModel {
        private String key;
        private String input;
        private String inputType;
    }

    public GooglePlacesModel search(RequestModel requestModel, Method method, int statusCode) {
        HashMap requestParams = new HashMap();
        requestParams.put("key", requestModel.getKey());
        requestParams.put("input", requestModel.getInput());
        requestParams.put("inputType", requestModel.getInputType());
        requestSpecBuilder.setBaseUri(GOOGLE_PLACE_SERVER + GOOGLE_PLACE_PATH + GOOGLE_PLACE_ENDPOINT_SEARCH).addQueryParams(requestParams);
        sendRequestAndGetResponse(method, statusCode);
        return this;
    }
}
