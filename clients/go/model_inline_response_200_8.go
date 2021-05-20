/*
 * untitled API
 *
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * API version: 5229
 * Generated by: OpenAPI Generator (https://openapi-generator.tech)
 */

package openapi
// InlineResponse2008 struct for InlineResponse2008
type InlineResponse2008 struct {
	MfaEnabled bool `json:"mfaEnabled"`
	DeletedAt interface{} `json:"deletedAt"`
	NetworkId string `json:"networkId"`
	Name string `json:"name"`
	UpdatedAt string `json:"updatedAt"`
	SyncId interface{} `json:"syncId"`
	SessionIdentityId interface{} `json:"sessionIdentityId"`
	OsRelease interface{} `json:"osRelease"`
	SyncResourceId interface{} `json:"syncResourceId"`
	ZitiId string `json:"zitiId"`
	AppVersion interface{} `json:"appVersion"`
	Branch interface{} `json:"branch"`
	Os interface{} `json:"os"`
	OwnerIdentityId string `json:"ownerIdentityId"`
	HasEdgeRouterConnection bool `json:"hasEdgeRouterConnection"`
	Attributes []string `json:"attributes"`
	HasApiSession bool `json:"hasApiSession"`
	Revision interface{} `json:"revision"`
	Version interface{} `json:"version"`
	Jwt string `json:"jwt"`
	Id string `json:"id"`
	SessionActive bool `json:"sessionActive"`
	JwtExpiresAt string `json:"jwtExpiresAt"`
	CreatedAt string `json:"createdAt"`
	Arch interface{} `json:"arch"`
	CreatedBy string `json:"createdBy"`
	DeletedBy interface{} `json:"deletedBy"`
	Type interface{} `json:"type"`
	OsVersion interface{} `json:"osVersion"`
	AppId interface{} `json:"appId"`
	Links InlineResponse200Links `json:"_links"`
}
