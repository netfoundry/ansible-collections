=begin comment

untitled API

No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)

The version of the OpenAPI document: 5229

Generated by: https://openapi-generator.tech

=end comment

=cut

#
# NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
# Do not edit the class manually.
# Ref: https://openapi-generator.tech
#
package WWW::OpenAPIClient::Object::InlineResponse200;

require 5.6.0;
use strict;
use warnings;
use utf8;
use JSON qw(decode_json);
use Data::Dumper;
use Module::Runtime qw(use_module);
use Log::Any qw($log);
use Date::Parse;
use DateTime;

use WWW::OpenAPIClient::Object::AnyType;
use WWW::OpenAPIClient::Object::InlineResponse200Links;

use base ("Class::Accessor", "Class::Data::Inheritable");

#
#
#
# NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech). Do not edit the class manually.
# REF: https://openapi-generator.tech
#

=begin comment

untitled API

No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)

The version of the OpenAPI document: 5229

Generated by: https://openapi-generator.tech

=end comment

=cut

#
# NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
# Do not edit the class manually.
# Ref: https://openapi-generator.tech
#
__PACKAGE__->mk_classdata('attribute_map' => {});
__PACKAGE__->mk_classdata('openapi_types' => {});
__PACKAGE__->mk_classdata('method_documentation' => {}); 
__PACKAGE__->mk_classdata('class_documentation' => {});

# new plain object
sub new { 
    my ($class, %args) = @_; 

    my $self = bless {}, $class;

    $self->init(%args);
    
    return $self;
}

# initialize the object
sub init
{
    my ($self, %args) = @_;

    foreach my $attribute (keys %{$self->attribute_map}) {
        my $args_key = $self->attribute_map->{$attribute};
        $self->$attribute( $args{ $args_key } );
    }
}

# return perl hash
sub to_hash {
    my $self = shift;
    my $_hash = decode_json(JSON->new->convert_blessed->encode($self));

    return $_hash;
}

# used by JSON for serialization
sub TO_JSON { 
    my $self = shift;
    my $_data = {};
    foreach my $_key (keys %{$self->attribute_map}) {
        if (defined $self->{$_key}) {
            $_data->{$self->attribute_map->{$_key}} = $self->{$_key};
        }
    }

    return $_data;
}

# from Perl hashref
sub from_hash {
    my ($self, $hash) = @_;

    # loop through attributes and use openapi_types to deserialize the data
    while ( my ($_key, $_type) = each %{$self->openapi_types} ) {
        my $_json_attribute = $self->attribute_map->{$_key}; 
        if ($_type =~ /^array\[(.+)\]$/i) { # array
            my $_subclass = $1;
            my @_array = ();
            foreach my $_element (@{$hash->{$_json_attribute}}) {
                push @_array, $self->_deserialize($_subclass, $_element);
            }
            $self->{$_key} = \@_array;
        } elsif ($_type =~ /^hash\[string,(.+)\]$/i) { # hash
            my $_subclass = $1;
            my %_hash = ();
            while (my($_key, $_element) = each %{$hash->{$_json_attribute}}) {
                $_hash{$_key} = $self->_deserialize($_subclass, $_element);
            }
            $self->{$_key} = \%_hash;
        } elsif (exists $hash->{$_json_attribute}) { #hash(model), primitive, datetime
            $self->{$_key} = $self->_deserialize($_type, $hash->{$_json_attribute});
        } else {
            $log->debugf("Warning: %s (%s) does not exist in input hash\n", $_key, $_json_attribute);
        }
    }
  
    return $self;
}

# deserialize non-array data
sub _deserialize {
    my ($self, $type, $data) = @_;
    $log->debugf("deserializing %s with %s",Dumper($data), $type);

    if ($type eq 'DateTime') {
        return DateTime->from_epoch(epoch => str2time($data));
    } elsif ( grep( /^$type$/, ('int', 'double', 'string', 'boolean'))) {
        return $data;
    } else { # hash(model)
        my $_instance = eval "WWW::OpenAPIClient::Object::$type->new()";
        return $_instance->from_hash($data);
    }
}



__PACKAGE__->class_documentation({description => '',
                                  class => 'InlineResponse200',
                                  required => [], # TODO
}                                 );

__PACKAGE__->method_documentation({
    'service_attributes' => {
        datatype => 'ARRAY[string]',
        base_name => 'serviceAttributes',
        description => '',
        format => '',
        read_only => '',
            },
    'deleted_at' => {
        datatype => 'AnyType',
        base_name => 'deletedAt',
        description => '',
        format => '',
        read_only => '',
            },
    'network_id' => {
        datatype => 'string',
        base_name => 'networkId',
        description => '',
        format => '',
        read_only => '',
            },
    'name' => {
        datatype => 'string',
        base_name => 'name',
        description => '',
        format => '',
        read_only => '',
            },
    'updated_at' => {
        datatype => 'string',
        base_name => 'updatedAt',
        description => '',
        format => '',
        read_only => '',
            },
    'posture_check_attributes' => {
        datatype => 'ARRAY[AnyType]',
        base_name => 'postureCheckAttributes',
        description => '',
        format => '',
        read_only => '',
            },
    'ziti_id' => {
        datatype => 'string',
        base_name => 'zitiId',
        description => '',
        format => '',
        read_only => '',
            },
    'owner_identity_id' => {
        datatype => 'string',
        base_name => 'ownerIdentityId',
        description => '',
        format => '',
        read_only => '',
            },
    'id' => {
        datatype => 'string',
        base_name => 'id',
        description => '',
        format => '',
        read_only => '',
            },
    'created_at' => {
        datatype => 'string',
        base_name => 'createdAt',
        description => '',
        format => '',
        read_only => '',
            },
    'created_by' => {
        datatype => 'string',
        base_name => 'createdBy',
        description => '',
        format => '',
        read_only => '',
            },
    'deleted_by' => {
        datatype => 'AnyType',
        base_name => 'deletedBy',
        description => '',
        format => '',
        read_only => '',
            },
    'endpoint_attributes' => {
        datatype => 'ARRAY[string]',
        base_name => 'endpointAttributes',
        description => '',
        format => '',
        read_only => '',
            },
    '_links' => {
        datatype => 'InlineResponse200Links',
        base_name => '_links',
        description => '',
        format => '',
        read_only => '',
            },
});

__PACKAGE__->openapi_types( {
    'service_attributes' => 'ARRAY[string]',
    'deleted_at' => 'AnyType',
    'network_id' => 'string',
    'name' => 'string',
    'updated_at' => 'string',
    'posture_check_attributes' => 'ARRAY[AnyType]',
    'ziti_id' => 'string',
    'owner_identity_id' => 'string',
    'id' => 'string',
    'created_at' => 'string',
    'created_by' => 'string',
    'deleted_by' => 'AnyType',
    'endpoint_attributes' => 'ARRAY[string]',
    '_links' => 'InlineResponse200Links'
} );

__PACKAGE__->attribute_map( {
    'service_attributes' => 'serviceAttributes',
    'deleted_at' => 'deletedAt',
    'network_id' => 'networkId',
    'name' => 'name',
    'updated_at' => 'updatedAt',
    'posture_check_attributes' => 'postureCheckAttributes',
    'ziti_id' => 'zitiId',
    'owner_identity_id' => 'ownerIdentityId',
    'id' => 'id',
    'created_at' => 'createdAt',
    'created_by' => 'createdBy',
    'deleted_by' => 'deletedBy',
    'endpoint_attributes' => 'endpointAttributes',
    '_links' => '_links'
} );

__PACKAGE__->mk_accessors(keys %{__PACKAGE__->attribute_map});


1;
