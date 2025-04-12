/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.SharedPreferences
 *  android.content.SharedPreferences$Editor
 *  android.util.Pair
 */
package com.google.android.gms.internal.gtm;

import android.content.SharedPreferences;
import android.util.Pair;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.gtm.zzet;
import com.google.android.gms.internal.gtm.zzeu;
import java.util.UUID;

public final class zzes {
    final /* synthetic */ zzeu zza;
    private final String zzb;
    private final long zzc;

    public /* synthetic */ zzes(zzeu object, String string2, long l2, zzet zzet2) {
        this.zza = object;
        object = "monitoring";
        Preconditions.checkNotEmpty((String)object);
        long l3 = 0L;
        long l4 = l2 == l3 ? 0 : (l2 < l3 ? -1 : 1);
        l4 = l4 > 0 ? (long)1 : (long)0;
        Preconditions.checkArgument((boolean)l4);
        this.zzb = object;
        this.zzc = l2;
    }

    private final long zzd() {
        SharedPreferences sharedPreferences2 = zzeu.zzc(this.zza);
        String string2 = this.zzf();
        return sharedPreferences2.getLong(string2, 0L);
    }

    private final String zze() {
        return this.zzb.concat(":count");
    }

    private final String zzf() {
        return this.zzb.concat(":start");
    }

    private final void zzg() {
        long l2 = this.zza.zzC().currentTimeMillis();
        SharedPreferences.Editor editor = zzeu.zzc(this.zza).edit();
        String string2 = this.zze();
        editor.remove(string2);
        string2 = this.zzb();
        editor.remove(string2);
        string2 = this.zzf();
        editor.putLong(string2, l2);
        editor.commit();
    }

    public final Pair zza() {
        long l2;
        Object object;
        long l3;
        long l4 = this.zzd();
        long l7 = l4 - (l3 = 0L);
        Object object2 = l7 == 0L ? 0 : (l7 < 0L ? -1 : 1);
        if (object2 == false) {
            l4 = l3;
        } else {
            object = this.zza.zzC();
            l2 = object.currentTimeMillis();
            l4 = Math.abs(l4 - l2);
        }
        l2 = this.zzc;
        long l8 = l4 == l2 ? 0 : (l4 < l2 ? -1 : 1);
        if (l8 >= 0) {
            long l12;
            long l14;
            if ((l8 = (l14 = l4 - (l2 += l2)) == 0L ? 0 : (l14 < 0L ? -1 : 1)) > 0) {
                this.zzg();
                return null;
            }
            Object object3 = zzeu.zzc(this.zza);
            String string2 = this.zzb();
            object3 = object3.getString(string2, null);
            string2 = zzeu.zzc(this.zza);
            object = this.zze();
            l2 = string2.getLong((String)object, l3);
            this.zzg();
            if (object3 != null && (l12 = l2 == l3 ? 0 : (l2 < l3 ? -1 : 1)) > 0) {
                Long l15 = l2;
                string2 = new Pair(object3, (Object)l15);
                return string2;
            }
        }
        return null;
    }

    public final String zzb() {
        return this.zzb.concat(":value");
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void zzc(String string2) {
        long l2;
        long l3 = this.zzd();
        long l4 = l3 - (l2 = 0L);
        Object object = l4 == 0L ? 0 : (l4 < 0L ? -1 : 1);
        if (object == false) {
            this.zzg();
        }
        if (string2 == null) {
            string2 = "";
        }
        synchronized (this) {
            Throwable throwable2;
            block8: {
                long l7;
                try {
                    zzeu zzeu2 = this.zza;
                    zzeu2 = zzeu.zzc(zzeu2);
                    String string3 = this.zze();
                    l3 = zzeu2.getLong(string3, l2);
                    l7 = 1L;
                    long l8 = l3 == l2 ? 0 : (l3 < l2 ? -1 : 1);
                    if (l8 <= 0) {
                        zzeu2 = this.zza;
                        zzeu2 = zzeu.zzc(zzeu2);
                        zzeu2 = zzeu2.edit();
                        string3 = this.zzb();
                        zzeu2.putString(string3, string2);
                        string2 = this.zze();
                        zzeu2.putLong(string2, l7);
                        zzeu2.apply();
                        return;
                    }
                }
                catch (Throwable throwable2) {
                    break block8;
                }
                Object object2 = UUID.randomUUID();
                l2 = ((UUID)object2).getLeastSignificantBits();
                long l12 = Long.MAX_VALUE;
                l2 &= l12;
                zzeu zzeu3 = this.zza;
                zzeu3 = zzeu.zzc(zzeu3);
                zzeu3 = zzeu3.edit();
                long l14 = l2 - (l12 /= (l3 += l7));
                long l15 = l14 == 0L ? 0 : (l14 < 0L ? -1 : 1);
                if (l15 < 0) {
                    object2 = this.zzb();
                    zzeu3.putString((String)object2, string2);
                }
                string2 = this.zze();
                zzeu3.putLong(string2, l3);
                zzeu3.apply();
                return;
            }
            throw throwable2;
        }
    }
}

