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
 * ErrorDetail
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-07-19T16:43:10.955404+03:00[Africa/Nairobi]", comments = "Generator version: 7.7.0")
public class ErrorDetail {
  public static final String SERIALIZED_NAME_SUB_CATEGORY = "subCategory";
  @SerializedName(SERIALIZED_NAME_SUB_CATEGORY)
  private String subCategory;

  public static final String SERIALIZED_NAME_CODE = "code";
  @SerializedName(SERIALIZED_NAME_CODE)
  private String code;

  public static final String SERIALIZED_NAME_IN = "in";
  @SerializedName(SERIALIZED_NAME_IN)
  private String in;

  public static final String SERIALIZED_NAME_CONTEXT = "context";
  @SerializedName(SERIALIZED_NAME_CONTEXT)
  private Map<String, List<String>> context = new HashMap<>();

  public static final String SERIALIZED_NAME_MESSAGE = "message";
  @SerializedName(SERIALIZED_NAME_MESSAGE)
  private String message;

  public ErrorDetail() {
  }

  public ErrorDetail subCategory(String subCategory) {
    this.subCategory = subCategory;
    return this;
  }

  /**
   * A specific category that contains more specific detail about the error
   * @return subCategory
   */
  @javax.annotation.Nullable
  public String getSubCategory() {
    return subCategory;
  }

  public void setSubCategory(String subCategory) {
    this.subCategory = subCategory;
  }


  public ErrorDetail code(String code) {
    this.code = code;
    return this;
  }

  /**
   * The status code associated with the error detail
   * @return code
   */
  @javax.annotation.Nullable
  public String getCode() {
    return code;
  }

  public void setCode(String code) {
    this.code = code;
  }


  public ErrorDetail in(String in) {
    this.in = in;
    return this;
  }

  /**
   * The name of the field or parameter in which the error was found.
   * @return in
   */
  @javax.annotation.Nullable
  public String getIn() {
    return in;
  }

  public void setIn(String in) {
    this.in = in;
  }


  public ErrorDetail context(Map<String, List<String>> context) {
    this.context = context;
    return this;
  }

  public ErrorDetail putContextItem(String key, List<String> contextItem) {
    if (this.context == null) {
      this.context = new HashMap<>();
    }
    this.context.put(key, contextItem);
    return this;
  }

  /**
   * Context about the error condition
   * @return context
   */
  @javax.annotation.Nullable
  public Map<String, List<String>> getContext() {
    return context;
  }

  public void setContext(Map<String, List<String>> context) {
    this.context = context;
  }


  public ErrorDetail message(String message) {
    this.message = message;
    return this;
  }

  /**
   * A human readable message describing the error along with remediation steps where appropriate
   * @return message
   */
  @javax.annotation.Nonnull
  public String getMessage() {
    return message;
  }

  public void setMessage(String message) {
    this.message = message;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ErrorDetail errorDetail = (ErrorDetail) o;
    return Objects.equals(this.subCategory, errorDetail.subCategory) &&
        Objects.equals(this.code, errorDetail.code) &&
        Objects.equals(this.in, errorDetail.in) &&
        Objects.equals(this.context, errorDetail.context) &&
        Objects.equals(this.message, errorDetail.message);
  }

  @Override
  public int hashCode() {
    return Objects.hash(subCategory, code, in, context, message);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ErrorDetail {\n");
    sb.append("    subCategory: ").append(toIndentedString(subCategory)).append("\n");
    sb.append("    code: ").append(toIndentedString(code)).append("\n");
    sb.append("    in: ").append(toIndentedString(in)).append("\n");
    sb.append("    context: ").append(toIndentedString(context)).append("\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
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
    openapiFields.add("subCategory");
    openapiFields.add("code");
    openapiFields.add("in");
    openapiFields.add("context");
    openapiFields.add("message");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("message");
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to ErrorDetail
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!ErrorDetail.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in ErrorDetail is not found in the empty JSON string", ErrorDetail.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!ErrorDetail.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `ErrorDetail` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : ErrorDetail.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("subCategory") != null && !jsonObj.get("subCategory").isJsonNull()) && !jsonObj.get("subCategory").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `subCategory` to be a primitive type in the JSON string but got `%s`", jsonObj.get("subCategory").toString()));
      }
      if ((jsonObj.get("code") != null && !jsonObj.get("code").isJsonNull()) && !jsonObj.get("code").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `code` to be a primitive type in the JSON string but got `%s`", jsonObj.get("code").toString()));
      }
      if ((jsonObj.get("in") != null && !jsonObj.get("in").isJsonNull()) && !jsonObj.get("in").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `in` to be a primitive type in the JSON string but got `%s`", jsonObj.get("in").toString()));
      }
      if (!jsonObj.get("message").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `message` to be a primitive type in the JSON string but got `%s`", jsonObj.get("message").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ErrorDetail.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ErrorDetail' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ErrorDetail> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ErrorDetail.class));

       return (TypeAdapter<T>) new TypeAdapter<ErrorDetail>() {
           @Override
           public void write(JsonWriter out, ErrorDetail value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ErrorDetail read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of ErrorDetail given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of ErrorDetail
   * @throws IOException if the JSON string is invalid with respect to ErrorDetail
   */
  public static ErrorDetail fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ErrorDetail.class);
  }

  /**
   * Convert an instance of ErrorDetail to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

