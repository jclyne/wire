// Code generated by Wire protocol buffer compiler, do not edit.
// Source: squareup.protos.kotlin.oneof.Form in form.proto
import Foundation
import Wire

public struct Form {

    public var choice: Form.Choice?
    public var decision: Form.Decision?
    public var unknownFields: Foundation.Data = .init()

    public init(configure: (inout Self) -> Swift.Void = { _ in }) {
        configure(&self)
    }

}

#if WIRE_INCLUDE_MEMBERWISE_INITIALIZER
extension Form {

    @_disfavoredOverload
    @available(*, deprecated)
    public init(choice: Choice? = nil, decision: Decision? = nil) {
        self.choice = choice
        self.decision = decision
    }

}
#endif

#if !WIRE_REMOVE_EQUATABLE
extension Form : Equatable {
}
#endif

#if !WIRE_REMOVE_HASHABLE
extension Form : Hashable {
}
#endif

#if swift(>=5.5)
extension Form : Sendable {
}
#endif

extension Form : ProtoDefaultedValue {

    public static var defaultedValue: Form {
        Form()
    }
}

extension Form : ProtoMessage {

    public static func protoMessageTypeURL() -> Swift.String {
        return "type.googleapis.com/squareup.protos.kotlin.oneof.Form"
    }

}

extension Form : Proto2Codable {

    public init(from protoReader: Wire.ProtoReader) throws {
        var choice: Choice? = nil
        var decision: Decision? = nil

        let token = try protoReader.beginMessage()
        while let tag = try protoReader.nextTag(token: token) {
            switch tag {
            case 1: choice = .button_element(try protoReader.decode(Form.ButtonElement.self))
            case 2: choice = .local_image_element(try protoReader.decode(Form.LocalImageElement.self))
            case 3: choice = .remote_image_element(try protoReader.decode(Form.RemoteImageElement.self))
            case 4: choice = .money_element(try protoReader.decode(Form.MoneyElement.self))
            case 5: choice = .spacer_element(try protoReader.decode(Form.SpacerElement.self))
            case 6: choice = .text_element(try protoReader.decode(Form.TextElement.self))
            case 7: choice = .customized_card_element(try protoReader.decode(Form.CustomizedCardElement.self))
            case 8: choice = .address_element(try protoReader.decode(Form.AddressElement.self))
            case 9: choice = .text_input_element(try protoReader.decode(Form.TextInputElement.self))
            case 10: choice = .option_picker_element(try protoReader.decode(Form.OptionPickerElement.self))
            case 11: choice = .detail_row_element(try protoReader.decode(Form.DetailRowElement.self))
            case 12: choice = .currency_conversion_flags_element(try protoReader.decode(Form.CurrencyConversionFlagsElement.self))
            case 101: decision = .a(try protoReader.decode(Swift.String.self))
            case 102: decision = .b(try protoReader.decode(Swift.String.self))
            case 103: decision = .c(try protoReader.decode(Swift.String.self))
            case 104: decision = .d(try protoReader.decode(Swift.String.self))
            case 105: decision = .e(try protoReader.decode(Swift.String.self))
            case 106: decision = .f(try protoReader.decode(Swift.String.self))
            case 107: decision = .g(try protoReader.decode(Swift.String.self))
            case 108: decision = .h(try protoReader.decode(Swift.String.self))
            default: try protoReader.readUnknownField(tag: tag)
            }
        }
        self.unknownFields = try protoReader.endMessage(token: token)

        self.choice = choice
        self.decision = decision
    }

    public func encode(to protoWriter: Wire.ProtoWriter) throws {
        if let choice = self.choice {
            try choice.encode(to: protoWriter)
        }
        if let decision = self.decision {
            try decision.encode(to: protoWriter)
        }
        try protoWriter.writeUnknownFields(unknownFields)
    }

}

#if !WIRE_REMOVE_CODABLE
extension Form : Codable {

    public init(from decoder: Swift.Decoder) throws {
        let container = try decoder.container(keyedBy: Wire.StringLiteralCodingKeys.self)
        if let button_element = try container.decodeIfPresent(Form.ButtonElement.self, forKey: "buttonElement") {
            self.choice = .button_element(button_element)
        } else if let button_element = try container.decodeIfPresent(Form.ButtonElement.self, forKey: "button_element") {
            self.choice = .button_element(button_element)
        } else if let local_image_element = try container.decodeIfPresent(Form.LocalImageElement.self, forKey: "localImageElement") {
            self.choice = .local_image_element(local_image_element)
        } else if let local_image_element = try container.decodeIfPresent(Form.LocalImageElement.self, forKey: "local_image_element") {
            self.choice = .local_image_element(local_image_element)
        } else if let remote_image_element = try container.decodeIfPresent(Form.RemoteImageElement.self, forKey: "remoteImageElement") {
            self.choice = .remote_image_element(remote_image_element)
        } else if let remote_image_element = try container.decodeIfPresent(Form.RemoteImageElement.self, forKey: "remote_image_element") {
            self.choice = .remote_image_element(remote_image_element)
        } else if let money_element = try container.decodeIfPresent(Form.MoneyElement.self, forKey: "moneyElement") {
            self.choice = .money_element(money_element)
        } else if let money_element = try container.decodeIfPresent(Form.MoneyElement.self, forKey: "money_element") {
            self.choice = .money_element(money_element)
        } else if let spacer_element = try container.decodeIfPresent(Form.SpacerElement.self, forKey: "spacerElement") {
            self.choice = .spacer_element(spacer_element)
        } else if let spacer_element = try container.decodeIfPresent(Form.SpacerElement.self, forKey: "spacer_element") {
            self.choice = .spacer_element(spacer_element)
        } else if let text_element = try container.decodeIfPresent(Form.TextElement.self, forKey: "textElement") {
            self.choice = .text_element(text_element)
        } else if let text_element = try container.decodeIfPresent(Form.TextElement.self, forKey: "text_element") {
            self.choice = .text_element(text_element)
        } else if let customized_card_element = try container.decodeIfPresent(Form.CustomizedCardElement.self, forKey: "customizedCardElement") {
            self.choice = .customized_card_element(customized_card_element)
        } else if let customized_card_element = try container.decodeIfPresent(Form.CustomizedCardElement.self, forKey: "customized_card_element") {
            self.choice = .customized_card_element(customized_card_element)
        } else if let address_element = try container.decodeIfPresent(Form.AddressElement.self, forKey: "addressElement") {
            self.choice = .address_element(address_element)
        } else if let address_element = try container.decodeIfPresent(Form.AddressElement.self, forKey: "address_element") {
            self.choice = .address_element(address_element)
        } else if let text_input_element = try container.decodeIfPresent(Form.TextInputElement.self, forKey: "textInputElement") {
            self.choice = .text_input_element(text_input_element)
        } else if let text_input_element = try container.decodeIfPresent(Form.TextInputElement.self, forKey: "text_input_element") {
            self.choice = .text_input_element(text_input_element)
        } else if let option_picker_element = try container.decodeIfPresent(Form.OptionPickerElement.self, forKey: "optionPickerElement") {
            self.choice = .option_picker_element(option_picker_element)
        } else if let option_picker_element = try container.decodeIfPresent(Form.OptionPickerElement.self, forKey: "option_picker_element") {
            self.choice = .option_picker_element(option_picker_element)
        } else if let detail_row_element = try container.decodeIfPresent(Form.DetailRowElement.self, forKey: "detailRowElement") {
            self.choice = .detail_row_element(detail_row_element)
        } else if let detail_row_element = try container.decodeIfPresent(Form.DetailRowElement.self, forKey: "detail_row_element") {
            self.choice = .detail_row_element(detail_row_element)
        } else if let currency_conversion_flags_element = try container.decodeIfPresent(Form.CurrencyConversionFlagsElement.self, forKey: "currencyConversionFlagsElement") {
            self.choice = .currency_conversion_flags_element(currency_conversion_flags_element)
        } else if let currency_conversion_flags_element = try container.decodeIfPresent(Form.CurrencyConversionFlagsElement.self, forKey: "currency_conversion_flags_element") {
            self.choice = .currency_conversion_flags_element(currency_conversion_flags_element)
        } else {
            self.choice = nil
        }
        if let a = try container.decodeIfPresent(Swift.String.self, forKey: "a") {
            self.decision = .a(a)
        } else if let b = try container.decodeIfPresent(Swift.String.self, forKey: "b") {
            self.decision = .b(b)
        } else if let c = try container.decodeIfPresent(Swift.String.self, forKey: "c") {
            self.decision = .c(c)
        } else if let d = try container.decodeIfPresent(Swift.String.self, forKey: "d") {
            self.decision = .d(d)
        } else if let e = try container.decodeIfPresent(Swift.String.self, forKey: "e") {
            self.decision = .e(e)
        } else if let f = try container.decodeIfPresent(Swift.String.self, forKey: "f") {
            self.decision = .f(f)
        } else if let g = try container.decodeIfPresent(Swift.String.self, forKey: "g") {
            self.decision = .g(g)
        } else if let h = try container.decodeIfPresent(Swift.String.self, forKey: "h") {
            self.decision = .h(h)
        } else {
            self.decision = nil
        }
    }

    public func encode(to encoder: Swift.Encoder) throws {
        var container = encoder.container(keyedBy: Wire.StringLiteralCodingKeys.self)
        let preferCamelCase = encoder.protoKeyNameEncodingStrategy == .camelCase

        switch self.choice {
        case .button_element(let button_element): try container.encode(button_element, forKey: preferCamelCase ? "buttonElement" : "button_element")
        case .local_image_element(let local_image_element): try container.encode(local_image_element, forKey: preferCamelCase ? "localImageElement" : "local_image_element")
        case .remote_image_element(let remote_image_element): try container.encode(remote_image_element, forKey: preferCamelCase ? "remoteImageElement" : "remote_image_element")
        case .money_element(let money_element): try container.encode(money_element, forKey: preferCamelCase ? "moneyElement" : "money_element")
        case .spacer_element(let spacer_element): try container.encode(spacer_element, forKey: preferCamelCase ? "spacerElement" : "spacer_element")
        case .text_element(let text_element): try container.encode(text_element, forKey: preferCamelCase ? "textElement" : "text_element")
        case .customized_card_element(let customized_card_element): try container.encode(customized_card_element, forKey: preferCamelCase ? "customizedCardElement" : "customized_card_element")
        case .address_element(let address_element): try container.encode(address_element, forKey: preferCamelCase ? "addressElement" : "address_element")
        case .text_input_element(let text_input_element): try container.encode(text_input_element, forKey: preferCamelCase ? "textInputElement" : "text_input_element")
        case .option_picker_element(let option_picker_element): try container.encode(option_picker_element, forKey: preferCamelCase ? "optionPickerElement" : "option_picker_element")
        case .detail_row_element(let detail_row_element): try container.encode(detail_row_element, forKey: preferCamelCase ? "detailRowElement" : "detail_row_element")
        case .currency_conversion_flags_element(let currency_conversion_flags_element): try container.encode(currency_conversion_flags_element, forKey: preferCamelCase ? "currencyConversionFlagsElement" : "currency_conversion_flags_element")
        case Swift.Optional.none: break
        }
        switch self.decision {
        case .a(let a): try container.encode(a, forKey: "a")
        case .b(let b): try container.encode(b, forKey: "b")
        case .c(let c): try container.encode(c, forKey: "c")
        case .d(let d): try container.encode(d, forKey: "d")
        case .e(let e): try container.encode(e, forKey: "e")
        case .f(let f): try container.encode(f, forKey: "f")
        case .g(let g): try container.encode(g, forKey: "g")
        case .h(let h): try container.encode(h, forKey: "h")
        case Swift.Optional.none: break
        }
    }

}
#endif

/**
 * Subtypes within Form
 */
extension Form {

    public enum Choice {

        case button_element(Form.ButtonElement)
        case local_image_element(Form.LocalImageElement)
        case remote_image_element(Form.RemoteImageElement)
        case money_element(Form.MoneyElement)
        case spacer_element(Form.SpacerElement)
        case text_element(Form.TextElement)
        case customized_card_element(Form.CustomizedCardElement)
        case address_element(Form.AddressElement)
        case text_input_element(Form.TextInputElement)
        @available(*, deprecated)
        case option_picker_element(Form.OptionPickerElement)
        case detail_row_element(Form.DetailRowElement)
        case currency_conversion_flags_element(Form.CurrencyConversionFlagsElement)

        fileprivate func encode(to protoWriter: Wire.ProtoWriter) throws {
            switch self {
            case .button_element(let button_element): try protoWriter.encode(tag: 1, value: button_element)
            case .local_image_element(let local_image_element): try protoWriter.encode(tag: 2, value: local_image_element)
            case .remote_image_element(let remote_image_element): try protoWriter.encode(tag: 3, value: remote_image_element)
            case .money_element(let money_element): try protoWriter.encode(tag: 4, value: money_element)
            case .spacer_element(let spacer_element): try protoWriter.encode(tag: 5, value: spacer_element)
            case .text_element(let text_element): try protoWriter.encode(tag: 6, value: text_element)
            case .customized_card_element(let customized_card_element): try protoWriter.encode(tag: 7, value: customized_card_element)
            case .address_element(let address_element): try protoWriter.encode(tag: 8, value: address_element)
            case .text_input_element(let text_input_element): try protoWriter.encode(tag: 9, value: text_input_element)
            case .option_picker_element(let option_picker_element): try protoWriter.encode(tag: 10, value: option_picker_element)
            case .detail_row_element(let detail_row_element): try protoWriter.encode(tag: 11, value: detail_row_element)
            case .currency_conversion_flags_element(let currency_conversion_flags_element): try protoWriter.encode(tag: 12, value: currency_conversion_flags_element)
            }
        }

    }

    public enum Decision {

        case a(Swift.String)
        case b(Swift.String)
        case c(Swift.String)
        case d(Swift.String)
        case e(Swift.String)
        case f(Swift.String)
        case g(Swift.String)
        case h(Swift.String)

        fileprivate func encode(to protoWriter: Wire.ProtoWriter) throws {
            switch self {
            case .a(let a): try protoWriter.encode(tag: 101, value: a)
            case .b(let b): try protoWriter.encode(tag: 102, value: b)
            case .c(let c): try protoWriter.encode(tag: 103, value: c)
            case .d(let d): try protoWriter.encode(tag: 104, value: d)
            case .e(let e): try protoWriter.encode(tag: 105, value: e)
            case .f(let f): try protoWriter.encode(tag: 106, value: f)
            case .g(let g): try protoWriter.encode(tag: 107, value: g)
            case .h(let h): try protoWriter.encode(tag: 108, value: h)
            }
        }

    }

    public struct ButtonElement {

        public var unknownFields: Foundation.Data = .init()

        public init() {
        }

    }

    public struct LocalImageElement {

        public var unknownFields: Foundation.Data = .init()

        public init() {
        }

    }

    public struct RemoteImageElement {

        public var unknownFields: Foundation.Data = .init()

        public init() {
        }

    }

    public struct MoneyElement {

        public var unknownFields: Foundation.Data = .init()

        public init() {
        }

    }

    public struct SpacerElement {

        public var unknownFields: Foundation.Data = .init()

        public init() {
        }

    }

    public struct TextElement {

        @Wire.ProtoDefaulted
        public var text: Swift.String?
        public var unknownFields: Foundation.Data = .init()

        public init(configure: (inout Self) -> Swift.Void = { _ in }) {
            configure(&self)
        }

    }

    public struct CustomizedCardElement {

        public var unknownFields: Foundation.Data = .init()

        public init() {
        }

    }

    public struct AddressElement {

        public var unknownFields: Foundation.Data = .init()

        public init() {
        }

    }

    public struct TextInputElement {

        public var unknownFields: Foundation.Data = .init()

        public init() {
        }

    }

    public struct OptionPickerElement {

        public var unknownFields: Foundation.Data = .init()

        public init() {
        }

    }

    public struct DetailRowElement {

        public var unknownFields: Foundation.Data = .init()

        public init() {
        }

    }

    public struct CurrencyConversionFlagsElement {

        public var unknownFields: Foundation.Data = .init()

        public init() {
        }

    }

}

#if !WIRE_REMOVE_EQUATABLE
extension Form.Choice : Equatable {
}
#endif

#if !WIRE_REMOVE_HASHABLE
extension Form.Choice : Hashable {
}
#endif

#if swift(>=5.5)
extension Form.Choice : Sendable {
}
#endif

#if !WIRE_REMOVE_EQUATABLE
extension Form.Decision : Equatable {
}
#endif

#if !WIRE_REMOVE_HASHABLE
extension Form.Decision : Hashable {
}
#endif

#if swift(>=5.5)
extension Form.Decision : Sendable {
}
#endif

#if !WIRE_REMOVE_REDACTABLE
extension Form.Decision : Redactable {

    public enum RedactedKeys : Swift.String, Wire.RedactedKey {

        case e

    }

}
#endif

#if !WIRE_REMOVE_EQUATABLE
extension Form.ButtonElement : Equatable {
}
#endif

#if !WIRE_REMOVE_HASHABLE
extension Form.ButtonElement : Hashable {
}
#endif

#if swift(>=5.5)
extension Form.ButtonElement : Sendable {
}
#endif

extension Form.ButtonElement : ProtoDefaultedValue {

    public static var defaultedValue: Form.ButtonElement {
        Form.ButtonElement()
    }
}

extension Form.ButtonElement : ProtoMessage {

    public static func protoMessageTypeURL() -> Swift.String {
        return "type.googleapis.com/squareup.protos.kotlin.oneof.Form.ButtonElement"
    }

}

extension Form.ButtonElement : Proto2Codable {

    public init(from protoReader: Wire.ProtoReader) throws {
        let token = try protoReader.beginMessage()
        while let tag = try protoReader.nextTag(token: token) {
            switch tag {
            default: try protoReader.readUnknownField(tag: tag)
            }
        }
        self.unknownFields = try protoReader.endMessage(token: token)

    }

    public func encode(to protoWriter: Wire.ProtoWriter) throws {
        try protoWriter.writeUnknownFields(unknownFields)
    }

}

#if !WIRE_REMOVE_CODABLE
extension Form.ButtonElement : Codable {

    public enum CodingKeys : Swift.CodingKey {
    }

}
#endif

#if !WIRE_REMOVE_EQUATABLE
extension Form.LocalImageElement : Equatable {
}
#endif

#if !WIRE_REMOVE_HASHABLE
extension Form.LocalImageElement : Hashable {
}
#endif

#if swift(>=5.5)
extension Form.LocalImageElement : Sendable {
}
#endif

extension Form.LocalImageElement : ProtoDefaultedValue {

    public static var defaultedValue: Form.LocalImageElement {
        Form.LocalImageElement()
    }
}

extension Form.LocalImageElement : ProtoMessage {

    public static func protoMessageTypeURL() -> Swift.String {
        return "type.googleapis.com/squareup.protos.kotlin.oneof.Form.LocalImageElement"
    }

}

extension Form.LocalImageElement : Proto2Codable {

    public init(from protoReader: Wire.ProtoReader) throws {
        let token = try protoReader.beginMessage()
        while let tag = try protoReader.nextTag(token: token) {
            switch tag {
            default: try protoReader.readUnknownField(tag: tag)
            }
        }
        self.unknownFields = try protoReader.endMessage(token: token)

    }

    public func encode(to protoWriter: Wire.ProtoWriter) throws {
        try protoWriter.writeUnknownFields(unknownFields)
    }

}

#if !WIRE_REMOVE_CODABLE
extension Form.LocalImageElement : Codable {

    public enum CodingKeys : Swift.CodingKey {
    }

}
#endif

#if !WIRE_REMOVE_EQUATABLE
extension Form.RemoteImageElement : Equatable {
}
#endif

#if !WIRE_REMOVE_HASHABLE
extension Form.RemoteImageElement : Hashable {
}
#endif

#if swift(>=5.5)
extension Form.RemoteImageElement : Sendable {
}
#endif

extension Form.RemoteImageElement : ProtoDefaultedValue {

    public static var defaultedValue: Form.RemoteImageElement {
        Form.RemoteImageElement()
    }
}

extension Form.RemoteImageElement : ProtoMessage {

    public static func protoMessageTypeURL() -> Swift.String {
        return "type.googleapis.com/squareup.protos.kotlin.oneof.Form.RemoteImageElement"
    }

}

extension Form.RemoteImageElement : Proto2Codable {

    public init(from protoReader: Wire.ProtoReader) throws {
        let token = try protoReader.beginMessage()
        while let tag = try protoReader.nextTag(token: token) {
            switch tag {
            default: try protoReader.readUnknownField(tag: tag)
            }
        }
        self.unknownFields = try protoReader.endMessage(token: token)

    }

    public func encode(to protoWriter: Wire.ProtoWriter) throws {
        try protoWriter.writeUnknownFields(unknownFields)
    }

}

#if !WIRE_REMOVE_CODABLE
extension Form.RemoteImageElement : Codable {

    public enum CodingKeys : Swift.CodingKey {
    }

}
#endif

#if !WIRE_REMOVE_EQUATABLE
extension Form.MoneyElement : Equatable {
}
#endif

#if !WIRE_REMOVE_HASHABLE
extension Form.MoneyElement : Hashable {
}
#endif

#if swift(>=5.5)
extension Form.MoneyElement : Sendable {
}
#endif

extension Form.MoneyElement : ProtoDefaultedValue {

    public static var defaultedValue: Form.MoneyElement {
        Form.MoneyElement()
    }
}

extension Form.MoneyElement : ProtoMessage {

    public static func protoMessageTypeURL() -> Swift.String {
        return "type.googleapis.com/squareup.protos.kotlin.oneof.Form.MoneyElement"
    }

}

extension Form.MoneyElement : Proto2Codable {

    public init(from protoReader: Wire.ProtoReader) throws {
        let token = try protoReader.beginMessage()
        while let tag = try protoReader.nextTag(token: token) {
            switch tag {
            default: try protoReader.readUnknownField(tag: tag)
            }
        }
        self.unknownFields = try protoReader.endMessage(token: token)

    }

    public func encode(to protoWriter: Wire.ProtoWriter) throws {
        try protoWriter.writeUnknownFields(unknownFields)
    }

}

#if !WIRE_REMOVE_CODABLE
extension Form.MoneyElement : Codable {

    public enum CodingKeys : Swift.CodingKey {
    }

}
#endif

#if !WIRE_REMOVE_EQUATABLE
extension Form.SpacerElement : Equatable {
}
#endif

#if !WIRE_REMOVE_HASHABLE
extension Form.SpacerElement : Hashable {
}
#endif

#if swift(>=5.5)
extension Form.SpacerElement : Sendable {
}
#endif

extension Form.SpacerElement : ProtoDefaultedValue {

    public static var defaultedValue: Form.SpacerElement {
        Form.SpacerElement()
    }
}

extension Form.SpacerElement : ProtoMessage {

    public static func protoMessageTypeURL() -> Swift.String {
        return "type.googleapis.com/squareup.protos.kotlin.oneof.Form.SpacerElement"
    }

}

extension Form.SpacerElement : Proto2Codable {

    public init(from protoReader: Wire.ProtoReader) throws {
        let token = try protoReader.beginMessage()
        while let tag = try protoReader.nextTag(token: token) {
            switch tag {
            default: try protoReader.readUnknownField(tag: tag)
            }
        }
        self.unknownFields = try protoReader.endMessage(token: token)

    }

    public func encode(to protoWriter: Wire.ProtoWriter) throws {
        try protoWriter.writeUnknownFields(unknownFields)
    }

}

#if !WIRE_REMOVE_CODABLE
extension Form.SpacerElement : Codable {

    public enum CodingKeys : Swift.CodingKey {
    }

}
#endif

#if WIRE_INCLUDE_MEMBERWISE_INITIALIZER
extension Form.TextElement {

    @_disfavoredOverload
    @available(*, deprecated)
    public init(text: Swift.String? = nil) {
        self._text.wrappedValue = text
    }

}
#endif

#if !WIRE_REMOVE_EQUATABLE
extension Form.TextElement : Equatable {
}
#endif

#if !WIRE_REMOVE_HASHABLE
extension Form.TextElement : Hashable {
}
#endif

#if swift(>=5.5)
extension Form.TextElement : Sendable {
}
#endif

extension Form.TextElement : ProtoDefaultedValue {

    public static var defaultedValue: Form.TextElement {
        Form.TextElement()
    }
}

extension Form.TextElement : ProtoMessage {

    public static func protoMessageTypeURL() -> Swift.String {
        return "type.googleapis.com/squareup.protos.kotlin.oneof.Form.TextElement"
    }

}

extension Form.TextElement : Proto2Codable {

    public init(from protoReader: Wire.ProtoReader) throws {
        var text: Swift.String? = nil

        let token = try protoReader.beginMessage()
        while let tag = try protoReader.nextTag(token: token) {
            switch tag {
            case 1: text = try protoReader.decode(Swift.String.self)
            default: try protoReader.readUnknownField(tag: tag)
            }
        }
        self.unknownFields = try protoReader.endMessage(token: token)

        self._text.wrappedValue = text
    }

    public func encode(to protoWriter: Wire.ProtoWriter) throws {
        try protoWriter.encode(tag: 1, value: self.text)
        try protoWriter.writeUnknownFields(unknownFields)
    }

}

#if !WIRE_REMOVE_CODABLE
extension Form.TextElement : Codable {

    public init(from decoder: Swift.Decoder) throws {
        let container = try decoder.container(keyedBy: Wire.StringLiteralCodingKeys.self)
        self._text.wrappedValue = try container.decodeIfPresent(Swift.String.self, forKey: "text")
    }

    public func encode(to encoder: Swift.Encoder) throws {
        var container = encoder.container(keyedBy: Wire.StringLiteralCodingKeys.self)

        try container.encodeIfPresent(self.text, forKey: "text")
    }

}
#endif

#if !WIRE_REMOVE_EQUATABLE
extension Form.CustomizedCardElement : Equatable {
}
#endif

#if !WIRE_REMOVE_HASHABLE
extension Form.CustomizedCardElement : Hashable {
}
#endif

#if swift(>=5.5)
extension Form.CustomizedCardElement : Sendable {
}
#endif

extension Form.CustomizedCardElement : ProtoDefaultedValue {

    public static var defaultedValue: Form.CustomizedCardElement {
        Form.CustomizedCardElement()
    }
}

extension Form.CustomizedCardElement : ProtoMessage {

    public static func protoMessageTypeURL() -> Swift.String {
        return "type.googleapis.com/squareup.protos.kotlin.oneof.Form.CustomizedCardElement"
    }

}

extension Form.CustomizedCardElement : Proto2Codable {

    public init(from protoReader: Wire.ProtoReader) throws {
        let token = try protoReader.beginMessage()
        while let tag = try protoReader.nextTag(token: token) {
            switch tag {
            default: try protoReader.readUnknownField(tag: tag)
            }
        }
        self.unknownFields = try protoReader.endMessage(token: token)

    }

    public func encode(to protoWriter: Wire.ProtoWriter) throws {
        try protoWriter.writeUnknownFields(unknownFields)
    }

}

#if !WIRE_REMOVE_CODABLE
extension Form.CustomizedCardElement : Codable {

    public enum CodingKeys : Swift.CodingKey {
    }

}
#endif

#if !WIRE_REMOVE_EQUATABLE
extension Form.AddressElement : Equatable {
}
#endif

#if !WIRE_REMOVE_HASHABLE
extension Form.AddressElement : Hashable {
}
#endif

#if swift(>=5.5)
extension Form.AddressElement : Sendable {
}
#endif

extension Form.AddressElement : ProtoDefaultedValue {

    public static var defaultedValue: Form.AddressElement {
        Form.AddressElement()
    }
}

extension Form.AddressElement : ProtoMessage {

    public static func protoMessageTypeURL() -> Swift.String {
        return "type.googleapis.com/squareup.protos.kotlin.oneof.Form.AddressElement"
    }

}

extension Form.AddressElement : Proto2Codable {

    public init(from protoReader: Wire.ProtoReader) throws {
        let token = try protoReader.beginMessage()
        while let tag = try protoReader.nextTag(token: token) {
            switch tag {
            default: try protoReader.readUnknownField(tag: tag)
            }
        }
        self.unknownFields = try protoReader.endMessage(token: token)

    }

    public func encode(to protoWriter: Wire.ProtoWriter) throws {
        try protoWriter.writeUnknownFields(unknownFields)
    }

}

#if !WIRE_REMOVE_CODABLE
extension Form.AddressElement : Codable {

    public enum CodingKeys : Swift.CodingKey {
    }

}
#endif

#if !WIRE_REMOVE_EQUATABLE
extension Form.TextInputElement : Equatable {
}
#endif

#if !WIRE_REMOVE_HASHABLE
extension Form.TextInputElement : Hashable {
}
#endif

#if swift(>=5.5)
extension Form.TextInputElement : Sendable {
}
#endif

extension Form.TextInputElement : ProtoDefaultedValue {

    public static var defaultedValue: Form.TextInputElement {
        Form.TextInputElement()
    }
}

extension Form.TextInputElement : ProtoMessage {

    public static func protoMessageTypeURL() -> Swift.String {
        return "type.googleapis.com/squareup.protos.kotlin.oneof.Form.TextInputElement"
    }

}

extension Form.TextInputElement : Proto2Codable {

    public init(from protoReader: Wire.ProtoReader) throws {
        let token = try protoReader.beginMessage()
        while let tag = try protoReader.nextTag(token: token) {
            switch tag {
            default: try protoReader.readUnknownField(tag: tag)
            }
        }
        self.unknownFields = try protoReader.endMessage(token: token)

    }

    public func encode(to protoWriter: Wire.ProtoWriter) throws {
        try protoWriter.writeUnknownFields(unknownFields)
    }

}

#if !WIRE_REMOVE_CODABLE
extension Form.TextInputElement : Codable {

    public enum CodingKeys : Swift.CodingKey {
    }

}
#endif

#if !WIRE_REMOVE_EQUATABLE
extension Form.OptionPickerElement : Equatable {
}
#endif

#if !WIRE_REMOVE_HASHABLE
extension Form.OptionPickerElement : Hashable {
}
#endif

#if swift(>=5.5)
extension Form.OptionPickerElement : Sendable {
}
#endif

extension Form.OptionPickerElement : ProtoDefaultedValue {

    public static var defaultedValue: Form.OptionPickerElement {
        Form.OptionPickerElement()
    }
}

extension Form.OptionPickerElement : ProtoMessage {

    public static func protoMessageTypeURL() -> Swift.String {
        return "type.googleapis.com/squareup.protos.kotlin.oneof.Form.OptionPickerElement"
    }

}

extension Form.OptionPickerElement : Proto2Codable {

    public init(from protoReader: Wire.ProtoReader) throws {
        let token = try protoReader.beginMessage()
        while let tag = try protoReader.nextTag(token: token) {
            switch tag {
            default: try protoReader.readUnknownField(tag: tag)
            }
        }
        self.unknownFields = try protoReader.endMessage(token: token)

    }

    public func encode(to protoWriter: Wire.ProtoWriter) throws {
        try protoWriter.writeUnknownFields(unknownFields)
    }

}

#if !WIRE_REMOVE_CODABLE
extension Form.OptionPickerElement : Codable {

    public enum CodingKeys : Swift.CodingKey {
    }

}
#endif

#if !WIRE_REMOVE_EQUATABLE
extension Form.DetailRowElement : Equatable {
}
#endif

#if !WIRE_REMOVE_HASHABLE
extension Form.DetailRowElement : Hashable {
}
#endif

#if swift(>=5.5)
extension Form.DetailRowElement : Sendable {
}
#endif

extension Form.DetailRowElement : ProtoDefaultedValue {

    public static var defaultedValue: Form.DetailRowElement {
        Form.DetailRowElement()
    }
}

extension Form.DetailRowElement : ProtoMessage {

    public static func protoMessageTypeURL() -> Swift.String {
        return "type.googleapis.com/squareup.protos.kotlin.oneof.Form.DetailRowElement"
    }

}

extension Form.DetailRowElement : Proto2Codable {

    public init(from protoReader: Wire.ProtoReader) throws {
        let token = try protoReader.beginMessage()
        while let tag = try protoReader.nextTag(token: token) {
            switch tag {
            default: try protoReader.readUnknownField(tag: tag)
            }
        }
        self.unknownFields = try protoReader.endMessage(token: token)

    }

    public func encode(to protoWriter: Wire.ProtoWriter) throws {
        try protoWriter.writeUnknownFields(unknownFields)
    }

}

#if !WIRE_REMOVE_CODABLE
extension Form.DetailRowElement : Codable {

    public enum CodingKeys : Swift.CodingKey {
    }

}
#endif

#if !WIRE_REMOVE_EQUATABLE
extension Form.CurrencyConversionFlagsElement : Equatable {
}
#endif

#if !WIRE_REMOVE_HASHABLE
extension Form.CurrencyConversionFlagsElement : Hashable {
}
#endif

#if swift(>=5.5)
extension Form.CurrencyConversionFlagsElement : Sendable {
}
#endif

extension Form.CurrencyConversionFlagsElement : ProtoDefaultedValue {

    public static var defaultedValue: Form.CurrencyConversionFlagsElement {
        Form.CurrencyConversionFlagsElement()
    }
}

extension Form.CurrencyConversionFlagsElement : ProtoMessage {

    public static func protoMessageTypeURL() -> Swift.String {
        return "type.googleapis.com/squareup.protos.kotlin.oneof.Form.CurrencyConversionFlagsElement"
    }

}

extension Form.CurrencyConversionFlagsElement : Proto2Codable {

    public init(from protoReader: Wire.ProtoReader) throws {
        let token = try protoReader.beginMessage()
        while let tag = try protoReader.nextTag(token: token) {
            switch tag {
            default: try protoReader.readUnknownField(tag: tag)
            }
        }
        self.unknownFields = try protoReader.endMessage(token: token)

    }

    public func encode(to protoWriter: Wire.ProtoWriter) throws {
        try protoWriter.writeUnknownFields(unknownFields)
    }

}

#if !WIRE_REMOVE_CODABLE
extension Form.CurrencyConversionFlagsElement : Codable {

    public enum CodingKeys : Swift.CodingKey {
    }

}
#endif