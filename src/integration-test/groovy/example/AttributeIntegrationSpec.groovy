package example

import grails.testing.mixin.integration.Integration
import grails.transaction.Rollback

import spock.lang.Specification

@Rollback
@Integration
class AttributeIntegrationSpec extends Specification{

    void "validate transient attribute"() {
        given:
        Attribute attribute1 = new Attribute(name: 'attr 1')
        AttributeType attributeType1 = new AttributeType()

        assert !attributeType1.validate()

        when: "assign an invalid attribute type"
        attribute1.type = attributeType1

        then: "validation will be fail"
        assert !attribute1.validate()
    }
}
