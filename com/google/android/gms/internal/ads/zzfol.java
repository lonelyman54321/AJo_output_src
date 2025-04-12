/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.webkit.WebView
 */
package com.google.android.gms.internal.ads;

import android.webkit.WebView;
import com.google.android.gms.internal.ads.zzfom;
import com.google.android.gms.internal.ads.zzfow;
import com.google.android.gms.internal.ads.zzfqd;
import java.util.Collections;
import java.util.List;
import java.util.Map;

public final class zzfol {
    private final zzfow zza;
    private final WebView zzb;
    private final List zzc;
    private final Map zzd;
    private final String zze;
    private final String zzf;
    private final zzfom zzg;

    private zzfol(zzfow zzfow2, WebView webView, String cloneable, List list, String string2, String string3, zzfom zzfom2) {
        this.zzc = cloneable = new Cloneable();
        this.zzd = cloneable;
        this.zza = zzfow2;
        this.zzb = webView;
        this.zzg = zzfom2;
        this.zzf = string2;
        this.zze = string3;
    }

    public static zzfol zzb(zzfow zzfow2, WebView webView, String string2, String string3) {
        if (string3 != null) {
            int n3 = 256;
            String string4 = "CustomReferenceData is greater than 256 characters";
            zzfqd.zzd(string3, n3, string4);
        }
        zzfom zzfom2 = zzfom.zza;
        zzfol zzfol2 = new zzfol(zzfow2, webView, null, null, string2, string3, zzfom2);
        return zzfol2;
    }

    public static zzfol zzc(zzfow zzfow2, WebView webView, String string2, String object) {
        String string3 = "";
        zzfqd.zzd(string3, 256, "CustomReferenceData is greater than 256 characters");
        zzfom zzfom2 = zzfom.zzc;
        object = new zzfol(zzfow2, webView, null, null, string2, string3, zzfom2);
        return object;
    }

    public final WebView zza() {
        return this.zzb;
    }

    public final zzfom zzd() {
        return this.zzg;
    }

    public final zzfow zze() {
        return this.zza;
    }

    public final String zzf() {
        return this.zzf;
    }

    public final String zzg() {
        return this.zze;
    }

    public final List zzh() {
        return Collections.unmodifiableList(this.zzc);
    }

    public final Map zzi() {
        return Collections.unmodifiableMap(this.zzd);
    }
}

