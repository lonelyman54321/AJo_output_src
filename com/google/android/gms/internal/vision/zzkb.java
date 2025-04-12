/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.vision;

import com.google.android.gms.internal.vision.zziq;
import com.google.android.gms.internal.vision.zzir;
import com.google.android.gms.internal.vision.zzjb;
import com.google.android.gms.internal.vision.zzjc;
import com.google.android.gms.internal.vision.zzjf;
import com.google.android.gms.internal.vision.zzju;
import com.google.android.gms.internal.vision.zzka;
import com.google.android.gms.internal.vision.zzkd;
import com.google.android.gms.internal.vision.zzkh;
import com.google.android.gms.internal.vision.zzki;
import com.google.android.gms.internal.vision.zzkj;
import com.google.android.gms.internal.vision.zzkk;
import com.google.android.gms.internal.vision.zzkl;
import com.google.android.gms.internal.vision.zzko;
import com.google.android.gms.internal.vision.zzkq;
import com.google.android.gms.internal.vision.zzks;
import com.google.android.gms.internal.vision.zzku;
import com.google.android.gms.internal.vision.zzkz;
import com.google.android.gms.internal.vision.zzlc;
import com.google.android.gms.internal.vision.zzle;
import com.google.android.gms.internal.vision.zzlf;
import com.google.android.gms.internal.vision.zzlu;
import java.lang.reflect.Method;

final class zzkb
implements zzlf {
    private static final zzkl zzb;
    private final zzkl zza;

    static {
        zzka zzka2 = new zzka();
        zzb = zzka2;
    }

    public zzkb() {
        zzjc zzjc2 = zzjc.zza();
        zzkl zzkl2 = zzkb.zza();
        zzkl[] zzklArray = new zzkl[]{zzjc2, zzkl2};
        zzkd zzkd2 = new zzkd(zzklArray);
        this(zzkd2);
    }

    private zzkb(zzkl zzkl2) {
        this.zza = zzkl2 = (zzkl)zzjf.zza((Object)zzkl2, "messageInfoFactory");
    }

    private static zzkl zza() {
        String string2;
        Object object = "com.google.protobuf.DescriptorMessageInfoFactory";
        try {
            object = Class.forName((String)object);
            string2 = "getInstance";
        }
        catch (Exception exception) {
            return zzb;
        }
        object = ((Class)object).getDeclaredMethod(string2, null);
        object = ((Method)object).invoke(null, null);
        return (zzkl)object;
    }

    private static boolean zza(zzki zzki2) {
        int n3;
        int n4 = zzki2.zza();
        return n4 == (n3 = zzkz.zza);
    }

    public final zzlc zza(Class object) {
        zzle.zza((Class)object);
        Object object2 = this.zza;
        zzki zzki2 = object2.zzb((Class)object);
        boolean bl2 = zzki2.zzb();
        Object object3 = zzjb.class;
        if (bl2) {
            boolean bl3 = ((Class)object3).isAssignableFrom((Class<?>)object);
            if (bl3) {
                object = zzle.zzc();
                object2 = zzir.zza();
                object3 = zzki2.zzc();
                return zzkq.zza((zzlu)object, (zziq)object2, (zzkk)object3);
            }
            object = zzle.zza();
            object2 = zzir.zzb();
            object3 = zzki2.zzc();
            return zzkq.zza((zzlu)object, (zziq)object2, (zzkk)object3);
        }
        bl2 = ((Class)object3).isAssignableFrom((Class<?>)object);
        if (bl2) {
            bl2 = zzkb.zza(zzki2);
            if (bl2) {
                zzks zzks2 = zzku.zzb();
                zzju zzju2 = zzju.zzb();
                zzlu zzlu2 = zzle.zzc();
                zziq zziq2 = zzir.zza();
                zzkh zzkh2 = zzkj.zzb();
                object3 = object;
                return zzko.zza((Class)object, zzki2, zzks2, zzju2, zzlu2, zziq2, zzkh2);
            }
            zzks zzks3 = zzku.zzb();
            zzju zzju3 = zzju.zzb();
            zzlu zzlu3 = zzle.zzc();
            zzkh zzkh3 = zzkj.zzb();
            object3 = object;
            return zzko.zza((Class)object, zzki2, zzks3, zzju3, zzlu3, null, zzkh3);
        }
        bl2 = zzkb.zza(zzki2);
        if (bl2) {
            zzks zzks4 = zzku.zza();
            zzju zzju4 = zzju.zza();
            zzlu zzlu4 = zzle.zza();
            zziq zziq3 = zzir.zzb();
            zzkh zzkh4 = zzkj.zza();
            object3 = object;
            return zzko.zza((Class)object, zzki2, zzks4, zzju4, zzlu4, zziq3, zzkh4);
        }
        zzks zzks5 = zzku.zza();
        zzju zzju5 = zzju.zza();
        zzlu zzlu5 = zzle.zzb();
        zzkh zzkh5 = zzkj.zza();
        object3 = object;
        return zzko.zza((Class)object, zzki2, zzks5, zzju5, zzlu5, null, zzkh5);
    }
}

