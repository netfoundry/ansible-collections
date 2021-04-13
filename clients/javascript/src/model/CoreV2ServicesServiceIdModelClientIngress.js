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
import CoreV2ServicesModelClientIngressPorts from './CoreV2ServicesModelClientIngressPorts';

/**
 * The CoreV2ServicesServiceIdModelClientIngress model module.
 * @module model/CoreV2ServicesServiceIdModelClientIngress
 * @version 5227
 */
class CoreV2ServicesServiceIdModelClientIngress {
    /**
     * Constructs a new <code>CoreV2ServicesServiceIdModelClientIngress</code>.
     * @alias module:model/CoreV2ServicesServiceIdModelClientIngress
     * @param addresses {Array.<String>} 
     * @param ports {Array.<module:model/CoreV2ServicesModelClientIngressPorts>} 
     * @param protocols {Array.<String>} 
     */
    constructor(addresses, ports, protocols) { 
        
        CoreV2ServicesServiceIdModelClientIngress.initialize(this, addresses, ports, protocols);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj, addresses, ports, protocols) { 
        obj['addresses'] = addresses;
        obj['ports'] = ports;
        obj['protocols'] = protocols;
    }

    /**
     * Constructs a <code>CoreV2ServicesServiceIdModelClientIngress</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/CoreV2ServicesServiceIdModelClientIngress} obj Optional instance to populate.
     * @return {module:model/CoreV2ServicesServiceIdModelClientIngress} The populated <code>CoreV2ServicesServiceIdModelClientIngress</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new CoreV2ServicesServiceIdModelClientIngress();

            if (data.hasOwnProperty('addresses')) {
                obj['addresses'] = ApiClient.convertToType(data['addresses'], ['String']);
            }
            if (data.hasOwnProperty('ports')) {
                obj['ports'] = ApiClient.convertToType(data['ports'], [CoreV2ServicesModelClientIngressPorts]);
            }
            if (data.hasOwnProperty('protocols')) {
                obj['protocols'] = ApiClient.convertToType(data['protocols'], ['String']);
            }
        }
        return obj;
    }


}

/**
 * @member {Array.<String>} addresses
 */
CoreV2ServicesServiceIdModelClientIngress.prototype['addresses'] = undefined;

/**
 * @member {Array.<module:model/CoreV2ServicesModelClientIngressPorts>} ports
 */
CoreV2ServicesServiceIdModelClientIngress.prototype['ports'] = undefined;

/**
 * @member {Array.<String>} protocols
 */
CoreV2ServicesServiceIdModelClientIngress.prototype['protocols'] = undefined;






export default CoreV2ServicesServiceIdModelClientIngress;

