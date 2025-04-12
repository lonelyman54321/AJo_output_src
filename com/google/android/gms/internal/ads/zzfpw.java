/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Handler
 *  android.webkit.WebView
 *  android.webkit.WebViewClient
 *  org.json.JSONObject
 */
package com.google.android.gms.internal.ads;

import android.os.Handler;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.google.android.gms.internal.ads.zzfol;
import com.google.android.gms.internal.ads.zzfon;
import com.google.android.gms.internal.ads.zzfox;
import com.google.android.gms.internal.ads.zzfpj;
import com.google.android.gms.internal.ads.zzfpl;
import com.google.android.gms.internal.ads.zzfps;
import com.google.android.gms.internal.ads.zzfpu;
import com.google.android.gms.internal.ads.zzfpv;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import org.json.JSONObject;

public final class zzfpw
extends zzfps {
    private WebView zza;
    private Long zzb = null;
    private final Map zzc;

    public zzfpw(String string2, Map map2, String string3) {
        super(string2);
        this.zzc = map2;
    }

    public static /* bridge */ /* synthetic */ WebView zzo(zzfpw zzfpw2) {
        return zzfpw2.zza;
    }

    public final void zzc() {
        long l2;
        super.zzc();
        Object object = this.zzb;
        long l3 = 4000L;
        if (object == null) {
            l2 = l3;
        } else {
            object = TimeUnit.MILLISECONDS;
            l2 = System.nanoTime();
            long l4 = this.zzb;
            l2 -= l4;
            TimeUnit timeUnit = TimeUnit.NANOSECONDS;
            l2 = ((TimeUnit)((Object)object)).convert(l2, timeUnit);
        }
        long l7 = Math.max(l3 - l2, 2000L);
        Handler handler = new Handler();
        zzfpv zzfpv2 = new zzfpv(this);
        handler.postDelayed((Runnable)zzfpv2, l7);
        this.zza = null;
    }

    public final void zzi(zzfon object, zzfol zzfol2) {
        JSONObject jSONObject = new JSONObject();
        Map map2 = zzfol2.zzi();
        Iterator iterator = map2.keySet().iterator();
        boolean bl2 = iterator.hasNext();
        if (!bl2) {
            this.zzj((zzfon)object, zzfol2, jSONObject);
            return;
        }
        object = (String)iterator.next();
        object = (zzfox)map2.get(object);
        throw null;
    }

    public final void zzn() {
        Object object = zzfpj.zzb().zza();
        Object object2 = new WebView(object);
        this.zza = object2;
        object2.getSettings().setJavaScriptEnabled(true);
        this.zza.getSettings().setAllowContentAccess(false);
        this.zza.getSettings().setAllowFileAccess(false);
        object2 = this.zza;
        object = new zzfpu(this);
        object2.setWebViewClient((WebViewClient)object);
        object2 = this.zza;
        this.zzm((WebView)object2);
        object2 = this.zza;
        object = null;
        zzfpl.zzj((WebView)object2, null);
        object2 = this.zzc.keySet().iterator();
        boolean bl2 = object2.hasNext();
        if (!bl2) {
            this.zzb = object2 = Long.valueOf(System.nanoTime());
            return;
        }
        object2 = (String)object2.next();
        object2 = (zzfox)this.zzc.get(object2);
        throw null;
    }
}

