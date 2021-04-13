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
pub struct InlineResponse500 {
    #[serde(rename = "error")]
    pub error: String,
    #[serde(rename = "message")]
    pub message: String,
    #[serde(rename = "status")]
    pub status: f32,
    #[serde(rename = "timestamp")]
    pub timestamp: String,
}

impl InlineResponse500 {
    pub fn new(error: String, message: String, status: f32, timestamp: String) -> InlineResponse500 {
        InlineResponse500 {
            error,
            message,
            status,
            timestamp,
        }
    }
}


