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
import io.github.mike_rollout.model.PublicAssociationsForObject;
import java.io.IOException;
import java.util.ArrayList;
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
 * SimplePublicObjectInputForCreate
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-07-19T16:43:10.955404+03:00[Africa/Nairobi]", comments = "Generator version: 7.7.0")
public class SimplePublicObjectInputForCreate {
  public static final String SERIALIZED_NAME_ASSOCIATIONS = "associations";
  @SerializedName(SERIALIZED_NAME_ASSOCIATIONS)
  private List<PublicAssociationsForObject> associations = new ArrayList<>();

  public static final String SERIALIZED_NAME_PROPERTIES = "properties";
  @SerializedName(SERIALIZED_NAME_PROPERTIES)
  private Map<String, String> properties = new HashMap<>();

  public SimplePublicObjectInputForCreate() {
  }

  public SimplePublicObjectInputForCreate associations(List<PublicAssociationsForObject> associations) {
    this.associations = associations;
    return this;
  }

  public SimplePublicObjectInputForCreate addAssociationsItem(PublicAssociationsForObject associationsItem) {
    if (this.associations == null) {
      this.associations = new ArrayList<>();
    }
    this.associations.add(associationsItem);
    return this;
  }

  /**
   * Get associations
   * @return associations
   */
  @javax.annotation.Nonnull
  public List<PublicAssociationsForObject> getAssociations() {
    return associations;
  }

  public void setAssociations(List<PublicAssociationsForObject> associations) {
    this.associations = associations;
  }


  public SimplePublicObjectInputForCreate properties(Map<String, String> properties) {
    this.properties = properties;
    return this;
  }

  public SimplePublicObjectInputForCreate putPropertiesItem(String key, String propertiesItem) {
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



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SimplePublicObjectInputForCreate simplePublicObjectInputForCreate = (SimplePublicObjectInputForCreate) o;
    return Objects.equals(this.associations, simplePublicObjectInputForCreate.associations) &&
        Objects.equals(this.properties, simplePublicObjectInputForCreate.properties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(associations, properties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SimplePublicObjectInputForCreate {\n");
    sb.append("    associations: ").append(toIndentedString(associations)).append("\n");
    sb.append("    properties: ").append(toIndentedString(properties)).append("\n");
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
    openapiFields.add("associations");
    openapiFields.add("properties");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("associations");
    openapiRequiredFields.add("properties");
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to SimplePublicObjectInputForCreate
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!SimplePublicObjectInputForCreate.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in SimplePublicObjectInputForCreate is not found in the empty JSON string", SimplePublicObjectInputForCreate.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!SimplePublicObjectInputForCreate.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `SimplePublicObjectInputForCreate` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : SimplePublicObjectInputForCreate.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // ensure the json data is an array
      if (!jsonObj.get("associations").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `associations` to be an array in the JSON string but got `%s`", jsonObj.get("associations").toString()));
      }

      JsonArray jsonArrayassociations = jsonObj.getAsJsonArray("associations");
      // validate the required field `associations` (array)
      for (int i = 0; i < jsonArrayassociations.size(); i++) {
        PublicAssociationsForObject.validateJsonElement(jsonArrayassociations.get(i));
      };
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!SimplePublicObjectInputForCreate.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'SimplePublicObjectInputForCreate' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<SimplePublicObjectInputForCreate> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(SimplePublicObjectInputForCreate.class));

       return (TypeAdapter<T>) new TypeAdapter<SimplePublicObjectInputForCreate>() {
           @Override
           public void write(JsonWriter out, SimplePublicObjectInputForCreate value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public SimplePublicObjectInputForCreate read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of SimplePublicObjectInputForCreate given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of SimplePublicObjectInputForCreate
   * @throws IOException if the JSON string is invalid with respect to SimplePublicObjectInputForCreate
   */
  public static SimplePublicObjectInputForCreate fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, SimplePublicObjectInputForCreate.class);
  }

  /**
   * Convert an instance of SimplePublicObjectInputForCreate to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

