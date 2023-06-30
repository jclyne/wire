// Code generated by Wire protocol buffer compiler, do not edit.
// Source: routeguide.RouteSummary in routeguide/RouteGuideProto.proto
package routeguide

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
 * A RouteSummary is received in response to a RecordRoute rpc.
 *
 * It contains the number of individual points received, the number of
 * detected features, and the total distance covered as the cumulative sum of
 * the distance between each point.
 */
public class RouteSummary(
  /**
   * The number of points received.
   */
  @field:WireField(
    tag = 1,
    adapter = "com.squareup.wire.ProtoAdapter#INT32",
    schemaIndex = 0,
  )
  public val point_count: Int? = null,
  /**
   * The number of known features passed while traversing the route.
   */
  @field:WireField(
    tag = 2,
    adapter = "com.squareup.wire.ProtoAdapter#INT32",
    schemaIndex = 1,
  )
  public val feature_count: Int? = null,
  /**
   * The distance covered in metres.
   */
  @field:WireField(
    tag = 3,
    adapter = "com.squareup.wire.ProtoAdapter#INT32",
    schemaIndex = 2,
  )
  public val distance: Int? = null,
  /**
   * The duration of the traversal in seconds.
   */
  @field:WireField(
    tag = 4,
    adapter = "com.squareup.wire.ProtoAdapter#INT32",
    schemaIndex = 3,
  )
  public val elapsed_time: Int? = null,
  unknownFields: ByteString = ByteString.EMPTY,
) : Message<RouteSummary, Nothing>(ADAPTER, unknownFields) {
  @Deprecated(
    message = "Shouldn't be used in Kotlin",
    level = DeprecationLevel.HIDDEN,
  )
  override fun newBuilder(): Nothing = throw
      AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin")

  override fun equals(other: Any?): Boolean {
    if (other === this) return true
    if (other !is RouteSummary) return false
    if (unknownFields != other.unknownFields) return false
    if (point_count != other.point_count) return false
    if (feature_count != other.feature_count) return false
    if (distance != other.distance) return false
    if (elapsed_time != other.elapsed_time) return false
    return true
  }

  override fun hashCode(): Int {
    var result = super.hashCode
    if (result == 0) {
      result = unknownFields.hashCode()
      result = result * 37 + (point_count?.hashCode() ?: 0)
      result = result * 37 + (feature_count?.hashCode() ?: 0)
      result = result * 37 + (distance?.hashCode() ?: 0)
      result = result * 37 + (elapsed_time?.hashCode() ?: 0)
      super.hashCode = result
    }
    return result
  }

  override fun toString(): String {
    val result = mutableListOf<String>()
    if (point_count != null) result += """point_count=$point_count"""
    if (feature_count != null) result += """feature_count=$feature_count"""
    if (distance != null) result += """distance=$distance"""
    if (elapsed_time != null) result += """elapsed_time=$elapsed_time"""
    return result.joinToString(prefix = "RouteSummary{", separator = ", ", postfix = "}")
  }

  public fun copy(
    point_count: Int? = this.point_count,
    feature_count: Int? = this.feature_count,
    distance: Int? = this.distance,
    elapsed_time: Int? = this.elapsed_time,
    unknownFields: ByteString = this.unknownFields,
  ): RouteSummary = RouteSummary(point_count, feature_count, distance, elapsed_time, unknownFields)

  public companion object {
    @JvmField
    public val ADAPTER: ProtoAdapter<RouteSummary> = object : ProtoAdapter<RouteSummary>(
      FieldEncoding.LENGTH_DELIMITED, 
      RouteSummary::class, 
      "type.googleapis.com/routeguide.RouteSummary", 
      PROTO_2, 
      null, 
      "routeguide/RouteGuideProto.proto"
    ) {
      override fun encodedSize(`value`: RouteSummary): Int {
        var size = value.unknownFields.size
        size += ProtoAdapter.INT32.encodedSizeWithTag(1, value.point_count)
        size += ProtoAdapter.INT32.encodedSizeWithTag(2, value.feature_count)
        size += ProtoAdapter.INT32.encodedSizeWithTag(3, value.distance)
        size += ProtoAdapter.INT32.encodedSizeWithTag(4, value.elapsed_time)
        return size
      }

      override fun encode(writer: ProtoWriter, `value`: RouteSummary) {
        ProtoAdapter.INT32.encodeWithTag(writer, 1, value.point_count)
        ProtoAdapter.INT32.encodeWithTag(writer, 2, value.feature_count)
        ProtoAdapter.INT32.encodeWithTag(writer, 3, value.distance)
        ProtoAdapter.INT32.encodeWithTag(writer, 4, value.elapsed_time)
        writer.writeBytes(value.unknownFields)
      }

      override fun encode(writer: ReverseProtoWriter, `value`: RouteSummary) {
        writer.writeBytes(value.unknownFields)
        ProtoAdapter.INT32.encodeWithTag(writer, 4, value.elapsed_time)
        ProtoAdapter.INT32.encodeWithTag(writer, 3, value.distance)
        ProtoAdapter.INT32.encodeWithTag(writer, 2, value.feature_count)
        ProtoAdapter.INT32.encodeWithTag(writer, 1, value.point_count)
      }

      override fun decode(reader: ProtoReader): RouteSummary {
        var point_count: Int? = null
        var feature_count: Int? = null
        var distance: Int? = null
        var elapsed_time: Int? = null
        val unknownFields = reader.forEachTag { tag ->
          when (tag) {
            1 -> point_count = ProtoAdapter.INT32.decode(reader)
            2 -> feature_count = ProtoAdapter.INT32.decode(reader)
            3 -> distance = ProtoAdapter.INT32.decode(reader)
            4 -> elapsed_time = ProtoAdapter.INT32.decode(reader)
            else -> reader.readUnknownField(tag)
          }
        }
        return RouteSummary(
          point_count = point_count,
          feature_count = feature_count,
          distance = distance,
          elapsed_time = elapsed_time,
          unknownFields = unknownFields
        )
      }

      override fun redact(`value`: RouteSummary): RouteSummary = value.copy(
        unknownFields = ByteString.EMPTY
      )
    }

    private const val serialVersionUID: Long = 0L
  }
}
