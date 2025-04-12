/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.auth;

import com.google.android.gms.internal.auth.zzel;
import com.google.android.gms.internal.auth.zzen;
import com.google.android.gms.internal.auth.zzer;
import com.google.android.gms.internal.auth.zzeu;
import com.google.android.gms.internal.auth.zzez;
import com.google.android.gms.internal.auth.zzfk;
import com.google.android.gms.internal.auth.zzfm;
import com.google.android.gms.internal.auth.zzfn;
import com.google.android.gms.internal.auth.zzfr;
import com.google.android.gms.internal.auth.zzfs;
import com.google.android.gms.internal.auth.zzft;
import com.google.android.gms.internal.auth.zzfu;
import com.google.android.gms.internal.auth.zzfw;
import com.google.android.gms.internal.auth.zzfz;
import com.google.android.gms.internal.auth.zzga;
import com.google.android.gms.internal.auth.zzgb;
import com.google.android.gms.internal.auth.zzgc;
import com.google.android.gms.internal.auth.zzgh;
import com.google.android.gms.internal.auth.zzgi;
import com.google.android.gms.internal.auth.zzgj;
import com.google.android.gms.internal.auth.zzgy;
import java.lang.reflect.Method;

final class zzfo
implements zzgi {
    private static final zzfu zza;
    private final zzfu zzb;

    static {
        zzfm zzfm2 = new zzfm();
        zza = zzfm2;
    }

    public zzfo() {
        zzer zzer2 = zzer.zza();
        Object object = "com.google.protobuf.DescriptorMessageInfoFactory";
        object = Class.forName((String)object);
        zzfu[] zzfuArray = "getInstance";
        object = ((Class)object).getDeclaredMethod((String)zzfuArray, null);
        object = ((Method)object).invoke(null, null);
        try {
            object = (zzfu)object;
        }
        catch (Exception exception) {
            object = zza;
        }
        zzfuArray = new zzfu[]{zzer2, object};
        zzfn zzfn2 = new zzfn(zzfuArray);
        zzez.zzf(zzfn2, "messageInfoFactory");
        this.zzb = zzfn2;
    }

    private static boolean zzb(zzft zzft2) {
        int n3;
        int n4 = zzft2.zzc();
        if (n4 == (n3 = 1)) {
            return n3 != 0;
        }
        return false;
    }

    public final zzgh zza(Class object) {
        zzgj.zzg((Class)object);
        Object object2 = this.zzb;
        zzft zzft2 = object2.zzb((Class)object);
        boolean bl2 = zzft2.zzb();
        Object object3 = zzeu.class;
        if (bl2) {
            boolean bl3 = ((Class)object3).isAssignableFrom((Class<?>)object);
            if (bl3) {
                object = zzgj.zzc();
                object2 = zzen.zzb();
                object3 = zzft2.zza();
                return zzga.zzb((zzgy)object, (zzel)object2, (zzfw)object3);
            }
            object = zzgj.zza();
            object2 = zzen.zza();
            object3 = zzft2.zza();
            return zzga.zzb((zzgy)object, (zzel)object2, (zzfw)object3);
        }
        bl2 = ((Class)object3).isAssignableFrom((Class<?>)object);
        if (bl2) {
            bl2 = zzfo.zzb(zzft2);
            if (bl2) {
                zzgb zzgb2 = zzgc.zzb();
                zzfk zzfk2 = zzfk.zzd();
                zzgy zzgy2 = zzgj.zzc();
                zzel zzel2 = zzen.zzb();
                zzfr zzfr2 = zzfs.zzb();
                object3 = object;
                object = zzfz.zzj((Class)object, zzft2, zzgb2, zzfk2, zzgy2, zzel2, zzfr2);
            } else {
                zzgb zzgb3 = zzgc.zzb();
                zzfk zzfk3 = zzfk.zzd();
                zzgy zzgy3 = zzgj.zzc();
                Object var10_20 = null;
                zzfr zzfr3 = zzfs.zzb();
                object3 = object;
                object = zzfz.zzj((Class)object, zzft2, zzgb3, zzfk3, zzgy3, null, zzfr3);
            }
        } else {
            bl2 = zzfo.zzb(zzft2);
            if (bl2) {
                zzgb zzgb4 = zzgc.zza();
                zzfk zzfk4 = zzfk.zzc();
                zzgy zzgy4 = zzgj.zza();
                zzel zzel3 = zzen.zza();
                zzfr zzfr4 = zzfs.zza();
                object3 = object;
                object = zzfz.zzj((Class)object, zzft2, zzgb4, zzfk4, zzgy4, zzel3, zzfr4);
            } else {
                zzgb zzgb5 = zzgc.zza();
                zzfk zzfk5 = zzfk.zzc();
                zzgy zzgy5 = zzgj.zzb();
                Object var10_22 = null;
                zzfr zzfr5 = zzfs.zza();
                object3 = object;
                object = zzfz.zzj((Class)object, zzft2, zzgb5, zzfk5, zzgy5, null, zzfr5);
            }
        }
        return object;
    }
}

