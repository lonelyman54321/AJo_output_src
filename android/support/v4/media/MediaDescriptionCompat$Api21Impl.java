/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.graphics.Bitmap
 *  android.media.MediaDescription
 *  android.media.MediaDescription$Builder
 *  android.net.Uri
 *  android.os.Bundle
 */
package android.support.v4.media;

import android.graphics.Bitmap;
import android.media.MediaDescription;
import android.net.Uri;
import android.os.Bundle;

class MediaDescriptionCompat$Api21Impl {
    private MediaDescriptionCompat$Api21Impl() {
    }

    public static MediaDescription build(MediaDescription.Builder builder) {
        return builder.build();
    }

    public static MediaDescription.Builder createBuilder() {
        MediaDescription.Builder builder = new MediaDescription.Builder();
        return builder;
    }

    public static CharSequence getDescription(MediaDescription mediaDescription) {
        return mediaDescription.getDescription();
    }

    public static Bundle getExtras(MediaDescription mediaDescription) {
        return mediaDescription.getExtras();
    }

    public static Bitmap getIconBitmap(MediaDescription mediaDescription) {
        return mediaDescription.getIconBitmap();
    }

    public static Uri getIconUri(MediaDescription mediaDescription) {
        return mediaDescription.getIconUri();
    }

    public static String getMediaId(MediaDescription mediaDescription) {
        return mediaDescription.getMediaId();
    }

    public static CharSequence getSubtitle(MediaDescription mediaDescription) {
        return mediaDescription.getSubtitle();
    }

    public static CharSequence getTitle(MediaDescription mediaDescription) {
        return mediaDescription.getTitle();
    }

    public static void setDescription(MediaDescription.Builder builder, CharSequence charSequence) {
        builder.setDescription(charSequence);
    }

    public static void setExtras(MediaDescription.Builder builder, Bundle bundle) {
        builder.setExtras(bundle);
    }

    public static void setIconBitmap(MediaDescription.Builder builder, Bitmap bitmap) {
        builder.setIconBitmap(bitmap);
    }

    public static void setIconUri(MediaDescription.Builder builder, Uri uri) {
        builder.setIconUri(uri);
    }

    public static void setMediaId(MediaDescription.Builder builder, String string2) {
        builder.setMediaId(string2);
    }

    public static void setSubtitle(MediaDescription.Builder builder, CharSequence charSequence) {
        builder.setSubtitle(charSequence);
    }

    public static void setTitle(MediaDescription.Builder builder, CharSequence charSequence) {
        builder.setTitle(charSequence);
    }
}

