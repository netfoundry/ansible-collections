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

import { RequestFile } from '../api';
import { InlineResponse2003EmbeddedModelServerEgress1 } from './inlineResponse2003EmbeddedModelServerEgress1';

export class InlineResponse2003EmbeddedModelEdgeRouterHosts {
    'edgeRouterId': string;
    'serverEgress': InlineResponse2003EmbeddedModelServerEgress1;

    static discriminator: string | undefined = undefined;

    static attributeTypeMap: Array<{name: string, baseName: string, type: string}> = [
        {
            "name": "edgeRouterId",
            "baseName": "edgeRouterId",
            "type": "string"
        },
        {
            "name": "serverEgress",
            "baseName": "serverEgress",
            "type": "InlineResponse2003EmbeddedModelServerEgress1"
        }    ];

    static getAttributeTypeMap() {
        return InlineResponse2003EmbeddedModelEdgeRouterHosts.attributeTypeMap;
    }
}

