/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.webkit.WebResourceResponse
 *  android.webkit.WebView
 */
package com.google.android.gms.internal.ads;

import android.content.Context;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.util.client.zzm;
import com.google.android.gms.ads.internal.util.zzt;
import com.google.android.gms.ads.internal.zzu;
import com.google.android.gms.internal.ads.zzbdm;
import com.google.android.gms.internal.ads.zzbdx;
import com.google.android.gms.internal.ads.zzbeg;
import com.google.android.gms.internal.ads.zzben;
import com.google.android.gms.internal.ads.zzbep;
import com.google.android.gms.internal.ads.zzbui;
import com.google.android.gms.internal.ads.zzchd;
import com.google.android.gms.internal.ads.zzchl;
import com.google.android.gms.internal.ads.zzcix;
import com.google.android.gms.internal.ads.zzegk;
import com.google.android.gms.internal.ads.zzftu;
import com.google.android.gms.internal.ads.zzftz;
import java.io.File;
import java.util.Collections;
import java.util.Map;

public class zzcil
extends zzchl {
    public zzcil(zzchd zzchd2, zzbdm zzbdm2, boolean bl2, zzegk zzegk2) {
        Object object = zzchd2.zzE();
        Object object2 = zzchd2.getContext();
        Object object3 = new zzbdx((Context)object2);
        zzbui zzbui2 = new zzbui(zzchd2, (Context)object, (zzbdx)object3);
        object = this;
        object3 = zzchd2;
        object2 = zzbdm2;
        super(zzchd2, zzbdm2, bl2, zzbui2, null, zzegk2);
    }

    public final WebResourceResponse zzS(WebView object, String object2, Map object3) {
        boolean bl2;
        boolean bl3 = object instanceof zzchd;
        if (!bl3) {
            zzm.zzj("Tried to intercept request from a WebView that wasn't an AdWebView.");
            return null;
        }
        object = (zzchd)object;
        Object object4 = this.zza;
        if (object4 != null) {
            int n3 = 1;
            object4.zzd((String)object2, (Map)object3, n3);
        }
        zzftu.zza();
        Object object5 = zzftz.zza;
        object4 = new File((String)object2);
        object4 = ((File)object4).getName();
        object5 = "mraid.js";
        bl3 = ((String)object5).equalsIgnoreCase((String)object4);
        if (!bl3) {
            if (object3 == null) {
                object3 = Collections.emptyMap();
            }
            return this.zzc((String)object2, (Map)object3);
        }
        object2 = object.zzN();
        if (object2 != null) {
            object2 = object.zzN();
            object2.zzF();
        }
        if (bl2 = ((zzcix)(object2 = object.zzO())).zzi()) {
            object2 = zzbep.zzN;
            object3 = zzba.zzc();
            object2 = (String)((zzben)object3).zza((zzbeg)object2);
        } else {
            bl2 = object.zzaF();
            if (bl2) {
                object2 = zzbep.zzM;
                object3 = zzba.zzc();
                object2 = (String)((zzben)object3).zza((zzbeg)object2);
            } else {
                object2 = zzbep.zzL;
                object3 = zzba.zzc();
                object2 = (String)((zzben)object3).zza((zzbeg)object2);
            }
        }
        zzu.zzp();
        object3 = object.getContext();
        object = object.zzn().afmaVersion;
        return zzt.zzx((Context)object3, (String)object, (String)object2);
    }
}

