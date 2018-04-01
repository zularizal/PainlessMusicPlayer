/*
 * Copyright (C) 2017 Yaroslav Mytkalyk
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.doctoror.fuckoffmusicplayer.domain.artists

import android.database.Cursor

import io.reactivex.Observable

/**
 * "Artists" provider
 */
interface ArtistsProvider {

    fun load(searchFilter: String?): Observable<Cursor>

    companion object {

        const val COLUMN_ID = 0
        const val COLUMN_NUMBER_OF_ALBUMS = 1
        const val COLUMN_ARTIST = 2
    }
}