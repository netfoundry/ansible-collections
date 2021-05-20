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
import { AnyType } from './anyType';
import { InlineResponse20014IdentityProviders } from './inlineResponse20014IdentityProviders';
import { InlineResponse20014UpdatedAt } from './inlineResponse20014UpdatedAt';

export class InlineResponse20014 {
    'deletedAt': AnyType;
    'name': string;
    'updatedAt': InlineResponse20014UpdatedAt;
    'label': string;
    'id': string;
    'mfaProvider': string;
    'createdAt': InlineResponse20014UpdatedAt;
    'identityProviders': Array<InlineResponse20014IdentityProviders>;
    'deleted': boolean;
    'active': boolean;

    static discriminator: string | undefined = undefined;

    static attributeTypeMap: Array<{name: string, baseName: string, type: string}> = [
        {
            "name": "deletedAt",
            "baseName": "deletedAt",
            "type": "AnyType"
        },
        {
            "name": "name",
            "baseName": "name",
            "type": "string"
        },
        {
            "name": "updatedAt",
            "baseName": "updatedAt",
            "type": "InlineResponse20014UpdatedAt"
        },
        {
            "name": "label",
            "baseName": "label",
            "type": "string"
        },
        {
            "name": "id",
            "baseName": "id",
            "type": "string"
        },
        {
            "name": "mfaProvider",
            "baseName": "mfaProvider",
            "type": "string"
        },
        {
            "name": "createdAt",
            "baseName": "createdAt",
            "type": "InlineResponse20014UpdatedAt"
        },
        {
            "name": "identityProviders",
            "baseName": "identityProviders",
            "type": "Array<InlineResponse20014IdentityProviders>"
        },
        {
            "name": "deleted",
            "baseName": "deleted",
            "type": "boolean"
        },
        {
            "name": "active",
            "baseName": "active",
            "type": "boolean"
        }    ];

    static getAttributeTypeMap() {
        return InlineResponse20014.attributeTypeMap;
    }
}

