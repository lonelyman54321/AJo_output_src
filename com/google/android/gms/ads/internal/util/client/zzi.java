/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.util.JsonWriter
 */
package com.google.android.gms.ads.internal.util.client;

import android.util.JsonWriter;
import com.google.android.gms.ads.internal.util.client.zzk;

public final class zzi
implements zzk {
    public final /* synthetic */ String zza;

    public /* synthetic */ zzi(String string2) {
        this.zza = string2;
    }

    public final void zza(JsonWriter jsonWriter) {
        jsonWriter.name("params").beginObject();
        String string2 = this.zza;
        if (string2 != null) {
            JsonWriter jsonWriter2 = jsonWriter.name("error_description");
            jsonWriter2.value(string2);
        }
        jsonWriter.endObject();
    }
}

