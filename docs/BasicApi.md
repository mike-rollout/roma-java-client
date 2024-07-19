# BasicApi

All URIs are relative to *https://api.hubapi.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**deleteCrmV3ObjectsContactsContactIdArchive**](BasicApi.md#deleteCrmV3ObjectsContactsContactIdArchive) | **DELETE** /crm/v3/objects/contacts/{contactId} | Archive |
| [**getCrmV3ObjectsContactsContactIdGetById**](BasicApi.md#getCrmV3ObjectsContactsContactIdGetById) | **GET** /crm/v3/objects/contacts/{contactId} | Read |
| [**getCrmV3ObjectsContactsGetPage**](BasicApi.md#getCrmV3ObjectsContactsGetPage) | **GET** /crm/v3/objects/contacts | List |
| [**patchCrmV3ObjectsContactsContactIdUpdate**](BasicApi.md#patchCrmV3ObjectsContactsContactIdUpdate) | **PATCH** /crm/v3/objects/contacts/{contactId} | Update |
| [**postCrmV3ObjectsContactsCreate**](BasicApi.md#postCrmV3ObjectsContactsCreate) | **POST** /crm/v3/objects/contacts | Create |


<a id="deleteCrmV3ObjectsContactsContactIdArchive"></a>
# **deleteCrmV3ObjectsContactsContactIdArchive**
> deleteCrmV3ObjectsContactsContactIdArchive(contactId)

Archive

Move an Object identified by &#x60;{contactId}&#x60; to the recycling bin.

### Example
```java
// Import classes:
import io.github.mike_rollout.ApiClient;
import io.github.mike_rollout.ApiException;
import io.github.mike_rollout.Configuration;
import io.github.mike_rollout.auth.*;
import io.github.mike_rollout.models.*;
import io.github.mike_rollout.api.BasicApi;

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

    BasicApi apiInstance = new BasicApi(defaultClient);
    String contactId = "contactId_example"; // String | 
    try {
      apiInstance.deleteCrmV3ObjectsContactsContactIdArchive(contactId);
    } catch (ApiException e) {
      System.err.println("Exception when calling BasicApi#deleteCrmV3ObjectsContactsContactIdArchive");
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
| **contactId** | **String**|  | |

### Return type

null (empty response body)

### Authorization

[oauth2](../README.md#oauth2), [private_apps](../README.md#private_apps)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **204** | No content |  -  |
| **0** | An error occurred. |  -  |

<a id="getCrmV3ObjectsContactsContactIdGetById"></a>
# **getCrmV3ObjectsContactsContactIdGetById**
> SimplePublicObjectWithAssociations getCrmV3ObjectsContactsContactIdGetById(contactId, properties, propertiesWithHistory, associations, archived)

Read

Read an Object identified by &#x60;{contactId}&#x60;. &#x60;{contactId}&#x60; refers to the internal object ID.  Control what is returned via the &#x60;properties&#x60; query param.

### Example
```java
// Import classes:
import io.github.mike_rollout.ApiClient;
import io.github.mike_rollout.ApiException;
import io.github.mike_rollout.Configuration;
import io.github.mike_rollout.auth.*;
import io.github.mike_rollout.models.*;
import io.github.mike_rollout.api.BasicApi;

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

    BasicApi apiInstance = new BasicApi(defaultClient);
    String contactId = "contactId_example"; // String | 
    List<String> properties = Arrays.asList(); // List<String> | A comma separated list of the properties to be returned in the response. If any of the specified properties are not present on the requested object(s), they will be ignored.
    List<String> propertiesWithHistory = Arrays.asList(); // List<String> | A comma separated list of the properties to be returned along with their history of previous values. If any of the specified properties are not present on the requested object(s), they will be ignored.
    List<String> associations = Arrays.asList(); // List<String> | A comma separated list of object types to retrieve associated IDs for. If any of the specified associations do not exist, they will be ignored.
    Boolean archived = false; // Boolean | Whether to return only results that have been archived.
    try {
      SimplePublicObjectWithAssociations result = apiInstance.getCrmV3ObjectsContactsContactIdGetById(contactId, properties, propertiesWithHistory, associations, archived);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling BasicApi#getCrmV3ObjectsContactsContactIdGetById");
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
| **contactId** | **String**|  | |
| **properties** | [**List&lt;String&gt;**](String.md)| A comma separated list of the properties to be returned in the response. If any of the specified properties are not present on the requested object(s), they will be ignored. | [optional] |
| **propertiesWithHistory** | [**List&lt;String&gt;**](String.md)| A comma separated list of the properties to be returned along with their history of previous values. If any of the specified properties are not present on the requested object(s), they will be ignored. | [optional] |
| **associations** | [**List&lt;String&gt;**](String.md)| A comma separated list of object types to retrieve associated IDs for. If any of the specified associations do not exist, they will be ignored. | [optional] |
| **archived** | **Boolean**| Whether to return only results that have been archived. | [optional] [default to false] |

### Return type

[**SimplePublicObjectWithAssociations**](SimplePublicObjectWithAssociations.md)

### Authorization

[oauth2](../README.md#oauth2), [private_apps](../README.md#private_apps)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | successful operation |  -  |
| **0** | An error occurred. |  -  |

<a id="getCrmV3ObjectsContactsGetPage"></a>
# **getCrmV3ObjectsContactsGetPage**
> CollectionResponseSimplePublicObjectWithAssociationsForwardPaging getCrmV3ObjectsContactsGetPage(limit, after, properties, propertiesWithHistory, associations, archived)

List

Read a page of contacts. Control what is returned via the &#x60;properties&#x60; query param.

### Example
```java
// Import classes:
import io.github.mike_rollout.ApiClient;
import io.github.mike_rollout.ApiException;
import io.github.mike_rollout.Configuration;
import io.github.mike_rollout.auth.*;
import io.github.mike_rollout.models.*;
import io.github.mike_rollout.api.BasicApi;

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

    BasicApi apiInstance = new BasicApi(defaultClient);
    Integer limit = 10; // Integer | The maximum number of results to display per page.
    String after = "after_example"; // String | The paging cursor token of the last successfully read resource will be returned as the `paging.next.after` JSON property of a paged response containing more results.
    List<String> properties = Arrays.asList(); // List<String> | A comma separated list of the properties to be returned in the response. If any of the specified properties are not present on the requested object(s), they will be ignored.
    List<String> propertiesWithHistory = Arrays.asList(); // List<String> | A comma separated list of the properties to be returned along with their history of previous values. If any of the specified properties are not present on the requested object(s), they will be ignored. Usage of this parameter will reduce the maximum number of objects that can be read by a single request.
    List<String> associations = Arrays.asList(); // List<String> | A comma separated list of object types to retrieve associated IDs for. If any of the specified associations do not exist, they will be ignored.
    Boolean archived = false; // Boolean | Whether to return only results that have been archived.
    try {
      CollectionResponseSimplePublicObjectWithAssociationsForwardPaging result = apiInstance.getCrmV3ObjectsContactsGetPage(limit, after, properties, propertiesWithHistory, associations, archived);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling BasicApi#getCrmV3ObjectsContactsGetPage");
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
| **limit** | **Integer**| The maximum number of results to display per page. | [optional] [default to 10] |
| **after** | **String**| The paging cursor token of the last successfully read resource will be returned as the &#x60;paging.next.after&#x60; JSON property of a paged response containing more results. | [optional] |
| **properties** | [**List&lt;String&gt;**](String.md)| A comma separated list of the properties to be returned in the response. If any of the specified properties are not present on the requested object(s), they will be ignored. | [optional] |
| **propertiesWithHistory** | [**List&lt;String&gt;**](String.md)| A comma separated list of the properties to be returned along with their history of previous values. If any of the specified properties are not present on the requested object(s), they will be ignored. Usage of this parameter will reduce the maximum number of objects that can be read by a single request. | [optional] |
| **associations** | [**List&lt;String&gt;**](String.md)| A comma separated list of object types to retrieve associated IDs for. If any of the specified associations do not exist, they will be ignored. | [optional] |
| **archived** | **Boolean**| Whether to return only results that have been archived. | [optional] [default to false] |

### Return type

[**CollectionResponseSimplePublicObjectWithAssociationsForwardPaging**](CollectionResponseSimplePublicObjectWithAssociationsForwardPaging.md)

### Authorization

[oauth2](../README.md#oauth2), [private_apps](../README.md#private_apps)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | successful operation |  -  |
| **0** | An error occurred. |  -  |

<a id="patchCrmV3ObjectsContactsContactIdUpdate"></a>
# **patchCrmV3ObjectsContactsContactIdUpdate**
> SimplePublicObject patchCrmV3ObjectsContactsContactIdUpdate(contactId, simplePublicObjectInput)

Update

Perform a partial update of an Object identified by &#x60;{contactId}&#x60;. &#x60;{contactId}&#x60; refers to the internal object ID. Provided property values will be overwritten. Read-only and non-existent properties will be ignored. Properties values can be cleared by passing an empty string.

### Example
```java
// Import classes:
import io.github.mike_rollout.ApiClient;
import io.github.mike_rollout.ApiException;
import io.github.mike_rollout.Configuration;
import io.github.mike_rollout.auth.*;
import io.github.mike_rollout.models.*;
import io.github.mike_rollout.api.BasicApi;

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

    BasicApi apiInstance = new BasicApi(defaultClient);
    String contactId = "contactId_example"; // String | 
    SimplePublicObjectInput simplePublicObjectInput = new SimplePublicObjectInput(); // SimplePublicObjectInput | 
    try {
      SimplePublicObject result = apiInstance.patchCrmV3ObjectsContactsContactIdUpdate(contactId, simplePublicObjectInput);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling BasicApi#patchCrmV3ObjectsContactsContactIdUpdate");
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
| **contactId** | **String**|  | |
| **simplePublicObjectInput** | [**SimplePublicObjectInput**](SimplePublicObjectInput.md)|  | |

### Return type

[**SimplePublicObject**](SimplePublicObject.md)

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

<a id="postCrmV3ObjectsContactsCreate"></a>
# **postCrmV3ObjectsContactsCreate**
> SimplePublicObject postCrmV3ObjectsContactsCreate(simplePublicObjectInputForCreate)

Create

Create a contact with the given properties and return a copy of the object, including the ID. Documentation and examples for creating standard contacts is provided.

### Example
```java
// Import classes:
import io.github.mike_rollout.ApiClient;
import io.github.mike_rollout.ApiException;
import io.github.mike_rollout.Configuration;
import io.github.mike_rollout.auth.*;
import io.github.mike_rollout.models.*;
import io.github.mike_rollout.api.BasicApi;

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

    BasicApi apiInstance = new BasicApi(defaultClient);
    SimplePublicObjectInputForCreate simplePublicObjectInputForCreate = new SimplePublicObjectInputForCreate(); // SimplePublicObjectInputForCreate | 
    try {
      SimplePublicObject result = apiInstance.postCrmV3ObjectsContactsCreate(simplePublicObjectInputForCreate);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling BasicApi#postCrmV3ObjectsContactsCreate");
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
| **simplePublicObjectInputForCreate** | [**SimplePublicObjectInputForCreate**](SimplePublicObjectInputForCreate.md)|  | |

### Return type

[**SimplePublicObject**](SimplePublicObject.md)

### Authorization

[oauth2](../README.md#oauth2), [private_apps](../README.md#private_apps)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | successful operation |  -  |
| **0** | An error occurred. |  -  |

