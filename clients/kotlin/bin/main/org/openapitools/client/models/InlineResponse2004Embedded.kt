/**
* untitled API
* No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
*
* The version of the OpenAPI document: 5229
* 
*
* NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
* https://openapi-generator.tech
* Do not edit the class manually.
*/
package org.openapitools.client.models

import org.openapitools.client.models.InlineResponse2004EmbeddedEdgeRouterPolicyList

import com.squareup.moshi.Json
/**
 * 
 * @param edgeRouterPolicyList 
 */

data class InlineResponse2004Embedded (
    @Json(name = "edgeRouterPolicyList")
    val edgeRouterPolicyList: kotlin.Array<InlineResponse2004EmbeddedEdgeRouterPolicyList>
)

