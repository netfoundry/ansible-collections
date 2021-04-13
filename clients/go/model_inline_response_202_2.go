/*
 * untitled API
 *
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * API version: 5227
 * Generated by: OpenAPI Generator (https://openapi-generator.tech)
 */

package openapi
// InlineResponse2022 struct for InlineResponse2022
type InlineResponse2022 struct {
	DeletedAt string `json:"deletedAt"`
	NetworkId string `json:"networkId"`
	Name string `json:"name"`
	UpdatedAt string `json:"updatedAt"`
	Model interface{} `json:"model"`
	ZitiId interface{} `json:"zitiId"`
	OwnerIdentityId string `json:"ownerIdentityId"`
	Attributes interface{} `json:"attributes"`
	ModelType string `json:"modelType"`
	Id string `json:"id"`
	ConfigIdByConfigTypeId InlineResponse2022ConfigIdByConfigTypeId `json:"configIdByConfigTypeId"`
	CreatedAt string `json:"createdAt"`
	CreatedBy string `json:"createdBy"`
	DeletedBy string `json:"deletedBy"`
	EncryptionRequired bool `json:"encryptionRequired"`
	Authority interface{} `json:"authority"`
	Links InlineResponse2021Links `json:"_links"`
}
