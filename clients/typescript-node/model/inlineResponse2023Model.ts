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

import { RequestFile } from '../api';
import { CoreV2ServicesServiceIdModelServerEgress } from './coreV2ServicesServiceIdModelServerEgress';
import { InlineResponse2023ModelClientIngress } from './inlineResponse2023ModelClientIngress';

export class InlineResponse2023Model {
    'bindEndpointAttributes': Array<string>;
    'clientIngress': InlineResponse2023ModelClientIngress;
    'edgeRouterAttributes': Array<string>;
    'serverEgress': CoreV2ServicesServiceIdModelServerEgress;

    static discriminator: string | undefined = undefined;

    static attributeTypeMap: Array<{name: string, baseName: string, type: string}> = [
        {
            "name": "bindEndpointAttributes",
            "baseName": "bindEndpointAttributes",
            "type": "Array<string>"
        },
        {
            "name": "clientIngress",
            "baseName": "clientIngress",
            "type": "InlineResponse2023ModelClientIngress"
        },
        {
            "name": "edgeRouterAttributes",
            "baseName": "edgeRouterAttributes",
            "type": "Array<string>"
        },
        {
            "name": "serverEgress",
            "baseName": "serverEgress",
            "type": "CoreV2ServicesServiceIdModelServerEgress"
        }    ];

    static getAttributeTypeMap() {
        return InlineResponse2023Model.attributeTypeMap;
    }
}

