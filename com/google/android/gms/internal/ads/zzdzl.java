/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.webkit.CookieManager
 */
package com.google.android.gms.internal.ads;

import android.webkit.CookieManager;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.internal.ads.zzbeg;
import com.google.android.gms.internal.ads.zzben;
import com.google.android.gms.internal.ads.zzbep;
import java.util.concurrent.Callable;

public final class zzdzl
implements Callable {
    public final /* synthetic */ CookieManager zza;

    public /* synthetic */ zzdzl(CookieManager cookieManager) {
        this.zza = cookieManager;
    }

    public final Object call() {
        Object object = this.zza;
        if (object == null) {
            object = "";
        } else {
            Object object2 = zzbep.zzaO;
            zzben zzben2 = zzba.zzc();
            object2 = (String)zzben2.zza((zzbeg)object2);
            object = object.getCookie((String)object2);
        }
        return object;
    }
}

