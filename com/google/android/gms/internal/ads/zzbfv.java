/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzbhb;

public class zzbfv {
    private final String zza;
    private final Object zzb;
    private final int zzc;

    public zzbfv(String string2, Object object, int n3) {
        this.zza = string2;
        this.zzb = object;
        this.zzc = n3;
    }

    public static zzbfv zza(String string2, double d2) {
        Double d5 = d2;
        zzbfv zzbfv2 = new zzbfv(string2, d5, 3);
        return zzbfv2;
    }

    public static zzbfv zzb(String string2, long l2) {
        Long l3 = l2;
        zzbfv zzbfv2 = new zzbfv(string2, l3, 2);
        return zzbfv2;
    }

    public static zzbfv zzc(String string2, String string3) {
        zzbfv zzbfv2 = new zzbfv(string2, string3, 4);
        return zzbfv2;
    }

    public static zzbfv zzd(String string2, boolean bl2) {
        Boolean bl3 = bl2;
        zzbfv zzbfv2 = new zzbfv(string2, bl3, 1);
        return zzbfv2;
    }

    public final Object zze() {
        Object object = zzbhb.zza();
        if (object == null) {
            object = zzbhb.zzb();
            if (object != null) {
                object = zzbhb.zzb();
                object.zza();
            }
            return this.zzb;
        }
        int n3 = this.zzc + -1;
        if (n3 != 0) {
            int n4 = 1;
            if (n3 != n4) {
                n4 = 2;
                if (n3 != n4) {
                    String string2 = this.zza;
                    String string3 = (String)this.zzb;
                    return object.zzd(string2, string3);
                }
                String string4 = this.zza;
                double d2 = (Double)this.zzb;
                return object.zzb(string4, d2);
            }
            String string5 = this.zza;
            long l2 = (Long)this.zzb;
            return object.zzc(string5, l2);
        }
        String string6 = this.zza;
        boolean bl2 = (Boolean)this.zzb;
        return object.zza(string6, bl2);
    }
}

