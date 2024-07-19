# GdprApi

All URIs are relative to *https://api.hubapi.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**postCrmV3ObjectsContactsGdprDeletePurge**](GdprApi.md#postCrmV3ObjectsContactsGdprDeletePurge) | **POST** /crm/v3/objects/contacts/gdpr-delete | GDPR DELETE |


<a id="postCrmV3ObjectsContactsGdprDeletePurge"></a>
# **postCrmV3ObjectsContactsGdprDeletePurge**
> postCrmV3ObjectsContactsGdprDeletePurge(publicGdprDeleteInput)

GDPR DELETE

Permanently delete a contact and all associated content to follow GDPR. Use optional property &#39;idProperty&#39; set to &#39;email&#39; to identify contact by email address. If email address is not found, the email address will be added to a blocklist and prevent it from being used in the future.

### Example
```java
// Import classes:
import io.github.mike_rollout.ApiClient;
import io.github.mike_rollout.ApiException;
import io.github.mike_rollout.Configuration;
import io.github.mike_rollout.auth.*;
import io.github.mike_rollout.models.*;
import io.github.mike_rollout.api.GdprApi;

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

    GdprApi apiInstance = new GdprApi(defaultClient);
    PublicGdprDeleteInput publicGdprDeleteInput = new PublicGdprDeleteInput(); // PublicGdprDeleteInput | 
    try {
      apiInstance.postCrmV3ObjectsContactsGdprDeletePurge(publicGdprDeleteInput);
    } catch (ApiException e) {
      System.err.println("Exception when calling GdprApi#postCrmV3ObjectsContactsGdprDeletePurge");
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
| **publicGdprDeleteInput** | [**PublicGdprDeleteInput**](PublicGdprDeleteInput.md)|  | |

### Return type

null (empty response body)

### Authorization

[oauth2](../README.md#oauth2), [private_apps](../README.md#private_apps)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **204** | No content |  -  |
| **0** | An error occurred. |  -  |

