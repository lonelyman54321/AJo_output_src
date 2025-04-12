/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzghk;
import com.google.android.gms.internal.ads.zzgox;
import com.google.android.gms.internal.ads.zzgqi;
import com.google.android.gms.internal.ads.zzgqk;
import com.google.android.gms.internal.ads.zzgtk;
import com.google.android.gms.internal.ads.zzgtl;
import com.google.android.gms.internal.ads.zzgtn;
import com.google.android.gms.internal.ads.zzgtr;
import java.security.GeneralSecurityException;
import java.util.Iterator;
import java.util.List;

public final class zzgoy {
    public static final zzgtl zza;

    static {
        zzgox zzgox2 = new zzgox(null);
        zza = zzgox2;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static zzgtr zza(zzgqk object) {
        Object object2 = new zzgtn();
        Object object3 = ((zzgqk)object).zzc();
        ((zzgtn)object2).zzb((zzgtk)object3);
        object3 = ((zzgqk)object).zze().iterator();
        block2: while (true) {
            boolean bl2;
            if (!(bl2 = object3.hasNext())) {
                object3 = ((zzgqk)object).zzb();
                if (object3 != null) {
                    object = ((zzgqk)object).zzb();
                    int n3 = ((zzgqi)object).zza();
                    ((zzgtn)object2).zzc(n3);
                }
                try {
                    return ((zzgtn)object2).zzd();
                }
                catch (GeneralSecurityException generalSecurityException) {
                    object2 = new IllegalStateException(generalSecurityException);
                    throw object2;
                }
            }
            Iterator iterator = ((List)object3.next()).iterator();
            while (true) {
                int n4;
                boolean bl3;
                if (!(bl3 = iterator.hasNext())) continue block2;
                Object object4 = (zzgqi)iterator.next();
                Object object5 = ((zzgqi)object4).zzb();
                int n7 = ((Enum)object5).ordinal();
                if (n7 != (n4 = 1)) {
                    n4 = 2;
                    if (n7 != n4) {
                        n4 = 3;
                        if (n7 != n4) {
                            object = new IllegalStateException("Unknown key status");
                            throw object;
                        }
                        object5 = zzghk.zzc;
                    } else {
                        object5 = zzghk.zzb;
                    }
                } else {
                    object5 = zzghk.zza;
                }
                n4 = ((zzgqi)object4).zza();
                String string2 = ((zzgqi)object4).zzf();
                String string3 = "type.googleapis.com/google.crypto.";
                int n8 = string2.startsWith(string3);
                if (n8 != 0) {
                    n8 = 34;
                    string2 = string2.substring(n8);
                }
                object4 = ((zzgqi)object4).zzc().name();
                ((zzgtn)object2).zza((zzghk)object5, n4, string2, (String)object4);
            }
            break;
        }
    }
}

