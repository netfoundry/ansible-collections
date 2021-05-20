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
import java.util.ArrayList;
import java.util.List;
import org.openapitools.client.model.CoreV2ServicesModelClientIngressPorts;

/**
 * CoreV2ServicesServiceIdModelClientIngress
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-05-03T11:59:07.273777-04:00[America/New_York]")
public class CoreV2ServicesServiceIdModelClientIngress {
  public static final String SERIALIZED_NAME_ADDRESSES = "addresses";
  @SerializedName(SERIALIZED_NAME_ADDRESSES)
  private List<String> addresses = new ArrayList<String>();

  public static final String SERIALIZED_NAME_PORTS = "ports";
  @SerializedName(SERIALIZED_NAME_PORTS)
  private List<CoreV2ServicesModelClientIngressPorts> ports = new ArrayList<CoreV2ServicesModelClientIngressPorts>();

  public static final String SERIALIZED_NAME_PROTOCOLS = "protocols";
  @SerializedName(SERIALIZED_NAME_PROTOCOLS)
  private List<String> protocols = new ArrayList<String>();


  public CoreV2ServicesServiceIdModelClientIngress addresses(List<String> addresses) {
    
    this.addresses = addresses;
    return this;
  }

  public CoreV2ServicesServiceIdModelClientIngress addAddressesItem(String addressesItem) {
    this.addresses.add(addressesItem);
    return this;
  }

   /**
   * Get addresses
   * @return addresses
  **/
  @ApiModelProperty(required = true, value = "")

  public List<String> getAddresses() {
    return addresses;
  }


  public void setAddresses(List<String> addresses) {
    this.addresses = addresses;
  }


  public CoreV2ServicesServiceIdModelClientIngress ports(List<CoreV2ServicesModelClientIngressPorts> ports) {
    
    this.ports = ports;
    return this;
  }

  public CoreV2ServicesServiceIdModelClientIngress addPortsItem(CoreV2ServicesModelClientIngressPorts portsItem) {
    this.ports.add(portsItem);
    return this;
  }

   /**
   * Get ports
   * @return ports
  **/
  @ApiModelProperty(required = true, value = "")

  public List<CoreV2ServicesModelClientIngressPorts> getPorts() {
    return ports;
  }


  public void setPorts(List<CoreV2ServicesModelClientIngressPorts> ports) {
    this.ports = ports;
  }


  public CoreV2ServicesServiceIdModelClientIngress protocols(List<String> protocols) {
    
    this.protocols = protocols;
    return this;
  }

  public CoreV2ServicesServiceIdModelClientIngress addProtocolsItem(String protocolsItem) {
    this.protocols.add(protocolsItem);
    return this;
  }

   /**
   * Get protocols
   * @return protocols
  **/
  @ApiModelProperty(required = true, value = "")

  public List<String> getProtocols() {
    return protocols;
  }


  public void setProtocols(List<String> protocols) {
    this.protocols = protocols;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CoreV2ServicesServiceIdModelClientIngress coreV2ServicesServiceIdModelClientIngress = (CoreV2ServicesServiceIdModelClientIngress) o;
    return Objects.equals(this.addresses, coreV2ServicesServiceIdModelClientIngress.addresses) &&
        Objects.equals(this.ports, coreV2ServicesServiceIdModelClientIngress.ports) &&
        Objects.equals(this.protocols, coreV2ServicesServiceIdModelClientIngress.protocols);
  }

  @Override
  public int hashCode() {
    return Objects.hash(addresses, ports, protocols);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CoreV2ServicesServiceIdModelClientIngress {\n");
    sb.append("    addresses: ").append(toIndentedString(addresses)).append("\n");
    sb.append("    ports: ").append(toIndentedString(ports)).append("\n");
    sb.append("    protocols: ").append(toIndentedString(protocols)).append("\n");
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

