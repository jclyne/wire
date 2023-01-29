// Code generated by Wire protocol buffer compiler, do not edit.
// Source: squareup.proto3.AllWrappers in all_wrappers.proto
package squareup.proto3;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.Syntax;
import com.squareup.wire.WireField;
import com.squareup.wire.internal.Internal;
import java.lang.Boolean;
import java.lang.Double;
import java.lang.Float;
import java.lang.Integer;
import java.lang.Long;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.List;
import java.util.Map;
import okio.ByteString;

public final class AllWrappers extends Message<AllWrappers, AllWrappers.Builder> {
  public static final ProtoAdapter<AllWrappers> ADAPTER = ProtoAdapter.newMessageAdapter(
    AllWrappers.class,
    "type.googleapis.com/squareup.proto3.AllWrappers",
    Syntax.PROTO_3,
    AllWrappers.class.getClassLoader()
  );

  private static final long serialVersionUID = 0L;

  @WireField(
      tag = 1,
      adapter = "com.squareup.wire.ProtoAdapter#DOUBLE_VALUE",
      jsonName = "doubleValue"
  )
  public final Double double_value;

  @WireField(
      tag = 2,
      adapter = "com.squareup.wire.ProtoAdapter#FLOAT_VALUE",
      jsonName = "floatValue"
  )
  public final Float float_value;

  @WireField(
      tag = 3,
      adapter = "com.squareup.wire.ProtoAdapter#INT64_VALUE",
      jsonName = "int64Value"
  )
  public final Long int64_value;

  @WireField(
      tag = 4,
      adapter = "com.squareup.wire.ProtoAdapter#UINT64_VALUE",
      jsonName = "uint64Value"
  )
  public final Long uint64_value;

  @WireField(
      tag = 5,
      adapter = "com.squareup.wire.ProtoAdapter#INT32_VALUE",
      jsonName = "int32Value"
  )
  public final Integer int32_value;

  @WireField(
      tag = 6,
      adapter = "com.squareup.wire.ProtoAdapter#UINT32_VALUE",
      jsonName = "uint32Value"
  )
  public final Integer uint32_value;

  @WireField(
      tag = 7,
      adapter = "com.squareup.wire.ProtoAdapter#BOOL_VALUE",
      jsonName = "boolValue"
  )
  public final Boolean bool_value;

  @WireField(
      tag = 8,
      adapter = "com.squareup.wire.ProtoAdapter#STRING_VALUE",
      jsonName = "stringValue"
  )
  public final String string_value;

  @WireField(
      tag = 9,
      adapter = "com.squareup.wire.ProtoAdapter#BYTES_VALUE",
      jsonName = "bytesValue"
  )
  public final ByteString bytes_value;

  @WireField(
      tag = 101,
      adapter = "com.squareup.wire.ProtoAdapter#DOUBLE_VALUE",
      label = WireField.Label.REPEATED,
      jsonName = "repDoubleValue"
  )
  public final List<Double> rep_double_value;

  @WireField(
      tag = 102,
      adapter = "com.squareup.wire.ProtoAdapter#FLOAT_VALUE",
      label = WireField.Label.REPEATED,
      jsonName = "repFloatValue"
  )
  public final List<Float> rep_float_value;

  @WireField(
      tag = 103,
      adapter = "com.squareup.wire.ProtoAdapter#INT64_VALUE",
      label = WireField.Label.REPEATED,
      jsonName = "repInt64Value"
  )
  public final List<Long> rep_int64_value;

  @WireField(
      tag = 104,
      adapter = "com.squareup.wire.ProtoAdapter#UINT64_VALUE",
      label = WireField.Label.REPEATED,
      jsonName = "repUint64Value"
  )
  public final List<Long> rep_uint64_value;

  @WireField(
      tag = 105,
      adapter = "com.squareup.wire.ProtoAdapter#INT32_VALUE",
      label = WireField.Label.REPEATED,
      jsonName = "repInt32Value"
  )
  public final List<Integer> rep_int32_value;

  @WireField(
      tag = 106,
      adapter = "com.squareup.wire.ProtoAdapter#UINT32_VALUE",
      label = WireField.Label.REPEATED,
      jsonName = "repUint32Value"
  )
  public final List<Integer> rep_uint32_value;

  @WireField(
      tag = 107,
      adapter = "com.squareup.wire.ProtoAdapter#BOOL_VALUE",
      label = WireField.Label.REPEATED,
      jsonName = "repBoolValue"
  )
  public final List<Boolean> rep_bool_value;

  @WireField(
      tag = 108,
      adapter = "com.squareup.wire.ProtoAdapter#STRING_VALUE",
      label = WireField.Label.REPEATED,
      jsonName = "repStringValue"
  )
  public final List<String> rep_string_value;

  @WireField(
      tag = 109,
      adapter = "com.squareup.wire.ProtoAdapter#BYTES_VALUE",
      label = WireField.Label.REPEATED,
      jsonName = "repBytesValue"
  )
  public final List<ByteString> rep_bytes_value;

  @WireField(
      tag = 301,
      keyAdapter = "com.squareup.wire.ProtoAdapter#INT32",
      adapter = "com.squareup.wire.ProtoAdapter#DOUBLE_VALUE",
      jsonName = "mapInt32DoubleValue"
  )
  public final Map<Integer, Double> map_int32_double_value;

  @WireField(
      tag = 302,
      keyAdapter = "com.squareup.wire.ProtoAdapter#INT32",
      adapter = "com.squareup.wire.ProtoAdapter#FLOAT_VALUE",
      jsonName = "mapInt32FloatValue"
  )
  public final Map<Integer, Float> map_int32_float_value;

  @WireField(
      tag = 303,
      keyAdapter = "com.squareup.wire.ProtoAdapter#INT32",
      adapter = "com.squareup.wire.ProtoAdapter#INT64_VALUE",
      jsonName = "mapInt32Int64Value"
  )
  public final Map<Integer, Long> map_int32_int64_value;

  @WireField(
      tag = 304,
      keyAdapter = "com.squareup.wire.ProtoAdapter#INT32",
      adapter = "com.squareup.wire.ProtoAdapter#UINT64_VALUE",
      jsonName = "mapInt32Uint64Value"
  )
  public final Map<Integer, Long> map_int32_uint64_value;

  @WireField(
      tag = 305,
      keyAdapter = "com.squareup.wire.ProtoAdapter#INT32",
      adapter = "com.squareup.wire.ProtoAdapter#INT32_VALUE",
      jsonName = "mapInt32Int32Value"
  )
  public final Map<Integer, Integer> map_int32_int32_value;

  @WireField(
      tag = 306,
      keyAdapter = "com.squareup.wire.ProtoAdapter#INT32",
      adapter = "com.squareup.wire.ProtoAdapter#UINT32_VALUE",
      jsonName = "mapInt32Uint32Value"
  )
  public final Map<Integer, Integer> map_int32_uint32_value;

  @WireField(
      tag = 307,
      keyAdapter = "com.squareup.wire.ProtoAdapter#INT32",
      adapter = "com.squareup.wire.ProtoAdapter#BOOL_VALUE",
      jsonName = "mapInt32BoolValue"
  )
  public final Map<Integer, Boolean> map_int32_bool_value;

  @WireField(
      tag = 308,
      keyAdapter = "com.squareup.wire.ProtoAdapter#INT32",
      adapter = "com.squareup.wire.ProtoAdapter#STRING_VALUE",
      jsonName = "mapInt32StringValue"
  )
  public final Map<Integer, String> map_int32_string_value;

  @WireField(
      tag = 309,
      keyAdapter = "com.squareup.wire.ProtoAdapter#INT32",
      adapter = "com.squareup.wire.ProtoAdapter#BYTES_VALUE",
      jsonName = "mapInt32BytesValue"
  )
  public final Map<Integer, ByteString> map_int32_bytes_value;

  public AllWrappers(Builder builder, ByteString unknownFields) {
    super(ADAPTER, unknownFields);
    this.double_value = builder.double_value;
    this.float_value = builder.float_value;
    this.int64_value = builder.int64_value;
    this.uint64_value = builder.uint64_value;
    this.int32_value = builder.int32_value;
    this.uint32_value = builder.uint32_value;
    this.bool_value = builder.bool_value;
    this.string_value = builder.string_value;
    this.bytes_value = builder.bytes_value;
    this.rep_double_value = Internal.immutableCopyOf("rep_double_value", builder.rep_double_value);
    this.rep_float_value = Internal.immutableCopyOf("rep_float_value", builder.rep_float_value);
    this.rep_int64_value = Internal.immutableCopyOf("rep_int64_value", builder.rep_int64_value);
    this.rep_uint64_value = Internal.immutableCopyOf("rep_uint64_value", builder.rep_uint64_value);
    this.rep_int32_value = Internal.immutableCopyOf("rep_int32_value", builder.rep_int32_value);
    this.rep_uint32_value = Internal.immutableCopyOf("rep_uint32_value", builder.rep_uint32_value);
    this.rep_bool_value = Internal.immutableCopyOf("rep_bool_value", builder.rep_bool_value);
    this.rep_string_value = Internal.immutableCopyOf("rep_string_value", builder.rep_string_value);
    this.rep_bytes_value = Internal.immutableCopyOf("rep_bytes_value", builder.rep_bytes_value);
    this.map_int32_double_value = Internal.immutableCopyOf("map_int32_double_value", builder.map_int32_double_value);
    this.map_int32_float_value = Internal.immutableCopyOf("map_int32_float_value", builder.map_int32_float_value);
    this.map_int32_int64_value = Internal.immutableCopyOf("map_int32_int64_value", builder.map_int32_int64_value);
    this.map_int32_uint64_value = Internal.immutableCopyOf("map_int32_uint64_value", builder.map_int32_uint64_value);
    this.map_int32_int32_value = Internal.immutableCopyOf("map_int32_int32_value", builder.map_int32_int32_value);
    this.map_int32_uint32_value = Internal.immutableCopyOf("map_int32_uint32_value", builder.map_int32_uint32_value);
    this.map_int32_bool_value = Internal.immutableCopyOf("map_int32_bool_value", builder.map_int32_bool_value);
    this.map_int32_string_value = Internal.immutableCopyOf("map_int32_string_value", builder.map_int32_string_value);
    this.map_int32_bytes_value = Internal.immutableCopyOf("map_int32_bytes_value", builder.map_int32_bytes_value);
  }

  @Override
  public Builder newBuilder() {
    Builder builder = new Builder();
    builder.double_value = double_value;
    builder.float_value = float_value;
    builder.int64_value = int64_value;
    builder.uint64_value = uint64_value;
    builder.int32_value = int32_value;
    builder.uint32_value = uint32_value;
    builder.bool_value = bool_value;
    builder.string_value = string_value;
    builder.bytes_value = bytes_value;
    builder.rep_double_value = Internal.copyOf(rep_double_value);
    builder.rep_float_value = Internal.copyOf(rep_float_value);
    builder.rep_int64_value = Internal.copyOf(rep_int64_value);
    builder.rep_uint64_value = Internal.copyOf(rep_uint64_value);
    builder.rep_int32_value = Internal.copyOf(rep_int32_value);
    builder.rep_uint32_value = Internal.copyOf(rep_uint32_value);
    builder.rep_bool_value = Internal.copyOf(rep_bool_value);
    builder.rep_string_value = Internal.copyOf(rep_string_value);
    builder.rep_bytes_value = Internal.copyOf(rep_bytes_value);
    builder.map_int32_double_value = Internal.copyOf(map_int32_double_value);
    builder.map_int32_float_value = Internal.copyOf(map_int32_float_value);
    builder.map_int32_int64_value = Internal.copyOf(map_int32_int64_value);
    builder.map_int32_uint64_value = Internal.copyOf(map_int32_uint64_value);
    builder.map_int32_int32_value = Internal.copyOf(map_int32_int32_value);
    builder.map_int32_uint32_value = Internal.copyOf(map_int32_uint32_value);
    builder.map_int32_bool_value = Internal.copyOf(map_int32_bool_value);
    builder.map_int32_string_value = Internal.copyOf(map_int32_string_value);
    builder.map_int32_bytes_value = Internal.copyOf(map_int32_bytes_value);
    builder.addUnknownFields(unknownFields());
    return builder;
  }

  @Override
  public boolean equals(Object other) {
    if (other == this) return true;
    if (!(other instanceof AllWrappers)) return false;
    AllWrappers o = (AllWrappers) other;
    return unknownFields().equals(o.unknownFields())
        && Internal.equals(double_value, o.double_value)
        && Internal.equals(float_value, o.float_value)
        && Internal.equals(int64_value, o.int64_value)
        && Internal.equals(uint64_value, o.uint64_value)
        && Internal.equals(int32_value, o.int32_value)
        && Internal.equals(uint32_value, o.uint32_value)
        && Internal.equals(bool_value, o.bool_value)
        && Internal.equals(string_value, o.string_value)
        && Internal.equals(bytes_value, o.bytes_value)
        && rep_double_value.equals(o.rep_double_value)
        && rep_float_value.equals(o.rep_float_value)
        && rep_int64_value.equals(o.rep_int64_value)
        && rep_uint64_value.equals(o.rep_uint64_value)
        && rep_int32_value.equals(o.rep_int32_value)
        && rep_uint32_value.equals(o.rep_uint32_value)
        && rep_bool_value.equals(o.rep_bool_value)
        && rep_string_value.equals(o.rep_string_value)
        && rep_bytes_value.equals(o.rep_bytes_value)
        && map_int32_double_value.equals(o.map_int32_double_value)
        && map_int32_float_value.equals(o.map_int32_float_value)
        && map_int32_int64_value.equals(o.map_int32_int64_value)
        && map_int32_uint64_value.equals(o.map_int32_uint64_value)
        && map_int32_int32_value.equals(o.map_int32_int32_value)
        && map_int32_uint32_value.equals(o.map_int32_uint32_value)
        && map_int32_bool_value.equals(o.map_int32_bool_value)
        && map_int32_string_value.equals(o.map_int32_string_value)
        && map_int32_bytes_value.equals(o.map_int32_bytes_value);
  }

  @Override
  public int hashCode() {
    int result = super.hashCode;
    if (result == 0) {
      result = unknownFields().hashCode();
      result = result * 37 + (double_value != null ? double_value.hashCode() : 0);
      result = result * 37 + (float_value != null ? float_value.hashCode() : 0);
      result = result * 37 + (int64_value != null ? int64_value.hashCode() : 0);
      result = result * 37 + (uint64_value != null ? uint64_value.hashCode() : 0);
      result = result * 37 + (int32_value != null ? int32_value.hashCode() : 0);
      result = result * 37 + (uint32_value != null ? uint32_value.hashCode() : 0);
      result = result * 37 + (bool_value != null ? bool_value.hashCode() : 0);
      result = result * 37 + (string_value != null ? string_value.hashCode() : 0);
      result = result * 37 + (bytes_value != null ? bytes_value.hashCode() : 0);
      result = result * 37 + rep_double_value.hashCode();
      result = result * 37 + rep_float_value.hashCode();
      result = result * 37 + rep_int64_value.hashCode();
      result = result * 37 + rep_uint64_value.hashCode();
      result = result * 37 + rep_int32_value.hashCode();
      result = result * 37 + rep_uint32_value.hashCode();
      result = result * 37 + rep_bool_value.hashCode();
      result = result * 37 + rep_string_value.hashCode();
      result = result * 37 + rep_bytes_value.hashCode();
      result = result * 37 + map_int32_double_value.hashCode();
      result = result * 37 + map_int32_float_value.hashCode();
      result = result * 37 + map_int32_int64_value.hashCode();
      result = result * 37 + map_int32_uint64_value.hashCode();
      result = result * 37 + map_int32_int32_value.hashCode();
      result = result * 37 + map_int32_uint32_value.hashCode();
      result = result * 37 + map_int32_bool_value.hashCode();
      result = result * 37 + map_int32_string_value.hashCode();
      result = result * 37 + map_int32_bytes_value.hashCode();
      super.hashCode = result;
    }
    return result;
  }

  public static final class Builder extends Message.Builder<AllWrappers, Builder> {
    public Double double_value;

    public Float float_value;

    public Long int64_value;

    public Long uint64_value;

    public Integer int32_value;

    public Integer uint32_value;

    public Boolean bool_value;

    public String string_value;

    public ByteString bytes_value;

    public List<Double> rep_double_value;

    public List<Float> rep_float_value;

    public List<Long> rep_int64_value;

    public List<Long> rep_uint64_value;

    public List<Integer> rep_int32_value;

    public List<Integer> rep_uint32_value;

    public List<Boolean> rep_bool_value;

    public List<String> rep_string_value;

    public List<ByteString> rep_bytes_value;

    public Map<Integer, Double> map_int32_double_value;

    public Map<Integer, Float> map_int32_float_value;

    public Map<Integer, Long> map_int32_int64_value;

    public Map<Integer, Long> map_int32_uint64_value;

    public Map<Integer, Integer> map_int32_int32_value;

    public Map<Integer, Integer> map_int32_uint32_value;

    public Map<Integer, Boolean> map_int32_bool_value;

    public Map<Integer, String> map_int32_string_value;

    public Map<Integer, ByteString> map_int32_bytes_value;

    public Builder() {
      rep_double_value = Internal.newMutableList();
      rep_float_value = Internal.newMutableList();
      rep_int64_value = Internal.newMutableList();
      rep_uint64_value = Internal.newMutableList();
      rep_int32_value = Internal.newMutableList();
      rep_uint32_value = Internal.newMutableList();
      rep_bool_value = Internal.newMutableList();
      rep_string_value = Internal.newMutableList();
      rep_bytes_value = Internal.newMutableList();
      map_int32_double_value = Internal.newMutableMap();
      map_int32_float_value = Internal.newMutableMap();
      map_int32_int64_value = Internal.newMutableMap();
      map_int32_uint64_value = Internal.newMutableMap();
      map_int32_int32_value = Internal.newMutableMap();
      map_int32_uint32_value = Internal.newMutableMap();
      map_int32_bool_value = Internal.newMutableMap();
      map_int32_string_value = Internal.newMutableMap();
      map_int32_bytes_value = Internal.newMutableMap();
    }

    public Builder double_value(Double double_value) {
      this.double_value = double_value;
      return this;
    }

    public Builder float_value(Float float_value) {
      this.float_value = float_value;
      return this;
    }

    public Builder int64_value(Long int64_value) {
      this.int64_value = int64_value;
      return this;
    }

    public Builder uint64_value(Long uint64_value) {
      this.uint64_value = uint64_value;
      return this;
    }

    public Builder int32_value(Integer int32_value) {
      this.int32_value = int32_value;
      return this;
    }

    public Builder uint32_value(Integer uint32_value) {
      this.uint32_value = uint32_value;
      return this;
    }

    public Builder bool_value(Boolean bool_value) {
      this.bool_value = bool_value;
      return this;
    }

    public Builder string_value(String string_value) {
      this.string_value = string_value;
      return this;
    }

    public Builder bytes_value(ByteString bytes_value) {
      this.bytes_value = bytes_value;
      return this;
    }

    public Builder rep_double_value(List<Double> rep_double_value) {
      Internal.checkElementsNotNull(rep_double_value);
      this.rep_double_value = rep_double_value;
      return this;
    }

    public Builder rep_float_value(List<Float> rep_float_value) {
      Internal.checkElementsNotNull(rep_float_value);
      this.rep_float_value = rep_float_value;
      return this;
    }

    public Builder rep_int64_value(List<Long> rep_int64_value) {
      Internal.checkElementsNotNull(rep_int64_value);
      this.rep_int64_value = rep_int64_value;
      return this;
    }

    public Builder rep_uint64_value(List<Long> rep_uint64_value) {
      Internal.checkElementsNotNull(rep_uint64_value);
      this.rep_uint64_value = rep_uint64_value;
      return this;
    }

    public Builder rep_int32_value(List<Integer> rep_int32_value) {
      Internal.checkElementsNotNull(rep_int32_value);
      this.rep_int32_value = rep_int32_value;
      return this;
    }

    public Builder rep_uint32_value(List<Integer> rep_uint32_value) {
      Internal.checkElementsNotNull(rep_uint32_value);
      this.rep_uint32_value = rep_uint32_value;
      return this;
    }

    public Builder rep_bool_value(List<Boolean> rep_bool_value) {
      Internal.checkElementsNotNull(rep_bool_value);
      this.rep_bool_value = rep_bool_value;
      return this;
    }

    public Builder rep_string_value(List<String> rep_string_value) {
      Internal.checkElementsNotNull(rep_string_value);
      this.rep_string_value = rep_string_value;
      return this;
    }

    public Builder rep_bytes_value(List<ByteString> rep_bytes_value) {
      Internal.checkElementsNotNull(rep_bytes_value);
      this.rep_bytes_value = rep_bytes_value;
      return this;
    }

    public Builder map_int32_double_value(Map<Integer, Double> map_int32_double_value) {
      Internal.checkElementsNotNull(map_int32_double_value);
      this.map_int32_double_value = map_int32_double_value;
      return this;
    }

    public Builder map_int32_float_value(Map<Integer, Float> map_int32_float_value) {
      Internal.checkElementsNotNull(map_int32_float_value);
      this.map_int32_float_value = map_int32_float_value;
      return this;
    }

    public Builder map_int32_int64_value(Map<Integer, Long> map_int32_int64_value) {
      Internal.checkElementsNotNull(map_int32_int64_value);
      this.map_int32_int64_value = map_int32_int64_value;
      return this;
    }

    public Builder map_int32_uint64_value(Map<Integer, Long> map_int32_uint64_value) {
      Internal.checkElementsNotNull(map_int32_uint64_value);
      this.map_int32_uint64_value = map_int32_uint64_value;
      return this;
    }

    public Builder map_int32_int32_value(Map<Integer, Integer> map_int32_int32_value) {
      Internal.checkElementsNotNull(map_int32_int32_value);
      this.map_int32_int32_value = map_int32_int32_value;
      return this;
    }

    public Builder map_int32_uint32_value(Map<Integer, Integer> map_int32_uint32_value) {
      Internal.checkElementsNotNull(map_int32_uint32_value);
      this.map_int32_uint32_value = map_int32_uint32_value;
      return this;
    }

    public Builder map_int32_bool_value(Map<Integer, Boolean> map_int32_bool_value) {
      Internal.checkElementsNotNull(map_int32_bool_value);
      this.map_int32_bool_value = map_int32_bool_value;
      return this;
    }

    public Builder map_int32_string_value(Map<Integer, String> map_int32_string_value) {
      Internal.checkElementsNotNull(map_int32_string_value);
      this.map_int32_string_value = map_int32_string_value;
      return this;
    }

    public Builder map_int32_bytes_value(Map<Integer, ByteString> map_int32_bytes_value) {
      Internal.checkElementsNotNull(map_int32_bytes_value);
      this.map_int32_bytes_value = map_int32_bytes_value;
      return this;
    }

    @Override
    public AllWrappers build() {
      return new AllWrappers(this, super.buildUnknownFields());
    }
  }
}
