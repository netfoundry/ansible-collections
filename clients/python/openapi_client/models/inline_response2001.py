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


class InlineResponse2001(object):
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
        'embedded': 'InlineResponse2001Embedded',
        'links': 'InlineResponse2001Links',
        'page': 'InlineResponse2001Page'
    }

    attribute_map = {
        'embedded': '_embedded',
        'links': '_links',
        'page': 'page'
    }

    def __init__(self, embedded=None, links=None, page=None, local_vars_configuration=None):  # noqa: E501
        """InlineResponse2001 - a model defined in OpenAPI"""  # noqa: E501
        if local_vars_configuration is None:
            local_vars_configuration = Configuration()
        self.local_vars_configuration = local_vars_configuration

        self._embedded = None
        self._links = None
        self._page = None
        self.discriminator = None

        self.embedded = embedded
        self.links = links
        self.page = page

    @property
    def embedded(self):
        """Gets the embedded of this InlineResponse2001.  # noqa: E501


        :return: The embedded of this InlineResponse2001.  # noqa: E501
        :rtype: InlineResponse2001Embedded
        """
        return self._embedded

    @embedded.setter
    def embedded(self, embedded):
        """Sets the embedded of this InlineResponse2001.


        :param embedded: The embedded of this InlineResponse2001.  # noqa: E501
        :type: InlineResponse2001Embedded
        """
        if self.local_vars_configuration.client_side_validation and embedded is None:  # noqa: E501
            raise ValueError("Invalid value for `embedded`, must not be `None`")  # noqa: E501

        self._embedded = embedded

    @property
    def links(self):
        """Gets the links of this InlineResponse2001.  # noqa: E501


        :return: The links of this InlineResponse2001.  # noqa: E501
        :rtype: InlineResponse2001Links
        """
        return self._links

    @links.setter
    def links(self, links):
        """Sets the links of this InlineResponse2001.


        :param links: The links of this InlineResponse2001.  # noqa: E501
        :type: InlineResponse2001Links
        """
        if self.local_vars_configuration.client_side_validation and links is None:  # noqa: E501
            raise ValueError("Invalid value for `links`, must not be `None`")  # noqa: E501

        self._links = links

    @property
    def page(self):
        """Gets the page of this InlineResponse2001.  # noqa: E501


        :return: The page of this InlineResponse2001.  # noqa: E501
        :rtype: InlineResponse2001Page
        """
        return self._page

    @page.setter
    def page(self, page):
        """Sets the page of this InlineResponse2001.


        :param page: The page of this InlineResponse2001.  # noqa: E501
        :type: InlineResponse2001Page
        """
        if self.local_vars_configuration.client_side_validation and page is None:  # noqa: E501
            raise ValueError("Invalid value for `page`, must not be `None`")  # noqa: E501

        self._page = page

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
        if not isinstance(other, InlineResponse2001):
            return False

        return self.to_dict() == other.to_dict()

    def __ne__(self, other):
        """Returns true if both objects are not equal"""
        if not isinstance(other, InlineResponse2001):
            return True

        return self.to_dict() != other.to_dict()
