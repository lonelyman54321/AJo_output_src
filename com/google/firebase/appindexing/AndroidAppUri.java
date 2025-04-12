/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.net.Uri
 *  android.net.Uri$Builder
 *  android.text.TextUtils
 */
package com.google.firebase.appindexing;

import android.net.Uri;
import android.text.TextUtils;
import com.google.android.gms.common.internal.Objects;

public final class AndroidAppUri {
    private final Uri zza;

    private AndroidAppUri(Uri uri) {
        this.zza = uri;
    }

    public static AndroidAppUri newAndroidAppUri(Uri object) {
        AndroidAppUri androidAppUri = new AndroidAppUri((Uri)object);
        String string2 = "android-app";
        object = androidAppUri.zza.getScheme();
        boolean bl2 = string2.equals(object);
        if (bl2) {
            object = androidAppUri.getPackageName();
            bl2 = TextUtils.isEmpty((CharSequence)object);
            if (!bl2) {
                return androidAppUri;
            }
            object = new IllegalArgumentException("Package name is empty.");
            throw object;
        }
        object = new IllegalArgumentException("android-app scheme is required.");
        throw object;
    }

    public boolean equals(Object object) {
        boolean bl2 = object instanceof AndroidAppUri;
        if (bl2) {
            Uri uri = this.zza;
            object = ((AndroidAppUri)object).zza;
            return uri.equals(object);
        }
        return false;
    }

    public Uri getDeepLinkUri() {
        Object object = this.zza.getPathSegments();
        int n3 = object.size();
        if (n3 > 0) {
            String string2 = (String)object.get(0);
            Uri.Builder builder = new Uri.Builder();
            builder.scheme(string2);
            n3 = object.size();
            int n4 = 1;
            if (n3 > n4) {
                string2 = (String)object.get(n4);
                builder.authority(string2);
                for (n3 = 2; n3 < (n4 = object.size()); ++n3) {
                    String string3 = (String)object.get(n3);
                    builder.appendPath(string3);
                }
            }
            object = this.zza.getEncodedQuery();
            builder.encodedQuery((String)object);
            object = this.zza.getEncodedFragment();
            builder.encodedFragment((String)object);
            return builder.build();
        }
        return null;
    }

    public String getPackageName() {
        return this.zza.getAuthority();
    }

    public int hashCode() {
        Uri uri = this.zza;
        Object[] objectArray = new Object[]{uri};
        return Objects.hashCode(objectArray);
    }

    public String toString() {
        return this.zza.toString();
    }
}

