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
import { CoreV2ServicesModelServerEgress } from './coreV2ServicesModelServerEgress';

export class CoreV2ServicesModelEdgeRouterHosts {
    'edgeRouterId': string;
    'serverEgress': CoreV2ServicesModelServerEgress;

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
            "type": "CoreV2ServicesModelServerEgress"
        }    ];

    static getAttributeTypeMap() {
        return CoreV2ServicesModelEdgeRouterHosts.attributeTypeMap;
    }
}

