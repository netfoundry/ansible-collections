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
import AnyType from './AnyType';

/**
 * The CoreV2ServicesModelServerEgress model module.
 * @module model/CoreV2ServicesModelServerEgress
 * @version 5227
 */
class CoreV2ServicesModelServerEgress {
    /**
     * Constructs a new <code>CoreV2ServicesModelServerEgress</code>.
     * @alias module:model/CoreV2ServicesModelServerEgress
     * @param host {String} 
     * @param port {module:model/AnyType} 
     * @param protocol {String} 
     */
    constructor(host, port, protocol) { 
        
        CoreV2ServicesModelServerEgress.initialize(this, host, port, protocol);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj, host, port, protocol) { 
        obj['host'] = host;
        obj['port'] = port;
        obj['protocol'] = protocol;
    }

    /**
     * Constructs a <code>CoreV2ServicesModelServerEgress</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/CoreV2ServicesModelServerEgress} obj Optional instance to populate.
     * @return {module:model/CoreV2ServicesModelServerEgress} The populated <code>CoreV2ServicesModelServerEgress</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new CoreV2ServicesModelServerEgress();

            if (data.hasOwnProperty('host')) {
                obj['host'] = ApiClient.convertToType(data['host'], 'String');
            }
            if (data.hasOwnProperty('port')) {
                obj['port'] = ApiClient.convertToType(data['port'], AnyType);
            }
            if (data.hasOwnProperty('protocol')) {
                obj['protocol'] = ApiClient.convertToType(data['protocol'], 'String');
            }
        }
        return obj;
    }


}

/**
 * @member {String} host
 */
CoreV2ServicesModelServerEgress.prototype['host'] = undefined;

/**
 * @member {module:model/AnyType} port
 */
CoreV2ServicesModelServerEgress.prototype['port'] = undefined;

/**
 * @member {String} protocol
 */
CoreV2ServicesModelServerEgress.prototype['protocol'] = undefined;






export default CoreV2ServicesModelServerEgress;

