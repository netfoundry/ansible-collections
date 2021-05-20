/*
 * untitled API
 *
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * The version of the OpenAPI document: 5229
 * 
 * Generated by: https://openapi-generator.tech
 */




#[derive(Clone, Debug, PartialEq, Serialize, Deserialize)]
pub struct InlineObject5 {
    #[serde(rename = "attributes")]
    pub attributes: Vec<String>,
    #[serde(rename = "enrollmentMethod")]
    pub enrollment_method: crate::models::CoreV2EndpointsEnrollmentMethod,
    #[serde(rename = "name")]
    pub name: String,
    #[serde(rename = "networkId")]
    pub network_id: String,
}

impl InlineObject5 {
    pub fn new(attributes: Vec<String>, enrollment_method: crate::models::CoreV2EndpointsEnrollmentMethod, name: String, network_id: String) -> InlineObject5 {
        InlineObject5 {
            attributes,
            enrollment_method,
            name,
            network_id,
        }
    }
}


