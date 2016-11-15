/*
 * Copyright (C) 2016 Yaroslav Mytkalyk
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
package com.doctoror.fuckoffmusicplayer.playlist;

import android.annotation.SuppressLint;
import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * Created by Yaroslav Mytkalyk on 21.10.16.
 */

public final class PlaylistHolder {

    // Is not a leak since it's an application context
    @SuppressLint("StaticFieldLeak")
    private static volatile PlaylistHolder sInstance;

    @NonNull
    public static PlaylistHolder getInstance(@NonNull final Context context) {
        if (sInstance == null) {
            synchronized (PlaylistHolder.class) {
                if (sInstance == null) {
                    sInstance = new PlaylistHolder(context.getApplicationContext());
                }
            }
        }
        return sInstance;
    }

    private final List<PlaylistObserver> mObservers = new LinkedList<>();

    @NonNull
    private final Context mContext;

    List<Media> playlist;
    int index;
    Media media;
    long position;

    private PlaylistHolder(@NonNull final Context context) {
        mContext = context;
        PlaylistPersister.read(context, this);
    }

    void remove(@NonNull final Media media) {
        if (playlist != null) {
            if (playlist.remove(media)) {
                if (media.equals(this.media)) {
                    this.media = null;
                }
                notifyMediaRemoved(media);
            }
        }
    }

    @Nullable
    public List<Media> getPlaylist() {
        return playlist == null ? null : new ArrayList<>(playlist);
    }

    public int getIndex() {
        return index;
    }

    @Nullable
    public Media getMedia() {
        return media;
    }

    public long getPosition() {
        return position;
    }

    public void setPlaylist(@Nullable final List<Media> playlist) {
        this.playlist = playlist;
    }

    public void setIndex(final int index) {
        this.index = index;
    }

    public void persistAsync() {
        PlaylistPersister.persistAsync(mContext, this);
    }

    public void setMedia(final Media media) {
        if (this.media == null || !this.media.equals(media)) {
            this.media = media;
            notifyMediaChanged(media);
        }
    }

    public void setPosition(final long position) {
        this.position = position;
        notifyPositionChanged(position);
    }

    public void addObserver(@NonNull final PlaylistObserver observer) {
        mObservers.add(observer);
    }

    public void deleteObserver(@NonNull final PlaylistObserver observer) {
        mObservers.remove(observer);
    }

    private void notifyMediaChanged(final Media media) {
        for (final PlaylistObserver observer : mObservers) {
            observer.onMediaChanged(media);
        }
    }

    private void notifyPositionChanged(final long position) {
        for (final PlaylistObserver observer : mObservers) {
            observer.onPositionChanged(position);
        }
    }

    private void notifyMediaRemoved(@NonNull final Media media) {
        for (final PlaylistObserver observer : mObservers) {
            observer.onMediaRemoved(media);
        }
    }

    public interface PlaylistObserver {

        void onPositionChanged(long position);

        void onMediaChanged(Media media);

        void onMediaRemoved(Media media);
    }
}