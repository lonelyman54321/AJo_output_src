/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.json.JSONObject
 */
package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzbxx;
import com.google.android.gms.internal.ads.zzedp;
import com.google.android.gms.internal.ads.zzeed;
import com.google.android.gms.internal.ads.zzfkw;
import java.io.InputStream;
import java.io.InputStreamReader;
import org.json.JSONObject;

public final class zzecm
implements zzfkw {
    public final /* synthetic */ JSONObject zza;
    public final /* synthetic */ zzbxx zzb;

    public /* synthetic */ zzecm(JSONObject jSONObject, zzbxx zzbxx2) {
        this.zza = jSONObject;
        this.zzb = zzbxx2;
    }

    public final Object zza(Object object) {
        object = (InputStream)object;
        InputStreamReader inputStreamReader = new InputStreamReader((InputStream)object);
        object = zzeed.zza(inputStreamReader);
        inputStreamReader = this.zza;
        zzbxx zzbxx2 = this.zzb;
        zzedp zzedp2 = new zzedp((zzeed)object, (JSONObject)inputStreamReader, zzbxx2);
        return zzedp2;
    }
}

