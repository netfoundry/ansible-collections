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
pub struct CoreV2ServicesServiceIdModelServerEgress {
    #[serde(rename = "dialInterceptAddress")]
    pub dial_intercept_address: crate::models::AnyType,
    #[serde(rename = "dialInterceptPort")]
    pub dial_intercept_port: crate::models::AnyType,
    #[serde(rename = "port")]
    pub port: f32,
    #[serde(rename = "dialInterceptProtocol")]
    pub dial_intercept_protocol: bool,
    #[serde(rename = "address")]
    pub address: String,
    #[serde(rename = "protocol")]
    pub protocol: crate::models::AnyType,
}

impl CoreV2ServicesServiceIdModelServerEgress {
    pub fn new(dial_intercept_address: crate::models::AnyType, dial_intercept_port: crate::models::AnyType, port: f32, dial_intercept_protocol: bool, address: String, protocol: crate::models::AnyType) -> CoreV2ServicesServiceIdModelServerEgress {
        CoreV2ServicesServiceIdModelServerEgress {
            dial_intercept_address,
            dial_intercept_port,
            port,
            dial_intercept_protocol,
            address,
            protocol,
        }
    }
}


