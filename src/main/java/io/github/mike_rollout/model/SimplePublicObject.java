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
import io.github.mike_rollout.model.ValueWithTimestamp;
import java.io.IOException;
import java.time.OffsetDateTime;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

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
 * SimplePublicObject
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-07-19T16:43:10.955404+03:00[Africa/Nairobi]", comments = "Generator version: 7.7.0")
public class SimplePublicObject {
  public static final String SERIALIZED_NAME_CREATED_AT = "createdAt";
  @SerializedName(SERIALIZED_NAME_CREATED_AT)
  private OffsetDateTime createdAt;

  public static final String SERIALIZED_NAME_ARCHIVED = "archived";
  @SerializedName(SERIALIZED_NAME_ARCHIVED)
  private Boolean archived;

  public static final String SERIALIZED_NAME_ARCHIVED_AT = "archivedAt";
  @SerializedName(SERIALIZED_NAME_ARCHIVED_AT)
  private OffsetDateTime archivedAt;

  public static final String SERIALIZED_NAME_PROPERTIES_WITH_HISTORY = "propertiesWithHistory";
  @SerializedName(SERIALIZED_NAME_PROPERTIES_WITH_HISTORY)
  private Map<String, List<ValueWithTimestamp>> propertiesWithHistory = new HashMap<>();

  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private String id;

  public static final String SERIALIZED_NAME_PROPERTIES = "properties";
  @SerializedName(SERIALIZED_NAME_PROPERTIES)
  private Map<String, String> properties = new HashMap<>();

  public static final String SERIALIZED_NAME_UPDATED_AT = "updatedAt";
  @SerializedName(SERIALIZED_NAME_UPDATED_AT)
  private OffsetDateTime updatedAt;

  public SimplePublicObject() {
  }

  public SimplePublicObject createdAt(OffsetDateTime createdAt) {
    this.createdAt = createdAt;
    return this;
  }

  /**
   * Get createdAt
   * @return createdAt
   */
  @javax.annotation.Nonnull
  public OffsetDateTime getCreatedAt() {
    return createdAt;
  }

  public void setCreatedAt(OffsetDateTime createdAt) {
    this.createdAt = createdAt;
  }


  public SimplePublicObject archived(Boolean archived) {
    this.archived = archived;
    return this;
  }

  /**
   * Get archived
   * @return archived
   */
  @javax.annotation.Nullable
  public Boolean getArchived() {
    return archived;
  }

  public void setArchived(Boolean archived) {
    this.archived = archived;
  }


  public SimplePublicObject archivedAt(OffsetDateTime archivedAt) {
    this.archivedAt = archivedAt;
    return this;
  }

  /**
   * Get archivedAt
   * @return archivedAt
   */
  @javax.annotation.Nullable
  public OffsetDateTime getArchivedAt() {
    return archivedAt;
  }

  public void setArchivedAt(OffsetDateTime archivedAt) {
    this.archivedAt = archivedAt;
  }


  public SimplePublicObject propertiesWithHistory(Map<String, List<ValueWithTimestamp>> propertiesWithHistory) {
    this.propertiesWithHistory = propertiesWithHistory;
    return this;
  }

  public SimplePublicObject putPropertiesWithHistoryItem(String key, List<ValueWithTimestamp> propertiesWithHistoryItem) {
    if (this.propertiesWithHistory == null) {
      this.propertiesWithHistory = new HashMap<>();
    }
    this.propertiesWithHistory.put(key, propertiesWithHistoryItem);
    return this;
  }

  /**
   * Get propertiesWithHistory
   * @return propertiesWithHistory
   */
  @javax.annotation.Nullable
  public Map<String, List<ValueWithTimestamp>> getPropertiesWithHistory() {
    return propertiesWithHistory;
  }

  public void setPropertiesWithHistory(Map<String, List<ValueWithTimestamp>> propertiesWithHistory) {
    this.propertiesWithHistory = propertiesWithHistory;
  }


  public SimplePublicObject id(String id) {
    this.id = id;
    return this;
  }

  /**
   * Get id
   * @return id
   */
  @javax.annotation.Nonnull
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }


  public SimplePublicObject properties(Map<String, String> properties) {
    this.properties = properties;
    return this;
  }

  public SimplePublicObject putPropertiesItem(String key, String propertiesItem) {
    if (this.properties == null) {
      this.properties = new HashMap<>();
    }
    this.properties.put(key, propertiesItem);
    return this;
  }

  /**
   * Get properties
   * @return properties
   */
  @javax.annotation.Nonnull
  public Map<String, String> getProperties() {
    return properties;
  }

  public void setProperties(Map<String, String> properties) {
    this.properties = properties;
  }


  public SimplePublicObject updatedAt(OffsetDateTime updatedAt) {
    this.updatedAt = updatedAt;
    return this;
  }

  /**
   * Get updatedAt
   * @return updatedAt
   */
  @javax.annotation.Nonnull
  public OffsetDateTime getUpdatedAt() {
    return updatedAt;
  }

  public void setUpdatedAt(OffsetDateTime updatedAt) {
    this.updatedAt = updatedAt;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SimplePublicObject simplePublicObject = (SimplePublicObject) o;
    return Objects.equals(this.createdAt, simplePublicObject.createdAt) &&
        Objects.equals(this.archived, simplePublicObject.archived) &&
        Objects.equals(this.archivedAt, simplePublicObject.archivedAt) &&
        Objects.equals(this.propertiesWithHistory, simplePublicObject.propertiesWithHistory) &&
        Objects.equals(this.id, simplePublicObject.id) &&
        Objects.equals(this.properties, simplePublicObject.properties) &&
        Objects.equals(this.updatedAt, simplePublicObject.updatedAt);
  }

  @Override
  public int hashCode() {
    return Objects.hash(createdAt, archived, archivedAt, propertiesWithHistory, id, properties, updatedAt);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SimplePublicObject {\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    archived: ").append(toIndentedString(archived)).append("\n");
    sb.append("    archivedAt: ").append(toIndentedString(archivedAt)).append("\n");
    sb.append("    propertiesWithHistory: ").append(toIndentedString(propertiesWithHistory)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    properties: ").append(toIndentedString(properties)).append("\n");
    sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
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
    openapiFields.add("createdAt");
    openapiFields.add("archived");
    openapiFields.add("archivedAt");
    openapiFields.add("propertiesWithHistory");
    openapiFields.add("id");
    openapiFields.add("properties");
    openapiFields.add("updatedAt");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("createdAt");
    openapiRequiredFields.add("id");
    openapiRequiredFields.add("properties");
    openapiRequiredFields.add("updatedAt");
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to SimplePublicObject
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!SimplePublicObject.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in SimplePublicObject is not found in the empty JSON string", SimplePublicObject.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!SimplePublicObject.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `SimplePublicObject` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : SimplePublicObject.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (!jsonObj.get("id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("id").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!SimplePublicObject.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'SimplePublicObject' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<SimplePublicObject> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(SimplePublicObject.class));

       return (TypeAdapter<T>) new TypeAdapter<SimplePublicObject>() {
           @Override
           public void write(JsonWriter out, SimplePublicObject value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public SimplePublicObject read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of SimplePublicObject given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of SimplePublicObject
   * @throws IOException if the JSON string is invalid with respect to SimplePublicObject
   */
  public static SimplePublicObject fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, SimplePublicObject.class);
  }

  /**
   * Convert an instance of SimplePublicObject to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
