/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.util.JsonWriter
 */
package com.google.android.gms.ads.internal.util.client;

import android.util.JsonWriter;
import com.google.android.gms.ads.internal.util.client.zzf;
import com.google.android.gms.ads.internal.util.client.zzk;
import com.google.android.gms.common.util.Base64Utils;

public final class zzh
implements zzk {
    public final /* synthetic */ byte[] zza;

    public /* synthetic */ zzh(byte[] byArray) {
        this.zza = byArray;
    }

    public final void zza(JsonWriter jsonWriter) {
        jsonWriter.name("params").beginObject();
        Object object = this.zza;
        int n3 = ((byte[])object).length;
        object = Base64Utils.encode(object);
        int n4 = 10000;
        if (n3 < n4) {
            JsonWriter jsonWriter2 = jsonWriter.name("body");
            jsonWriter2.value((String)object);
        } else if ((object = (Object)zzf.zzf((String)object)) != null) {
            JsonWriter jsonWriter3 = jsonWriter.name("bodydigest");
            jsonWriter3.value((String)object);
        }
        object = jsonWriter.name("bodylength");
        long l2 = n3;
        object.value(l2);
        jsonWriter.endObject();
    }
}

