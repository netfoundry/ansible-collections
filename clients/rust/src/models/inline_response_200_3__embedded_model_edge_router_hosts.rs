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
pub struct InlineResponse2003EmbeddedModelEdgeRouterHosts {
    #[serde(rename = "edgeRouterId")]
    pub edge_router_id: String,
    #[serde(rename = "serverEgress")]
    pub server_egress: crate::models::InlineResponse2003EmbeddedModelServerEgress1,
}

impl InlineResponse2003EmbeddedModelEdgeRouterHosts {
    pub fn new(edge_router_id: String, server_egress: crate::models::InlineResponse2003EmbeddedModelServerEgress1) -> InlineResponse2003EmbeddedModelEdgeRouterHosts {
        InlineResponse2003EmbeddedModelEdgeRouterHosts {
            edge_router_id,
            server_egress,
        }
    }
}


