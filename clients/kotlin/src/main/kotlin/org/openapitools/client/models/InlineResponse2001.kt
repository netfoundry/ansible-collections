/**
* untitled API
* No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
*
* The version of the OpenAPI document: 5227
* 
*
* NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
* https://openapi-generator.tech
* Do not edit the class manually.
*/
package org.openapitools.client.models

import org.openapitools.client.models.InlineResponse2001Embedded
import org.openapitools.client.models.InlineResponse2001Links
import org.openapitools.client.models.InlineResponse2001Page

import com.squareup.moshi.Json
/**
 * 
 * @param embedded 
 * @param links 
 * @param page 
 */

data class InlineResponse2001 (
    @Json(name = "_embedded")
    val embedded: InlineResponse2001Embedded,
    @Json(name = "_links")
    val links: InlineResponse2001Links,
    @Json(name = "page")
    val page: InlineResponse2001Page
)

