<?php
/**
 * InlineResponse20011Links
 *
 * PHP version 5
 *
 * @category Class
 * @package  OpenAPI\Client
 * @author   OpenAPI Generator team
 * @link     https://openapi-generator.tech
 */

/**
 * untitled API
 *
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * The version of the OpenAPI document: 5227
 * 
 * Generated by: https://openapi-generator.tech
 * OpenAPI Generator version: 4.3.1
 */

/**
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

namespace OpenAPI\Client\Model;

use \ArrayAccess;
use \OpenAPI\Client\ObjectSerializer;

/**
 * InlineResponse20011Links Class Doc Comment
 *
 * @category Class
 * @package  OpenAPI\Client
 * @author   OpenAPI Generator team
 * @link     https://openapi-generator.tech
 */
class InlineResponse20011Links implements ModelInterface, ArrayAccess
{
    const DISCRIMINATOR = null;

    /**
      * The original name of the model.
      *
      * @var string
      */
    protected static $openAPIModelName = 'inline_response_200_11__links';

    /**
      * Array of property to type mappings. Used for (de)serialization
      *
      * @var string[]
      */
    protected static $openAPITypes = [
        'azure_subscription' => '\OpenAPI\Client\Model\InlineResponse200LinksSelf',
        'networks' => '\OpenAPI\Client\Model\InlineResponse200LinksSelf',
        'self' => '\OpenAPI\Client\Model\InlineResponse200LinksSelf'
    ];

    /**
      * Array of property to format mappings. Used for (de)serialization
      *
      * @var string[]
      */
    protected static $openAPIFormats = [
        'azure_subscription' => null,
        'networks' => null,
        'self' => null
    ];

    /**
     * Array of property to type mappings. Used for (de)serialization
     *
     * @return array
     */
    public static function openAPITypes()
    {
        return self::$openAPITypes;
    }

    /**
     * Array of property to format mappings. Used for (de)serialization
     *
     * @return array
     */
    public static function openAPIFormats()
    {
        return self::$openAPIFormats;
    }

    /**
     * Array of attributes where the key is the local name,
     * and the value is the original name
     *
     * @var string[]
     */
    protected static $attributeMap = [
        'azure_subscription' => 'azureSubscription',
        'networks' => 'networks',
        'self' => 'self'
    ];

    /**
     * Array of attributes to setter functions (for deserialization of responses)
     *
     * @var string[]
     */
    protected static $setters = [
        'azure_subscription' => 'setAzureSubscription',
        'networks' => 'setNetworks',
        'self' => 'setSelf'
    ];

    /**
     * Array of attributes to getter functions (for serialization of requests)
     *
     * @var string[]
     */
    protected static $getters = [
        'azure_subscription' => 'getAzureSubscription',
        'networks' => 'getNetworks',
        'self' => 'getSelf'
    ];

    /**
     * Array of attributes where the key is the local name,
     * and the value is the original name
     *
     * @return array
     */
    public static function attributeMap()
    {
        return self::$attributeMap;
    }

    /**
     * Array of attributes to setter functions (for deserialization of responses)
     *
     * @return array
     */
    public static function setters()
    {
        return self::$setters;
    }

    /**
     * Array of attributes to getter functions (for serialization of requests)
     *
     * @return array
     */
    public static function getters()
    {
        return self::$getters;
    }

    /**
     * The original name of the model.
     *
     * @return string
     */
    public function getModelName()
    {
        return self::$openAPIModelName;
    }

    

    

    /**
     * Associative array for storing property values
     *
     * @var mixed[]
     */
    protected $container = [];

    /**
     * Constructor
     *
     * @param mixed[] $data Associated array of property values
     *                      initializing the model
     */
    public function __construct(array $data = null)
    {
        $this->container['azure_subscription'] = isset($data['azure_subscription']) ? $data['azure_subscription'] : null;
        $this->container['networks'] = isset($data['networks']) ? $data['networks'] : null;
        $this->container['self'] = isset($data['self']) ? $data['self'] : null;
    }

    /**
     * Show all the invalid properties with reasons.
     *
     * @return array invalid properties with reasons
     */
    public function listInvalidProperties()
    {
        $invalidProperties = [];

        if ($this->container['azure_subscription'] === null) {
            $invalidProperties[] = "'azure_subscription' can't be null";
        }
        if ($this->container['networks'] === null) {
            $invalidProperties[] = "'networks' can't be null";
        }
        if ($this->container['self'] === null) {
            $invalidProperties[] = "'self' can't be null";
        }
        return $invalidProperties;
    }

    /**
     * Validate all the properties in the model
     * return true if all passed
     *
     * @return bool True if all properties are valid
     */
    public function valid()
    {
        return count($this->listInvalidProperties()) === 0;
    }


    /**
     * Gets azure_subscription
     *
     * @return \OpenAPI\Client\Model\InlineResponse200LinksSelf
     */
    public function getAzureSubscription()
    {
        return $this->container['azure_subscription'];
    }

    /**
     * Sets azure_subscription
     *
     * @param \OpenAPI\Client\Model\InlineResponse200LinksSelf $azure_subscription azure_subscription
     *
     * @return $this
     */
    public function setAzureSubscription($azure_subscription)
    {
        $this->container['azure_subscription'] = $azure_subscription;

        return $this;
    }

    /**
     * Gets networks
     *
     * @return \OpenAPI\Client\Model\InlineResponse200LinksSelf
     */
    public function getNetworks()
    {
        return $this->container['networks'];
    }

    /**
     * Sets networks
     *
     * @param \OpenAPI\Client\Model\InlineResponse200LinksSelf $networks networks
     *
     * @return $this
     */
    public function setNetworks($networks)
    {
        $this->container['networks'] = $networks;

        return $this;
    }

    /**
     * Gets self
     *
     * @return \OpenAPI\Client\Model\InlineResponse200LinksSelf
     */
    public function getSelf()
    {
        return $this->container['self'];
    }

    /**
     * Sets self
     *
     * @param \OpenAPI\Client\Model\InlineResponse200LinksSelf $self self
     *
     * @return $this
     */
    public function setSelf($self)
    {
        $this->container['self'] = $self;

        return $this;
    }
    /**
     * Returns true if offset exists. False otherwise.
     *
     * @param integer $offset Offset
     *
     * @return boolean
     */
    public function offsetExists($offset)
    {
        return isset($this->container[$offset]);
    }

    /**
     * Gets offset.
     *
     * @param integer $offset Offset
     *
     * @return mixed
     */
    public function offsetGet($offset)
    {
        return isset($this->container[$offset]) ? $this->container[$offset] : null;
    }

    /**
     * Sets value based on offset.
     *
     * @param integer $offset Offset
     * @param mixed   $value  Value to be set
     *
     * @return void
     */
    public function offsetSet($offset, $value)
    {
        if (is_null($offset)) {
            $this->container[] = $value;
        } else {
            $this->container[$offset] = $value;
        }
    }

    /**
     * Unsets offset.
     *
     * @param integer $offset Offset
     *
     * @return void
     */
    public function offsetUnset($offset)
    {
        unset($this->container[$offset]);
    }

    /**
     * Gets the string presentation of the object
     *
     * @return string
     */
    public function __toString()
    {
        return json_encode(
            ObjectSerializer::sanitizeForSerialization($this),
            JSON_PRETTY_PRINT
        );
    }

    /**
     * Gets a header-safe presentation of the object
     *
     * @return string
     */
    public function toHeaderValue()
    {
        return json_encode(ObjectSerializer::sanitizeForSerialization($this));
    }
}


