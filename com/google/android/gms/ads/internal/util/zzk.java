/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.webkit.WebSettings
 */
package com.google.android.gms.ads.internal.util;

import android.content.Context;
import android.webkit.WebSettings;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.util.zzt;
import com.google.android.gms.internal.ads.zzbeg;
import com.google.android.gms.internal.ads.zzben;
import com.google.android.gms.internal.ads.zzbep;
import java.util.concurrent.Callable;

public final class zzk
implements Callable {
    public final /* synthetic */ WebSettings zza;
    public final /* synthetic */ Context zzb;

    public /* synthetic */ zzk(WebSettings webSettings, Context context) {
        this.zza = webSettings;
        this.zzb = context;
    }

    public final Object call() {
        Object object = zzt.zza;
        object = this.zzb.getDatabasePath("com.google.android.gms.ads.db").getAbsolutePath();
        WebSettings webSettings = this.zza;
        webSettings.setDatabasePath((String)object);
        boolean n3 = true;
        webSettings.setDatabaseEnabled(n3);
        webSettings.setDomStorageEnabled(n3);
        webSettings.setDisplayZoomControls(false);
        webSettings.setBuiltInZoomControls(n3);
        webSettings.setSupportZoom(n3);
        object = zzbep.zzaL;
        zzben zzben2 = zzba.zzc();
        object = (Boolean)zzben2.zza((zzbeg)object);
        boolean bl2 = (Boolean)object;
        if (bl2) {
            int n4 = 100;
            webSettings.setTextZoom(n4);
        }
        webSettings.setAllowContentAccess(false);
        return Boolean.TRUE;
    }
}

