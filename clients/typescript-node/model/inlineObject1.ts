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
import { CoreV2ServicesModel } from './coreV2ServicesModel';

export class InlineObject1 {
    'networkId': string;
    'name': string;
    'model': CoreV2ServicesModel;
    'attributes': Array<string>;
    'modelType': string;
    'encryptionRequired': boolean;

    static discriminator: string | undefined = undefined;

    static attributeTypeMap: Array<{name: string, baseName: string, type: string}> = [
        {
            "name": "networkId",
            "baseName": "networkId",
            "type": "string"
        },
        {
            "name": "name",
            "baseName": "name",
            "type": "string"
        },
        {
            "name": "model",
            "baseName": "model",
            "type": "CoreV2ServicesModel"
        },
        {
            "name": "attributes",
            "baseName": "attributes",
            "type": "Array<string>"
        },
        {
            "name": "modelType",
            "baseName": "modelType",
            "type": "string"
        },
        {
            "name": "encryptionRequired",
            "baseName": "encryptionRequired",
            "type": "boolean"
        }    ];

    static getAttributeTypeMap() {
        return InlineObject1.attributeTypeMap;
    }
}

