/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.media.MediaDescription
 *  android.media.browse.MediaBrowser$MediaItem
 */
package android.support.v4.media;

import android.media.MediaDescription;
import android.media.browse.MediaBrowser;

class MediaBrowserCompat$Api21Impl {
    private MediaBrowserCompat$Api21Impl() {
    }

    public static MediaDescription getDescription(MediaBrowser.MediaItem mediaItem) {
        return mediaItem.getDescription();
    }

    public static int getFlags(MediaBrowser.MediaItem mediaItem) {
        return mediaItem.getFlags();
    }
}

