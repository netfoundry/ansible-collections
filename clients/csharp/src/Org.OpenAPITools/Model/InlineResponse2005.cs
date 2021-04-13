/* 
 * untitled API
 *
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * The version of the OpenAPI document: 5227
 * 
 * Generated by: https://github.com/openapitools/openapi-generator.git
 */

using System;
using System.Linq;
using System.IO;
using System.Text;
using System.Text.RegularExpressions;
using System.Collections;
using System.Collections.Generic;
using System.Collections.ObjectModel;
using System.Runtime.Serialization;
using Newtonsoft.Json;
using Newtonsoft.Json.Converters;
using System.ComponentModel.DataAnnotations;
using OpenAPIDateConverter = Org.OpenAPITools.Client.OpenAPIDateConverter;

namespace Org.OpenAPITools.Model
{
    /// <summary>
    /// InlineResponse2005
    /// </summary>
    [DataContract]
    public partial class InlineResponse2005 :  IEquatable<InlineResponse2005>, IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="InlineResponse2005" /> class.
        /// </summary>
        [JsonConstructorAttribute]
        protected InlineResponse2005() { }
        /// <summary>
        /// Initializes a new instance of the <see cref="InlineResponse2005" /> class.
        /// </summary>
        /// <param name="deletedAt">deletedAt (required).</param>
        /// <param name="networkId">networkId (required).</param>
        /// <param name="name">name (required).</param>
        /// <param name="updatedAt">updatedAt (required).</param>
        /// <param name="model">model (required).</param>
        /// <param name="zitiId">zitiId (required).</param>
        /// <param name="ownerIdentityId">ownerIdentityId (required).</param>
        /// <param name="attributes">attributes (required).</param>
        /// <param name="modelType">modelType (required).</param>
        /// <param name="id">id (required).</param>
        /// <param name="configIdByConfigTypeId">configIdByConfigTypeId (required).</param>
        /// <param name="createdAt">createdAt (required).</param>
        /// <param name="createdBy">createdBy (required).</param>
        /// <param name="deletedBy">deletedBy (required).</param>
        /// <param name="encryptionRequired">encryptionRequired (required).</param>
        /// <param name="authority">authority (required).</param>
        /// <param name="links">links (required).</param>
        public InlineResponse2005(AnyType deletedAt = default(AnyType), string networkId = default(string), string name = default(string), string updatedAt = default(string), InlineResponse2003EmbeddedModel model = default(InlineResponse2003EmbeddedModel), string zitiId = default(string), string ownerIdentityId = default(string), List<string> attributes = default(List<string>), string modelType = default(string), string id = default(string), InlineResponse2005ConfigIdByConfigTypeId configIdByConfigTypeId = default(InlineResponse2005ConfigIdByConfigTypeId), string createdAt = default(string), string createdBy = default(string), AnyType deletedBy = default(AnyType), bool encryptionRequired = default(bool), AnyType authority = default(AnyType), InlineResponse200Links links = default(InlineResponse200Links))
        {
            // to ensure "deletedAt" is required (not null)
            if (deletedAt == null)
            {
                throw new InvalidDataException("deletedAt is a required property for InlineResponse2005 and cannot be null");
            }
            else
            {
                this.DeletedAt = deletedAt;
            }
            
            // to ensure "networkId" is required (not null)
            if (networkId == null)
            {
                throw new InvalidDataException("networkId is a required property for InlineResponse2005 and cannot be null");
            }
            else
            {
                this.NetworkId = networkId;
            }
            
            // to ensure "name" is required (not null)
            if (name == null)
            {
                throw new InvalidDataException("name is a required property for InlineResponse2005 and cannot be null");
            }
            else
            {
                this.Name = name;
            }
            
            // to ensure "updatedAt" is required (not null)
            if (updatedAt == null)
            {
                throw new InvalidDataException("updatedAt is a required property for InlineResponse2005 and cannot be null");
            }
            else
            {
                this.UpdatedAt = updatedAt;
            }
            
            // to ensure "model" is required (not null)
            if (model == null)
            {
                throw new InvalidDataException("model is a required property for InlineResponse2005 and cannot be null");
            }
            else
            {
                this.Model = model;
            }
            
            // to ensure "zitiId" is required (not null)
            if (zitiId == null)
            {
                throw new InvalidDataException("zitiId is a required property for InlineResponse2005 and cannot be null");
            }
            else
            {
                this.ZitiId = zitiId;
            }
            
            // to ensure "ownerIdentityId" is required (not null)
            if (ownerIdentityId == null)
            {
                throw new InvalidDataException("ownerIdentityId is a required property for InlineResponse2005 and cannot be null");
            }
            else
            {
                this.OwnerIdentityId = ownerIdentityId;
            }
            
            // to ensure "attributes" is required (not null)
            if (attributes == null)
            {
                throw new InvalidDataException("attributes is a required property for InlineResponse2005 and cannot be null");
            }
            else
            {
                this.Attributes = attributes;
            }
            
            // to ensure "modelType" is required (not null)
            if (modelType == null)
            {
                throw new InvalidDataException("modelType is a required property for InlineResponse2005 and cannot be null");
            }
            else
            {
                this.ModelType = modelType;
            }
            
            // to ensure "id" is required (not null)
            if (id == null)
            {
                throw new InvalidDataException("id is a required property for InlineResponse2005 and cannot be null");
            }
            else
            {
                this.Id = id;
            }
            
            // to ensure "configIdByConfigTypeId" is required (not null)
            if (configIdByConfigTypeId == null)
            {
                throw new InvalidDataException("configIdByConfigTypeId is a required property for InlineResponse2005 and cannot be null");
            }
            else
            {
                this.ConfigIdByConfigTypeId = configIdByConfigTypeId;
            }
            
            // to ensure "createdAt" is required (not null)
            if (createdAt == null)
            {
                throw new InvalidDataException("createdAt is a required property for InlineResponse2005 and cannot be null");
            }
            else
            {
                this.CreatedAt = createdAt;
            }
            
            // to ensure "createdBy" is required (not null)
            if (createdBy == null)
            {
                throw new InvalidDataException("createdBy is a required property for InlineResponse2005 and cannot be null");
            }
            else
            {
                this.CreatedBy = createdBy;
            }
            
            // to ensure "deletedBy" is required (not null)
            if (deletedBy == null)
            {
                throw new InvalidDataException("deletedBy is a required property for InlineResponse2005 and cannot be null");
            }
            else
            {
                this.DeletedBy = deletedBy;
            }
            
            // to ensure "encryptionRequired" is required (not null)
            if (encryptionRequired == null)
            {
                throw new InvalidDataException("encryptionRequired is a required property for InlineResponse2005 and cannot be null");
            }
            else
            {
                this.EncryptionRequired = encryptionRequired;
            }
            
            // to ensure "authority" is required (not null)
            if (authority == null)
            {
                throw new InvalidDataException("authority is a required property for InlineResponse2005 and cannot be null");
            }
            else
            {
                this.Authority = authority;
            }
            
            // to ensure "links" is required (not null)
            if (links == null)
            {
                throw new InvalidDataException("links is a required property for InlineResponse2005 and cannot be null");
            }
            else
            {
                this.Links = links;
            }
            
        }
        
        /// <summary>
        /// Gets or Sets DeletedAt
        /// </summary>
        [DataMember(Name="deletedAt", EmitDefaultValue=true)]
        public AnyType DeletedAt { get; set; }

        /// <summary>
        /// Gets or Sets NetworkId
        /// </summary>
        [DataMember(Name="networkId", EmitDefaultValue=true)]
        public string NetworkId { get; set; }

        /// <summary>
        /// Gets or Sets Name
        /// </summary>
        [DataMember(Name="name", EmitDefaultValue=true)]
        public string Name { get; set; }

        /// <summary>
        /// Gets or Sets UpdatedAt
        /// </summary>
        [DataMember(Name="updatedAt", EmitDefaultValue=true)]
        public string UpdatedAt { get; set; }

        /// <summary>
        /// Gets or Sets Model
        /// </summary>
        [DataMember(Name="model", EmitDefaultValue=true)]
        public InlineResponse2003EmbeddedModel Model { get; set; }

        /// <summary>
        /// Gets or Sets ZitiId
        /// </summary>
        [DataMember(Name="zitiId", EmitDefaultValue=true)]
        public string ZitiId { get; set; }

        /// <summary>
        /// Gets or Sets OwnerIdentityId
        /// </summary>
        [DataMember(Name="ownerIdentityId", EmitDefaultValue=true)]
        public string OwnerIdentityId { get; set; }

        /// <summary>
        /// Gets or Sets Attributes
        /// </summary>
        [DataMember(Name="attributes", EmitDefaultValue=true)]
        public List<string> Attributes { get; set; }

        /// <summary>
        /// Gets or Sets ModelType
        /// </summary>
        [DataMember(Name="modelType", EmitDefaultValue=true)]
        public string ModelType { get; set; }

        /// <summary>
        /// Gets or Sets Id
        /// </summary>
        [DataMember(Name="id", EmitDefaultValue=true)]
        public string Id { get; set; }

        /// <summary>
        /// Gets or Sets ConfigIdByConfigTypeId
        /// </summary>
        [DataMember(Name="configIdByConfigTypeId", EmitDefaultValue=true)]
        public InlineResponse2005ConfigIdByConfigTypeId ConfigIdByConfigTypeId { get; set; }

        /// <summary>
        /// Gets or Sets CreatedAt
        /// </summary>
        [DataMember(Name="createdAt", EmitDefaultValue=true)]
        public string CreatedAt { get; set; }

        /// <summary>
        /// Gets or Sets CreatedBy
        /// </summary>
        [DataMember(Name="createdBy", EmitDefaultValue=true)]
        public string CreatedBy { get; set; }

        /// <summary>
        /// Gets or Sets DeletedBy
        /// </summary>
        [DataMember(Name="deletedBy", EmitDefaultValue=true)]
        public AnyType DeletedBy { get; set; }

        /// <summary>
        /// Gets or Sets EncryptionRequired
        /// </summary>
        [DataMember(Name="encryptionRequired", EmitDefaultValue=true)]
        public bool EncryptionRequired { get; set; }

        /// <summary>
        /// Gets or Sets Authority
        /// </summary>
        [DataMember(Name="authority", EmitDefaultValue=true)]
        public AnyType Authority { get; set; }

        /// <summary>
        /// Gets or Sets Links
        /// </summary>
        [DataMember(Name="_links", EmitDefaultValue=true)]
        public InlineResponse200Links Links { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            var sb = new StringBuilder();
            sb.Append("class InlineResponse2005 {\n");
            sb.Append("  DeletedAt: ").Append(DeletedAt).Append("\n");
            sb.Append("  NetworkId: ").Append(NetworkId).Append("\n");
            sb.Append("  Name: ").Append(Name).Append("\n");
            sb.Append("  UpdatedAt: ").Append(UpdatedAt).Append("\n");
            sb.Append("  Model: ").Append(Model).Append("\n");
            sb.Append("  ZitiId: ").Append(ZitiId).Append("\n");
            sb.Append("  OwnerIdentityId: ").Append(OwnerIdentityId).Append("\n");
            sb.Append("  Attributes: ").Append(Attributes).Append("\n");
            sb.Append("  ModelType: ").Append(ModelType).Append("\n");
            sb.Append("  Id: ").Append(Id).Append("\n");
            sb.Append("  ConfigIdByConfigTypeId: ").Append(ConfigIdByConfigTypeId).Append("\n");
            sb.Append("  CreatedAt: ").Append(CreatedAt).Append("\n");
            sb.Append("  CreatedBy: ").Append(CreatedBy).Append("\n");
            sb.Append("  DeletedBy: ").Append(DeletedBy).Append("\n");
            sb.Append("  EncryptionRequired: ").Append(EncryptionRequired).Append("\n");
            sb.Append("  Authority: ").Append(Authority).Append("\n");
            sb.Append("  Links: ").Append(Links).Append("\n");
            sb.Append("}\n");
            return sb.ToString();
        }
  
        /// <summary>
        /// Returns the JSON string presentation of the object
        /// </summary>
        /// <returns>JSON string presentation of the object</returns>
        public virtual string ToJson()
        {
            return JsonConvert.SerializeObject(this, Formatting.Indented);
        }

        /// <summary>
        /// Returns true if objects are equal
        /// </summary>
        /// <param name="input">Object to be compared</param>
        /// <returns>Boolean</returns>
        public override bool Equals(object input)
        {
            return this.Equals(input as InlineResponse2005);
        }

        /// <summary>
        /// Returns true if InlineResponse2005 instances are equal
        /// </summary>
        /// <param name="input">Instance of InlineResponse2005 to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(InlineResponse2005 input)
        {
            if (input == null)
                return false;

            return 
                (
                    this.DeletedAt == input.DeletedAt ||
                    (this.DeletedAt != null &&
                    this.DeletedAt.Equals(input.DeletedAt))
                ) && 
                (
                    this.NetworkId == input.NetworkId ||
                    (this.NetworkId != null &&
                    this.NetworkId.Equals(input.NetworkId))
                ) && 
                (
                    this.Name == input.Name ||
                    (this.Name != null &&
                    this.Name.Equals(input.Name))
                ) && 
                (
                    this.UpdatedAt == input.UpdatedAt ||
                    (this.UpdatedAt != null &&
                    this.UpdatedAt.Equals(input.UpdatedAt))
                ) && 
                (
                    this.Model == input.Model ||
                    (this.Model != null &&
                    this.Model.Equals(input.Model))
                ) && 
                (
                    this.ZitiId == input.ZitiId ||
                    (this.ZitiId != null &&
                    this.ZitiId.Equals(input.ZitiId))
                ) && 
                (
                    this.OwnerIdentityId == input.OwnerIdentityId ||
                    (this.OwnerIdentityId != null &&
                    this.OwnerIdentityId.Equals(input.OwnerIdentityId))
                ) && 
                (
                    this.Attributes == input.Attributes ||
                    this.Attributes != null &&
                    input.Attributes != null &&
                    this.Attributes.SequenceEqual(input.Attributes)
                ) && 
                (
                    this.ModelType == input.ModelType ||
                    (this.ModelType != null &&
                    this.ModelType.Equals(input.ModelType))
                ) && 
                (
                    this.Id == input.Id ||
                    (this.Id != null &&
                    this.Id.Equals(input.Id))
                ) && 
                (
                    this.ConfigIdByConfigTypeId == input.ConfigIdByConfigTypeId ||
                    (this.ConfigIdByConfigTypeId != null &&
                    this.ConfigIdByConfigTypeId.Equals(input.ConfigIdByConfigTypeId))
                ) && 
                (
                    this.CreatedAt == input.CreatedAt ||
                    (this.CreatedAt != null &&
                    this.CreatedAt.Equals(input.CreatedAt))
                ) && 
                (
                    this.CreatedBy == input.CreatedBy ||
                    (this.CreatedBy != null &&
                    this.CreatedBy.Equals(input.CreatedBy))
                ) && 
                (
                    this.DeletedBy == input.DeletedBy ||
                    (this.DeletedBy != null &&
                    this.DeletedBy.Equals(input.DeletedBy))
                ) && 
                (
                    this.EncryptionRequired == input.EncryptionRequired ||
                    (this.EncryptionRequired != null &&
                    this.EncryptionRequired.Equals(input.EncryptionRequired))
                ) && 
                (
                    this.Authority == input.Authority ||
                    (this.Authority != null &&
                    this.Authority.Equals(input.Authority))
                ) && 
                (
                    this.Links == input.Links ||
                    (this.Links != null &&
                    this.Links.Equals(input.Links))
                );
        }

        /// <summary>
        /// Gets the hash code
        /// </summary>
        /// <returns>Hash code</returns>
        public override int GetHashCode()
        {
            unchecked // Overflow is fine, just wrap
            {
                int hashCode = 41;
                if (this.DeletedAt != null)
                    hashCode = hashCode * 59 + this.DeletedAt.GetHashCode();
                if (this.NetworkId != null)
                    hashCode = hashCode * 59 + this.NetworkId.GetHashCode();
                if (this.Name != null)
                    hashCode = hashCode * 59 + this.Name.GetHashCode();
                if (this.UpdatedAt != null)
                    hashCode = hashCode * 59 + this.UpdatedAt.GetHashCode();
                if (this.Model != null)
                    hashCode = hashCode * 59 + this.Model.GetHashCode();
                if (this.ZitiId != null)
                    hashCode = hashCode * 59 + this.ZitiId.GetHashCode();
                if (this.OwnerIdentityId != null)
                    hashCode = hashCode * 59 + this.OwnerIdentityId.GetHashCode();
                if (this.Attributes != null)
                    hashCode = hashCode * 59 + this.Attributes.GetHashCode();
                if (this.ModelType != null)
                    hashCode = hashCode * 59 + this.ModelType.GetHashCode();
                if (this.Id != null)
                    hashCode = hashCode * 59 + this.Id.GetHashCode();
                if (this.ConfigIdByConfigTypeId != null)
                    hashCode = hashCode * 59 + this.ConfigIdByConfigTypeId.GetHashCode();
                if (this.CreatedAt != null)
                    hashCode = hashCode * 59 + this.CreatedAt.GetHashCode();
                if (this.CreatedBy != null)
                    hashCode = hashCode * 59 + this.CreatedBy.GetHashCode();
                if (this.DeletedBy != null)
                    hashCode = hashCode * 59 + this.DeletedBy.GetHashCode();
                if (this.EncryptionRequired != null)
                    hashCode = hashCode * 59 + this.EncryptionRequired.GetHashCode();
                if (this.Authority != null)
                    hashCode = hashCode * 59 + this.Authority.GetHashCode();
                if (this.Links != null)
                    hashCode = hashCode * 59 + this.Links.GetHashCode();
                return hashCode;
            }
        }

        /// <summary>
        /// To validate all properties of the instance
        /// </summary>
        /// <param name="validationContext">Validation context</param>
        /// <returns>Validation Result</returns>
        IEnumerable<System.ComponentModel.DataAnnotations.ValidationResult> IValidatableObject.Validate(ValidationContext validationContext)
        {
            yield break;
        }
    }

}
