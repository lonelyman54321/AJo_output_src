/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Bundle
 *  android.util.JsonReader
 *  org.json.JSONException
 */
package com.google.android.gms.ads.nonagon.signalgeneration;

import android.os.Bundle;
import android.util.JsonReader;
import com.google.android.gms.ads.internal.client.zzay;
import com.google.android.gms.ads.internal.util.client.zzf;
import com.google.android.gms.ads.nonagon.signalgeneration.zzax;
import com.google.android.gms.internal.ads.zzbxu;
import com.google.android.gms.internal.ads.zzebi;
import com.google.android.gms.internal.ads.zzgfa;
import com.google.android.gms.internal.ads.zzgft;
import com.google.common.util.concurrent.ListenableFuture;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import org.json.JSONException;

public final class zzau
implements zzgfa {
    public final /* synthetic */ zzbxu zza;

    public /* synthetic */ zzau(zzbxu zzbxu2) {
        this.zza = zzbxu2;
    }

    public final ListenableFuture zza(Object object) {
        object = (zzebi)object;
        InputStream inputStream = ((zzebi)object).zzb();
        InputStreamReader inputStreamReader = new InputStreamReader(inputStream);
        Object object2 = new JsonReader((Reader)inputStreamReader);
        object = ((zzebi)object).zza();
        zzax zzax2 = new zzax((JsonReader)object2, (zzbxu)object);
        object = this.zza;
        object2 = zzay.zzb();
        object = ((zzbxu)object).zza;
        object = ((zzf)object2).zzi((Bundle)object);
        object = object.toString();
        try {
            zzax2.zzb = object;
        }
        catch (JSONException jSONException) {
            zzax2.zzb = object = "{}";
        }
        return zzgft.zzh(zzax2);
    }
}

