/*
 * Copyright (C) 2020 Square, Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.squareup.wire.schema

import okio.Path

class ClaimedPaths {
  private val paths = mutableMapOf<Path, String>()

  fun claim(path: Path, type: Type) {
    val existingEntry = paths.putIfAbsent(path, type.asErrorMessage())
    if (existingEntry != null) {
      throw IllegalStateException("Same type is getting generated by different messages:\n" +
        "  ${existingEntry}\n" +
        "  ${type.asErrorMessage()}")
    }
  }

  fun claim(path: Path, service: Service) {
    val existingEntry = paths.putIfAbsent(path, service.asErrorMessage())
    if (existingEntry != null) {
      throw IllegalStateException("Same file is getting generated by different services:\n" +
        "  ${existingEntry}\n" +
        "  ${service.asErrorMessage()}")
    }
  }

  private fun Type.asErrorMessage(): String = "${type.simpleName} at $location"
  private fun Service.asErrorMessage(): String = "${type.simpleName} at $location"
}
