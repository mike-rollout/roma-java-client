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


package io.github.mike_rollout.model;

import java.util.Objects;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.github.mike_rollout.model.FilterGroup;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonArray;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.reflect.TypeToken;
import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;

import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import io.github.mike_rollout.JSON;

/**
 * PublicObjectSearchRequest
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-07-19T16:43:10.955404+03:00[Africa/Nairobi]", comments = "Generator version: 7.7.0")
public class PublicObjectSearchRequest {
  public static final String SERIALIZED_NAME_QUERY = "query";
  @SerializedName(SERIALIZED_NAME_QUERY)
  private String query;

  public static final String SERIALIZED_NAME_LIMIT = "limit";
  @SerializedName(SERIALIZED_NAME_LIMIT)
  private Integer limit;

  public static final String SERIALIZED_NAME_AFTER = "after";
  @SerializedName(SERIALIZED_NAME_AFTER)
  private String after;

  public static final String SERIALIZED_NAME_SORTS = "sorts";
  @SerializedName(SERIALIZED_NAME_SORTS)
  private List<String> sorts = new ArrayList<>();

  public static final String SERIALIZED_NAME_PROPERTIES = "properties";
  @SerializedName(SERIALIZED_NAME_PROPERTIES)
  private List<String> properties = new ArrayList<>();

  public static final String SERIALIZED_NAME_FILTER_GROUPS = "filterGroups";
  @SerializedName(SERIALIZED_NAME_FILTER_GROUPS)
  private List<FilterGroup> filterGroups = new ArrayList<>();

  public PublicObjectSearchRequest() {
  }

  public PublicObjectSearchRequest query(String query) {
    this.query = query;
    return this;
  }

  /**
   * Get query
   * @return query
   */
  @javax.annotation.Nullable
  public String getQuery() {
    return query;
  }

  public void setQuery(String query) {
    this.query = query;
  }


  public PublicObjectSearchRequest limit(Integer limit) {
    this.limit = limit;
    return this;
  }

  /**
   * Get limit
   * @return limit
   */
  @javax.annotation.Nonnull
  public Integer getLimit() {
    return limit;
  }

  public void setLimit(Integer limit) {
    this.limit = limit;
  }


  public PublicObjectSearchRequest after(String after) {
    this.after = after;
    return this;
  }

  /**
   * Get after
   * @return after
   */
  @javax.annotation.Nonnull
  public String getAfter() {
    return after;
  }

  public void setAfter(String after) {
    this.after = after;
  }


  public PublicObjectSearchRequest sorts(List<String> sorts) {
    this.sorts = sorts;
    return this;
  }

  public PublicObjectSearchRequest addSortsItem(String sortsItem) {
    if (this.sorts == null) {
      this.sorts = new ArrayList<>();
    }
    this.sorts.add(sortsItem);
    return this;
  }

  /**
   * Get sorts
   * @return sorts
   */
  @javax.annotation.Nonnull
  public List<String> getSorts() {
    return sorts;
  }

  public void setSorts(List<String> sorts) {
    this.sorts = sorts;
  }


  public PublicObjectSearchRequest properties(List<String> properties) {
    this.properties = properties;
    return this;
  }

  public PublicObjectSearchRequest addPropertiesItem(String propertiesItem) {
    if (this.properties == null) {
      this.properties = new ArrayList<>();
    }
    this.properties.add(propertiesItem);
    return this;
  }

  /**
   * Get properties
   * @return properties
   */
  @javax.annotation.Nonnull
  public List<String> getProperties() {
    return properties;
  }

  public void setProperties(List<String> properties) {
    this.properties = properties;
  }


  public PublicObjectSearchRequest filterGroups(List<FilterGroup> filterGroups) {
    this.filterGroups = filterGroups;
    return this;
  }

  public PublicObjectSearchRequest addFilterGroupsItem(FilterGroup filterGroupsItem) {
    if (this.filterGroups == null) {
      this.filterGroups = new ArrayList<>();
    }
    this.filterGroups.add(filterGroupsItem);
    return this;
  }

  /**
   * Get filterGroups
   * @return filterGroups
   */
  @javax.annotation.Nonnull
  public List<FilterGroup> getFilterGroups() {
    return filterGroups;
  }

  public void setFilterGroups(List<FilterGroup> filterGroups) {
    this.filterGroups = filterGroups;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PublicObjectSearchRequest publicObjectSearchRequest = (PublicObjectSearchRequest) o;
    return Objects.equals(this.query, publicObjectSearchRequest.query) &&
        Objects.equals(this.limit, publicObjectSearchRequest.limit) &&
        Objects.equals(this.after, publicObjectSearchRequest.after) &&
        Objects.equals(this.sorts, publicObjectSearchRequest.sorts) &&
        Objects.equals(this.properties, publicObjectSearchRequest.properties) &&
        Objects.equals(this.filterGroups, publicObjectSearchRequest.filterGroups);
  }

  @Override
  public int hashCode() {
    return Objects.hash(query, limit, after, sorts, properties, filterGroups);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PublicObjectSearchRequest {\n");
    sb.append("    query: ").append(toIndentedString(query)).append("\n");
    sb.append("    limit: ").append(toIndentedString(limit)).append("\n");
    sb.append("    after: ").append(toIndentedString(after)).append("\n");
    sb.append("    sorts: ").append(toIndentedString(sorts)).append("\n");
    sb.append("    properties: ").append(toIndentedString(properties)).append("\n");
    sb.append("    filterGroups: ").append(toIndentedString(filterGroups)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }


  public static HashSet<String> openapiFields;
  public static HashSet<String> openapiRequiredFields;

  static {
    // a set of all properties/fields (JSON key names)
    openapiFields = new HashSet<String>();
    openapiFields.add("query");
    openapiFields.add("limit");
    openapiFields.add("after");
    openapiFields.add("sorts");
    openapiFields.add("properties");
    openapiFields.add("filterGroups");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("limit");
    openapiRequiredFields.add("after");
    openapiRequiredFields.add("sorts");
    openapiRequiredFields.add("properties");
    openapiRequiredFields.add("filterGroups");
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to PublicObjectSearchRequest
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!PublicObjectSearchRequest.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in PublicObjectSearchRequest is not found in the empty JSON string", PublicObjectSearchRequest.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!PublicObjectSearchRequest.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `PublicObjectSearchRequest` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : PublicObjectSearchRequest.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("query") != null && !jsonObj.get("query").isJsonNull()) && !jsonObj.get("query").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `query` to be a primitive type in the JSON string but got `%s`", jsonObj.get("query").toString()));
      }
      if (!jsonObj.get("after").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `after` to be a primitive type in the JSON string but got `%s`", jsonObj.get("after").toString()));
      }
      // ensure the required json array is present
      if (jsonObj.get("sorts") == null) {
        throw new IllegalArgumentException("Expected the field `linkedContent` to be an array in the JSON string but got `null`");
      } else if (!jsonObj.get("sorts").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `sorts` to be an array in the JSON string but got `%s`", jsonObj.get("sorts").toString()));
      }
      // ensure the required json array is present
      if (jsonObj.get("properties") == null) {
        throw new IllegalArgumentException("Expected the field `linkedContent` to be an array in the JSON string but got `null`");
      } else if (!jsonObj.get("properties").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `properties` to be an array in the JSON string but got `%s`", jsonObj.get("properties").toString()));
      }
      // ensure the json data is an array
      if (!jsonObj.get("filterGroups").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `filterGroups` to be an array in the JSON string but got `%s`", jsonObj.get("filterGroups").toString()));
      }

      JsonArray jsonArrayfilterGroups = jsonObj.getAsJsonArray("filterGroups");
      // validate the required field `filterGroups` (array)
      for (int i = 0; i < jsonArrayfilterGroups.size(); i++) {
        FilterGroup.validateJsonElement(jsonArrayfilterGroups.get(i));
      };
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!PublicObjectSearchRequest.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'PublicObjectSearchRequest' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<PublicObjectSearchRequest> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(PublicObjectSearchRequest.class));

       return (TypeAdapter<T>) new TypeAdapter<PublicObjectSearchRequest>() {
           @Override
           public void write(JsonWriter out, PublicObjectSearchRequest value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public PublicObjectSearchRequest read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of PublicObjectSearchRequest given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of PublicObjectSearchRequest
   * @throws IOException if the JSON string is invalid with respect to PublicObjectSearchRequest
   */
  public static PublicObjectSearchRequest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, PublicObjectSearchRequest.class);
  }

  /**
   * Convert an instance of PublicObjectSearchRequest to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

