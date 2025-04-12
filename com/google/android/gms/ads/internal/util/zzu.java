/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.webkit.CookieManager
 *  android.webkit.WebResourceResponse
 */
package com.google.android.gms.ads.internal.util;

import android.content.Context;
import android.webkit.CookieManager;
import android.webkit.WebResourceResponse;
import com.google.android.gms.ads.internal.util.client.zzm;
import com.google.android.gms.ads.internal.util.zzab;
import com.google.android.gms.ads.internal.util.zzt;
import com.google.android.gms.internal.ads.zzbdm;
import com.google.android.gms.internal.ads.zzchd;
import com.google.android.gms.internal.ads.zzchl;
import com.google.android.gms.internal.ads.zzcim;
import com.google.android.gms.internal.ads.zzegk;
import java.io.InputStream;
import java.util.Map;

public class zzu
extends zzab {
    public zzu() {
        super(null);
    }

    public final CookieManager zza(Context context) {
        com.google.android.gms.ads.internal.zzu.zzp();
        boolean bl2 = zzt.zzF();
        if (bl2) {
            return null;
        }
        try {
            return CookieManager.getInstance();
        }
        catch (Throwable throwable) {
            zzm.zzh("Failed to obtain CookieManager.", throwable);
            com.google.android.gms.ads.internal.zzu.zzo().zzv(throwable, "ApiLevelUtil.getCookieManager");
            return null;
        }
    }

    public final WebResourceResponse zzb(String string2, String string3, int n3, String string4, Map map2, InputStream inputStream) {
        WebResourceResponse webResourceResponse = new WebResourceResponse(string2, string3, n3, string4, map2, inputStream);
        return webResourceResponse;
    }

    public final zzchl zzc(zzchd zzchd2, zzbdm zzbdm2, boolean bl2, zzegk zzegk2) {
        zzcim zzcim2 = new zzcim(zzchd2, zzbdm2, bl2, zzegk2);
        return zzcim2;
    }
}

