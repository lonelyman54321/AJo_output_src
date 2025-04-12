/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 */
package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.internal.ads.zzcu;
import com.google.android.gms.internal.ads.zzcv;
import com.google.android.gms.internal.ads.zzdq;
import com.google.android.gms.internal.ads.zzdr;
import com.google.android.gms.internal.ads.zzdt;
import com.google.android.gms.internal.ads.zzt;
import com.google.android.gms.internal.ads.zzw;
import java.lang.reflect.Constructor;
import java.util.List;
import java.util.concurrent.Executor;

final class zzaaw
implements zzcu {
    private final zzdr zza;

    public zzaaw(zzdr zzdr2) {
        this.zza = zzdr2;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final zzcv zza(Context context, zzt zzt2, zzw zzw2, zzdt zzdt2, Executor executor, List list, long l2) {
        zzdq zzdq2;
        zzdq zzdq22;
        int n3;
        block5: {
            Object object;
            Object var9_8 = null;
            n3 = 1;
            Constructor constructor = "androidx.media3.effect.PreviewingSingleInputVideoGraph$Factory";
            try {
                constructor = Class.forName((String)((Object)constructor));
                Object classArray = new Class[n3];
                object = zzdr.class;
                classArray[0] = object;
                constructor = ((Class)((Object)constructor)).getConstructor((Class<?>)classArray);
                classArray = this;
            }
            catch (Exception exception) {
                zzaaw zzaaw2 = this;
                break block5;
            }
            try {
                object = this.zza;
                Object[] objectArray = new Object[n3];
                objectArray[0] = object;
                var9_8 = constructor.newInstance(objectArray);
                object = var9_8;
                object = var9_8;
                long l3 = 0L;
                return object.zza(context, zzt2, zzw2, zzdt2, executor, list, l3);
            }
            catch (Exception exception) {}
        }
        n3 = zzdq22 instanceof zzdq;
        if (n3 != 0) {
            zzdq22 = zzdq22;
            throw zzdq22;
        }
        long l4 = -9223372036854775807L;
        zzdq22 = zzdq2 = new zzdq(zzdq22, l4);
        throw zzdq22;
    }
}

