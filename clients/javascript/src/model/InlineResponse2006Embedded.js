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
import InlineResponse200 from './InlineResponse200';

/**
 * The InlineResponse2006Embedded model module.
 * @module model/InlineResponse2006Embedded
 * @version 5227
 */
class InlineResponse2006Embedded {
    /**
     * Constructs a new <code>InlineResponse2006Embedded</code>.
     * @alias module:model/InlineResponse2006Embedded
     * @param appWanList {Array.<module:model/InlineResponse200>} 
     */
    constructor(appWanList) { 
        
        InlineResponse2006Embedded.initialize(this, appWanList);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj, appWanList) { 
        obj['appWanList'] = appWanList;
    }

    /**
     * Constructs a <code>InlineResponse2006Embedded</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/InlineResponse2006Embedded} obj Optional instance to populate.
     * @return {module:model/InlineResponse2006Embedded} The populated <code>InlineResponse2006Embedded</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new InlineResponse2006Embedded();

            if (data.hasOwnProperty('appWanList')) {
                obj['appWanList'] = ApiClient.convertToType(data['appWanList'], [InlineResponse200]);
            }
        }
        return obj;
    }


}

/**
 * @member {Array.<module:model/InlineResponse200>} appWanList
 */
InlineResponse2006Embedded.prototype['appWanList'] = undefined;






export default InlineResponse2006Embedded;

