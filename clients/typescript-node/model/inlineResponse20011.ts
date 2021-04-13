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
import { AnyType } from './anyType';
import { InlineResponse20011Links } from './inlineResponse20011Links';

export class InlineResponse20011 {
    'organizationShortName': string;
    'name': string;
    'updatedAt': string;
    'zitiEnabled': boolean;
    'defaultAzureVirtualWanId': AnyType;
    'ownerIdentityId': AnyType;
    'billingAccountId': AnyType;
    'id': string;
    'awsAutoScalingGatewayEnabled': boolean;
    'createdAt': string;
    'mfaRequired': boolean;
    'deleted': boolean;
    'links': InlineResponse20011Links;

    static discriminator: string | undefined = undefined;

    static attributeTypeMap: Array<{name: string, baseName: string, type: string}> = [
        {
            "name": "organizationShortName",
            "baseName": "organizationShortName",
            "type": "string"
        },
        {
            "name": "name",
            "baseName": "name",
            "type": "string"
        },
        {
            "name": "updatedAt",
            "baseName": "updatedAt",
            "type": "string"
        },
        {
            "name": "zitiEnabled",
            "baseName": "zitiEnabled",
            "type": "boolean"
        },
        {
            "name": "defaultAzureVirtualWanId",
            "baseName": "defaultAzureVirtualWanId",
            "type": "AnyType"
        },
        {
            "name": "ownerIdentityId",
            "baseName": "ownerIdentityId",
            "type": "AnyType"
        },
        {
            "name": "billingAccountId",
            "baseName": "billingAccountId",
            "type": "AnyType"
        },
        {
            "name": "id",
            "baseName": "id",
            "type": "string"
        },
        {
            "name": "awsAutoScalingGatewayEnabled",
            "baseName": "awsAutoScalingGatewayEnabled",
            "type": "boolean"
        },
        {
            "name": "createdAt",
            "baseName": "createdAt",
            "type": "string"
        },
        {
            "name": "mfaRequired",
            "baseName": "mfaRequired",
            "type": "boolean"
        },
        {
            "name": "deleted",
            "baseName": "deleted",
            "type": "boolean"
        },
        {
            "name": "links",
            "baseName": "_links",
            "type": "InlineResponse20011Links"
        }    ];

    static getAttributeTypeMap() {
        return InlineResponse20011.attributeTypeMap;
    }
}

