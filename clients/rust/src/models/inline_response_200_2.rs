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
pub struct InlineResponse2002 {
    #[serde(rename = "_embedded")]
    pub _embedded: crate::models::InlineResponse2002Embedded,
    #[serde(rename = "_links")]
    pub _links: crate::models::InlineResponse2002EmbeddedLinks,
    #[serde(rename = "page")]
    pub page: crate::models::InlineResponse2001Page,
}

impl InlineResponse2002 {
    pub fn new(_embedded: crate::models::InlineResponse2002Embedded, _links: crate::models::InlineResponse2002EmbeddedLinks, page: crate::models::InlineResponse2001Page) -> InlineResponse2002 {
        InlineResponse2002 {
            _embedded,
            _links,
            page,
        }
    }
}


