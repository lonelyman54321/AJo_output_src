/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.appindexing;

import com.google.android.gms.appindexing.AppIndexApi;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.internal.icing.zzal;
import com.google.android.gms.internal.icing.zze;

public final class AppIndex {
    public static final Api API;
    public static final Api APP_INDEX_API;
    public static final AppIndexApi AppIndexApi;

    static {
        Object object = zze.zzb;
        API = object;
        APP_INDEX_API = object;
        AppIndexApi = object = new zzal();
    }

    private AppIndex() {
    }
}

