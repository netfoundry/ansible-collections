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


import com.squareup.moshi.Json
/**
 * 
 * @param epochSecond 
 * @param nano 
 */

data class InlineResponse20014UpdatedAt (
    @Json(name = "epochSecond")
    val epochSecond: java.math.BigDecimal,
    @Json(name = "nano")
    val nano: java.math.BigDecimal
)

