# coding: utf-8

"""
    untitled API

    No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)  # noqa: E501

    The version of the OpenAPI document: 5227
    Generated by: https://openapi-generator.tech
"""


import pprint
import re  # noqa: F401

import six

from openapi_client.configuration import Configuration


class InlineResponse2023ModelClientIngress(object):
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
        'addresses': 'list[str]',
        'ports': 'list[InlineResponse2003EmbeddedModelClientIngressPorts]',
        'protocols': 'list[str]'
    }

    attribute_map = {
        'addresses': 'addresses',
        'ports': 'ports',
        'protocols': 'protocols'
    }

    def __init__(self, addresses=None, ports=None, protocols=None, local_vars_configuration=None):  # noqa: E501
        """InlineResponse2023ModelClientIngress - a model defined in OpenAPI"""  # noqa: E501
        if local_vars_configuration is None:
            local_vars_configuration = Configuration()
        self.local_vars_configuration = local_vars_configuration

        self._addresses = None
        self._ports = None
        self._protocols = None
        self.discriminator = None

        self.addresses = addresses
        self.ports = ports
        self.protocols = protocols

    @property
    def addresses(self):
        """Gets the addresses of this InlineResponse2023ModelClientIngress.  # noqa: E501


        :return: The addresses of this InlineResponse2023ModelClientIngress.  # noqa: E501
        :rtype: list[str]
        """
        return self._addresses

    @addresses.setter
    def addresses(self, addresses):
        """Sets the addresses of this InlineResponse2023ModelClientIngress.


        :param addresses: The addresses of this InlineResponse2023ModelClientIngress.  # noqa: E501
        :type: list[str]
        """
        if self.local_vars_configuration.client_side_validation and addresses is None:  # noqa: E501
            raise ValueError("Invalid value for `addresses`, must not be `None`")  # noqa: E501

        self._addresses = addresses

    @property
    def ports(self):
        """Gets the ports of this InlineResponse2023ModelClientIngress.  # noqa: E501


        :return: The ports of this InlineResponse2023ModelClientIngress.  # noqa: E501
        :rtype: list[InlineResponse2003EmbeddedModelClientIngressPorts]
        """
        return self._ports

    @ports.setter
    def ports(self, ports):
        """Sets the ports of this InlineResponse2023ModelClientIngress.


        :param ports: The ports of this InlineResponse2023ModelClientIngress.  # noqa: E501
        :type: list[InlineResponse2003EmbeddedModelClientIngressPorts]
        """
        if self.local_vars_configuration.client_side_validation and ports is None:  # noqa: E501
            raise ValueError("Invalid value for `ports`, must not be `None`")  # noqa: E501

        self._ports = ports

    @property
    def protocols(self):
        """Gets the protocols of this InlineResponse2023ModelClientIngress.  # noqa: E501


        :return: The protocols of this InlineResponse2023ModelClientIngress.  # noqa: E501
        :rtype: list[str]
        """
        return self._protocols

    @protocols.setter
    def protocols(self, protocols):
        """Sets the protocols of this InlineResponse2023ModelClientIngress.


        :param protocols: The protocols of this InlineResponse2023ModelClientIngress.  # noqa: E501
        :type: list[str]
        """
        if self.local_vars_configuration.client_side_validation and protocols is None:  # noqa: E501
            raise ValueError("Invalid value for `protocols`, must not be `None`")  # noqa: E501

        self._protocols = protocols

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
        if not isinstance(other, InlineResponse2023ModelClientIngress):
            return False

        return self.to_dict() == other.to_dict()

    def __ne__(self, other):
        """Returns true if both objects are not equal"""
        if not isinstance(other, InlineResponse2023ModelClientIngress):
            return True

        return self.to_dict() != other.to_dict()
