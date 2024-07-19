# BatchApi

All URIs are relative to *https://api.hubapi.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**postCrmV3ObjectsContactsBatchArchiveArchive**](BatchApi.md#postCrmV3ObjectsContactsBatchArchiveArchive) | **POST** /crm/v3/objects/contacts/batch/archive | Archive a batch of contacts by ID |
| [**postCrmV3ObjectsContactsBatchCreateCreate**](BatchApi.md#postCrmV3ObjectsContactsBatchCreateCreate) | **POST** /crm/v3/objects/contacts/batch/create | Create a batch of contacts |
| [**postCrmV3ObjectsContactsBatchReadRead**](BatchApi.md#postCrmV3ObjectsContactsBatchReadRead) | **POST** /crm/v3/objects/contacts/batch/read | Read a batch of contacts by internal ID, or unique property values |
| [**postCrmV3ObjectsContactsBatchUpdateUpdate**](BatchApi.md#postCrmV3ObjectsContactsBatchUpdateUpdate) | **POST** /crm/v3/objects/contacts/batch/update | Update a batch of contacts |


<a id="postCrmV3ObjectsContactsBatchArchiveArchive"></a>
# **postCrmV3ObjectsContactsBatchArchiveArchive**
> postCrmV3ObjectsContactsBatchArchiveArchive(batchInputSimplePublicObjectId)

Archive a batch of contacts by ID

### Example
```java
// Import classes:
import io.github.mike_rollout.ApiClient;
import io.github.mike_rollout.ApiException;
import io.github.mike_rollout.Configuration;
import io.github.mike_rollout.auth.*;
import io.github.mike_rollout.models.*;
import io.github.mike_rollout.api.BatchApi;

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

    BatchApi apiInstance = new BatchApi(defaultClient);
    BatchInputSimplePublicObjectId batchInputSimplePublicObjectId = new BatchInputSimplePublicObjectId(); // BatchInputSimplePublicObjectId | 
    try {
      apiInstance.postCrmV3ObjectsContactsBatchArchiveArchive(batchInputSimplePublicObjectId);
    } catch (ApiException e) {
      System.err.println("Exception when calling BatchApi#postCrmV3ObjectsContactsBatchArchiveArchive");
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
| **batchInputSimplePublicObjectId** | [**BatchInputSimplePublicObjectId**](BatchInputSimplePublicObjectId.md)|  | |

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

<a id="postCrmV3ObjectsContactsBatchCreateCreate"></a>
# **postCrmV3ObjectsContactsBatchCreateCreate**
> BatchResponseSimplePublicObject postCrmV3ObjectsContactsBatchCreateCreate(batchInputSimplePublicObjectInputForCreate)

Create a batch of contacts

### Example
```java
// Import classes:
import io.github.mike_rollout.ApiClient;
import io.github.mike_rollout.ApiException;
import io.github.mike_rollout.Configuration;
import io.github.mike_rollout.auth.*;
import io.github.mike_rollout.models.*;
import io.github.mike_rollout.api.BatchApi;

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

    BatchApi apiInstance = new BatchApi(defaultClient);
    BatchInputSimplePublicObjectInputForCreate batchInputSimplePublicObjectInputForCreate = new BatchInputSimplePublicObjectInputForCreate(); // BatchInputSimplePublicObjectInputForCreate | 
    try {
      BatchResponseSimplePublicObject result = apiInstance.postCrmV3ObjectsContactsBatchCreateCreate(batchInputSimplePublicObjectInputForCreate);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling BatchApi#postCrmV3ObjectsContactsBatchCreateCreate");
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
| **batchInputSimplePublicObjectInputForCreate** | [**BatchInputSimplePublicObjectInputForCreate**](BatchInputSimplePublicObjectInputForCreate.md)|  | |

### Return type

[**BatchResponseSimplePublicObject**](BatchResponseSimplePublicObject.md)

### Authorization

[oauth2](../README.md#oauth2), [private_apps](../README.md#private_apps)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | successful operation |  -  |
| **207** | multiple statuses |  -  |
| **0** | An error occurred. |  -  |

<a id="postCrmV3ObjectsContactsBatchReadRead"></a>
# **postCrmV3ObjectsContactsBatchReadRead**
> BatchResponseSimplePublicObject postCrmV3ObjectsContactsBatchReadRead(batchReadInputSimplePublicObjectId, archived)

Read a batch of contacts by internal ID, or unique property values

### Example
```java
// Import classes:
import io.github.mike_rollout.ApiClient;
import io.github.mike_rollout.ApiException;
import io.github.mike_rollout.Configuration;
import io.github.mike_rollout.auth.*;
import io.github.mike_rollout.models.*;
import io.github.mike_rollout.api.BatchApi;

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

    BatchApi apiInstance = new BatchApi(defaultClient);
    BatchReadInputSimplePublicObjectId batchReadInputSimplePublicObjectId = new BatchReadInputSimplePublicObjectId(); // BatchReadInputSimplePublicObjectId | 
    Boolean archived = false; // Boolean | Whether to return only results that have been archived.
    try {
      BatchResponseSimplePublicObject result = apiInstance.postCrmV3ObjectsContactsBatchReadRead(batchReadInputSimplePublicObjectId, archived);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling BatchApi#postCrmV3ObjectsContactsBatchReadRead");
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
| **batchReadInputSimplePublicObjectId** | [**BatchReadInputSimplePublicObjectId**](BatchReadInputSimplePublicObjectId.md)|  | |
| **archived** | **Boolean**| Whether to return only results that have been archived. | [optional] [default to false] |

### Return type

[**BatchResponseSimplePublicObject**](BatchResponseSimplePublicObject.md)

### Authorization

[oauth2](../README.md#oauth2), [private_apps](../README.md#private_apps)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | successful operation |  -  |
| **207** | multiple statuses |  -  |
| **0** | An error occurred. |  -  |

<a id="postCrmV3ObjectsContactsBatchUpdateUpdate"></a>
# **postCrmV3ObjectsContactsBatchUpdateUpdate**
> BatchResponseSimplePublicObject postCrmV3ObjectsContactsBatchUpdateUpdate(batchInputSimplePublicObjectBatchInput)

Update a batch of contacts

### Example
```java
// Import classes:
import io.github.mike_rollout.ApiClient;
import io.github.mike_rollout.ApiException;
import io.github.mike_rollout.Configuration;
import io.github.mike_rollout.auth.*;
import io.github.mike_rollout.models.*;
import io.github.mike_rollout.api.BatchApi;

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

    BatchApi apiInstance = new BatchApi(defaultClient);
    BatchInputSimplePublicObjectBatchInput batchInputSimplePublicObjectBatchInput = new BatchInputSimplePublicObjectBatchInput(); // BatchInputSimplePublicObjectBatchInput | 
    try {
      BatchResponseSimplePublicObject result = apiInstance.postCrmV3ObjectsContactsBatchUpdateUpdate(batchInputSimplePublicObjectBatchInput);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling BatchApi#postCrmV3ObjectsContactsBatchUpdateUpdate");
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
| **batchInputSimplePublicObjectBatchInput** | [**BatchInputSimplePublicObjectBatchInput**](BatchInputSimplePublicObjectBatchInput.md)|  | |

### Return type

[**BatchResponseSimplePublicObject**](BatchResponseSimplePublicObject.md)

### Authorization

[oauth2](../README.md#oauth2), [private_apps](../README.md#private_apps)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | successful operation |  -  |
| **207** | multiple statuses |  -  |
| **0** | An error occurred. |  -  |

