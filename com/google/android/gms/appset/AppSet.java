/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 */
package com.google.android.gms.appset;

import android.content.Context;
import com.google.android.gms.appset.AppSetIdClient;
import com.google.android.gms.internal.appset.zzr;

public final class AppSet {
    private AppSet() {
    }

    public static AppSetIdClient getClient(Context context) {
        zzr zzr2 = new zzr(context);
        return zzr2;
    }
}

