/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.graphics.Bitmap
 *  android.media.MediaDescription
 *  android.media.MediaDescription$Builder
 *  android.net.Uri
 *  android.os.Build$VERSION
 *  android.os.Bundle
 *  android.os.Parcel
 *  android.os.Parcelable
 *  android.os.Parcelable$Creator
 *  android.text.TextUtils
 */
package android.support.v4.media;

import android.graphics.Bitmap;
import android.media.MediaDescription;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.support.v4.media.MediaDescriptionCompat$1;
import android.support.v4.media.MediaDescriptionCompat$Api21Impl;
import android.support.v4.media.MediaDescriptionCompat$Api23Impl;
import android.support.v4.media.MediaDescriptionCompat$Builder;
import android.support.v4.media.session.MediaSessionCompat;
import android.text.TextUtils;

public final class MediaDescriptionCompat
implements Parcelable {
    public static final long BT_FOLDER_TYPE_ALBUMS = 2L;
    public static final long BT_FOLDER_TYPE_ARTISTS = 3L;
    public static final long BT_FOLDER_TYPE_GENRES = 4L;
    public static final long BT_FOLDER_TYPE_MIXED = 0L;
    public static final long BT_FOLDER_TYPE_PLAYLISTS = 5L;
    public static final long BT_FOLDER_TYPE_TITLES = 1L;
    public static final long BT_FOLDER_TYPE_YEARS = 6L;
    public static final Parcelable.Creator CREATOR;
    public static final String DESCRIPTION_KEY_MEDIA_URI = "android.support.v4.media.description.MEDIA_URI";
    public static final String DESCRIPTION_KEY_NULL_BUNDLE_FLAG = "android.support.v4.media.description.NULL_BUNDLE_FLAG";
    public static final String EXTRA_BT_FOLDER_TYPE = "android.media.extra.BT_FOLDER_TYPE";
    public static final String EXTRA_DOWNLOAD_STATUS = "android.media.extra.DOWNLOAD_STATUS";
    public static final long STATUS_DOWNLOADED = 2L;
    public static final long STATUS_DOWNLOADING = 1L;
    public static final long STATUS_NOT_DOWNLOADED = 0L;
    private static final String TAG = "MediaDescriptionCompat";
    private final CharSequence mDescription;
    private MediaDescription mDescriptionFwk;
    private final Bundle mExtras;
    private final Bitmap mIcon;
    private final Uri mIconUri;
    private final String mMediaId;
    private final Uri mMediaUri;
    private final CharSequence mSubtitle;
    private final CharSequence mTitle;

    static {
        MediaDescriptionCompat$1 mediaDescriptionCompat$1 = new MediaDescriptionCompat$1();
        CREATOR = mediaDescriptionCompat$1;
    }

    public MediaDescriptionCompat(Parcel parcel) {
        CharSequence charSequence;
        Object object = parcel.readString();
        this.mMediaId = object;
        object = TextUtils.CHAR_SEQUENCE_CREATOR;
        this.mTitle = charSequence = (CharSequence)object.createFromParcel(parcel);
        this.mSubtitle = charSequence = (CharSequence)object.createFromParcel(parcel);
        object = (CharSequence)object.createFromParcel(parcel);
        this.mDescription = object;
        object = MediaDescriptionCompat.class.getClassLoader();
        charSequence = (Bitmap)parcel.readParcelable((ClassLoader)object);
        this.mIcon = charSequence;
        charSequence = (Uri)parcel.readParcelable((ClassLoader)object);
        this.mIconUri = charSequence;
        charSequence = parcel.readBundle((ClassLoader)object);
        this.mExtras = charSequence;
        parcel = (Uri)parcel.readParcelable((ClassLoader)object);
        this.mMediaUri = parcel;
    }

    public MediaDescriptionCompat(String string2, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, Bitmap bitmap, Uri uri, Bundle bundle, Uri uri2) {
        this.mMediaId = string2;
        this.mTitle = charSequence;
        this.mSubtitle = charSequence2;
        this.mDescription = charSequence3;
        this.mIcon = bitmap;
        this.mIconUri = uri;
        this.mExtras = bundle;
        this.mMediaUri = uri2;
    }

    public static MediaDescriptionCompat fromMediaDescription(Object object) {
        Object object2;
        block7: {
            Uri uri;
            MediaDescriptionCompat$Builder mediaDescriptionCompat$Builder;
            int n3;
            int n4;
            block9: {
                CharSequence charSequence;
                block8: {
                    int n7;
                    n4 = 0;
                    object2 = null;
                    if (object == null) break block7;
                    n3 = Build.VERSION.SDK_INT;
                    mediaDescriptionCompat$Builder = new MediaDescriptionCompat$Builder();
                    object = (MediaDescription)object;
                    charSequence = MediaDescriptionCompat$Api21Impl.getMediaId((MediaDescription)object);
                    mediaDescriptionCompat$Builder.setMediaId((String)charSequence);
                    charSequence = MediaDescriptionCompat$Api21Impl.getTitle((MediaDescription)object);
                    mediaDescriptionCompat$Builder.setTitle(charSequence);
                    charSequence = MediaDescriptionCompat$Api21Impl.getSubtitle((MediaDescription)object);
                    mediaDescriptionCompat$Builder.setSubtitle(charSequence);
                    charSequence = MediaDescriptionCompat$Api21Impl.getDescription((MediaDescription)object);
                    mediaDescriptionCompat$Builder.setDescription(charSequence);
                    charSequence = MediaDescriptionCompat$Api21Impl.getIconBitmap((MediaDescription)object);
                    mediaDescriptionCompat$Builder.setIconBitmap((Bitmap)charSequence);
                    charSequence = MediaDescriptionCompat$Api21Impl.getIconUri((MediaDescription)object);
                    mediaDescriptionCompat$Builder.setIconUri((Uri)charSequence);
                    charSequence = MediaDescriptionCompat$Api21Impl.getExtras((MediaDescription)object);
                    if (charSequence != null) {
                        charSequence = MediaSessionCompat.unparcelWithClassLoader((Bundle)charSequence);
                    }
                    String string2 = DESCRIPTION_KEY_MEDIA_URI;
                    uri = charSequence != null ? (Uri)charSequence.getParcelable(string2) : null;
                    if (uri == null) break block8;
                    String string3 = DESCRIPTION_KEY_NULL_BUNDLE_FLAG;
                    int n8 = charSequence.containsKey(string3);
                    if (n8 != 0 && (n8 = charSequence.size()) == (n7 = 2)) break block9;
                    charSequence.remove(string2);
                    charSequence.remove(string3);
                }
                object2 = charSequence;
            }
            mediaDescriptionCompat$Builder.setExtras((Bundle)object2);
            if (uri != null) {
                mediaDescriptionCompat$Builder.setMediaUri(uri);
            } else {
                n4 = 23;
                if (n3 >= n4) {
                    object2 = MediaDescriptionCompat$Api23Impl.getMediaUri((MediaDescription)object);
                    mediaDescriptionCompat$Builder.setMediaUri((Uri)object2);
                }
            }
            object2 = mediaDescriptionCompat$Builder.build();
            ((MediaDescriptionCompat)object2).mDescriptionFwk = object;
        }
        return object2;
    }

    public int describeContents() {
        return 0;
    }

    public CharSequence getDescription() {
        return this.mDescription;
    }

    public Bundle getExtras() {
        return this.mExtras;
    }

    public Bitmap getIconBitmap() {
        return this.mIcon;
    }

    public Uri getIconUri() {
        return this.mIconUri;
    }

    public Object getMediaDescription() {
        MediaDescription mediaDescription = this.mDescriptionFwk;
        if (mediaDescription == null) {
            Uri uri;
            int n3 = Build.VERSION.SDK_INT;
            MediaDescription.Builder builder = MediaDescriptionCompat$Api21Impl.createBuilder();
            CharSequence charSequence = this.mMediaId;
            MediaDescriptionCompat$Api21Impl.setMediaId(builder, charSequence);
            charSequence = this.mTitle;
            MediaDescriptionCompat$Api21Impl.setTitle(builder, charSequence);
            charSequence = this.mSubtitle;
            MediaDescriptionCompat$Api21Impl.setSubtitle(builder, charSequence);
            charSequence = this.mDescription;
            MediaDescriptionCompat$Api21Impl.setDescription(builder, charSequence);
            charSequence = this.mIcon;
            MediaDescriptionCompat$Api21Impl.setIconBitmap(builder, (Bitmap)charSequence);
            charSequence = this.mIconUri;
            MediaDescriptionCompat$Api21Impl.setIconUri(builder, (Uri)charSequence);
            int n4 = 23;
            if (n3 < n4 && (uri = this.mMediaUri) != null) {
                Object object;
                uri = this.mExtras;
                if (uri == null) {
                    uri = new Bundle();
                    object = DESCRIPTION_KEY_NULL_BUNDLE_FLAG;
                    boolean bl2 = true;
                    uri.putBoolean((String)object, bl2);
                } else {
                    object = this.mExtras;
                    uri = new Bundle(object);
                }
                object = DESCRIPTION_KEY_MEDIA_URI;
                Uri uri2 = this.mMediaUri;
                uri.putParcelable((String)object, (Parcelable)uri2);
                MediaDescriptionCompat$Api21Impl.setExtras(builder, (Bundle)uri);
            } else {
                uri = this.mExtras;
                MediaDescriptionCompat$Api21Impl.setExtras(builder, (Bundle)uri);
            }
            if (n3 >= n4) {
                mediaDescription = this.mMediaUri;
                MediaDescriptionCompat$Api23Impl.setMediaUri(builder, (Uri)mediaDescription);
            }
            this.mDescriptionFwk = mediaDescription = MediaDescriptionCompat$Api21Impl.build(builder);
        }
        return mediaDescription;
    }

    public String getMediaId() {
        return this.mMediaId;
    }

    public Uri getMediaUri() {
        return this.mMediaUri;
    }

    public CharSequence getSubtitle() {
        return this.mSubtitle;
    }

    public CharSequence getTitle() {
        return this.mTitle;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        CharSequence charSequence = this.mTitle;
        stringBuilder.append((Object)charSequence);
        charSequence = ", ";
        stringBuilder.append((String)charSequence);
        CharSequence charSequence2 = this.mSubtitle;
        stringBuilder.append((Object)charSequence2);
        stringBuilder.append((String)charSequence);
        charSequence = this.mDescription;
        stringBuilder.append((Object)charSequence);
        return stringBuilder.toString();
    }

    public void writeToParcel(Parcel parcel, int n3) {
        ((MediaDescription)this.getMediaDescription()).writeToParcel(parcel, n3);
    }
}

