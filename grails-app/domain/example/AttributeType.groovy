package example

class AttributeType {

    String name
    String description

    static belongsTo = [attribute: Attribute]

    static constraints = {
    }
}
