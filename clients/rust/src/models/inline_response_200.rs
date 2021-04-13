/*
 * untitled API
 *
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * The version of the OpenAPI document: 5227
 * 
 * Generated by: https://openapi-generator.tech
 */




#[derive(Clone, Debug, PartialEq, Serialize, Deserialize)]
pub struct InlineResponse200 {
    #[serde(rename = "serviceAttributes")]
    pub service_attributes: Vec<String>,
    #[serde(rename = "deletedAt")]
    pub deleted_at: crate::models::AnyType,
    #[serde(rename = "networkId")]
    pub network_id: String,
    #[serde(rename = "name")]
    pub name: String,
    #[serde(rename = "updatedAt")]
    pub updated_at: String,
    #[serde(rename = "postureCheckAttributes")]
    pub posture_check_attributes: Vec<crate::models::AnyType>,
    #[serde(rename = "zitiId")]
    pub ziti_id: String,
    #[serde(rename = "ownerIdentityId")]
    pub owner_identity_id: String,
    #[serde(rename = "id")]
    pub id: String,
    #[serde(rename = "createdAt")]
    pub created_at: String,
    #[serde(rename = "createdBy")]
    pub created_by: String,
    #[serde(rename = "deletedBy")]
    pub deleted_by: crate::models::AnyType,
    #[serde(rename = "endpointAttributes")]
    pub endpoint_attributes: Vec<String>,
    #[serde(rename = "_links")]
    pub _links: crate::models::InlineResponse200Links,
}

impl InlineResponse200 {
    pub fn new(service_attributes: Vec<String>, deleted_at: crate::models::AnyType, network_id: String, name: String, updated_at: String, posture_check_attributes: Vec<crate::models::AnyType>, ziti_id: String, owner_identity_id: String, id: String, created_at: String, created_by: String, deleted_by: crate::models::AnyType, endpoint_attributes: Vec<String>, _links: crate::models::InlineResponse200Links) -> InlineResponse200 {
        InlineResponse200 {
            service_attributes,
            deleted_at,
            network_id,
            name,
            updated_at,
            posture_check_attributes,
            ziti_id,
            owner_identity_id,
            id,
            created_at,
            created_by,
            deleted_by,
            endpoint_attributes,
            _links,
        }
    }
}


