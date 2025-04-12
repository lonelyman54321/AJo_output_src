/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Build
 *  android.os.Build$VERSION
 *  android.webkit.WebView
 *  org.json.JSONArray
 *  org.json.JSONObject
 */
package com.google.android.gms.internal.ads;

import android.os.Build;
import android.webkit.WebView;
import com.google.android.gms.internal.ads.zzfok;
import com.google.android.gms.internal.ads.zzfol;
import com.google.android.gms.internal.ads.zzfon;
import com.google.android.gms.internal.ads.zzfox;
import com.google.android.gms.internal.ads.zzfpj;
import com.google.android.gms.internal.ads.zzfpl;
import com.google.android.gms.internal.ads.zzfpx;
import com.google.android.gms.internal.ads.zzfpy;
import com.google.android.gms.internal.ads.zzfqw;
import java.util.Date;
import org.json.JSONArray;
import org.json.JSONObject;

public class zzfps {
    private final String zza;
    private zzfqw zzb;
    private long zzc;
    private int zzd;

    public zzfps(String object) {
        this.zzb();
        this.zza = object;
        this.zzb = object = new zzfqw(null);
    }

    public final WebView zza() {
        return (WebView)this.zzb.get();
    }

    public final void zzb() {
        long l2;
        this.zzc = l2 = System.nanoTime();
        this.zzd = 1;
    }

    public void zzc() {
        this.zzb.clear();
    }

    public final void zzd(String string2, long l2) {
        int n3;
        int n4;
        long l3 = this.zzc;
        long l4 = l2 - l3;
        Object object = l4 == 0L ? 0 : (l4 < 0L ? -1 : 1);
        if (object >= 0 && (n4 = this.zzd) != (n3 = 3)) {
            this.zzd = n3;
            zzfpl zzfpl2 = zzfpl.zza();
            WebView webView = this.zza();
            String string3 = this.zza;
            zzfpl2.zzg(webView, string3, string2);
        }
    }

    public final void zze() {
        zzfpl zzfpl2 = zzfpl.zza();
        WebView webView = this.zza();
        String string2 = this.zza;
        zzfpl2.zzc(webView, string2);
    }

    public final void zzf(zzfok zzfok2) {
        zzfpl zzfpl2 = zzfpl.zza();
        WebView webView = this.zza();
        String string2 = this.zza;
        zzfok2 = zzfok2.zzb();
        zzfpl2.zzd(webView, string2, (JSONObject)zzfok2);
    }

    public final void zzg(Date object) {
        if (object == null) {
            return;
        }
        JSONObject jSONObject = new JSONObject();
        object = ((Date)object).getTime();
        zzfpy.zze(jSONObject, "timestamp", object);
        object = zzfpl.zza();
        WebView webView = this.zza();
        ((zzfpl)object).zzf(webView, jSONObject);
    }

    public final void zzh(String string2, long l2) {
        long l3 = this.zzc;
        long l4 = l2 - l3;
        Object object = l4 == 0L ? 0 : (l4 < 0L ? -1 : 1);
        if (object >= 0) {
            int n3;
            this.zzd = n3 = 2;
            zzfpl zzfpl2 = zzfpl.zza();
            WebView webView = this.zza();
            String string3 = this.zza;
            zzfpl2.zzg(webView, string3, string2);
        }
    }

    public void zzi(zzfon zzfon2, zzfol zzfol2) {
        this.zzj(zzfon2, zzfol2, null);
    }

    public final void zzj(zzfon object, zzfol zzfol2, JSONObject jSONObject) {
        String string2 = ((zzfon)object).zzh();
        JSONObject jSONObject2 = new JSONObject();
        Object object2 = "app";
        zzfpy.zze(jSONObject2, "environment", object2);
        object = zzfol2.zzd();
        zzfpy.zze(jSONObject2, "adSessionType", object);
        object = new JSONObject();
        String string3 = Build.MANUFACTURER;
        String string4 = Build.MODEL;
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(string3);
        stringBuilder.append("; ");
        stringBuilder.append(string4);
        string3 = stringBuilder.toString();
        zzfpy.zze((JSONObject)object, "deviceType", string3);
        int n3 = Build.VERSION.SDK_INT;
        string3 = Integer.toString(n3);
        zzfpy.zze((JSONObject)object, "osVersion", string3);
        zzfpy.zze((JSONObject)object, "os", "Android");
        zzfpy.zze(jSONObject2, "deviceInfo", object);
        object = zzfpx.zza().toString();
        zzfpy.zze(jSONObject2, "deviceCategory", object);
        object = new JSONArray();
        object.put((Object)"clid");
        object.put((Object)"vlid");
        zzfpy.zze(jSONObject2, "supports", object);
        object = new JSONObject();
        string3 = zzfol2.zze().zzb();
        zzfpy.zze((JSONObject)object, "partnerName", string3);
        string3 = zzfol2.zze().zzc();
        zzfpy.zze((JSONObject)object, "partnerVersion", string3);
        zzfpy.zze(jSONObject2, "omidNativeInfo", object);
        object = new JSONObject();
        zzfpy.zze((JSONObject)object, "libraryVersion", "1.4.10-google_20240110");
        string3 = zzfpj.zzb().zza().getApplicationContext().getPackageName();
        string4 = "appId";
        zzfpy.zze((JSONObject)object, string4, string3);
        zzfpy.zze(jSONObject2, (String)object2, object);
        object = zzfol2.zzf();
        if (object != null) {
            object = zzfol2.zzf();
            object2 = "contentUrl";
            zzfpy.zze(jSONObject2, (String)object2, object);
        }
        if ((object = zzfol2.zzg()) != null) {
            object = zzfol2.zzg();
            object2 = "customReferenceData";
            zzfpy.zze(jSONObject2, (String)object2, object);
        }
        string4 = new JSONObject();
        object = zzfol2.zzh().iterator();
        boolean bl2 = object.hasNext();
        if (!bl2) {
            object2 = zzfpl.zza();
            string3 = this.zza();
            stringBuilder = jSONObject;
            ((zzfpl)object2).zzi((WebView)string3, string2, jSONObject2, (JSONObject)string4, jSONObject);
            return;
        }
        object = (zzfox)object.next();
        throw null;
    }

    public final void zzk(boolean bl2) {
        Object object = this.zzb.get();
        if (object != null) {
            boolean bl3 = true;
            String string2 = bl3 != bl2 ? "backgrounded" : "foregrounded";
            object = zzfpl.zza();
            WebView webView = this.zza();
            String string3 = this.zza;
            ((zzfpl)object).zzh(webView, string3, string2);
        }
    }

    public final void zzl(float f5) {
        zzfpl zzfpl2 = zzfpl.zza();
        WebView webView = this.zza();
        String string2 = this.zza;
        zzfpl2.zze(webView, string2, f5);
    }

    public final void zzm(WebView webView) {
        zzfqw zzfqw2;
        this.zzb = zzfqw2 = new zzfqw(webView);
    }

    public void zzn() {
    }
}

