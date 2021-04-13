<?php
/**
 * InlineResponse20012
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
 * InlineResponse20012 Class Doc Comment
 *
 * @category Class
 * @package  OpenAPI\Client
 * @author   OpenAPI Generator team
 * @link     https://openapi-generator.tech
 */
class InlineResponse20012 implements ModelInterface, ArrayAccess
{
    const DISCRIMINATOR = null;

    /**
      * The original name of the model.
      *
      * @var string
      */
    protected static $openAPIModelName = 'inline_response_200_12';

    /**
      * Array of property to type mappings. Used for (de)serialization
      *
      * @var string[]
      */
    protected static $openAPITypes = [
        'deleted_at' => 'AnyType',
        'network_id' => 'string',
        'name' => 'string',
        'updated_at' => 'string',
        'provider' => 'AnyType',
        'online' => 'bool',
        'ziti_id' => 'string',
        'user_data' => 'AnyType',
        'owner_identity_id' => 'string',
        'attributes' => 'string[]',
        'provider_id' => 'AnyType',
        'jwt' => 'AnyType',
        'id' => 'string',
        'ip_address' => 'AnyType',
        'status' => 'string',
        'host_id' => 'AnyType',
        'created_at' => 'string',
        'created_by' => 'string',
        'deleted_by' => 'AnyType',
        'location_metadata_id' => 'AnyType',
        'link_listener' => 'bool',
        'data_center_id' => 'AnyType',
        'verified' => 'bool',
        '_links' => '\OpenAPI\Client\Model\InlineResponse200Links'
    ];

    /**
      * Array of property to format mappings. Used for (de)serialization
      *
      * @var string[]
      */
    protected static $openAPIFormats = [
        'deleted_at' => null,
        'network_id' => null,
        'name' => null,
        'updated_at' => null,
        'provider' => null,
        'online' => null,
        'ziti_id' => null,
        'user_data' => null,
        'owner_identity_id' => null,
        'attributes' => null,
        'provider_id' => null,
        'jwt' => null,
        'id' => null,
        'ip_address' => null,
        'status' => null,
        'host_id' => null,
        'created_at' => null,
        'created_by' => null,
        'deleted_by' => null,
        'location_metadata_id' => null,
        'link_listener' => null,
        'data_center_id' => null,
        'verified' => null,
        '_links' => null
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
        'deleted_at' => 'deletedAt',
        'network_id' => 'networkId',
        'name' => 'name',
        'updated_at' => 'updatedAt',
        'provider' => 'provider',
        'online' => 'online',
        'ziti_id' => 'zitiId',
        'user_data' => 'userData',
        'owner_identity_id' => 'ownerIdentityId',
        'attributes' => 'attributes',
        'provider_id' => 'providerId',
        'jwt' => 'jwt',
        'id' => 'id',
        'ip_address' => 'ipAddress',
        'status' => 'status',
        'host_id' => 'hostId',
        'created_at' => 'createdAt',
        'created_by' => 'createdBy',
        'deleted_by' => 'deletedBy',
        'location_metadata_id' => 'locationMetadataId',
        'link_listener' => 'linkListener',
        'data_center_id' => 'dataCenterId',
        'verified' => 'verified',
        '_links' => '_links'
    ];

    /**
     * Array of attributes to setter functions (for deserialization of responses)
     *
     * @var string[]
     */
    protected static $setters = [
        'deleted_at' => 'setDeletedAt',
        'network_id' => 'setNetworkId',
        'name' => 'setName',
        'updated_at' => 'setUpdatedAt',
        'provider' => 'setProvider',
        'online' => 'setOnline',
        'ziti_id' => 'setZitiId',
        'user_data' => 'setUserData',
        'owner_identity_id' => 'setOwnerIdentityId',
        'attributes' => 'setAttributes',
        'provider_id' => 'setProviderId',
        'jwt' => 'setJwt',
        'id' => 'setId',
        'ip_address' => 'setIpAddress',
        'status' => 'setStatus',
        'host_id' => 'setHostId',
        'created_at' => 'setCreatedAt',
        'created_by' => 'setCreatedBy',
        'deleted_by' => 'setDeletedBy',
        'location_metadata_id' => 'setLocationMetadataId',
        'link_listener' => 'setLinkListener',
        'data_center_id' => 'setDataCenterId',
        'verified' => 'setVerified',
        '_links' => 'setLinks'
    ];

    /**
     * Array of attributes to getter functions (for serialization of requests)
     *
     * @var string[]
     */
    protected static $getters = [
        'deleted_at' => 'getDeletedAt',
        'network_id' => 'getNetworkId',
        'name' => 'getName',
        'updated_at' => 'getUpdatedAt',
        'provider' => 'getProvider',
        'online' => 'getOnline',
        'ziti_id' => 'getZitiId',
        'user_data' => 'getUserData',
        'owner_identity_id' => 'getOwnerIdentityId',
        'attributes' => 'getAttributes',
        'provider_id' => 'getProviderId',
        'jwt' => 'getJwt',
        'id' => 'getId',
        'ip_address' => 'getIpAddress',
        'status' => 'getStatus',
        'host_id' => 'getHostId',
        'created_at' => 'getCreatedAt',
        'created_by' => 'getCreatedBy',
        'deleted_by' => 'getDeletedBy',
        'location_metadata_id' => 'getLocationMetadataId',
        'link_listener' => 'getLinkListener',
        'data_center_id' => 'getDataCenterId',
        'verified' => 'getVerified',
        '_links' => 'getLinks'
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
        $this->container['deleted_at'] = isset($data['deleted_at']) ? $data['deleted_at'] : null;
        $this->container['network_id'] = isset($data['network_id']) ? $data['network_id'] : null;
        $this->container['name'] = isset($data['name']) ? $data['name'] : null;
        $this->container['updated_at'] = isset($data['updated_at']) ? $data['updated_at'] : null;
        $this->container['provider'] = isset($data['provider']) ? $data['provider'] : null;
        $this->container['online'] = isset($data['online']) ? $data['online'] : null;
        $this->container['ziti_id'] = isset($data['ziti_id']) ? $data['ziti_id'] : null;
        $this->container['user_data'] = isset($data['user_data']) ? $data['user_data'] : null;
        $this->container['owner_identity_id'] = isset($data['owner_identity_id']) ? $data['owner_identity_id'] : null;
        $this->container['attributes'] = isset($data['attributes']) ? $data['attributes'] : null;
        $this->container['provider_id'] = isset($data['provider_id']) ? $data['provider_id'] : null;
        $this->container['jwt'] = isset($data['jwt']) ? $data['jwt'] : null;
        $this->container['id'] = isset($data['id']) ? $data['id'] : null;
        $this->container['ip_address'] = isset($data['ip_address']) ? $data['ip_address'] : null;
        $this->container['status'] = isset($data['status']) ? $data['status'] : null;
        $this->container['host_id'] = isset($data['host_id']) ? $data['host_id'] : null;
        $this->container['created_at'] = isset($data['created_at']) ? $data['created_at'] : null;
        $this->container['created_by'] = isset($data['created_by']) ? $data['created_by'] : null;
        $this->container['deleted_by'] = isset($data['deleted_by']) ? $data['deleted_by'] : null;
        $this->container['location_metadata_id'] = isset($data['location_metadata_id']) ? $data['location_metadata_id'] : null;
        $this->container['link_listener'] = isset($data['link_listener']) ? $data['link_listener'] : null;
        $this->container['data_center_id'] = isset($data['data_center_id']) ? $data['data_center_id'] : null;
        $this->container['verified'] = isset($data['verified']) ? $data['verified'] : null;
        $this->container['_links'] = isset($data['_links']) ? $data['_links'] : null;
    }

    /**
     * Show all the invalid properties with reasons.
     *
     * @return array invalid properties with reasons
     */
    public function listInvalidProperties()
    {
        $invalidProperties = [];

        if ($this->container['deleted_at'] === null) {
            $invalidProperties[] = "'deleted_at' can't be null";
        }
        if ($this->container['network_id'] === null) {
            $invalidProperties[] = "'network_id' can't be null";
        }
        if ($this->container['name'] === null) {
            $invalidProperties[] = "'name' can't be null";
        }
        if ($this->container['updated_at'] === null) {
            $invalidProperties[] = "'updated_at' can't be null";
        }
        if ($this->container['provider'] === null) {
            $invalidProperties[] = "'provider' can't be null";
        }
        if ($this->container['online'] === null) {
            $invalidProperties[] = "'online' can't be null";
        }
        if ($this->container['ziti_id'] === null) {
            $invalidProperties[] = "'ziti_id' can't be null";
        }
        if ($this->container['user_data'] === null) {
            $invalidProperties[] = "'user_data' can't be null";
        }
        if ($this->container['owner_identity_id'] === null) {
            $invalidProperties[] = "'owner_identity_id' can't be null";
        }
        if ($this->container['attributes'] === null) {
            $invalidProperties[] = "'attributes' can't be null";
        }
        if ($this->container['provider_id'] === null) {
            $invalidProperties[] = "'provider_id' can't be null";
        }
        if ($this->container['jwt'] === null) {
            $invalidProperties[] = "'jwt' can't be null";
        }
        if ($this->container['id'] === null) {
            $invalidProperties[] = "'id' can't be null";
        }
        if ($this->container['ip_address'] === null) {
            $invalidProperties[] = "'ip_address' can't be null";
        }
        if ($this->container['status'] === null) {
            $invalidProperties[] = "'status' can't be null";
        }
        if ($this->container['host_id'] === null) {
            $invalidProperties[] = "'host_id' can't be null";
        }
        if ($this->container['created_at'] === null) {
            $invalidProperties[] = "'created_at' can't be null";
        }
        if ($this->container['created_by'] === null) {
            $invalidProperties[] = "'created_by' can't be null";
        }
        if ($this->container['deleted_by'] === null) {
            $invalidProperties[] = "'deleted_by' can't be null";
        }
        if ($this->container['location_metadata_id'] === null) {
            $invalidProperties[] = "'location_metadata_id' can't be null";
        }
        if ($this->container['link_listener'] === null) {
            $invalidProperties[] = "'link_listener' can't be null";
        }
        if ($this->container['data_center_id'] === null) {
            $invalidProperties[] = "'data_center_id' can't be null";
        }
        if ($this->container['verified'] === null) {
            $invalidProperties[] = "'verified' can't be null";
        }
        if ($this->container['_links'] === null) {
            $invalidProperties[] = "'_links' can't be null";
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
     * Gets deleted_at
     *
     * @return AnyType
     */
    public function getDeletedAt()
    {
        return $this->container['deleted_at'];
    }

    /**
     * Sets deleted_at
     *
     * @param AnyType $deleted_at deleted_at
     *
     * @return $this
     */
    public function setDeletedAt($deleted_at)
    {
        $this->container['deleted_at'] = $deleted_at;

        return $this;
    }

    /**
     * Gets network_id
     *
     * @return string
     */
    public function getNetworkId()
    {
        return $this->container['network_id'];
    }

    /**
     * Sets network_id
     *
     * @param string $network_id network_id
     *
     * @return $this
     */
    public function setNetworkId($network_id)
    {
        $this->container['network_id'] = $network_id;

        return $this;
    }

    /**
     * Gets name
     *
     * @return string
     */
    public function getName()
    {
        return $this->container['name'];
    }

    /**
     * Sets name
     *
     * @param string $name name
     *
     * @return $this
     */
    public function setName($name)
    {
        $this->container['name'] = $name;

        return $this;
    }

    /**
     * Gets updated_at
     *
     * @return string
     */
    public function getUpdatedAt()
    {
        return $this->container['updated_at'];
    }

    /**
     * Sets updated_at
     *
     * @param string $updated_at updated_at
     *
     * @return $this
     */
    public function setUpdatedAt($updated_at)
    {
        $this->container['updated_at'] = $updated_at;

        return $this;
    }

    /**
     * Gets provider
     *
     * @return AnyType
     */
    public function getProvider()
    {
        return $this->container['provider'];
    }

    /**
     * Sets provider
     *
     * @param AnyType $provider provider
     *
     * @return $this
     */
    public function setProvider($provider)
    {
        $this->container['provider'] = $provider;

        return $this;
    }

    /**
     * Gets online
     *
     * @return bool
     */
    public function getOnline()
    {
        return $this->container['online'];
    }

    /**
     * Sets online
     *
     * @param bool $online online
     *
     * @return $this
     */
    public function setOnline($online)
    {
        $this->container['online'] = $online;

        return $this;
    }

    /**
     * Gets ziti_id
     *
     * @return string
     */
    public function getZitiId()
    {
        return $this->container['ziti_id'];
    }

    /**
     * Sets ziti_id
     *
     * @param string $ziti_id ziti_id
     *
     * @return $this
     */
    public function setZitiId($ziti_id)
    {
        $this->container['ziti_id'] = $ziti_id;

        return $this;
    }

    /**
     * Gets user_data
     *
     * @return AnyType
     */
    public function getUserData()
    {
        return $this->container['user_data'];
    }

    /**
     * Sets user_data
     *
     * @param AnyType $user_data user_data
     *
     * @return $this
     */
    public function setUserData($user_data)
    {
        $this->container['user_data'] = $user_data;

        return $this;
    }

    /**
     * Gets owner_identity_id
     *
     * @return string
     */
    public function getOwnerIdentityId()
    {
        return $this->container['owner_identity_id'];
    }

    /**
     * Sets owner_identity_id
     *
     * @param string $owner_identity_id owner_identity_id
     *
     * @return $this
     */
    public function setOwnerIdentityId($owner_identity_id)
    {
        $this->container['owner_identity_id'] = $owner_identity_id;

        return $this;
    }

    /**
     * Gets attributes
     *
     * @return string[]
     */
    public function getAttributes()
    {
        return $this->container['attributes'];
    }

    /**
     * Sets attributes
     *
     * @param string[] $attributes attributes
     *
     * @return $this
     */
    public function setAttributes($attributes)
    {
        $this->container['attributes'] = $attributes;

        return $this;
    }

    /**
     * Gets provider_id
     *
     * @return AnyType
     */
    public function getProviderId()
    {
        return $this->container['provider_id'];
    }

    /**
     * Sets provider_id
     *
     * @param AnyType $provider_id provider_id
     *
     * @return $this
     */
    public function setProviderId($provider_id)
    {
        $this->container['provider_id'] = $provider_id;

        return $this;
    }

    /**
     * Gets jwt
     *
     * @return AnyType
     */
    public function getJwt()
    {
        return $this->container['jwt'];
    }

    /**
     * Sets jwt
     *
     * @param AnyType $jwt jwt
     *
     * @return $this
     */
    public function setJwt($jwt)
    {
        $this->container['jwt'] = $jwt;

        return $this;
    }

    /**
     * Gets id
     *
     * @return string
     */
    public function getId()
    {
        return $this->container['id'];
    }

    /**
     * Sets id
     *
     * @param string $id id
     *
     * @return $this
     */
    public function setId($id)
    {
        $this->container['id'] = $id;

        return $this;
    }

    /**
     * Gets ip_address
     *
     * @return AnyType
     */
    public function getIpAddress()
    {
        return $this->container['ip_address'];
    }

    /**
     * Sets ip_address
     *
     * @param AnyType $ip_address ip_address
     *
     * @return $this
     */
    public function setIpAddress($ip_address)
    {
        $this->container['ip_address'] = $ip_address;

        return $this;
    }

    /**
     * Gets status
     *
     * @return string
     */
    public function getStatus()
    {
        return $this->container['status'];
    }

    /**
     * Sets status
     *
     * @param string $status status
     *
     * @return $this
     */
    public function setStatus($status)
    {
        $this->container['status'] = $status;

        return $this;
    }

    /**
     * Gets host_id
     *
     * @return AnyType
     */
    public function getHostId()
    {
        return $this->container['host_id'];
    }

    /**
     * Sets host_id
     *
     * @param AnyType $host_id host_id
     *
     * @return $this
     */
    public function setHostId($host_id)
    {
        $this->container['host_id'] = $host_id;

        return $this;
    }

    /**
     * Gets created_at
     *
     * @return string
     */
    public function getCreatedAt()
    {
        return $this->container['created_at'];
    }

    /**
     * Sets created_at
     *
     * @param string $created_at created_at
     *
     * @return $this
     */
    public function setCreatedAt($created_at)
    {
        $this->container['created_at'] = $created_at;

        return $this;
    }

    /**
     * Gets created_by
     *
     * @return string
     */
    public function getCreatedBy()
    {
        return $this->container['created_by'];
    }

    /**
     * Sets created_by
     *
     * @param string $created_by created_by
     *
     * @return $this
     */
    public function setCreatedBy($created_by)
    {
        $this->container['created_by'] = $created_by;

        return $this;
    }

    /**
     * Gets deleted_by
     *
     * @return AnyType
     */
    public function getDeletedBy()
    {
        return $this->container['deleted_by'];
    }

    /**
     * Sets deleted_by
     *
     * @param AnyType $deleted_by deleted_by
     *
     * @return $this
     */
    public function setDeletedBy($deleted_by)
    {
        $this->container['deleted_by'] = $deleted_by;

        return $this;
    }

    /**
     * Gets location_metadata_id
     *
     * @return AnyType
     */
    public function getLocationMetadataId()
    {
        return $this->container['location_metadata_id'];
    }

    /**
     * Sets location_metadata_id
     *
     * @param AnyType $location_metadata_id location_metadata_id
     *
     * @return $this
     */
    public function setLocationMetadataId($location_metadata_id)
    {
        $this->container['location_metadata_id'] = $location_metadata_id;

        return $this;
    }

    /**
     * Gets link_listener
     *
     * @return bool
     */
    public function getLinkListener()
    {
        return $this->container['link_listener'];
    }

    /**
     * Sets link_listener
     *
     * @param bool $link_listener link_listener
     *
     * @return $this
     */
    public function setLinkListener($link_listener)
    {
        $this->container['link_listener'] = $link_listener;

        return $this;
    }

    /**
     * Gets data_center_id
     *
     * @return AnyType
     */
    public function getDataCenterId()
    {
        return $this->container['data_center_id'];
    }

    /**
     * Sets data_center_id
     *
     * @param AnyType $data_center_id data_center_id
     *
     * @return $this
     */
    public function setDataCenterId($data_center_id)
    {
        $this->container['data_center_id'] = $data_center_id;

        return $this;
    }

    /**
     * Gets verified
     *
     * @return bool
     */
    public function getVerified()
    {
        return $this->container['verified'];
    }

    /**
     * Sets verified
     *
     * @param bool $verified verified
     *
     * @return $this
     */
    public function setVerified($verified)
    {
        $this->container['verified'] = $verified;

        return $this;
    }

    /**
     * Gets _links
     *
     * @return \OpenAPI\Client\Model\InlineResponse200Links
     */
    public function getLinks()
    {
        return $this->container['_links'];
    }

    /**
     * Sets _links
     *
     * @param \OpenAPI\Client\Model\InlineResponse200Links $_links _links
     *
     * @return $this
     */
    public function setLinks($_links)
    {
        $this->container['_links'] = $_links;

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


