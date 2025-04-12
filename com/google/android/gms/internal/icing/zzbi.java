/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 */
package com.google.android.gms.internal.icing;

import android.content.Context;
import com.google.android.gms.internal.icing.zzbd;
import com.google.android.gms.internal.icing.zzbe;
import com.google.android.gms.internal.icing.zzbf;
import com.google.android.gms.internal.icing.zzbg;
import com.google.android.gms.internal.icing.zzbh;
import com.google.android.gms.internal.icing.zzbj;
import com.google.android.gms.internal.icing.zzbk;
import com.google.android.gms.internal.icing.zzbl;
import com.google.android.gms.internal.icing.zzbm;
import com.google.android.gms.internal.icing.zzbo;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

public final class zzbi {
    public static final /* synthetic */ int zza = 0;
    private static final Object zzb;
    private static volatile zzbh zzc;
    private static volatile boolean zzd = false;
    private static final AtomicReference zze;
    private static final zzbk zzf;
    private static final AtomicInteger zzg;

    static {
        Object object;
        zzb = object = new Object();
        object = new AtomicReference();
        zze = object;
        zzbl zzbl2 = zzbg.zza;
        zzf = object = new zzbk(zzbl2);
        zzg = object = new AtomicInteger();
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static void zza(Context object) {
        Object object2 = zzb;
        synchronized (object2) {
            Throwable throwable2;
            block6: {
                block5: {
                    try {
                        Object object3 = zzc;
                        Object object4 = object.getApplicationContext();
                        if (object4 != null) {
                            object = object4;
                        }
                        if (object3 != null && (object3 = ((zzbh)object3).zza()) == object) break block5;
                        zzbe.zza();
                        zzbj.zza();
                        object3 = new zzbf((Context)object);
                        object3 = zzbo.zza((zzbm)object3);
                        object4 = new zzbd((Context)object, (zzbm)object3);
                        zzc = object4;
                        object = zzg;
                        ((AtomicInteger)object).incrementAndGet();
                    }
                    catch (Throwable throwable2) {
                        break block6;
                    }
                }
                return;
            }
            throw throwable2;
        }
    }
}

