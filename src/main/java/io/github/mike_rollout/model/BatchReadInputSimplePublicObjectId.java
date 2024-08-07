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
import io.github.mike_rollout.model.SimplePublicObjectId;
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
 * BatchReadInputSimplePublicObjectId
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-07-19T16:43:10.955404+03:00[Africa/Nairobi]", comments = "Generator version: 7.7.0")
public class BatchReadInputSimplePublicObjectId {
  public static final String SERIALIZED_NAME_PROPERTIES_WITH_HISTORY = "propertiesWithHistory";
  @SerializedName(SERIALIZED_NAME_PROPERTIES_WITH_HISTORY)
  private List<String> propertiesWithHistory = new ArrayList<>();

  public static final String SERIALIZED_NAME_ID_PROPERTY = "idProperty";
  @SerializedName(SERIALIZED_NAME_ID_PROPERTY)
  private String idProperty;

  public static final String SERIALIZED_NAME_INPUTS = "inputs";
  @SerializedName(SERIALIZED_NAME_INPUTS)
  private List<SimplePublicObjectId> inputs = new ArrayList<>();

  public static final String SERIALIZED_NAME_PROPERTIES = "properties";
  @SerializedName(SERIALIZED_NAME_PROPERTIES)
  private List<String> properties = new ArrayList<>();

  public BatchReadInputSimplePublicObjectId() {
  }

  public BatchReadInputSimplePublicObjectId propertiesWithHistory(List<String> propertiesWithHistory) {
    this.propertiesWithHistory = propertiesWithHistory;
    return this;
  }

  public BatchReadInputSimplePublicObjectId addPropertiesWithHistoryItem(String propertiesWithHistoryItem) {
    if (this.propertiesWithHistory == null) {
      this.propertiesWithHistory = new ArrayList<>();
    }
    this.propertiesWithHistory.add(propertiesWithHistoryItem);
    return this;
  }

  /**
   * Get propertiesWithHistory
   * @return propertiesWithHistory
   */
  @javax.annotation.Nonnull
  public List<String> getPropertiesWithHistory() {
    return propertiesWithHistory;
  }

  public void setPropertiesWithHistory(List<String> propertiesWithHistory) {
    this.propertiesWithHistory = propertiesWithHistory;
  }


  public BatchReadInputSimplePublicObjectId idProperty(String idProperty) {
    this.idProperty = idProperty;
    return this;
  }

  /**
   * Get idProperty
   * @return idProperty
   */
  @javax.annotation.Nullable
  public String getIdProperty() {
    return idProperty;
  }

  public void setIdProperty(String idProperty) {
    this.idProperty = idProperty;
  }


  public BatchReadInputSimplePublicObjectId inputs(List<SimplePublicObjectId> inputs) {
    this.inputs = inputs;
    return this;
  }

  public BatchReadInputSimplePublicObjectId addInputsItem(SimplePublicObjectId inputsItem) {
    if (this.inputs == null) {
      this.inputs = new ArrayList<>();
    }
    this.inputs.add(inputsItem);
    return this;
  }

  /**
   * Get inputs
   * @return inputs
   */
  @javax.annotation.Nonnull
  public List<SimplePublicObjectId> getInputs() {
    return inputs;
  }

  public void setInputs(List<SimplePublicObjectId> inputs) {
    this.inputs = inputs;
  }


  public BatchReadInputSimplePublicObjectId properties(List<String> properties) {
    this.properties = properties;
    return this;
  }

  public BatchReadInputSimplePublicObjectId addPropertiesItem(String propertiesItem) {
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



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BatchReadInputSimplePublicObjectId batchReadInputSimplePublicObjectId = (BatchReadInputSimplePublicObjectId) o;
    return Objects.equals(this.propertiesWithHistory, batchReadInputSimplePublicObjectId.propertiesWithHistory) &&
        Objects.equals(this.idProperty, batchReadInputSimplePublicObjectId.idProperty) &&
        Objects.equals(this.inputs, batchReadInputSimplePublicObjectId.inputs) &&
        Objects.equals(this.properties, batchReadInputSimplePublicObjectId.properties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(propertiesWithHistory, idProperty, inputs, properties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BatchReadInputSimplePublicObjectId {\n");
    sb.append("    propertiesWithHistory: ").append(toIndentedString(propertiesWithHistory)).append("\n");
    sb.append("    idProperty: ").append(toIndentedString(idProperty)).append("\n");
    sb.append("    inputs: ").append(toIndentedString(inputs)).append("\n");
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
    openapiFields.add("propertiesWithHistory");
    openapiFields.add("idProperty");
    openapiFields.add("inputs");
    openapiFields.add("properties");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("propertiesWithHistory");
    openapiRequiredFields.add("inputs");
    openapiRequiredFields.add("properties");
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to BatchReadInputSimplePublicObjectId
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!BatchReadInputSimplePublicObjectId.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in BatchReadInputSimplePublicObjectId is not found in the empty JSON string", BatchReadInputSimplePublicObjectId.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!BatchReadInputSimplePublicObjectId.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `BatchReadInputSimplePublicObjectId` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : BatchReadInputSimplePublicObjectId.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // ensure the required json array is present
      if (jsonObj.get("propertiesWithHistory") == null) {
        throw new IllegalArgumentException("Expected the field `linkedContent` to be an array in the JSON string but got `null`");
      } else if (!jsonObj.get("propertiesWithHistory").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `propertiesWithHistory` to be an array in the JSON string but got `%s`", jsonObj.get("propertiesWithHistory").toString()));
      }
      if ((jsonObj.get("idProperty") != null && !jsonObj.get("idProperty").isJsonNull()) && !jsonObj.get("idProperty").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `idProperty` to be a primitive type in the JSON string but got `%s`", jsonObj.get("idProperty").toString()));
      }
      // ensure the json data is an array
      if (!jsonObj.get("inputs").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `inputs` to be an array in the JSON string but got `%s`", jsonObj.get("inputs").toString()));
      }

      JsonArray jsonArrayinputs = jsonObj.getAsJsonArray("inputs");
      // validate the required field `inputs` (array)
      for (int i = 0; i < jsonArrayinputs.size(); i++) {
        SimplePublicObjectId.validateJsonElement(jsonArrayinputs.get(i));
      };
      // ensure the required json array is present
      if (jsonObj.get("properties") == null) {
        throw new IllegalArgumentException("Expected the field `linkedContent` to be an array in the JSON string but got `null`");
      } else if (!jsonObj.get("properties").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `properties` to be an array in the JSON string but got `%s`", jsonObj.get("properties").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!BatchReadInputSimplePublicObjectId.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'BatchReadInputSimplePublicObjectId' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<BatchReadInputSimplePublicObjectId> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(BatchReadInputSimplePublicObjectId.class));

       return (TypeAdapter<T>) new TypeAdapter<BatchReadInputSimplePublicObjectId>() {
           @Override
           public void write(JsonWriter out, BatchReadInputSimplePublicObjectId value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public BatchReadInputSimplePublicObjectId read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of BatchReadInputSimplePublicObjectId given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of BatchReadInputSimplePublicObjectId
   * @throws IOException if the JSON string is invalid with respect to BatchReadInputSimplePublicObjectId
   */
  public static BatchReadInputSimplePublicObjectId fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, BatchReadInputSimplePublicObjectId.class);
  }

  /**
   * Convert an instance of BatchReadInputSimplePublicObjectId to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

