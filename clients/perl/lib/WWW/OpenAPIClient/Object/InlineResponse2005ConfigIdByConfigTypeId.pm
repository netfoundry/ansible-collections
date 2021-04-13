=begin comment

untitled API

No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)

The version of the OpenAPI document: 5227

Generated by: https://openapi-generator.tech

=end comment

=cut

#
# NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
# Do not edit the class manually.
# Ref: https://openapi-generator.tech
#
package WWW::OpenAPIClient::Object::InlineResponse2005ConfigIdByConfigTypeId;

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

The version of the OpenAPI document: 5227

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
                                  class => 'InlineResponse2005ConfigIdByConfigTypeId',
                                  required => [], # TODO
}                                 );

__PACKAGE__->method_documentation({
    'd75e27f0_ebab_4567_8440_c24f02f2eca5' => {
        datatype => 'string',
        base_name => 'd75e27f0-ebab-4567-8440-c24f02f2eca5',
        description => '',
        format => '',
        read_only => '',
            },
    'cf3962b1_a98e_4ade_ae25_cdc388e7feb3' => {
        datatype => 'string',
        base_name => 'cf3962b1-a98e-4ade-ae25-cdc388e7feb3',
        description => '',
        format => '',
        read_only => '',
            },
    '_2c1998a1_32e2_4084_b20a_b580570f4fbf' => {
        datatype => 'string',
        base_name => '2c1998a1-32e2-4084-b20a-b580570f4fbf',
        description => '',
        format => '',
        read_only => '',
            },
    '_4c42c4db_f039_4a57_8264_5f57af512614' => {
        datatype => 'string',
        base_name => '4c42c4db-f039-4a57-8264-5f57af512614',
        description => '',
        format => '',
        read_only => '',
            },
    '_7cafedc5_17b8_4c1e_8b6f_0d9bc1b4b7bc' => {
        datatype => 'string',
        base_name => '7cafedc5-17b8-4c1e-8b6f-0d9bc1b4b7bc',
        description => '',
        format => '',
        read_only => '',
            },
    '_714a918a_7935_4b4f_82c3_afbadcd9e59b' => {
        datatype => 'string',
        base_name => '714a918a-7935-4b4f-82c3-afbadcd9e59b',
        description => '',
        format => '',
        read_only => '',
            },
    'b1582680_ab7b_45d0_ac36_b00f82df8e79' => {
        datatype => 'string',
        base_name => 'b1582680-ab7b-45d0-ac36-b00f82df8e79',
        description => '',
        format => '',
        read_only => '',
            },
    'e7f6ef8d_da57_444c_b677_f03974f5d8be' => {
        datatype => 'string',
        base_name => 'e7f6ef8d-da57-444c-b677-f03974f5d8be',
        description => '',
        format => '',
        read_only => '',
            },
    '_6fa5c2bc_b7f7_47f8_9229_e927722adb27' => {
        datatype => 'string',
        base_name => '6fa5c2bc-b7f7-47f8-9229-e927722adb27',
        description => '',
        format => '',
        read_only => '',
            },
    '_64a39300_b672_413b_9d8c_42175f7e84dd' => {
        datatype => 'string',
        base_name => '64a39300-b672-413b-9d8c-42175f7e84dd',
        description => '',
        format => '',
        read_only => '',
            },
    'ea6e632b_d8e1_420f_bd8f_ad50b067bad6' => {
        datatype => 'string',
        base_name => 'ea6e632b-d8e1-420f-bd8f-ad50b067bad6',
        description => '',
        format => '',
        read_only => '',
            },
    '_7491e52d_97e8_4759_8a63_c8ea8a75f822' => {
        datatype => 'string',
        base_name => '7491e52d-97e8-4759-8a63-c8ea8a75f822',
        description => '',
        format => '',
        read_only => '',
            },
});

__PACKAGE__->openapi_types( {
    'd75e27f0_ebab_4567_8440_c24f02f2eca5' => 'string',
    'cf3962b1_a98e_4ade_ae25_cdc388e7feb3' => 'string',
    '_2c1998a1_32e2_4084_b20a_b580570f4fbf' => 'string',
    '_4c42c4db_f039_4a57_8264_5f57af512614' => 'string',
    '_7cafedc5_17b8_4c1e_8b6f_0d9bc1b4b7bc' => 'string',
    '_714a918a_7935_4b4f_82c3_afbadcd9e59b' => 'string',
    'b1582680_ab7b_45d0_ac36_b00f82df8e79' => 'string',
    'e7f6ef8d_da57_444c_b677_f03974f5d8be' => 'string',
    '_6fa5c2bc_b7f7_47f8_9229_e927722adb27' => 'string',
    '_64a39300_b672_413b_9d8c_42175f7e84dd' => 'string',
    'ea6e632b_d8e1_420f_bd8f_ad50b067bad6' => 'string',
    '_7491e52d_97e8_4759_8a63_c8ea8a75f822' => 'string'
} );

__PACKAGE__->attribute_map( {
    'd75e27f0_ebab_4567_8440_c24f02f2eca5' => 'd75e27f0-ebab-4567-8440-c24f02f2eca5',
    'cf3962b1_a98e_4ade_ae25_cdc388e7feb3' => 'cf3962b1-a98e-4ade-ae25-cdc388e7feb3',
    '_2c1998a1_32e2_4084_b20a_b580570f4fbf' => '2c1998a1-32e2-4084-b20a-b580570f4fbf',
    '_4c42c4db_f039_4a57_8264_5f57af512614' => '4c42c4db-f039-4a57-8264-5f57af512614',
    '_7cafedc5_17b8_4c1e_8b6f_0d9bc1b4b7bc' => '7cafedc5-17b8-4c1e-8b6f-0d9bc1b4b7bc',
    '_714a918a_7935_4b4f_82c3_afbadcd9e59b' => '714a918a-7935-4b4f-82c3-afbadcd9e59b',
    'b1582680_ab7b_45d0_ac36_b00f82df8e79' => 'b1582680-ab7b-45d0-ac36-b00f82df8e79',
    'e7f6ef8d_da57_444c_b677_f03974f5d8be' => 'e7f6ef8d-da57-444c-b677-f03974f5d8be',
    '_6fa5c2bc_b7f7_47f8_9229_e927722adb27' => '6fa5c2bc-b7f7-47f8-9229-e927722adb27',
    '_64a39300_b672_413b_9d8c_42175f7e84dd' => '64a39300-b672-413b-9d8c-42175f7e84dd',
    'ea6e632b_d8e1_420f_bd8f_ad50b067bad6' => 'ea6e632b-d8e1-420f-bd8f-ad50b067bad6',
    '_7491e52d_97e8_4759_8a63_c8ea8a75f822' => '7491e52d-97e8-4759-8a63-c8ea8a75f822'
} );

__PACKAGE__->mk_accessors(keys %{__PACKAGE__->attribute_map});


1;
