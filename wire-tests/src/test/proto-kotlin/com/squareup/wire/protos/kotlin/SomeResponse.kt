// Code generated by Wire protocol buffer compiler, do not edit.
// Source file: service_kotlin.proto
package com.squareup.wire.protos.kotlin

import com.squareup.wire.FieldEncoding
import com.squareup.wire.Message
import com.squareup.wire.ProtoAdapter
import com.squareup.wire.ProtoReader
import com.squareup.wire.ProtoWriter
import com.squareup.wire.TagHandler
import kotlin.Deprecated
import kotlin.DeprecationLevel
import kotlin.Int
import kotlin.jvm.JvmField
import okio.ByteString

data class SomeResponse(val unknownFields: ByteString = ByteString.EMPTY) : Message<SomeResponse,
        SomeResponse.Builder>(ADAPTER, unknownFields) {
    @Deprecated(
            message = "Shouldn't be used in Kotlin",
            level = DeprecationLevel.HIDDEN
    )
    override fun newBuilder(): Builder = Builder(this.copy())

    class Builder(private val message: SomeResponse) : Message.Builder<SomeResponse, Builder>() {
        override fun build(): SomeResponse = message
    }

    companion object {
        @JvmField
        val ADAPTER: ProtoAdapter<SomeResponse> = object : ProtoAdapter<SomeResponse>(
            FieldEncoding.LENGTH_DELIMITED, 
            SomeResponse::class.java
        ) {
            override fun encodedSize(value: SomeResponse): Int = 
                value.unknownFields.size

            override fun encode(writer: ProtoWriter, value: SomeResponse) {
                writer.writeBytes(value.unknownFields)
            }

            override fun decode(reader: ProtoReader): SomeResponse {
                val unknownFields = reader.forEachTag { tag ->
                    when (tag) {
                        else -> TagHandler.UNKNOWN_TAG
                    }
                }
                return SomeResponse(
                    unknownFields = unknownFields
                )
            }
        }
    }
}