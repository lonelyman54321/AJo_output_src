/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.graphics.Bitmap
 *  android.media.MediaMetadata
 *  android.net.Uri
 *  android.os.Bundle
 *  android.os.Parcel
 *  android.os.Parcelable
 *  android.os.Parcelable$Creator
 *  android.text.TextUtils
 */
package android.support.v4.media;

import android.graphics.Bitmap;
import android.media.MediaMetadata;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.support.v4.media.MediaDescriptionCompat;
import android.support.v4.media.MediaDescriptionCompat$Builder;
import android.support.v4.media.MediaMetadataCompat$1;
import android.support.v4.media.RatingCompat;
import android.support.v4.media.session.MediaSessionCompat;
import android.text.TextUtils;
import java.util.Set;

public final class MediaMetadataCompat
implements Parcelable {
    public static final Parcelable.Creator CREATOR;
    static final Jp METADATA_KEYS_TYPE;
    public static final String METADATA_KEY_ADVERTISEMENT = "android.media.metadata.ADVERTISEMENT";
    public static final String METADATA_KEY_ALBUM = "android.media.metadata.ALBUM";
    public static final String METADATA_KEY_ALBUM_ART = "android.media.metadata.ALBUM_ART";
    public static final String METADATA_KEY_ALBUM_ARTIST = "android.media.metadata.ALBUM_ARTIST";
    public static final String METADATA_KEY_ALBUM_ART_URI = "android.media.metadata.ALBUM_ART_URI";
    public static final String METADATA_KEY_ART = "android.media.metadata.ART";
    public static final String METADATA_KEY_ARTIST = "android.media.metadata.ARTIST";
    public static final String METADATA_KEY_ART_URI = "android.media.metadata.ART_URI";
    public static final String METADATA_KEY_AUTHOR = "android.media.metadata.AUTHOR";
    public static final String METADATA_KEY_BT_FOLDER_TYPE = "android.media.metadata.BT_FOLDER_TYPE";
    public static final String METADATA_KEY_COMPILATION = "android.media.metadata.COMPILATION";
    public static final String METADATA_KEY_COMPOSER = "android.media.metadata.COMPOSER";
    public static final String METADATA_KEY_DATE = "android.media.metadata.DATE";
    public static final String METADATA_KEY_DISC_NUMBER = "android.media.metadata.DISC_NUMBER";
    public static final String METADATA_KEY_DISPLAY_DESCRIPTION = "android.media.metadata.DISPLAY_DESCRIPTION";
    public static final String METADATA_KEY_DISPLAY_ICON = "android.media.metadata.DISPLAY_ICON";
    public static final String METADATA_KEY_DISPLAY_ICON_URI = "android.media.metadata.DISPLAY_ICON_URI";
    public static final String METADATA_KEY_DISPLAY_SUBTITLE = "android.media.metadata.DISPLAY_SUBTITLE";
    public static final String METADATA_KEY_DISPLAY_TITLE = "android.media.metadata.DISPLAY_TITLE";
    public static final String METADATA_KEY_DOWNLOAD_STATUS = "android.media.metadata.DOWNLOAD_STATUS";
    public static final String METADATA_KEY_DURATION = "android.media.metadata.DURATION";
    public static final String METADATA_KEY_GENRE = "android.media.metadata.GENRE";
    public static final String METADATA_KEY_MEDIA_ID = "android.media.metadata.MEDIA_ID";
    public static final String METADATA_KEY_MEDIA_URI = "android.media.metadata.MEDIA_URI";
    public static final String METADATA_KEY_NUM_TRACKS = "android.media.metadata.NUM_TRACKS";
    public static final String METADATA_KEY_RATING = "android.media.metadata.RATING";
    public static final String METADATA_KEY_TITLE = "android.media.metadata.TITLE";
    public static final String METADATA_KEY_TRACK_NUMBER = "android.media.metadata.TRACK_NUMBER";
    public static final String METADATA_KEY_USER_RATING = "android.media.metadata.USER_RATING";
    public static final String METADATA_KEY_WRITER = "android.media.metadata.WRITER";
    public static final String METADATA_KEY_YEAR = "android.media.metadata.YEAR";
    static final int METADATA_TYPE_BITMAP = 2;
    static final int METADATA_TYPE_LONG = 0;
    static final int METADATA_TYPE_RATING = 3;
    static final int METADATA_TYPE_TEXT = 1;
    private static final String[] PREFERRED_BITMAP_ORDER;
    private static final String[] PREFERRED_DESCRIPTION_ORDER;
    private static final String[] PREFERRED_URI_ORDER;
    private static final String TAG = "MediaMetadata";
    final Bundle mBundle;
    private MediaDescriptionCompat mDescription;
    private MediaMetadata mMetadataFwk;

    static {
        Object object = new Jp();
        METADATA_KEYS_TYPE = object;
        Integer n3 = 1;
        ((a53)object).put(METADATA_KEY_TITLE, n3);
        ((a53)object).put(METADATA_KEY_ARTIST, n3);
        Integer n4 = 0;
        ((a53)object).put(METADATA_KEY_DURATION, n4);
        ((a53)object).put(METADATA_KEY_ALBUM, n3);
        ((a53)object).put(METADATA_KEY_AUTHOR, n3);
        ((a53)object).put(METADATA_KEY_WRITER, n3);
        ((a53)object).put(METADATA_KEY_COMPOSER, n3);
        ((a53)object).put(METADATA_KEY_COMPILATION, n3);
        ((a53)object).put(METADATA_KEY_DATE, n3);
        ((a53)object).put(METADATA_KEY_YEAR, n4);
        ((a53)object).put(METADATA_KEY_GENRE, n3);
        ((a53)object).put(METADATA_KEY_TRACK_NUMBER, n4);
        ((a53)object).put(METADATA_KEY_NUM_TRACKS, n4);
        ((a53)object).put(METADATA_KEY_DISC_NUMBER, n4);
        ((a53)object).put(METADATA_KEY_ALBUM_ARTIST, n3);
        Object object2 = 2;
        String string2 = METADATA_KEY_ART;
        ((a53)object).put(string2, object2);
        String string3 = METADATA_KEY_ART_URI;
        ((a53)object).put(string3, n3);
        String string4 = METADATA_KEY_ALBUM_ART;
        ((a53)object).put(string4, object2);
        String string5 = METADATA_KEY_ALBUM_ART_URI;
        ((a53)object).put(string5, n3);
        Object object3 = 3;
        ((a53)object).put(METADATA_KEY_USER_RATING, object3);
        ((a53)object).put(METADATA_KEY_RATING, object3);
        ((a53)object).put(METADATA_KEY_DISPLAY_TITLE, n3);
        ((a53)object).put(METADATA_KEY_DISPLAY_SUBTITLE, n3);
        ((a53)object).put(METADATA_KEY_DISPLAY_DESCRIPTION, n3);
        object3 = METADATA_KEY_DISPLAY_ICON;
        ((a53)object).put(object3, object2);
        object2 = METADATA_KEY_DISPLAY_ICON_URI;
        ((a53)object).put(object2, n3);
        ((a53)object).put(METADATA_KEY_MEDIA_ID, n3);
        ((a53)object).put(METADATA_KEY_BT_FOLDER_TYPE, n4);
        ((a53)object).put(METADATA_KEY_MEDIA_URI, n3);
        ((a53)object).put(METADATA_KEY_ADVERTISEMENT, n4);
        ((a53)object).put(METADATA_KEY_DOWNLOAD_STATUS, n4);
        PREFERRED_DESCRIPTION_ORDER = new String[]{METADATA_KEY_TITLE, METADATA_KEY_ARTIST, METADATA_KEY_ALBUM, METADATA_KEY_ALBUM_ARTIST, METADATA_KEY_WRITER, METADATA_KEY_AUTHOR, METADATA_KEY_COMPOSER};
        PREFERRED_BITMAP_ORDER = new String[]{object3, string2, string4};
        PREFERRED_URI_ORDER = new String[]{object2, string3, string5};
        object = new MediaMetadataCompat$1();
        CREATOR = object;
    }

    public MediaMetadataCompat(Bundle bundle) {
        Bundle bundle2;
        this.mBundle = bundle2 = new Bundle(bundle);
        MediaSessionCompat.ensureClassLoader(bundle2);
    }

    public MediaMetadataCompat(Parcel parcel) {
        ClassLoader classLoader = MediaSessionCompat.class.getClassLoader();
        parcel = parcel.readBundle(classLoader);
        this.mBundle = parcel;
    }

    public static MediaMetadataCompat fromMediaMetadata(Object object) {
        if (object != null) {
            Parcel parcel = Parcel.obtain();
            object = (MediaMetadata)object;
            object.writeToParcel(parcel, 0);
            parcel.setDataPosition(0);
            MediaMetadataCompat mediaMetadataCompat = (MediaMetadataCompat)CREATOR.createFromParcel(parcel);
            parcel.recycle();
            mediaMetadataCompat.mMetadataFwk = object;
            return mediaMetadataCompat;
        }
        return null;
    }

    public boolean containsKey(String string2) {
        return this.mBundle.containsKey(string2);
    }

    public int describeContents() {
        return 0;
    }

    public Bitmap getBitmap(String string2) {
        Bundle bundle = this.mBundle;
        string2 = bundle.getParcelable(string2);
        try {
            string2 = (Bitmap)string2;
        }
        catch (Exception exception) {
            string2 = null;
        }
        return string2;
    }

    public Bundle getBundle() {
        Bundle bundle = this.mBundle;
        Bundle bundle2 = new Bundle(bundle);
        return bundle2;
    }

    public MediaDescriptionCompat getDescription() {
        long l2;
        Uri uri;
        int n3;
        Object object;
        CharSequence charSequence;
        int n4;
        int n7;
        Bitmap bitmap;
        Object object2;
        int n8;
        Object object3;
        block13: {
            block12: {
                int n10;
                int n14;
                object3 = this.mDescription;
                if (object3 != null) {
                    return object3;
                }
                object3 = this.getString(METADATA_KEY_MEDIA_ID);
                n8 = 3;
                object2 = new CharSequence[n8];
                bitmap = this.getText(METADATA_KEY_DISPLAY_TITLE);
                int n15 = TextUtils.isEmpty((CharSequence)bitmap);
                n7 = 2;
                n4 = 1;
                if (n15 == 0) {
                    object2[0] = bitmap;
                    object2[n4] = charSequence = this.getText(METADATA_KEY_DISPLAY_SUBTITLE);
                    object2[n7] = charSequence = this.getText(METADATA_KEY_DISPLAY_DESCRIPTION);
                } else {
                    n14 = 0;
                    bitmap = null;
                    n15 = 0;
                    object = null;
                    while (n14 < n8 && n15 < (n3 = ((String[])(uri = PREFERRED_DESCRIPTION_ORDER)).length)) {
                        n3 = n15 + 1;
                        object = uri[n15];
                        n10 = TextUtils.isEmpty((CharSequence)(object = this.getText((String)object)));
                        if (n10 == 0) {
                            n10 = n14 + 1;
                            object2[n14] = object;
                            n14 = n10;
                        }
                        n15 = n3;
                    }
                }
                n8 = 0;
                charSequence = null;
                while (true) {
                    bitmap = PREFERRED_BITMAP_ORDER;
                    n15 = ((String[])bitmap).length;
                    n10 = 0;
                    uri = null;
                    if (n8 >= n15) break;
                    bitmap = bitmap[n8];
                    if ((bitmap = this.getBitmap((String)bitmap)) == null) {
                        ++n8;
                        continue;
                    }
                    break block12;
                    break;
                }
                n14 = 0;
                bitmap = null;
            }
            charSequence = null;
            for (n8 = 0; n8 < (n3 = ((String[])(object = PREFERRED_URI_ORDER)).length); ++n8) {
                object = object[n8];
                n3 = (int)(TextUtils.isEmpty((CharSequence)(object = this.getString((String)object))) ? 1 : 0);
                if (n3 != 0) continue;
                charSequence = Uri.parse((String)object);
                break block13;
            }
            n8 = 0;
            charSequence = null;
        }
        object = this.getString(METADATA_KEY_MEDIA_URI);
        n3 = (int)(TextUtils.isEmpty((CharSequence)object) ? 1 : 0);
        if (n3 == 0) {
            uri = Uri.parse((String)object);
        }
        object = new MediaDescriptionCompat$Builder();
        ((MediaDescriptionCompat$Builder)object).setMediaId((String)object3);
        object3 = object2[0];
        ((MediaDescriptionCompat$Builder)object).setTitle((CharSequence)object3);
        object3 = object2[n4];
        ((MediaDescriptionCompat$Builder)object).setSubtitle((CharSequence)object3);
        object3 = object2[n7];
        ((MediaDescriptionCompat$Builder)object).setDescription((CharSequence)object3);
        ((MediaDescriptionCompat$Builder)object).setIconBitmap(bitmap);
        ((MediaDescriptionCompat$Builder)object).setIconUri((Uri)charSequence);
        ((MediaDescriptionCompat$Builder)object).setMediaUri(uri);
        object3 = new Bundle();
        charSequence = this.mBundle;
        object2 = METADATA_KEY_BT_FOLDER_TYPE;
        n8 = (int)(charSequence.containsKey((String)object2) ? 1 : 0);
        if (n8 != 0) {
            charSequence = "android.media.extra.BT_FOLDER_TYPE";
            l2 = this.getLong((String)object2);
            object3.putLong((String)charSequence, l2);
        }
        if ((n8 = (int)((charSequence = this.mBundle).containsKey((String)(object2 = METADATA_KEY_DOWNLOAD_STATUS)) ? 1 : 0)) != 0) {
            charSequence = "android.media.extra.DOWNLOAD_STATUS";
            l2 = this.getLong((String)object2);
            object3.putLong((String)charSequence, l2);
        }
        if ((n8 = (int)(object3.isEmpty() ? 1 : 0)) == 0) {
            ((MediaDescriptionCompat$Builder)object).setExtras((Bundle)object3);
        }
        this.mDescription = object3 = ((MediaDescriptionCompat$Builder)object).build();
        return object3;
    }

    public long getLong(String string2) {
        return this.mBundle.getLong(string2, 0L);
    }

    public Object getMediaMetadata() {
        MediaMetadata mediaMetadata = this.mMetadataFwk;
        if (mediaMetadata == null) {
            MediaMetadata mediaMetadata2;
            mediaMetadata = Parcel.obtain();
            this.writeToParcel((Parcel)mediaMetadata, 0);
            mediaMetadata.setDataPosition(0);
            this.mMetadataFwk = mediaMetadata2 = (MediaMetadata)MediaMetadata.CREATOR.createFromParcel((Parcel)mediaMetadata);
            mediaMetadata.recycle();
        }
        return this.mMetadataFwk;
    }

    public RatingCompat getRating(String object) {
        Bundle bundle = this.mBundle;
        object = bundle.getParcelable((String)object);
        try {
            object = RatingCompat.fromRating(object);
        }
        catch (Exception exception) {
            object = null;
        }
        return object;
    }

    public String getString(String charSequence) {
        Bundle bundle = this.mBundle;
        if ((charSequence = bundle.getCharSequence((String)charSequence)) != null) {
            return charSequence.toString();
        }
        return null;
    }

    public CharSequence getText(String string2) {
        return this.mBundle.getCharSequence(string2);
    }

    public Set keySet() {
        return this.mBundle.keySet();
    }

    public int size() {
        return this.mBundle.size();
    }

    public void writeToParcel(Parcel parcel, int n3) {
        Bundle bundle = this.mBundle;
        parcel.writeBundle(bundle);
    }
}

