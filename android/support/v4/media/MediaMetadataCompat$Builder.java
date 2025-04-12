/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.graphics.Bitmap
 *  android.os.Bundle
 *  android.os.Parcelable
 */
package android.support.v4.media;

import android.graphics.Bitmap;
import android.os.Bundle;
import android.os.Parcelable;
import android.support.v4.media.MediaMetadataCompat;
import android.support.v4.media.RatingCompat;
import android.support.v4.media.session.MediaSessionCompat;

public final class MediaMetadataCompat$Builder {
    private final Bundle mBundle;

    public MediaMetadataCompat$Builder() {
        Bundle bundle;
        this.mBundle = bundle = new Bundle();
    }

    public MediaMetadataCompat$Builder(MediaMetadataCompat mediaMetadataCompat) {
        Bundle bundle;
        mediaMetadataCompat = mediaMetadataCompat.mBundle;
        this.mBundle = bundle = new Bundle((Bundle)mediaMetadataCompat);
        MediaSessionCompat.ensureClassLoader(bundle);
    }

    public MediaMetadataCompat$Builder(MediaMetadataCompat object, int n3) {
        this((MediaMetadataCompat)object);
        boolean bl2;
        object = this.mBundle.keySet().iterator();
        while (bl2 = object.hasNext()) {
            String string2 = (String)object.next();
            Object object2 = this.mBundle.get(string2);
            int n4 = object2 instanceof Bitmap;
            if (n4 == 0 || (n4 = (object2 = (Bitmap)object2).getHeight()) <= n3 && (n4 = object2.getWidth()) <= n3) continue;
            object2 = this.scaleBitmap((Bitmap)object2, n3);
            this.putBitmap(string2, (Bitmap)object2);
        }
    }

    private Bitmap scaleBitmap(Bitmap bitmap, int n3) {
        float f5 = n3;
        float f6 = bitmap.getWidth();
        f6 = f5 / f6;
        float f7 = bitmap.getHeight();
        f5 /= f7;
        f5 = Math.min(f6, f5);
        int n4 = (int)((float)bitmap.getHeight() * f5);
        n3 = (int)((float)bitmap.getWidth() * f5);
        return Bitmap.createScaledBitmap((Bitmap)bitmap, (int)n3, (int)n4, (boolean)true);
    }

    public MediaMetadataCompat build() {
        Bundle bundle = this.mBundle;
        MediaMetadataCompat mediaMetadataCompat = new MediaMetadataCompat(bundle);
        return mediaMetadataCompat;
    }

    public MediaMetadataCompat$Builder putBitmap(String string2, Bitmap object) {
        int n3;
        int n4;
        Object object2 = MediaMetadataCompat.METADATA_KEYS_TYPE;
        boolean n42 = ((a53)object2).containsKey(string2);
        if (n42 && (n4 = ((Integer)(object2 = (Integer)((a53)object2).get(string2))).intValue()) != (n3 = 2)) {
            string2 = cP.a("The ", string2, " key cannot be used to put a Bitmap");
            object = new IllegalArgumentException(string2);
            throw object;
        }
        this.mBundle.putParcelable(string2, (Parcelable)object);
        return this;
    }

    public MediaMetadataCompat$Builder putLong(String string2, long l2) {
        int n3;
        Object object = MediaMetadataCompat.METADATA_KEYS_TYPE;
        boolean bl2 = ((a53)object).containsKey(string2);
        if (bl2 && (n3 = ((Integer)(object = (Integer)((a53)object).get(string2))).intValue()) != 0) {
            string2 = cP.a("The ", string2, " key cannot be used to put a long");
            IllegalArgumentException illegalArgumentException = new IllegalArgumentException(string2);
            throw illegalArgumentException;
        }
        this.mBundle.putLong(string2, l2);
        return this;
    }

    public MediaMetadataCompat$Builder putRating(String string2, RatingCompat object) {
        int n3;
        int n4;
        Object object2 = MediaMetadataCompat.METADATA_KEYS_TYPE;
        boolean n42 = ((a53)object2).containsKey(string2);
        if (n42 && (n4 = ((Integer)(object2 = (Integer)((a53)object2).get(string2))).intValue()) != (n3 = 3)) {
            string2 = cP.a("The ", string2, " key cannot be used to put a Rating");
            object = new IllegalArgumentException(string2);
            throw object;
        }
        object2 = this.mBundle;
        object = (Parcelable)((RatingCompat)object).getRating();
        object2.putParcelable(string2, (Parcelable)object);
        return this;
    }

    public MediaMetadataCompat$Builder putString(String string2, String object) {
        int n3;
        int n4;
        Object object2 = MediaMetadataCompat.METADATA_KEYS_TYPE;
        boolean n42 = ((a53)object2).containsKey(string2);
        if (n42 && (n4 = ((Integer)(object2 = (Integer)((a53)object2).get(string2))).intValue()) != (n3 = 1)) {
            string2 = cP.a("The ", string2, " key cannot be used to put a String");
            object = new IllegalArgumentException(string2);
            throw object;
        }
        this.mBundle.putCharSequence(string2, (CharSequence)object);
        return this;
    }

    public MediaMetadataCompat$Builder putText(String string2, CharSequence object) {
        int n3;
        int n4;
        Object object2 = MediaMetadataCompat.METADATA_KEYS_TYPE;
        boolean n42 = ((a53)object2).containsKey(string2);
        if (n42 && (n4 = ((Integer)(object2 = (Integer)((a53)object2).get(string2))).intValue()) != (n3 = 1)) {
            string2 = cP.a("The ", string2, " key cannot be used to put a CharSequence");
            object = new IllegalArgumentException(string2);
            throw object;
        }
        this.mBundle.putCharSequence(string2, (CharSequence)object);
        return this;
    }
}

