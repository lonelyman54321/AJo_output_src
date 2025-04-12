/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzhaz;
import com.google.android.gms.internal.ads.zzhbb;
import com.google.android.gms.internal.ads.zzhbh;
import com.google.android.gms.internal.ads.zzhbo;
import com.google.android.gms.internal.ads.zzhcb;
import com.google.android.gms.internal.ads.zzhcs;
import com.google.android.gms.internal.ads.zzhcu;
import com.google.android.gms.internal.ads.zzhcv;
import com.google.android.gms.internal.ads.zzhcz;
import com.google.android.gms.internal.ads.zzhda;
import com.google.android.gms.internal.ads.zzhdb;
import com.google.android.gms.internal.ads.zzhdc;
import com.google.android.gms.internal.ads.zzhde;
import com.google.android.gms.internal.ads.zzhdh;
import com.google.android.gms.internal.ads.zzhdi;
import com.google.android.gms.internal.ads.zzhdk;
import com.google.android.gms.internal.ads.zzhdl;
import com.google.android.gms.internal.ads.zzhdz;
import com.google.android.gms.internal.ads.zzhea;
import com.google.android.gms.internal.ads.zzheb;
import com.google.android.gms.internal.ads.zzheq;
import java.lang.reflect.Method;

final class zzhcw
implements zzhea {
    private static final zzhdc zza;
    private final zzhdc zzb;

    static {
        zzhcu zzhcu2 = new zzhcu();
        zza = zzhcu2;
    }

    public zzhcw() {
        Object object = zzhbh.zza();
        Object object2 = "com.google.protobuf.DescriptorMessageInfoFactory";
        object2 = Class.forName((String)object2);
        zzhdc[] zzhdcArray = "getInstance";
        object2 = ((Class)object2).getDeclaredMethod((String)zzhdcArray, null);
        object2 = ((Method)object2).invoke(null, null);
        try {
            object2 = (zzhdc)object2;
        }
        catch (Exception exception) {
            object2 = zza;
        }
        zzhdcArray = new zzhdc[]{object, object2};
        zzhcv zzhcv2 = new zzhcv(zzhdcArray);
        object = zzhcb.zzd;
        this.zzb = zzhcv2;
    }

    private static boolean zzb(zzhdb zzhdb2) {
        boolean bl2;
        boolean bl3 = zzhdb2.zzc() + -1;
        if (bl3 != (bl2 = true)) {
            return bl2;
        }
        return false;
    }

    public final zzhdz zza(Class object) {
        zzheb.zzs((Class)object);
        Object object2 = this.zzb;
        zzhdb zzhdb2 = object2.zzb((Class)object);
        boolean bl2 = zzhdb2.zzb();
        Object object3 = zzhbo.class;
        if (bl2) {
            boolean bl3 = ((Class)object3).isAssignableFrom((Class<?>)object);
            if (bl3) {
                object = zzheb.zzn();
                object2 = zzhbb.zzb();
                object3 = zzhdb2.zza();
                return zzhdi.zzc((zzheq)object, (zzhaz)object2, (zzhde)object3);
            }
            object = zzheb.zzm();
            object2 = zzhbb.zza();
            object3 = zzhdb2.zza();
            return zzhdi.zzc((zzheq)object, (zzhaz)object2, (zzhde)object3);
        }
        bl2 = ((Class)object3).isAssignableFrom((Class<?>)object);
        if (bl2) {
            bl2 = zzhcw.zzb(zzhdb2);
            if (bl2) {
                zzhdk zzhdk2 = zzhdl.zzb();
                zzhcs zzhcs2 = zzhcs.zze();
                zzheq zzheq2 = zzheb.zzn();
                zzhaz zzhaz2 = zzhbb.zzb();
                zzhcz zzhcz2 = zzhda.zzb();
                object3 = object;
                object = zzhdh.zzm((Class)object, zzhdb2, zzhdk2, zzhcs2, zzheq2, zzhaz2, zzhcz2);
            } else {
                zzhdk zzhdk3 = zzhdl.zzb();
                zzhcs zzhcs3 = zzhcs.zze();
                zzheq zzheq3 = zzheb.zzn();
                Object var10_20 = null;
                zzhcz zzhcz3 = zzhda.zzb();
                object3 = object;
                object = zzhdh.zzm((Class)object, zzhdb2, zzhdk3, zzhcs3, zzheq3, null, zzhcz3);
            }
        } else {
            bl2 = zzhcw.zzb(zzhdb2);
            if (bl2) {
                zzhdk zzhdk4 = zzhdl.zza();
                zzhcs zzhcs4 = zzhcs.zzd();
                zzheq zzheq4 = zzheb.zzm();
                zzhaz zzhaz3 = zzhbb.zza();
                zzhcz zzhcz4 = zzhda.zza();
                object3 = object;
                object = zzhdh.zzm((Class)object, zzhdb2, zzhdk4, zzhcs4, zzheq4, zzhaz3, zzhcz4);
            } else {
                zzhdk zzhdk5 = zzhdl.zza();
                zzhcs zzhcs5 = zzhcs.zzd();
                zzheq zzheq5 = zzheb.zzm();
                Object var10_22 = null;
                zzhcz zzhcz5 = zzhda.zza();
                object3 = object;
                object = zzhdh.zzm((Class)object, zzhdb2, zzhdk5, zzhcs5, zzheq5, null, zzhcz5);
            }
        }
        return object;
    }
}

