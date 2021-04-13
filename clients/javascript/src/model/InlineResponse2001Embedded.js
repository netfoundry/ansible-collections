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
 *
 */

import ApiClient from '../ApiClient';
import InlineResponse2001EmbeddedNetworkList from './InlineResponse2001EmbeddedNetworkList';

/**
 * The InlineResponse2001Embedded model module.
 * @module model/InlineResponse2001Embedded
 * @version 5227
 */
class InlineResponse2001Embedded {
    /**
     * Constructs a new <code>InlineResponse2001Embedded</code>.
     * @alias module:model/InlineResponse2001Embedded
     * @param networkList {Array.<module:model/InlineResponse2001EmbeddedNetworkList>} 
     */
    constructor(networkList) { 
        
        InlineResponse2001Embedded.initialize(this, networkList);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj, networkList) { 
        obj['networkList'] = networkList;
    }

    /**
     * Constructs a <code>InlineResponse2001Embedded</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/InlineResponse2001Embedded} obj Optional instance to populate.
     * @return {module:model/InlineResponse2001Embedded} The populated <code>InlineResponse2001Embedded</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new InlineResponse2001Embedded();

            if (data.hasOwnProperty('networkList')) {
                obj['networkList'] = ApiClient.convertToType(data['networkList'], [InlineResponse2001EmbeddedNetworkList]);
            }
        }
        return obj;
    }


}

/**
 * @member {Array.<module:model/InlineResponse2001EmbeddedNetworkList>} networkList
 */
InlineResponse2001Embedded.prototype['networkList'] = undefined;






export default InlineResponse2001Embedded;

