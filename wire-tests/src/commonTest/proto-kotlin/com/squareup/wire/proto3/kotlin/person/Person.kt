// Code generated by Wire protocol buffer compiler, do not edit.
// Source: squareup.protos3.kotlin.person.Person in person.proto
@file:Suppress(
  "DEPRECATION",
  "RUNTIME_ANNOTATION_NOT_SUPPORTED",
)

package com.squareup.wire.proto3.kotlin.person

import com.squareup.wire.EnumAdapter
import com.squareup.wire.FieldEncoding
import com.squareup.wire.Message
import com.squareup.wire.ProtoAdapter
import com.squareup.wire.ProtoReader
import com.squareup.wire.ProtoWriter
import com.squareup.wire.ReverseProtoWriter
import com.squareup.wire.Syntax.PROTO_3
import com.squareup.wire.WireEnum
import com.squareup.wire.WireField
import com.squareup.wire.`internal`.JvmField
import com.squareup.wire.`internal`.JvmStatic
import com.squareup.wire.`internal`.countNonNull
import com.squareup.wire.`internal`.immutableCopyOf
import com.squareup.wire.`internal`.redactElements
import com.squareup.wire.`internal`.sanitize
import kotlin.Any
import kotlin.AssertionError
import kotlin.Boolean
import kotlin.Deprecated
import kotlin.DeprecationLevel
import kotlin.Int
import kotlin.Long
import kotlin.Nothing
import kotlin.String
import kotlin.Suppress
import kotlin.collections.List
import okio.ByteString

/**
 * Message representing a person, includes their name, unique ID number, email and phone number.
 */
public class Person(
  /**
   * The customer's full name.
   */
  @field:WireField(
    tag = 1,
    adapter = "com.squareup.wire.ProtoAdapter#STRING",
    label = WireField.Label.OMIT_IDENTITY,
    schemaIndex = 0,
  )
  public val name: String = "",
  /**
   * The customer's ID number.
   */
  @field:WireField(
    tag = 2,
    adapter = "com.squareup.wire.ProtoAdapter#INT32",
    label = WireField.Label.OMIT_IDENTITY,
    schemaIndex = 1,
  )
  public val id: Int = 0,
  /**
   * Email address for the customer.
   */
  @field:WireField(
    tag = 3,
    adapter = "com.squareup.wire.ProtoAdapter#STRING",
    label = WireField.Label.OMIT_IDENTITY,
    schemaIndex = 2,
  )
  public val email: String = "",
  phones: List<PhoneNumber> = emptyList(),
  aliases: List<String> = emptyList(),
  @field:WireField(
    tag = 6,
    adapter = "com.squareup.wire.ProtoAdapter#INT32",
    oneofName = "choice",
    schemaIndex = 5,
  )
  public val foo: Int? = null,
  @field:WireField(
    tag = 7,
    adapter = "com.squareup.wire.ProtoAdapter#STRING",
    oneofName = "choice",
    schemaIndex = 6,
  )
  public val bar: String? = null,
  unknownFields: ByteString = ByteString.EMPTY,
) : Message<Person, Nothing>(ADAPTER, unknownFields) {
  /**
   * A list of the customer's phone numbers.
   */
  @field:WireField(
    tag = 4,
    adapter = "com.squareup.wire.proto3.kotlin.person.Person${'$'}PhoneNumber#ADAPTER",
    label = WireField.Label.REPEATED,
    schemaIndex = 3,
  )
  public val phones: List<PhoneNumber> = immutableCopyOf("phones", phones)

  @field:WireField(
    tag = 5,
    adapter = "com.squareup.wire.ProtoAdapter#STRING",
    label = WireField.Label.REPEATED,
    schemaIndex = 4,
  )
  public val aliases: List<String> = immutableCopyOf("aliases", aliases)

  init {
    require(countNonNull(foo, bar) <= 1) {
      "At most one of foo, bar may be non-null"
    }
  }

  @Deprecated(
    message = "Shouldn't be used in Kotlin",
    level = DeprecationLevel.HIDDEN,
  )
  override fun newBuilder(): Nothing = throw AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin")

  override fun equals(other: Any?): Boolean {
    if (other === this) return true
    if (other !is Person) return false
    if (unknownFields != other.unknownFields) return false
    if (name != other.name) return false
    if (id != other.id) return false
    if (email != other.email) return false
    if (phones != other.phones) return false
    if (aliases != other.aliases) return false
    if (foo != other.foo) return false
    if (bar != other.bar) return false
    return true
  }

  override fun hashCode(): Int {
    var result = super.hashCode
    if (result == 0) {
      result = unknownFields.hashCode()
      result = result * 37 + name.hashCode()
      result = result * 37 + id.hashCode()
      result = result * 37 + email.hashCode()
      result = result * 37 + phones.hashCode()
      result = result * 37 + aliases.hashCode()
      result = result * 37 + (foo?.hashCode() ?: 0)
      result = result * 37 + (bar?.hashCode() ?: 0)
      super.hashCode = result
    }
    return result
  }

  override fun toString(): String {
    val result = mutableListOf<String>()
    result += """name=${sanitize(name)}"""
    result += """id=$id"""
    result += """email=${sanitize(email)}"""
    if (phones.isNotEmpty()) result += """phones=$phones"""
    if (aliases.isNotEmpty()) result += """aliases=${sanitize(aliases)}"""
    if (foo != null) result += """foo=$foo"""
    if (bar != null) result += """bar=${sanitize(bar)}"""
    return result.joinToString(prefix = "Person{", separator = ", ", postfix = "}")
  }

  public fun copy(
    name: String = this.name,
    id: Int = this.id,
    email: String = this.email,
    phones: List<PhoneNumber> = this.phones,
    aliases: List<String> = this.aliases,
    foo: Int? = this.foo,
    bar: String? = this.bar,
    unknownFields: ByteString = this.unknownFields,
  ): Person = Person(name, id, email, phones, aliases, foo, bar, unknownFields)

  public companion object {
    @JvmField
    public val ADAPTER: ProtoAdapter<Person> = object : ProtoAdapter<Person>(
      FieldEncoding.LENGTH_DELIMITED, 
      Person::class, 
      "type.googleapis.com/squareup.protos3.kotlin.person.Person", 
      PROTO_3, 
      null, 
      "person.proto"
    ) {
      override fun encodedSize(`value`: Person): Int {
        var size = value.unknownFields.size
        if (value.name != "") {
          size += ProtoAdapter.STRING.encodedSizeWithTag(1, value.name)
        }
        if (value.id != 0) {
          size += ProtoAdapter.INT32.encodedSizeWithTag(2, value.id)
        }
        if (value.email != "") {
          size += ProtoAdapter.STRING.encodedSizeWithTag(3, value.email)
        }
        size += PhoneNumber.ADAPTER.asRepeated().encodedSizeWithTag(4, value.phones)
        size += ProtoAdapter.STRING.asRepeated().encodedSizeWithTag(5, value.aliases)
        size += ProtoAdapter.INT32.encodedSizeWithTag(6, value.foo)
        size += ProtoAdapter.STRING.encodedSizeWithTag(7, value.bar)
        return size
      }

      override fun encode(writer: ProtoWriter, `value`: Person) {
        if (value.name != "") {
          ProtoAdapter.STRING.encodeWithTag(writer, 1, value.name)
        }
        if (value.id != 0) {
          ProtoAdapter.INT32.encodeWithTag(writer, 2, value.id)
        }
        if (value.email != "") {
          ProtoAdapter.STRING.encodeWithTag(writer, 3, value.email)
        }
        PhoneNumber.ADAPTER.asRepeated().encodeWithTag(writer, 4, value.phones)
        ProtoAdapter.STRING.asRepeated().encodeWithTag(writer, 5, value.aliases)
        ProtoAdapter.INT32.encodeWithTag(writer, 6, value.foo)
        ProtoAdapter.STRING.encodeWithTag(writer, 7, value.bar)
        writer.writeBytes(value.unknownFields)
      }

      override fun encode(writer: ReverseProtoWriter, `value`: Person) {
        writer.writeBytes(value.unknownFields)
        ProtoAdapter.STRING.encodeWithTag(writer, 7, value.bar)
        ProtoAdapter.INT32.encodeWithTag(writer, 6, value.foo)
        ProtoAdapter.STRING.asRepeated().encodeWithTag(writer, 5, value.aliases)
        PhoneNumber.ADAPTER.asRepeated().encodeWithTag(writer, 4, value.phones)
        if (value.email != "") {
          ProtoAdapter.STRING.encodeWithTag(writer, 3, value.email)
        }
        if (value.id != 0) {
          ProtoAdapter.INT32.encodeWithTag(writer, 2, value.id)
        }
        if (value.name != "") {
          ProtoAdapter.STRING.encodeWithTag(writer, 1, value.name)
        }
      }

      override fun decode(reader: ProtoReader): Person {
        var name: String = ""
        var id: Int = 0
        var email: String = ""
        val phones = mutableListOf<PhoneNumber>()
        val aliases = mutableListOf<String>()
        var foo: Int? = null
        var bar: String? = null
        val unknownFields = reader.forEachTag { tag ->
          when (tag) {
            1 -> name = ProtoAdapter.STRING.decode(reader)
            2 -> id = ProtoAdapter.INT32.decode(reader)
            3 -> email = ProtoAdapter.STRING.decode(reader)
            4 -> phones.add(PhoneNumber.ADAPTER.decode(reader))
            5 -> aliases.add(ProtoAdapter.STRING.decode(reader))
            6 -> foo = ProtoAdapter.INT32.decode(reader)
            7 -> bar = ProtoAdapter.STRING.decode(reader)
            else -> reader.readUnknownField(tag)
          }
        }
        return Person(
          name = name,
          id = id,
          email = email,
          phones = phones,
          aliases = aliases,
          foo = foo,
          bar = bar,
          unknownFields = unknownFields
        )
      }

      override fun redact(`value`: Person): Person = value.copy(
        phones = value.phones.redactElements(PhoneNumber.ADAPTER),
        unknownFields = ByteString.EMPTY
      )
    }

    private const val serialVersionUID: Long = 0L
  }

  /**
   * Represents the type of the phone number: mobile, home or work.
   */
  public enum class PhoneType(
    override val `value`: Int,
  ) : WireEnum {
    MOBILE(0),
    HOME(1),
    /**
     * Could be phone or fax.
     */
    WORK(2),
    ;

    public companion object {
      @JvmField
      public val ADAPTER: ProtoAdapter<PhoneType> = object : EnumAdapter<PhoneType>(
        PhoneType::class, 
        PROTO_3, 
        PhoneType.MOBILE
      ) {
        override fun fromValue(`value`: Int): PhoneType? = PhoneType.fromValue(`value`)
      }

      @JvmStatic
      public fun fromValue(`value`: Int): PhoneType? = when (`value`) {
        0 -> MOBILE
        1 -> HOME
        2 -> WORK
        else -> null
      }
    }
  }

  public class PhoneNumber(
    /**
     * The customer's phone number.
     */
    @field:WireField(
      tag = 1,
      adapter = "com.squareup.wire.ProtoAdapter#STRING",
      label = WireField.Label.OMIT_IDENTITY,
      schemaIndex = 0,
    )
    public val number: String = "",
    /**
     * The type of phone stored here.
     */
    @field:WireField(
      tag = 2,
      adapter = "com.squareup.wire.proto3.kotlin.person.Person${'$'}PhoneType#ADAPTER",
      label = WireField.Label.OMIT_IDENTITY,
      schemaIndex = 1,
    )
    public val type: PhoneType = PhoneType.MOBILE,
    unknownFields: ByteString = ByteString.EMPTY,
  ) : Message<PhoneNumber, Nothing>(ADAPTER, unknownFields) {
    @Deprecated(
      message = "Shouldn't be used in Kotlin",
      level = DeprecationLevel.HIDDEN,
    )
    override fun newBuilder(): Nothing = throw AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin")

    override fun equals(other: Any?): Boolean {
      if (other === this) return true
      if (other !is PhoneNumber) return false
      if (unknownFields != other.unknownFields) return false
      if (number != other.number) return false
      if (type != other.type) return false
      return true
    }

    override fun hashCode(): Int {
      var result = super.hashCode
      if (result == 0) {
        result = unknownFields.hashCode()
        result = result * 37 + number.hashCode()
        result = result * 37 + type.hashCode()
        super.hashCode = result
      }
      return result
    }

    override fun toString(): String {
      val result = mutableListOf<String>()
      result += """number=${sanitize(number)}"""
      result += """type=$type"""
      return result.joinToString(prefix = "PhoneNumber{", separator = ", ", postfix = "}")
    }

    public fun copy(
      number: String = this.number,
      type: PhoneType = this.type,
      unknownFields: ByteString = this.unknownFields,
    ): PhoneNumber = PhoneNumber(number, type, unknownFields)

    public companion object {
      @JvmField
      public val ADAPTER: ProtoAdapter<PhoneNumber> = object : ProtoAdapter<PhoneNumber>(
        FieldEncoding.LENGTH_DELIMITED, 
        PhoneNumber::class, 
        "type.googleapis.com/squareup.protos3.kotlin.person.Person.PhoneNumber", 
        PROTO_3, 
        null, 
        "person.proto"
      ) {
        override fun encodedSize(`value`: PhoneNumber): Int {
          var size = value.unknownFields.size
          if (value.number != "") {
            size += ProtoAdapter.STRING.encodedSizeWithTag(1, value.number)
          }
          if (value.type != com.squareup.wire.proto3.kotlin.person.Person.PhoneType.MOBILE) {
            size += PhoneType.ADAPTER.encodedSizeWithTag(2, value.type)
          }
          return size
        }

        override fun encode(writer: ProtoWriter, `value`: PhoneNumber) {
          if (value.number != "") {
            ProtoAdapter.STRING.encodeWithTag(writer, 1, value.number)
          }
          if (value.type != com.squareup.wire.proto3.kotlin.person.Person.PhoneType.MOBILE) {
            PhoneType.ADAPTER.encodeWithTag(writer, 2, value.type)
          }
          writer.writeBytes(value.unknownFields)
        }

        override fun encode(writer: ReverseProtoWriter, `value`: PhoneNumber) {
          writer.writeBytes(value.unknownFields)
          if (value.type != com.squareup.wire.proto3.kotlin.person.Person.PhoneType.MOBILE) {
            PhoneType.ADAPTER.encodeWithTag(writer, 2, value.type)
          }
          if (value.number != "") {
            ProtoAdapter.STRING.encodeWithTag(writer, 1, value.number)
          }
        }

        override fun decode(reader: ProtoReader): PhoneNumber {
          var number: String = ""
          var type: PhoneType = PhoneType.MOBILE
          val unknownFields = reader.forEachTag { tag ->
            when (tag) {
              1 -> number = ProtoAdapter.STRING.decode(reader)
              2 -> try {
                type = PhoneType.ADAPTER.decode(reader)
              } catch (e: ProtoAdapter.EnumConstantNotFoundException) {
                reader.addUnknownField(tag, FieldEncoding.VARINT, e.value.toLong())
              }
              else -> reader.readUnknownField(tag)
            }
          }
          return PhoneNumber(
            number = number,
            type = type,
            unknownFields = unknownFields
          )
        }

        override fun redact(`value`: PhoneNumber): PhoneNumber = value.copy(
          unknownFields = ByteString.EMPTY
        )
      }

      private const val serialVersionUID: Long = 0L
    }
  }
}
