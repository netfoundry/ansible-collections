/*
 * untitled API
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * The version of the OpenAPI document: 5227
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
import org.openapitools.client.model.InlineResponse2024Links;
import org.openapitools.client.model.InlineResponse2024NetworkController;
import org.openapitools.client.model.oas_any_type_not_mapped;

/**
 * InlineResponse2024
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-04-13T16:26:28.927973-04:00[America/New_York]")
public class InlineResponse2024 {
  public static final String SERIALIZED_NAME_DELETED_AT = "deletedAt";
  @SerializedName(SERIALIZED_NAME_DELETED_AT)
  private oas_any_type_not_mapped deletedAt = null;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_UPDATED_AT = "updatedAt";
  @SerializedName(SERIALIZED_NAME_UPDATED_AT)
  private String updatedAt;

  public static final String SERIALIZED_NAME_SIZE = "size";
  @SerializedName(SERIALIZED_NAME_SIZE)
  private String size;

  public static final String SERIALIZED_NAME_OWNER_IDENTITY_ID = "ownerIdentityId";
  @SerializedName(SERIALIZED_NAME_OWNER_IDENTITY_ID)
  private String ownerIdentityId;

  public static final String SERIALIZED_NAME_PRODUCT_VERSION = "productVersion";
  @SerializedName(SERIALIZED_NAME_PRODUCT_VERSION)
  private String productVersion;

  public static final String SERIALIZED_NAME_NETWORK_GROUP_ID = "networkGroupId";
  @SerializedName(SERIALIZED_NAME_NETWORK_GROUP_ID)
  private String networkGroupId;

  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private String id;

  public static final String SERIALIZED_NAME_STATUS = "status";
  @SerializedName(SERIALIZED_NAME_STATUS)
  private String status;

  public static final String SERIALIZED_NAME_CREATED_AT = "createdAt";
  @SerializedName(SERIALIZED_NAME_CREATED_AT)
  private String createdAt;

  public static final String SERIALIZED_NAME_CREATED_BY = "createdBy";
  @SerializedName(SERIALIZED_NAME_CREATED_BY)
  private String createdBy;

  public static final String SERIALIZED_NAME_DELETED_BY = "deletedBy";
  @SerializedName(SERIALIZED_NAME_DELETED_BY)
  private oas_any_type_not_mapped deletedBy = null;

  public static final String SERIALIZED_NAME_NETWORK_CONTROLLER = "networkController";
  @SerializedName(SERIALIZED_NAME_NETWORK_CONTROLLER)
  private InlineResponse2024NetworkController networkController;

  public static final String SERIALIZED_NAME_O365_BREAKOUT_CATEGORY = "o365BreakoutCategory";
  @SerializedName(SERIALIZED_NAME_O365_BREAKOUT_CATEGORY)
  private String o365BreakoutCategory;

  public static final String SERIALIZED_NAME_LINKS = "_links";
  @SerializedName(SERIALIZED_NAME_LINKS)
  private InlineResponse2024Links links;


  public InlineResponse2024 deletedAt(oas_any_type_not_mapped deletedAt) {
    
    this.deletedAt = deletedAt;
    return this;
  }

   /**
   * Get deletedAt
   * @return deletedAt
  **/
  @ApiModelProperty(required = true, value = "")

  public oas_any_type_not_mapped getDeletedAt() {
    return deletedAt;
  }


  public void setDeletedAt(oas_any_type_not_mapped deletedAt) {
    this.deletedAt = deletedAt;
  }


  public InlineResponse2024 name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @ApiModelProperty(required = true, value = "")

  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public InlineResponse2024 updatedAt(String updatedAt) {
    
    this.updatedAt = updatedAt;
    return this;
  }

   /**
   * Get updatedAt
   * @return updatedAt
  **/
  @ApiModelProperty(required = true, value = "")

  public String getUpdatedAt() {
    return updatedAt;
  }


  public void setUpdatedAt(String updatedAt) {
    this.updatedAt = updatedAt;
  }


  public InlineResponse2024 size(String size) {
    
    this.size = size;
    return this;
  }

   /**
   * Get size
   * @return size
  **/
  @ApiModelProperty(required = true, value = "")

  public String getSize() {
    return size;
  }


  public void setSize(String size) {
    this.size = size;
  }


  public InlineResponse2024 ownerIdentityId(String ownerIdentityId) {
    
    this.ownerIdentityId = ownerIdentityId;
    return this;
  }

   /**
   * Get ownerIdentityId
   * @return ownerIdentityId
  **/
  @ApiModelProperty(required = true, value = "")

  public String getOwnerIdentityId() {
    return ownerIdentityId;
  }


  public void setOwnerIdentityId(String ownerIdentityId) {
    this.ownerIdentityId = ownerIdentityId;
  }


  public InlineResponse2024 productVersion(String productVersion) {
    
    this.productVersion = productVersion;
    return this;
  }

   /**
   * Get productVersion
   * @return productVersion
  **/
  @ApiModelProperty(required = true, value = "")

  public String getProductVersion() {
    return productVersion;
  }


  public void setProductVersion(String productVersion) {
    this.productVersion = productVersion;
  }


  public InlineResponse2024 networkGroupId(String networkGroupId) {
    
    this.networkGroupId = networkGroupId;
    return this;
  }

   /**
   * Get networkGroupId
   * @return networkGroupId
  **/
  @ApiModelProperty(required = true, value = "")

  public String getNetworkGroupId() {
    return networkGroupId;
  }


  public void setNetworkGroupId(String networkGroupId) {
    this.networkGroupId = networkGroupId;
  }


  public InlineResponse2024 id(String id) {
    
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @ApiModelProperty(required = true, value = "")

  public String getId() {
    return id;
  }


  public void setId(String id) {
    this.id = id;
  }


  public InlineResponse2024 status(String status) {
    
    this.status = status;
    return this;
  }

   /**
   * Get status
   * @return status
  **/
  @ApiModelProperty(required = true, value = "")

  public String getStatus() {
    return status;
  }


  public void setStatus(String status) {
    this.status = status;
  }


  public InlineResponse2024 createdAt(String createdAt) {
    
    this.createdAt = createdAt;
    return this;
  }

   /**
   * Get createdAt
   * @return createdAt
  **/
  @ApiModelProperty(required = true, value = "")

  public String getCreatedAt() {
    return createdAt;
  }


  public void setCreatedAt(String createdAt) {
    this.createdAt = createdAt;
  }


  public InlineResponse2024 createdBy(String createdBy) {
    
    this.createdBy = createdBy;
    return this;
  }

   /**
   * Get createdBy
   * @return createdBy
  **/
  @ApiModelProperty(required = true, value = "")

  public String getCreatedBy() {
    return createdBy;
  }


  public void setCreatedBy(String createdBy) {
    this.createdBy = createdBy;
  }


  public InlineResponse2024 deletedBy(oas_any_type_not_mapped deletedBy) {
    
    this.deletedBy = deletedBy;
    return this;
  }

   /**
   * Get deletedBy
   * @return deletedBy
  **/
  @ApiModelProperty(required = true, value = "")

  public oas_any_type_not_mapped getDeletedBy() {
    return deletedBy;
  }


  public void setDeletedBy(oas_any_type_not_mapped deletedBy) {
    this.deletedBy = deletedBy;
  }


  public InlineResponse2024 networkController(InlineResponse2024NetworkController networkController) {
    
    this.networkController = networkController;
    return this;
  }

   /**
   * Get networkController
   * @return networkController
  **/
  @ApiModelProperty(required = true, value = "")

  public InlineResponse2024NetworkController getNetworkController() {
    return networkController;
  }


  public void setNetworkController(InlineResponse2024NetworkController networkController) {
    this.networkController = networkController;
  }


  public InlineResponse2024 o365BreakoutCategory(String o365BreakoutCategory) {
    
    this.o365BreakoutCategory = o365BreakoutCategory;
    return this;
  }

   /**
   * Get o365BreakoutCategory
   * @return o365BreakoutCategory
  **/
  @ApiModelProperty(required = true, value = "")

  public String getO365BreakoutCategory() {
    return o365BreakoutCategory;
  }


  public void setO365BreakoutCategory(String o365BreakoutCategory) {
    this.o365BreakoutCategory = o365BreakoutCategory;
  }


  public InlineResponse2024 links(InlineResponse2024Links links) {
    
    this.links = links;
    return this;
  }

   /**
   * Get links
   * @return links
  **/
  @ApiModelProperty(required = true, value = "")

  public InlineResponse2024Links getLinks() {
    return links;
  }


  public void setLinks(InlineResponse2024Links links) {
    this.links = links;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InlineResponse2024 inlineResponse2024 = (InlineResponse2024) o;
    return Objects.equals(this.deletedAt, inlineResponse2024.deletedAt) &&
        Objects.equals(this.name, inlineResponse2024.name) &&
        Objects.equals(this.updatedAt, inlineResponse2024.updatedAt) &&
        Objects.equals(this.size, inlineResponse2024.size) &&
        Objects.equals(this.ownerIdentityId, inlineResponse2024.ownerIdentityId) &&
        Objects.equals(this.productVersion, inlineResponse2024.productVersion) &&
        Objects.equals(this.networkGroupId, inlineResponse2024.networkGroupId) &&
        Objects.equals(this.id, inlineResponse2024.id) &&
        Objects.equals(this.status, inlineResponse2024.status) &&
        Objects.equals(this.createdAt, inlineResponse2024.createdAt) &&
        Objects.equals(this.createdBy, inlineResponse2024.createdBy) &&
        Objects.equals(this.deletedBy, inlineResponse2024.deletedBy) &&
        Objects.equals(this.networkController, inlineResponse2024.networkController) &&
        Objects.equals(this.o365BreakoutCategory, inlineResponse2024.o365BreakoutCategory) &&
        Objects.equals(this.links, inlineResponse2024.links);
  }

  @Override
  public int hashCode() {
    return Objects.hash(deletedAt, name, updatedAt, size, ownerIdentityId, productVersion, networkGroupId, id, status, createdAt, createdBy, deletedBy, networkController, o365BreakoutCategory, links);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InlineResponse2024 {\n");
    sb.append("    deletedAt: ").append(toIndentedString(deletedAt)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
    sb.append("    size: ").append(toIndentedString(size)).append("\n");
    sb.append("    ownerIdentityId: ").append(toIndentedString(ownerIdentityId)).append("\n");
    sb.append("    productVersion: ").append(toIndentedString(productVersion)).append("\n");
    sb.append("    networkGroupId: ").append(toIndentedString(networkGroupId)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    createdBy: ").append(toIndentedString(createdBy)).append("\n");
    sb.append("    deletedBy: ").append(toIndentedString(deletedBy)).append("\n");
    sb.append("    networkController: ").append(toIndentedString(networkController)).append("\n");
    sb.append("    o365BreakoutCategory: ").append(toIndentedString(o365BreakoutCategory)).append("\n");
    sb.append("    links: ").append(toIndentedString(links)).append("\n");
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

