/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.media.MediaDescription
 *  android.media.MediaDescription$Builder
 *  android.net.Uri
 */
package android.support.v4.media;

import android.media.MediaDescription;
import android.net.Uri;

class MediaDescriptionCompat$Api23Impl {
    private MediaDescriptionCompat$Api23Impl() {
    }

    public static Uri getMediaUri(MediaDescription mediaDescription) {
        return gm1_1.a(mediaDescription);
    }

    public static void setMediaUri(MediaDescription.Builder builder, Uri uri) {
        fm1_0.a(builder, uri);
    }
}

