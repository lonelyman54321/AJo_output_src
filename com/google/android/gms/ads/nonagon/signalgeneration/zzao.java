/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.ads.nonagon.signalgeneration;

import com.google.android.gms.ads.nonagon.signalgeneration.zzam;
import com.google.android.gms.ads.nonagon.signalgeneration.zzan;
import com.google.android.gms.internal.ads.zzbdv$zza$zza;
import java.util.HashSet;
import java.util.Locale;
import java.util.Set;

public final class zzao {
    private final String zza;

    public /* synthetic */ zzao(zzam object, zzan zzan2) {
        this.zza = object = zzam.zzc((zzam)object);
    }

    public final zzbdv$zza$zza zza() {
        int n3;
        int n4;
        int n7;
        int n8;
        block10: {
            String string2 = this.zza;
            int n10 = string2.hashCode();
            n8 = 2;
            n7 = 1;
            n4 = 3;
            switch (n10) {
                default: {
                    break;
                }
                case 1951953708: {
                    String string3 = "BANNER";
                    n3 = (int)(string2.equals(string3) ? 1 : 0);
                    if (n3 == 0) break;
                    n3 = 0;
                    string2 = null;
                    break block10;
                }
                case 543046670: {
                    String string4 = "REWARDED";
                    n3 = (int)(string2.equals(string4) ? 1 : 0);
                    if (n3 == 0) break;
                    n3 = 3;
                    break block10;
                }
                case -1372958932: {
                    String string5 = "INTERSTITIAL";
                    n3 = (int)(string2.equals(string5) ? 1 : 0);
                    if (n3 == 0) break;
                    n3 = 1;
                    break block10;
                }
                case -1999289321: {
                    String string6 = "NATIVE";
                    n3 = (int)(string2.equals(string6) ? 1 : 0);
                    if (n3 == 0) break;
                    n3 = 2;
                    break block10;
                }
            }
            n3 = -1;
        }
        if (n3 != 0) {
            if (n3 != n7) {
                if (n3 != n8) {
                    if (n3 != n4) {
                        return zzbdv$zza$zza.zza;
                    }
                    return zzbdv$zza$zza.zzh;
                }
                return zzbdv$zza$zza.zzg;
            }
            return zzbdv$zza$zza.zzd;
        }
        return zzbdv$zza$zza.zzb;
    }

    public final String zzb() {
        String string2 = this.zza;
        Locale locale = Locale.ROOT;
        return string2.toLowerCase(locale);
    }

    public final Set zzc() {
        HashSet<String> hashSet = new HashSet<String>();
        String string2 = this.zza;
        Locale locale = Locale.ROOT;
        string2 = string2.toLowerCase(locale);
        hashSet.add(string2);
        return hashSet;
    }
}

