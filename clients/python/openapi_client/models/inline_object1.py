# coding: utf-8

"""
    untitled API

    No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)  # noqa: E501

    The version of the OpenAPI document: 5229
    Generated by: https://openapi-generator.tech
"""


import pprint
import re  # noqa: F401

import six

from openapi_client.configuration import Configuration


class InlineObject1(object):
    """NOTE: This class is auto generated by OpenAPI Generator.
    Ref: https://openapi-generator.tech

    Do not edit the class manually.
    """

    """
    Attributes:
      openapi_types (dict): The key is attribute name
                            and the value is attribute type.
      attribute_map (dict): The key is attribute name
                            and the value is json key in definition.
    """
    openapi_types = {
        'network_id': 'str',
        'name': 'str',
        'model': 'CoreV2ServicesModel',
        'attributes': 'list[str]',
        'model_type': 'str',
        'encryption_required': 'bool'
    }

    attribute_map = {
        'network_id': 'networkId',
        'name': 'name',
        'model': 'model',
        'attributes': 'attributes',
        'model_type': 'modelType',
        'encryption_required': 'encryptionRequired'
    }

    def __init__(self, network_id=None, name=None, model=None, attributes=None, model_type=None, encryption_required=None, local_vars_configuration=None):  # noqa: E501
        """InlineObject1 - a model defined in OpenAPI"""  # noqa: E501
        if local_vars_configuration is None:
            local_vars_configuration = Configuration()
        self.local_vars_configuration = local_vars_configuration

        self._network_id = None
        self._name = None
        self._model = None
        self._attributes = None
        self._model_type = None
        self._encryption_required = None
        self.discriminator = None

        self.network_id = network_id
        self.name = name
        self.model = model
        self.attributes = attributes
        self.model_type = model_type
        self.encryption_required = encryption_required

    @property
    def network_id(self):
        """Gets the network_id of this InlineObject1.  # noqa: E501


        :return: The network_id of this InlineObject1.  # noqa: E501
        :rtype: str
        """
        return self._network_id

    @network_id.setter
    def network_id(self, network_id):
        """Sets the network_id of this InlineObject1.


        :param network_id: The network_id of this InlineObject1.  # noqa: E501
        :type: str
        """
        if self.local_vars_configuration.client_side_validation and network_id is None:  # noqa: E501
            raise ValueError("Invalid value for `network_id`, must not be `None`")  # noqa: E501

        self._network_id = network_id

    @property
    def name(self):
        """Gets the name of this InlineObject1.  # noqa: E501


        :return: The name of this InlineObject1.  # noqa: E501
        :rtype: str
        """
        return self._name

    @name.setter
    def name(self, name):
        """Sets the name of this InlineObject1.


        :param name: The name of this InlineObject1.  # noqa: E501
        :type: str
        """
        if self.local_vars_configuration.client_side_validation and name is None:  # noqa: E501
            raise ValueError("Invalid value for `name`, must not be `None`")  # noqa: E501

        self._name = name

    @property
    def model(self):
        """Gets the model of this InlineObject1.  # noqa: E501


        :return: The model of this InlineObject1.  # noqa: E501
        :rtype: CoreV2ServicesModel
        """
        return self._model

    @model.setter
    def model(self, model):
        """Sets the model of this InlineObject1.


        :param model: The model of this InlineObject1.  # noqa: E501
        :type: CoreV2ServicesModel
        """
        if self.local_vars_configuration.client_side_validation and model is None:  # noqa: E501
            raise ValueError("Invalid value for `model`, must not be `None`")  # noqa: E501

        self._model = model

    @property
    def attributes(self):
        """Gets the attributes of this InlineObject1.  # noqa: E501


        :return: The attributes of this InlineObject1.  # noqa: E501
        :rtype: list[str]
        """
        return self._attributes

    @attributes.setter
    def attributes(self, attributes):
        """Sets the attributes of this InlineObject1.


        :param attributes: The attributes of this InlineObject1.  # noqa: E501
        :type: list[str]
        """
        if self.local_vars_configuration.client_side_validation and attributes is None:  # noqa: E501
            raise ValueError("Invalid value for `attributes`, must not be `None`")  # noqa: E501

        self._attributes = attributes

    @property
    def model_type(self):
        """Gets the model_type of this InlineObject1.  # noqa: E501


        :return: The model_type of this InlineObject1.  # noqa: E501
        :rtype: str
        """
        return self._model_type

    @model_type.setter
    def model_type(self, model_type):
        """Sets the model_type of this InlineObject1.


        :param model_type: The model_type of this InlineObject1.  # noqa: E501
        :type: str
        """
        if self.local_vars_configuration.client_side_validation and model_type is None:  # noqa: E501
            raise ValueError("Invalid value for `model_type`, must not be `None`")  # noqa: E501

        self._model_type = model_type

    @property
    def encryption_required(self):
        """Gets the encryption_required of this InlineObject1.  # noqa: E501


        :return: The encryption_required of this InlineObject1.  # noqa: E501
        :rtype: bool
        """
        return self._encryption_required

    @encryption_required.setter
    def encryption_required(self, encryption_required):
        """Sets the encryption_required of this InlineObject1.


        :param encryption_required: The encryption_required of this InlineObject1.  # noqa: E501
        :type: bool
        """
        if self.local_vars_configuration.client_side_validation and encryption_required is None:  # noqa: E501
            raise ValueError("Invalid value for `encryption_required`, must not be `None`")  # noqa: E501

        self._encryption_required = encryption_required

    def to_dict(self):
        """Returns the model properties as a dict"""
        result = {}

        for attr, _ in six.iteritems(self.openapi_types):
            value = getattr(self, attr)
            if isinstance(value, list):
                result[attr] = list(map(
                    lambda x: x.to_dict() if hasattr(x, "to_dict") else x,
                    value
                ))
            elif hasattr(value, "to_dict"):
                result[attr] = value.to_dict()
            elif isinstance(value, dict):
                result[attr] = dict(map(
                    lambda item: (item[0], item[1].to_dict())
                    if hasattr(item[1], "to_dict") else item,
                    value.items()
                ))
            else:
                result[attr] = value

        return result

    def to_str(self):
        """Returns the string representation of the model"""
        return pprint.pformat(self.to_dict())

    def __repr__(self):
        """For `print` and `pprint`"""
        return self.to_str()

    def __eq__(self, other):
        """Returns true if both objects are equal"""
        if not isinstance(other, InlineObject1):
            return False

        return self.to_dict() == other.to_dict()

    def __ne__(self, other):
        """Returns true if both objects are not equal"""
        if not isinstance(other, InlineObject1):
            return True

        return self.to_dict() != other.to_dict()
