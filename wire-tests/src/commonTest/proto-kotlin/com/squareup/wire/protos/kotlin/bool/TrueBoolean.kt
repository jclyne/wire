// Code generated by Wire protocol buffer compiler, do not edit.
// Source: com.squareup.wire.protos.kotlin.bool.TrueBoolean in bool.proto
package com.squareup.wire.protos.kotlin.bool

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

public class TrueBoolean(
  @field:WireField(
    tag = 1,
    adapter = "com.squareup.wire.ProtoAdapter#BOOL",
    schemaIndex = 0,
  )
  public val isTrue: Boolean? = null,
  unknownFields: ByteString = ByteString.EMPTY,
) : Message<TrueBoolean, Nothing>(ADAPTER, unknownFields) {
  @Deprecated(
    message = "Shouldn't be used in Kotlin",
    level = DeprecationLevel.HIDDEN,
  )
  override fun newBuilder(): Nothing = throw
      AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin")

  override fun equals(other: Any?): Boolean {
    if (other === this) return true
    if (other !is TrueBoolean) return false
    if (unknownFields != other.unknownFields) return false
    if (isTrue != other.isTrue) return false
    return true
  }

  override fun hashCode(): Int {
    var result = super.hashCode
    if (result == 0) {
      result = unknownFields.hashCode()
      result = result * 37 + (isTrue?.hashCode() ?: 0)
      super.hashCode = result
    }
    return result
  }

  override fun toString(): String {
    val result = mutableListOf<String>()
    if (isTrue != null) result += """isTrue=$isTrue"""
    return result.joinToString(prefix = "TrueBoolean{", separator = ", ", postfix = "}")
  }

  public fun copy(isTrue: Boolean? = this.isTrue, unknownFields: ByteString = this.unknownFields):
      TrueBoolean = TrueBoolean(isTrue, unknownFields)

  public companion object {
    @JvmField
    public val ADAPTER: ProtoAdapter<TrueBoolean> = object : ProtoAdapter<TrueBoolean>(
      FieldEncoding.LENGTH_DELIMITED, 
      TrueBoolean::class, 
      "type.googleapis.com/com.squareup.wire.protos.kotlin.bool.TrueBoolean", 
      PROTO_2, 
      null, 
      "bool.proto"
    ) {
      override fun encodedSize(`value`: TrueBoolean): Int {
        var size = value.unknownFields.size
        size += ProtoAdapter.BOOL.encodedSizeWithTag(1, value.isTrue)
        return size
      }

      override fun encode(writer: ProtoWriter, `value`: TrueBoolean) {
        ProtoAdapter.BOOL.encodeWithTag(writer, 1, value.isTrue)
        writer.writeBytes(value.unknownFields)
      }

      override fun encode(writer: ReverseProtoWriter, `value`: TrueBoolean) {
        writer.writeBytes(value.unknownFields)
        ProtoAdapter.BOOL.encodeWithTag(writer, 1, value.isTrue)
      }

      override fun decode(reader: ProtoReader): TrueBoolean {
        var isTrue: Boolean? = null
        val unknownFields = reader.forEachTag { tag ->
          when (tag) {
            1 -> isTrue = ProtoAdapter.BOOL.decode(reader)
            else -> reader.readUnknownField(tag)
          }
        }
        return TrueBoolean(
          isTrue = isTrue,
          unknownFields = unknownFields
        )
      }

      override fun redact(`value`: TrueBoolean): TrueBoolean = value.copy(
        unknownFields = ByteString.EMPTY
      )
    }

    private const val serialVersionUID: Long = 0L
  }
}
