/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.clearcut;

import com.google.android.gms.internal.clearcut.zzbu;
import com.google.android.gms.internal.clearcut.zzbx;
import com.google.android.gms.internal.clearcut.zzcf;
import com.google.android.gms.internal.clearcut.zzcg;
import com.google.android.gms.internal.clearcut.zzcg$zzg;
import com.google.android.gms.internal.clearcut.zzci;
import com.google.android.gms.internal.clearcut.zzcy;
import com.google.android.gms.internal.clearcut.zzde;
import com.google.android.gms.internal.clearcut.zzdf;
import com.google.android.gms.internal.clearcut.zzdj;
import com.google.android.gms.internal.clearcut.zzdl;
import com.google.android.gms.internal.clearcut.zzdm;
import com.google.android.gms.internal.clearcut.zzdn;
import com.google.android.gms.internal.clearcut.zzdo;
import com.google.android.gms.internal.clearcut.zzds;
import com.google.android.gms.internal.clearcut.zzdu;
import com.google.android.gms.internal.clearcut.zzdw;
import com.google.android.gms.internal.clearcut.zzdy;
import com.google.android.gms.internal.clearcut.zzef;
import com.google.android.gms.internal.clearcut.zzeg;
import com.google.android.gms.internal.clearcut.zzeh;
import com.google.android.gms.internal.clearcut.zzex;
import java.lang.reflect.Method;

final class zzdd
implements zzeg {
    private static final zzdn zzlz;
    private final zzdn zzly;

    static {
        zzde zzde2 = new zzde();
        zzlz = zzde2;
    }

    public zzdd() {
        zzcf zzcf2 = zzcf.zzay();
        zzdn zzdn2 = zzdd.zzby();
        zzdn[] zzdnArray = new zzdn[]{zzcf2, zzdn2};
        zzdf zzdf2 = new zzdf(zzdnArray);
        this(zzdf2);
    }

    private zzdd(zzdn zzdn2) {
        this.zzly = zzdn2 = (zzdn)zzci.zza((Object)zzdn2, "messageInfoFactory");
    }

    private static boolean zza(zzdm zzdm2) {
        int n3;
        int n4 = zzdm2.zzcf();
        return n4 == (n3 = zzcg$zzg.zzkl);
    }

    private static zzdn zzby() {
        String string2;
        Object object = "com.google.protobuf.DescriptorMessageInfoFactory";
        try {
            object = Class.forName((String)object);
            string2 = "getInstance";
        }
        catch (Exception exception) {
            return zzlz;
        }
        object = ((Class)object).getDeclaredMethod(string2, null);
        object = ((Method)object).invoke(null, null);
        return (zzdn)object;
    }

    public final zzef zzd(Class object) {
        zzeh.zzf((Class)object);
        Object object2 = this.zzly;
        zzdm zzdm2 = object2.zzb((Class)object);
        boolean bl2 = zzdm2.zzcg();
        Object object3 = zzcg.class;
        if (bl2) {
            boolean bl3 = ((Class)object3).isAssignableFrom((Class<?>)object);
            if (bl3) {
                object = zzeh.zzdo();
                object2 = zzbx.zzap();
                object3 = zzdm2.zzch();
                return zzdu.zza((zzex)object, (zzbu)object2, (zzdo)object3);
            }
            object = zzeh.zzdm();
            object2 = zzbx.zzaq();
            object3 = zzdm2.zzch();
            return zzdu.zza((zzex)object, (zzbu)object2, (zzdo)object3);
        }
        bl2 = ((Class)object3).isAssignableFrom((Class<?>)object);
        if (bl2) {
            bl2 = zzdd.zza(zzdm2);
            zzdw zzdw2 = zzdy.zzck();
            zzcy zzcy2 = zzcy.zzbw();
            zzex zzex2 = zzeh.zzdo();
            if (bl2) {
                zzbu zzbu2 = zzbx.zzap();
                zzdj zzdj2 = zzdl.zzcd();
                object3 = object;
                return zzds.zza((Class)object, zzdm2, zzdw2, zzcy2, zzex2, zzbu2, zzdj2);
            }
            zzdj zzdj3 = zzdl.zzcd();
            object3 = object;
            return zzds.zza((Class)object, zzdm2, zzdw2, zzcy2, zzex2, null, zzdj3);
        }
        bl2 = zzdd.zza(zzdm2);
        zzdw zzdw3 = zzdy.zzcj();
        zzcy zzcy3 = zzcy.zzbv();
        if (bl2) {
            zzex zzex3 = zzeh.zzdm();
            zzbu zzbu3 = zzbx.zzaq();
            zzdj zzdj4 = zzdl.zzcc();
            object3 = object;
            return zzds.zza((Class)object, zzdm2, zzdw3, zzcy3, zzex3, zzbu3, zzdj4);
        }
        zzex zzex4 = zzeh.zzdn();
        zzdj zzdj5 = zzdl.zzcc();
        object3 = object;
        return zzds.zza((Class)object, zzdm2, zzdw3, zzcy3, zzex4, null, zzdj5);
    }
}

