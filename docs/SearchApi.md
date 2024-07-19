# SearchApi

All URIs are relative to *https://api.hubapi.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**postCrmV3ObjectsContactsSearchDoSearch**](SearchApi.md#postCrmV3ObjectsContactsSearchDoSearch) | **POST** /crm/v3/objects/contacts/search |  |


<a id="postCrmV3ObjectsContactsSearchDoSearch"></a>
# **postCrmV3ObjectsContactsSearchDoSearch**
> CollectionResponseWithTotalSimplePublicObjectForwardPaging postCrmV3ObjectsContactsSearchDoSearch(publicObjectSearchRequest)



### Example
```java
// Import classes:
import io.github.mike_rollout.ApiClient;
import io.github.mike_rollout.ApiException;
import io.github.mike_rollout.Configuration;
import io.github.mike_rollout.auth.*;
import io.github.mike_rollout.models.*;
import io.github.mike_rollout.api.SearchApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.hubapi.com");
    
    // Configure OAuth2 access token for authorization: oauth2
    OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
    oauth2.setAccessToken("YOUR ACCESS TOKEN");

    // Configure API key authorization: private_apps
    ApiKeyAuth private_apps = (ApiKeyAuth) defaultClient.getAuthentication("private_apps");
    private_apps.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //private_apps.setApiKeyPrefix("Token");

    SearchApi apiInstance = new SearchApi(defaultClient);
    PublicObjectSearchRequest publicObjectSearchRequest = new PublicObjectSearchRequest(); // PublicObjectSearchRequest | 
    try {
      CollectionResponseWithTotalSimplePublicObjectForwardPaging result = apiInstance.postCrmV3ObjectsContactsSearchDoSearch(publicObjectSearchRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SearchApi#postCrmV3ObjectsContactsSearchDoSearch");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **publicObjectSearchRequest** | [**PublicObjectSearchRequest**](PublicObjectSearchRequest.md)|  | |

### Return type

[**CollectionResponseWithTotalSimplePublicObjectForwardPaging**](CollectionResponseWithTotalSimplePublicObjectForwardPaging.md)

### Authorization

[oauth2](../README.md#oauth2), [private_apps](../README.md#private_apps)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | successful operation |  -  |
| **0** | An error occurred. |  -  |

