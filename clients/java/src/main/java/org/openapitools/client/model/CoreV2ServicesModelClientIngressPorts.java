/*
 * untitled API
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * The version of the OpenAPI document: 5229
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package org.openapitools.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * CoreV2ServicesModelClientIngressPorts
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-05-03T11:59:07.273777-04:00[America/New_York]")
public class CoreV2ServicesModelClientIngressPorts {
  public static final String SERIALIZED_NAME_HIGH = "high";
  @SerializedName(SERIALIZED_NAME_HIGH)
  private String high;

  public static final String SERIALIZED_NAME_LOW = "low";
  @SerializedName(SERIALIZED_NAME_LOW)
  private String low;


  public CoreV2ServicesModelClientIngressPorts high(String high) {
    
    this.high = high;
    return this;
  }

   /**
   * Get high
   * @return high
  **/
  @ApiModelProperty(required = true, value = "")

  public String getHigh() {
    return high;
  }


  public void setHigh(String high) {
    this.high = high;
  }


  public CoreV2ServicesModelClientIngressPorts low(String low) {
    
    this.low = low;
    return this;
  }

   /**
   * Get low
   * @return low
  **/
  @ApiModelProperty(required = true, value = "")

  public String getLow() {
    return low;
  }


  public void setLow(String low) {
    this.low = low;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CoreV2ServicesModelClientIngressPorts coreV2ServicesModelClientIngressPorts = (CoreV2ServicesModelClientIngressPorts) o;
    return Objects.equals(this.high, coreV2ServicesModelClientIngressPorts.high) &&
        Objects.equals(this.low, coreV2ServicesModelClientIngressPorts.low);
  }

  @Override
  public int hashCode() {
    return Objects.hash(high, low);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CoreV2ServicesModelClientIngressPorts {\n");
    sb.append("    high: ").append(toIndentedString(high)).append("\n");
    sb.append("    low: ").append(toIndentedString(low)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}

