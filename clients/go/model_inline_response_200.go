/*
 * untitled API
 *
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * API version: 5229
 * Generated by: OpenAPI Generator (https://openapi-generator.tech)
 */

package openapi
// InlineResponse200 struct for InlineResponse200
type InlineResponse200 struct {
	ServiceAttributes []string `json:"serviceAttributes"`
	DeletedAt interface{} `json:"deletedAt"`
	NetworkId string `json:"networkId"`
	Name string `json:"name"`
	UpdatedAt string `json:"updatedAt"`
	PostureCheckAttributes []interface{} `json:"postureCheckAttributes"`
	ZitiId string `json:"zitiId"`
	OwnerIdentityId string `json:"ownerIdentityId"`
	Id string `json:"id"`
	CreatedAt string `json:"createdAt"`
	CreatedBy string `json:"createdBy"`
	DeletedBy interface{} `json:"deletedBy"`
	EndpointAttributes []string `json:"endpointAttributes"`
	Links InlineResponse200Links `json:"_links"`
}
