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
pub struct InlineResponse20017Links {
    #[serde(rename = "first")]
    pub first: crate::models::InlineResponse200LinksSelf,
    #[serde(rename = "last")]
    pub last: crate::models::InlineResponse200LinksSelf,
}

impl InlineResponse20017Links {
    pub fn new(first: crate::models::InlineResponse200LinksSelf, last: crate::models::InlineResponse200LinksSelf) -> InlineResponse20017Links {
        InlineResponse20017Links {
            first,
            last,
        }
    }
}


