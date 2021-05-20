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
import java.math.BigDecimal;
import org.openapitools.client.model.oas_any_type_not_mapped;

/**
 * CoreV2ServicesServiceIdModelServerEgress
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-05-03T11:59:07.273777-04:00[America/New_York]")
public class CoreV2ServicesServiceIdModelServerEgress {
  public static final String SERIALIZED_NAME_DIAL_INTERCEPT_ADDRESS = "dialInterceptAddress";
  @SerializedName(SERIALIZED_NAME_DIAL_INTERCEPT_ADDRESS)
  private oas_any_type_not_mapped dialInterceptAddress = null;

  public static final String SERIALIZED_NAME_DIAL_INTERCEPT_PORT = "dialInterceptPort";
  @SerializedName(SERIALIZED_NAME_DIAL_INTERCEPT_PORT)
  private oas_any_type_not_mapped dialInterceptPort = null;

  public static final String SERIALIZED_NAME_PORT = "port";
  @SerializedName(SERIALIZED_NAME_PORT)
  private BigDecimal port;

  public static final String SERIALIZED_NAME_DIAL_INTERCEPT_PROTOCOL = "dialInterceptProtocol";
  @SerializedName(SERIALIZED_NAME_DIAL_INTERCEPT_PROTOCOL)
  private Boolean dialInterceptProtocol;

  public static final String SERIALIZED_NAME_ADDRESS = "address";
  @SerializedName(SERIALIZED_NAME_ADDRESS)
  private String address;

  public static final String SERIALIZED_NAME_PROTOCOL = "protocol";
  @SerializedName(SERIALIZED_NAME_PROTOCOL)
  private oas_any_type_not_mapped protocol = null;


  public CoreV2ServicesServiceIdModelServerEgress dialInterceptAddress(oas_any_type_not_mapped dialInterceptAddress) {
    
    this.dialInterceptAddress = dialInterceptAddress;
    return this;
  }

   /**
   * Get dialInterceptAddress
   * @return dialInterceptAddress
  **/
  @ApiModelProperty(required = true, value = "")

  public oas_any_type_not_mapped getDialInterceptAddress() {
    return dialInterceptAddress;
  }


  public void setDialInterceptAddress(oas_any_type_not_mapped dialInterceptAddress) {
    this.dialInterceptAddress = dialInterceptAddress;
  }


  public CoreV2ServicesServiceIdModelServerEgress dialInterceptPort(oas_any_type_not_mapped dialInterceptPort) {
    
    this.dialInterceptPort = dialInterceptPort;
    return this;
  }

   /**
   * Get dialInterceptPort
   * @return dialInterceptPort
  **/
  @ApiModelProperty(required = true, value = "")

  public oas_any_type_not_mapped getDialInterceptPort() {
    return dialInterceptPort;
  }


  public void setDialInterceptPort(oas_any_type_not_mapped dialInterceptPort) {
    this.dialInterceptPort = dialInterceptPort;
  }


  public CoreV2ServicesServiceIdModelServerEgress port(BigDecimal port) {
    
    this.port = port;
    return this;
  }

   /**
   * Get port
   * @return port
  **/
  @ApiModelProperty(required = true, value = "")

  public BigDecimal getPort() {
    return port;
  }


  public void setPort(BigDecimal port) {
    this.port = port;
  }


  public CoreV2ServicesServiceIdModelServerEgress dialInterceptProtocol(Boolean dialInterceptProtocol) {
    
    this.dialInterceptProtocol = dialInterceptProtocol;
    return this;
  }

   /**
   * Get dialInterceptProtocol
   * @return dialInterceptProtocol
  **/
  @ApiModelProperty(required = true, value = "")

  public Boolean getDialInterceptProtocol() {
    return dialInterceptProtocol;
  }


  public void setDialInterceptProtocol(Boolean dialInterceptProtocol) {
    this.dialInterceptProtocol = dialInterceptProtocol;
  }


  public CoreV2ServicesServiceIdModelServerEgress address(String address) {
    
    this.address = address;
    return this;
  }

   /**
   * Get address
   * @return address
  **/
  @ApiModelProperty(required = true, value = "")

  public String getAddress() {
    return address;
  }


  public void setAddress(String address) {
    this.address = address;
  }


  public CoreV2ServicesServiceIdModelServerEgress protocol(oas_any_type_not_mapped protocol) {
    
    this.protocol = protocol;
    return this;
  }

   /**
   * Get protocol
   * @return protocol
  **/
  @ApiModelProperty(required = true, value = "")

  public oas_any_type_not_mapped getProtocol() {
    return protocol;
  }


  public void setProtocol(oas_any_type_not_mapped protocol) {
    this.protocol = protocol;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CoreV2ServicesServiceIdModelServerEgress coreV2ServicesServiceIdModelServerEgress = (CoreV2ServicesServiceIdModelServerEgress) o;
    return Objects.equals(this.dialInterceptAddress, coreV2ServicesServiceIdModelServerEgress.dialInterceptAddress) &&
        Objects.equals(this.dialInterceptPort, coreV2ServicesServiceIdModelServerEgress.dialInterceptPort) &&
        Objects.equals(this.port, coreV2ServicesServiceIdModelServerEgress.port) &&
        Objects.equals(this.dialInterceptProtocol, coreV2ServicesServiceIdModelServerEgress.dialInterceptProtocol) &&
        Objects.equals(this.address, coreV2ServicesServiceIdModelServerEgress.address) &&
        Objects.equals(this.protocol, coreV2ServicesServiceIdModelServerEgress.protocol);
  }

  @Override
  public int hashCode() {
    return Objects.hash(dialInterceptAddress, dialInterceptPort, port, dialInterceptProtocol, address, protocol);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CoreV2ServicesServiceIdModelServerEgress {\n");
    sb.append("    dialInterceptAddress: ").append(toIndentedString(dialInterceptAddress)).append("\n");
    sb.append("    dialInterceptPort: ").append(toIndentedString(dialInterceptPort)).append("\n");
    sb.append("    port: ").append(toIndentedString(port)).append("\n");
    sb.append("    dialInterceptProtocol: ").append(toIndentedString(dialInterceptProtocol)).append("\n");
    sb.append("    address: ").append(toIndentedString(address)).append("\n");
    sb.append("    protocol: ").append(toIndentedString(protocol)).append("\n");
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

