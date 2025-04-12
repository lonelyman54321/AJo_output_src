/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.View
 *  android.webkit.WebView
 */
package com.google.android.gms.internal.ads;

import android.view.View;
import android.webkit.WebView;
import com.google.android.gms.internal.ads.zzchs;
import com.google.android.gms.internal.ads.zzfoj;
import com.google.android.gms.internal.ads.zzfok;
import com.google.android.gms.internal.ads.zzfol;
import com.google.android.gms.internal.ads.zzfon;
import com.google.android.gms.internal.ads.zzfoo;
import com.google.android.gms.internal.ads.zzfoq;
import com.google.android.gms.internal.ads.zzfor;
import com.google.android.gms.internal.ads.zzfos;
import com.google.android.gms.internal.ads.zzfot;
import com.google.android.gms.internal.ads.zzfov;
import com.google.android.gms.internal.ads.zzfow;
import com.google.android.gms.internal.ads.zzfph;
import com.google.android.gms.internal.ads.zzfpi;
import com.google.android.gms.internal.ads.zzfqd;
import com.google.android.gms.internal.ads.zzfqf;
import java.lang.reflect.InvocationHandler;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Timer;
import java.util.TimerTask;

public final class zzfou {
    private static final zzfqf zza;
    private final zzfow zzb;
    private final WebView zzc;
    private final HashMap zzd;
    private final zzfpi zze;

    static {
        zzfqf zzfqf2;
        zza = zzfqf2 = new zzfqf();
    }

    private zzfou(zzfow object, WebView object2, boolean bl2) {
        String[] stringArray = new HashMap();
        this.zzd = stringArray;
        stringArray = new zzfpi();
        this.zze = stringArray;
        zzfqd.zza();
        this.zzb = object;
        this.zzc = object2;
        object = "WEB_MESSAGE_LISTENER";
        boolean bl3 = h83.c((String)object);
        if (bl3) {
            this.zzg();
            object = new zzfot(this);
            Object object3 = Arrays.asList("*");
            stringArray = new HashSet(object3);
            int n3 = BF3.a;
            object3 = CF3.c;
            n3 = (int)(object3.c() ? 1 : 0);
            if (n3 != 0) {
                object2 = DF3$a.a.createWebView((WebView)object2);
                object3 = new String[]{};
                stringArray = stringArray.toArray((T[])object3);
                object3.a = object;
                object = new EA$a((vf3_1)object3);
                object2.addWebMessageListener("omidJsSessionService", stringArray, (InvocationHandler)object);
                return;
            }
            object = new UnsupportedOperationException("This method is not supported by the current version of the framework and the current WebView APK");
            throw object;
        }
        object = new UnsupportedOperationException("The JavaScriptSessionService cannot be supported in this WebView version.");
        throw object;
    }

    public static zzfou zza(zzfow zzfow2, WebView webView, boolean bl2) {
        zzfou zzfou2 = new zzfou(zzfow2, webView, true);
        return zzfou2;
    }

    public static /* bridge */ /* synthetic */ void zzb(zzfou object, String string2) {
        zzfoj zzfoj2 = (zzfoj)((zzfou)object).zzd.get(string2);
        if (zzfoj2 != null) {
            zzfoj2.zzc();
            object = ((zzfou)object).zzd;
            ((HashMap)object).remove(string2);
        }
    }

    public static /* bridge */ /* synthetic */ void zzc(zzfou zzfou2) {
        zzfou2.zzg();
    }

    public static /* bridge */ /* synthetic */ void zzd(zzfou object, String object2) {
        boolean bl2;
        Object object3 = zzfoo.zza;
        Object object4 = zzfor.zza;
        zzfov zzfov2 = zzfov.zzb;
        object3 = zzfok.zza((zzfoo)((Object)object3), object4, zzfov2, zzfov2, false);
        object4 = ((zzfou)object).zzb;
        zzfov2 = ((zzfou)object).zzc;
        object4 = zzfol.zzb((zzfow)object4, (WebView)zzfov2, null, null);
        zzfon zzfon2 = new zzfon((zzfok)object3, (zzfol)object4, (String)object2);
        object3 = ((zzfou)object).zzd;
        ((HashMap)object3).put(object2, zzfon2);
        object2 = ((zzfou)object).zzc;
        zzfon2.zzd((View)object2);
        object = ((zzfou)object).zze.zza().iterator();
        while (bl2 = object.hasNext()) {
            object2 = (zzfph)object.next();
            object3 = (View)((zzfph)object2).zzb().get();
            object4 = ((zzfph)object2).zza();
            object2 = ((zzfph)object2).zzc();
            zzfon2.zzb((View)object3, (zzfoq)((Object)object4), (String)object2);
        }
        zzfon2.zze();
    }

    private final void zzg() {
        Object object = this.zzc;
        int n3 = BF3.a;
        mm$d mm$d = CF3.c;
        n3 = (int)(mm$d.c() ? 1 : 0);
        if (n3 != 0) {
            DF3$a.a.createWebView((WebView)object).removeWebMessageListener("omidJsSessionService");
            return;
        }
        object = new UnsupportedOperationException("This method is not supported by the current version of the framework and the current WebView APK");
        throw object;
    }

    public final void zze(View view, zzfoq zzfoq2, String object) {
        String string2;
        object = this.zzd.values().iterator();
        while (true) {
            boolean bl2 = object.hasNext();
            string2 = "Ad overlay";
            if (!bl2) break;
            zzfoj zzfoj2 = (zzfoj)object.next();
            zzfoj2.zzb(view, zzfoq2, string2);
        }
        this.zze.zzb(view, zzfoq2, string2);
    }

    public final void zzf(zzchs zzchs2) {
        Object object;
        boolean bl2;
        Object object2 = this.zzd.values().iterator();
        while (bl2 = object2.hasNext()) {
            object = (zzfoj)object2.next();
            ((zzfoj)object).zzc();
        }
        object2 = new Timer();
        object = new zzfos(this, zzchs2, (Timer)object2);
        ((Timer)object2).schedule((TimerTask)object, 1000L);
    }
}

