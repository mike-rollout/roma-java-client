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
import java.io.IOException;
import java.util.Arrays;

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
 * AssociationSpec
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-07-19T16:43:10.955404+03:00[Africa/Nairobi]", comments = "Generator version: 7.7.0")
public class AssociationSpec {
  /**
   * Gets or Sets associationCategory
   */
  @JsonAdapter(AssociationCategoryEnum.Adapter.class)
  public enum AssociationCategoryEnum {
    HUBSPOT_DEFINED("HUBSPOT_DEFINED"),
    
    USER_DEFINED("USER_DEFINED"),
    
    INTEGRATOR_DEFINED("INTEGRATOR_DEFINED");

    private String value;

    AssociationCategoryEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static AssociationCategoryEnum fromValue(String value) {
      for (AssociationCategoryEnum b : AssociationCategoryEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<AssociationCategoryEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final AssociationCategoryEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public AssociationCategoryEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return AssociationCategoryEnum.fromValue(value);
      }
    }

    public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      String value = jsonElement.getAsString();
      AssociationCategoryEnum.fromValue(value);
    }
  }

  public static final String SERIALIZED_NAME_ASSOCIATION_CATEGORY = "associationCategory";
  @SerializedName(SERIALIZED_NAME_ASSOCIATION_CATEGORY)
  private AssociationCategoryEnum associationCategory;

  public static final String SERIALIZED_NAME_ASSOCIATION_TYPE_ID = "associationTypeId";
  @SerializedName(SERIALIZED_NAME_ASSOCIATION_TYPE_ID)
  private Integer associationTypeId;

  public AssociationSpec() {
  }

  public AssociationSpec associationCategory(AssociationCategoryEnum associationCategory) {
    this.associationCategory = associationCategory;
    return this;
  }

  /**
   * Get associationCategory
   * @return associationCategory
   */
  @javax.annotation.Nonnull
  public AssociationCategoryEnum getAssociationCategory() {
    return associationCategory;
  }

  public void setAssociationCategory(AssociationCategoryEnum associationCategory) {
    this.associationCategory = associationCategory;
  }


  public AssociationSpec associationTypeId(Integer associationTypeId) {
    this.associationTypeId = associationTypeId;
    return this;
  }

  /**
   * Get associationTypeId
   * @return associationTypeId
   */
  @javax.annotation.Nonnull
  public Integer getAssociationTypeId() {
    return associationTypeId;
  }

  public void setAssociationTypeId(Integer associationTypeId) {
    this.associationTypeId = associationTypeId;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AssociationSpec associationSpec = (AssociationSpec) o;
    return Objects.equals(this.associationCategory, associationSpec.associationCategory) &&
        Objects.equals(this.associationTypeId, associationSpec.associationTypeId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(associationCategory, associationTypeId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AssociationSpec {\n");
    sb.append("    associationCategory: ").append(toIndentedString(associationCategory)).append("\n");
    sb.append("    associationTypeId: ").append(toIndentedString(associationTypeId)).append("\n");
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
    openapiFields.add("associationCategory");
    openapiFields.add("associationTypeId");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("associationCategory");
    openapiRequiredFields.add("associationTypeId");
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to AssociationSpec
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!AssociationSpec.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in AssociationSpec is not found in the empty JSON string", AssociationSpec.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!AssociationSpec.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `AssociationSpec` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : AssociationSpec.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (!jsonObj.get("associationCategory").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `associationCategory` to be a primitive type in the JSON string but got `%s`", jsonObj.get("associationCategory").toString()));
      }
      // validate the required field `associationCategory`
      AssociationCategoryEnum.validateJsonElement(jsonObj.get("associationCategory"));
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AssociationSpec.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AssociationSpec' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AssociationSpec> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AssociationSpec.class));

       return (TypeAdapter<T>) new TypeAdapter<AssociationSpec>() {
           @Override
           public void write(JsonWriter out, AssociationSpec value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public AssociationSpec read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of AssociationSpec given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of AssociationSpec
   * @throws IOException if the JSON string is invalid with respect to AssociationSpec
   */
  public static AssociationSpec fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AssociationSpec.class);
  }

  /**
   * Convert an instance of AssociationSpec to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

