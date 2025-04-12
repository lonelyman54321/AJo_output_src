/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.icing;

import com.google.android.gms.internal.icing.zzcq;
import com.google.android.gms.internal.icing.zzcs;
import com.google.android.gms.internal.icing.zzcw;
import com.google.android.gms.internal.icing.zzda;
import com.google.android.gms.internal.icing.zzdh;
import com.google.android.gms.internal.icing.zzds;
import com.google.android.gms.internal.icing.zzdu;
import com.google.android.gms.internal.icing.zzdv;
import com.google.android.gms.internal.icing.zzdz;
import com.google.android.gms.internal.icing.zzea;
import com.google.android.gms.internal.icing.zzeb;
import com.google.android.gms.internal.icing.zzec;
import com.google.android.gms.internal.icing.zzee;
import com.google.android.gms.internal.icing.zzeh;
import com.google.android.gms.internal.icing.zzei;
import com.google.android.gms.internal.icing.zzej;
import com.google.android.gms.internal.icing.zzek;
import com.google.android.gms.internal.icing.zzep;
import com.google.android.gms.internal.icing.zzeq;
import com.google.android.gms.internal.icing.zzer;
import com.google.android.gms.internal.icing.zzfd;
import java.lang.reflect.Method;

final class zzdw
implements zzeq {
    private static final zzec zzb;
    private final zzec zza;

    static {
        zzdu zzdu2 = new zzdu();
        zzb = zzdu2;
    }

    public zzdw() {
        zzcw zzcw2 = zzcw.zza();
        Object object = "com.google.protobuf.DescriptorMessageInfoFactory";
        object = Class.forName((String)object);
        zzec[] zzecArray = "getInstance";
        object = ((Class)object).getDeclaredMethod((String)zzecArray, null);
        object = ((Method)object).invoke(null, null);
        try {
            object = (zzec)object;
        }
        catch (Exception exception) {
            object = zzb;
        }
        zzecArray = new zzec[]{zzcw2, object};
        zzdv zzdv2 = new zzdv(zzecArray);
        zzdh.zzb(zzdv2, "messageInfoFactory");
        this.zza = zzdv2;
    }

    private static boolean zzb(zzeb zzeb2) {
        int n3;
        int n4 = zzeb2.zzc();
        if (n4 == (n3 = 1)) {
            return n3 != 0;
        }
        return false;
    }

    public final zzep zza(Class object) {
        zzer.zza((Class)object);
        Object object2 = this.zza;
        zzeb zzeb2 = object2.zzc((Class)object);
        boolean bl2 = zzeb2.zza();
        Object object3 = zzda.class;
        if (bl2) {
            boolean bl3 = ((Class)object3).isAssignableFrom((Class<?>)object);
            if (bl3) {
                object = zzer.zzC();
                object2 = zzcs.zza();
                object3 = zzeb2.zzb();
                return zzei.zzg((zzfd)object, (zzcq)object2, (zzee)object3);
            }
            object = zzer.zzA();
            object2 = zzcs.zzb();
            object3 = zzeb2.zzb();
            return zzei.zzg((zzfd)object, (zzcq)object2, (zzee)object3);
        }
        bl2 = ((Class)object3).isAssignableFrom((Class<?>)object);
        if (bl2) {
            bl2 = zzdw.zzb(zzeb2);
            if (bl2) {
                zzej zzej2 = zzek.zzb();
                zzds zzds2 = zzds.zzd();
                zzfd zzfd2 = zzer.zzC();
                zzcq zzcq2 = zzcs.zza();
                zzdz zzdz2 = zzea.zzb();
                object3 = object;
                object = zzeh.zzg((Class)object, zzeb2, zzej2, zzds2, zzfd2, zzcq2, zzdz2);
            } else {
                zzej zzej3 = zzek.zzb();
                zzds zzds3 = zzds.zzd();
                zzfd zzfd3 = zzer.zzC();
                Object var10_20 = null;
                zzdz zzdz3 = zzea.zzb();
                object3 = object;
                object = zzeh.zzg((Class)object, zzeb2, zzej3, zzds3, zzfd3, null, zzdz3);
            }
        } else {
            bl2 = zzdw.zzb(zzeb2);
            if (bl2) {
                zzej zzej4 = zzek.zza();
                zzds zzds4 = zzds.zzc();
                zzfd zzfd4 = zzer.zzA();
                zzcq zzcq3 = zzcs.zzb();
                zzdz zzdz4 = zzea.zza();
                object3 = object;
                object = zzeh.zzg((Class)object, zzeb2, zzej4, zzds4, zzfd4, zzcq3, zzdz4);
            } else {
                zzej zzej5 = zzek.zza();
                zzds zzds5 = zzds.zzc();
                zzfd zzfd5 = zzer.zzB();
                Object var10_22 = null;
                zzdz zzdz5 = zzea.zza();
                object3 = object;
                object = zzeh.zzg((Class)object, zzeb2, zzej5, zzds5, zzfd5, null, zzdz5);
            }
        }
        return object;
    }
}

