/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Bundle
 *  android.util.JsonReader
 */
package com.google.android.gms.ads.nonagon.signalgeneration;

import android.os.Bundle;
import android.util.JsonReader;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.internal.ads.zzbeg;
import com.google.android.gms.internal.ads.zzben;
import com.google.android.gms.internal.ads.zzbep;
import com.google.android.gms.internal.ads.zzbxu;
import com.google.android.gms.internal.ads.zzdul;
import java.util.HashMap;
import java.util.Map;

public final class zzax {
    public final String zza;
    public String zzb;
    public zzbxu zzc;
    public Bundle zzd;
    private long zze;
    private long zzf;

    public zzax(JsonReader object, zzbxu object2) {
        boolean bl2;
        int n3;
        long l2;
        Object object3;
        this.zzd = object3 = new Bundle();
        this.zze = l2 = (long)-1;
        this.zzf = l2;
        this.zzc = object2;
        object2 = new HashMap();
        object.beginObject();
        Object object4 = object3 = "";
        while ((n3 = object.hasNext()) != 0) {
            String string2;
            int n4;
            int n7;
            int n8;
            String string3;
            block15: {
                string3 = object.nextName();
                if (string3 == null) {
                    string3 = object3;
                }
                int n10 = string3.hashCode();
                n8 = 2;
                n7 = 1;
                n4 = 3;
                switch (n10) {
                    default: {
                        break;
                    }
                    case 1725551537: {
                        string2 = "end_time";
                        n3 = (int)(string3.equals(string2) ? 1 : 0);
                        if (n3 == 0) break;
                        n3 = 3;
                        break block15;
                    }
                    case -271442291: {
                        string2 = "signal_dictionary";
                        n3 = (int)(string3.equals(string2) ? 1 : 0);
                        if (n3 == 0) break;
                        n3 = 1;
                        break block15;
                    }
                    case -995427962: {
                        string2 = "params";
                        n3 = (int)(string3.equals(string2) ? 1 : 0);
                        if (n3 == 0) break;
                        n3 = 0;
                        string3 = null;
                        break block15;
                    }
                    case -1573145462: {
                        string2 = "start_time";
                        n3 = (int)(string3.equals(string2) ? 1 : 0);
                        if (n3 == 0) break;
                        n3 = 2;
                        break block15;
                    }
                }
                n3 = -1;
            }
            if (n3 != 0) {
                if (n3 != n7) {
                    long l3;
                    if (n3 != n8) {
                        if (n3 != n4) {
                            object.skipValue();
                            continue;
                        }
                        this.zzf = l3 = object.nextLong();
                        continue;
                    }
                    this.zze = l3 = object.nextLong();
                    continue;
                }
                object2 = new HashMap();
                object.beginObject();
                while ((n3 = (int)(object.hasNext() ? 1 : 0)) != 0) {
                    string3 = object.nextName();
                    string2 = object.nextString();
                    ((HashMap)object2).put(string3, string2);
                }
                object.endObject();
                continue;
            }
            object4 = object.nextString();
        }
        this.zza = object4;
        object.endObject();
        object = object2.entrySet().iterator();
        while (bl2 = object.hasNext()) {
            object2 = (Map.Entry)object.next();
            object3 = object2.getKey();
            if (object3 == null || (object3 = object2.getValue()) == null) continue;
            object3 = this.zzd;
            object4 = (String)object2.getKey();
            object2 = (String)object2.getValue();
            object3.putString((String)object4, (String)object2);
        }
        object = zzbep.zzcd;
        object2 = zzba.zzc();
        object = (Boolean)((zzben)object2).zza((zzbeg)object);
        boolean bl3 = (Boolean)object;
        if (bl3 && (object = this.zzc) != null && (object = ((zzbxu)object).zzm) != null) {
            object2 = zzdul.zzh.zza();
            l2 = this.zze;
            object.putLong((String)object2, l2);
            object = this.zzc.zzm;
            object2 = zzdul.zzi.zza();
            l2 = this.zzf;
            object.putLong((String)object2, l2);
        }
    }
}

