/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.util.JsonReader
 */
package com.google.android.gms.internal.ads;

import android.util.JsonReader;
import java.util.ArrayList;
import java.util.List;

public final class zzfgu {
    public final int zza;
    public final int zzb;
    public final boolean zzc;

    public zzfgu(int n3, int n4, boolean bl2) {
        this.zza = n3;
        this.zzb = n4;
        this.zzc = bl2;
    }

    public static List zza(JsonReader jsonReader) {
        int n3;
        ArrayList<Object> arrayList = new ArrayList<Object>();
        jsonReader.beginArray();
        while ((n3 = jsonReader.hasNext()) != 0) {
            Object object;
            boolean bl2;
            jsonReader.beginObject();
            n3 = 0;
            int n4 = 0;
            boolean bl3 = false;
            while (bl2 = jsonReader.hasNext()) {
                String string2 = "width";
                object = jsonReader.nextName();
                boolean bl4 = string2.equals(object);
                if (bl4) {
                    n3 = jsonReader.nextInt();
                    continue;
                }
                string2 = "height";
                bl4 = string2.equals(object);
                if (bl4) {
                    n4 = jsonReader.nextInt();
                    continue;
                }
                string2 = "is_fluid_height";
                bl2 = string2.equals(object);
                if (bl2) {
                    bl3 = jsonReader.nextBoolean();
                    continue;
                }
                jsonReader.skipValue();
            }
            jsonReader.endObject();
            object = new zzfgu(n3, n4, bl3);
            arrayList.add(object);
        }
        jsonReader.endArray();
        return arrayList;
    }
}

