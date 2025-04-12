/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.net.Uri
 */
package com.google.android.gms.common.internal;

import android.net.Uri;

public final class zzu {
    public static final /* synthetic */ int zza;
    private static final Uri zzb;
    private static final Uri zzc;

    static {
        Uri uri;
        zzb = uri = Uri.parse((String)"https://plus.google.com/");
        zzc = uri.buildUpon().appendPath("circles").appendPath("find").build();
    }
}

