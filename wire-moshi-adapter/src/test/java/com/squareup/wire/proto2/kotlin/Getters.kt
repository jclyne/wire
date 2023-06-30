// Code generated by Wire protocol buffer compiler, do not edit.
// Source: squareup.proto2.kotlin.Getters in getters_kotlin.proto
package com.squareup.wire.proto2.kotlin

import com.squareup.wire.FieldEncoding
import com.squareup.wire.Message
import com.squareup.wire.ProtoAdapter
import com.squareup.wire.ProtoReader
import com.squareup.wire.ProtoWriter
import com.squareup.wire.ReverseProtoWriter
import com.squareup.wire.Syntax.PROTO_2
import com.squareup.wire.WireField
import kotlin.Any
import kotlin.AssertionError
import kotlin.Boolean
import kotlin.Deprecated
import kotlin.DeprecationLevel
import kotlin.Int
import kotlin.Long
import kotlin.Nothing
import kotlin.String
import kotlin.jvm.JvmField
import okio.ByteString

/**
 * This message is used to test that JSON serializers correctly infer getters in Kotlin code.
 */
public class Getters(
  /**
   * Getter name: "getIsa"
   */
  @field:WireField(
    tag = 1,
    adapter = "com.squareup.wire.ProtoAdapter#INT32",
    schemaIndex = 0,
  )
  public val isa: Int? = null,
  /**
   * Getter name: "isA"
   */
  @field:WireField(
    tag = 2,
    adapter = "com.squareup.wire.ProtoAdapter#INT32",
    schemaIndex = 1,
  )
  public val isA: Int? = null,
  /**
   * Getter name: "isA"
   */
  @field:WireField(
    tag = 3,
    adapter = "com.squareup.wire.ProtoAdapter#INT32",
    schemaIndex = 2,
  )
  public val is_a: Int? = null,
  /**
   * Getter name: "is32"
   */
  @field:WireField(
    tag = 4,
    adapter = "com.squareup.wire.ProtoAdapter#INT32",
    schemaIndex = 3,
  )
  public val is32: Int? = null,
  /**
   * Getter name: "getIsb" (types don't matter)
   */
  @field:WireField(
    tag = 5,
    adapter = "com.squareup.wire.ProtoAdapter#BOOL",
    schemaIndex = 4,
  )
  public val isb: Boolean? = null,
  unknownFields: ByteString = ByteString.EMPTY,
) : Message<Getters, Nothing>(ADAPTER, unknownFields) {
  @Deprecated(
    message = "Shouldn't be used in Kotlin",
    level = DeprecationLevel.HIDDEN,
  )
  override fun newBuilder(): Nothing = throw
      AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin")

  override fun equals(other: Any?): Boolean {
    if (other === this) return true
    if (other !is Getters) return false
    if (unknownFields != other.unknownFields) return false
    if (isa != other.isa) return false
    if (isA != other.isA) return false
    if (is_a != other.is_a) return false
    if (is32 != other.is32) return false
    if (isb != other.isb) return false
    return true
  }

  override fun hashCode(): Int {
    var result = super.hashCode
    if (result == 0) {
      result = unknownFields.hashCode()
      result = result * 37 + (isa?.hashCode() ?: 0)
      result = result * 37 + (isA?.hashCode() ?: 0)
      result = result * 37 + (is_a?.hashCode() ?: 0)
      result = result * 37 + (is32?.hashCode() ?: 0)
      result = result * 37 + (isb?.hashCode() ?: 0)
      super.hashCode = result
    }
    return result
  }

  override fun toString(): String {
    val result = mutableListOf<String>()
    if (isa != null) result += """isa=$isa"""
    if (isA != null) result += """isA=$isA"""
    if (is_a != null) result += """is_a=$is_a"""
    if (is32 != null) result += """is32=$is32"""
    if (isb != null) result += """isb=$isb"""
    return result.joinToString(prefix = "Getters{", separator = ", ", postfix = "}")
  }

  public fun copy(
    isa: Int? = this.isa,
    isA: Int? = this.isA,
    is_a: Int? = this.is_a,
    is32: Int? = this.is32,
    isb: Boolean? = this.isb,
    unknownFields: ByteString = this.unknownFields,
  ): Getters = Getters(isa, isA, is_a, is32, isb, unknownFields)

  public companion object {
    @JvmField
    public val ADAPTER: ProtoAdapter<Getters> = object : ProtoAdapter<Getters>(
      FieldEncoding.LENGTH_DELIMITED, 
      Getters::class, 
      "type.googleapis.com/squareup.proto2.kotlin.Getters", 
      PROTO_2, 
      null, 
      "getters_kotlin.proto"
    ) {
      override fun encodedSize(`value`: Getters): Int {
        var size = value.unknownFields.size
        size += ProtoAdapter.INT32.encodedSizeWithTag(1, value.isa)
        size += ProtoAdapter.INT32.encodedSizeWithTag(2, value.isA)
        size += ProtoAdapter.INT32.encodedSizeWithTag(3, value.is_a)
        size += ProtoAdapter.INT32.encodedSizeWithTag(4, value.is32)
        size += ProtoAdapter.BOOL.encodedSizeWithTag(5, value.isb)
        return size
      }

      override fun encode(writer: ProtoWriter, `value`: Getters) {
        ProtoAdapter.INT32.encodeWithTag(writer, 1, value.isa)
        ProtoAdapter.INT32.encodeWithTag(writer, 2, value.isA)
        ProtoAdapter.INT32.encodeWithTag(writer, 3, value.is_a)
        ProtoAdapter.INT32.encodeWithTag(writer, 4, value.is32)
        ProtoAdapter.BOOL.encodeWithTag(writer, 5, value.isb)
        writer.writeBytes(value.unknownFields)
      }

      override fun encode(writer: ReverseProtoWriter, `value`: Getters) {
        writer.writeBytes(value.unknownFields)
        ProtoAdapter.BOOL.encodeWithTag(writer, 5, value.isb)
        ProtoAdapter.INT32.encodeWithTag(writer, 4, value.is32)
        ProtoAdapter.INT32.encodeWithTag(writer, 3, value.is_a)
        ProtoAdapter.INT32.encodeWithTag(writer, 2, value.isA)
        ProtoAdapter.INT32.encodeWithTag(writer, 1, value.isa)
      }

      override fun decode(reader: ProtoReader): Getters {
        var isa: Int? = null
        var isA: Int? = null
        var is_a: Int? = null
        var is32: Int? = null
        var isb: Boolean? = null
        val unknownFields = reader.forEachTag { tag ->
          when (tag) {
            1 -> isa = ProtoAdapter.INT32.decode(reader)
            2 -> isA = ProtoAdapter.INT32.decode(reader)
            3 -> is_a = ProtoAdapter.INT32.decode(reader)
            4 -> is32 = ProtoAdapter.INT32.decode(reader)
            5 -> isb = ProtoAdapter.BOOL.decode(reader)
            else -> reader.readUnknownField(tag)
          }
        }
        return Getters(
          isa = isa,
          isA = isA,
          is_a = is_a,
          is32 = is32,
          isb = isb,
          unknownFields = unknownFields
        )
      }

      override fun redact(`value`: Getters): Getters = value.copy(
        unknownFields = ByteString.EMPTY
      )
    }

    private const val serialVersionUID: Long = 0L
  }
}
