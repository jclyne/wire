// Code generated by Wire protocol buffer compiler, do not edit.
// Source: squareup.protos.kotlin.oneof.OneOfMessage in one_of.proto
import Wire

/**
 * It's a one of message.
 */
public struct OneOfMessage {

    /**
     * Must have a foo or a bar or a baz.
     */
    public var choice: Choice?
    public var unknownFields: UnknownFields = .init()

    public init(configure: (inout Self) -> Swift.Void = { _ in }) {
        configure(&self)
    }

}

#if !WIRE_REMOVE_EQUATABLE
extension OneOfMessage : Equatable {
}
#endif

#if !WIRE_REMOVE_HASHABLE
extension OneOfMessage : Hashable {
}
#endif

extension OneOfMessage : Sendable {
}

extension OneOfMessage : ProtoDefaultedValue {

    public static var defaultedValue: OneOfMessage {
        OneOfMessage()
    }
}

extension OneOfMessage : ProtoMessage {

    public static func protoMessageTypeURL() -> String {
        return "type.googleapis.com/squareup.protos.kotlin.oneof.OneOfMessage"
    }

}

extension OneOfMessage : Proto2Codable {

    public init(from protoReader: ProtoReader) throws {
        var choice: Choice? = nil

        let token = try protoReader.beginMessage()
        while let tag = try protoReader.nextTag(token: token) {
            switch tag {
            case 1: choice = .foo(try protoReader.decode(Int32.self))
            case 3: choice = .bar(try protoReader.decode(String.self))
            case 4: choice = .baz(try protoReader.decode(String.self))
            default: try protoReader.readUnknownField(tag: tag)
            }
        }
        self.unknownFields = try protoReader.endMessage(token: token)

        self.choice = choice
    }

    public func encode(to protoWriter: ProtoWriter) throws {
        if let choice = self.choice {
            try choice.encode(to: protoWriter)
        }
        try protoWriter.writeUnknownFields(unknownFields)
    }

}

#if !WIRE_REMOVE_CODABLE
extension OneOfMessage : Codable {

    public init(from decoder: Decoder) throws {
        let container = try decoder.container(keyedBy: StringLiteralCodingKeys.self)
        if let foo = try container.decodeIfPresent(Int32.self, forKey: "foo") {
            self.choice = .foo(foo)
        } else if let bar = try container.decodeIfPresent(String.self, forKey: "bar") {
            self.choice = .bar(bar)
        } else if let baz = try container.decodeIfPresent(String.self, forKey: "baz") {
            self.choice = .baz(baz)
        } else {
            self.choice = nil
        }
    }

    public func encode(to encoder: Encoder) throws {
        var container = encoder.container(keyedBy: StringLiteralCodingKeys.self)

        switch self.choice {
        case .foo(let foo): try container.encode(foo, forKey: "foo")
        case .bar(let bar): try container.encode(bar, forKey: "bar")
        case .baz(let baz): try container.encode(baz, forKey: "baz")
        case Optional.none: break
        }
    }

}
#endif

/**
 * Subtypes within OneOfMessage
 */
extension OneOfMessage {

    public enum Choice {

        /**
         * What foo.
         */
        case foo(Int32)
        /**
         * Such bar.
         */
        case bar(String)
        /**
         * Nice baz.
         */
        case baz(String)

        fileprivate func encode(to protoWriter: ProtoWriter) throws {
            switch self {
            case .foo(let foo): try protoWriter.encode(tag: 1, value: foo)
            case .bar(let bar): try protoWriter.encode(tag: 3, value: bar)
            case .baz(let baz): try protoWriter.encode(tag: 4, value: baz)
            }
        }

    }

}

#if !WIRE_REMOVE_EQUATABLE
extension OneOfMessage.Choice : Equatable {
}
#endif

#if !WIRE_REMOVE_HASHABLE
extension OneOfMessage.Choice : Hashable {
}
#endif

extension OneOfMessage.Choice : Sendable {
}
