/*
 * Contacts
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * The version of the OpenAPI document: v3
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package io.github.mike_rollout.api;

import io.github.mike_rollout.ApiException;
import io.github.mike_rollout.model.CollectionResponseWithTotalSimplePublicObjectForwardPaging;
import io.github.mike_rollout.model.Error;
import io.github.mike_rollout.model.PublicObjectSearchRequest;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for SearchApi
 */
@Disabled
public class SearchApiTest {

    private final SearchApi api = new SearchApi();

    /**
     * @throws ApiException if the Api call fails
     */
    @Test
    public void postCrmV3ObjectsContactsSearchDoSearchTest() throws ApiException {
        PublicObjectSearchRequest publicObjectSearchRequest = null;
        CollectionResponseWithTotalSimplePublicObjectForwardPaging response = api.postCrmV3ObjectsContactsSearchDoSearch(publicObjectSearchRequest);
        // TODO: test validations
    }

}