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
import { InlineResponse2001Page } from './inlineResponse2001Page';
import { InlineResponse2002EmbeddedLinks } from './inlineResponse2002EmbeddedLinks';
import { InlineResponse2006Embedded } from './inlineResponse2006Embedded';

export class InlineResponse2006 {
    'embedded'?: InlineResponse2006Embedded;
    'links': InlineResponse2002EmbeddedLinks;
    'page': InlineResponse2001Page;

    static discriminator: string | undefined = undefined;

    static attributeTypeMap: Array<{name: string, baseName: string, type: string}> = [
        {
            "name": "embedded",
            "baseName": "_embedded",
            "type": "InlineResponse2006Embedded"
        },
        {
            "name": "links",
            "baseName": "_links",
            "type": "InlineResponse2002EmbeddedLinks"
        },
        {
            "name": "page",
            "baseName": "page",
            "type": "InlineResponse2001Page"
        }    ];

    static getAttributeTypeMap() {
        return InlineResponse2006.attributeTypeMap;
    }
}

