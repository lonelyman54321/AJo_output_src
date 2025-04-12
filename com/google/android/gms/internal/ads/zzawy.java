/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.ConditionVariable
 */
package com.google.android.gms.internal.ads;

import android.os.ConditionVariable;
import com.google.android.gms.internal.ads.zzasx;
import com.google.android.gms.internal.ads.zzatd;
import com.google.android.gms.internal.ads.zzawx;
import com.google.android.gms.internal.ads.zzaye;
import com.google.android.gms.internal.ads.zzftj;
import com.google.android.gms.internal.ads.zzftk;
import com.google.android.gms.internal.ads.zzgzi;
import com.google.android.gms.internal.ads.zzhbi;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.io.Writer;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public final class zzawy {
    protected static volatile zzftk zza;
    private static final ConditionVariable zzc;
    private static volatile Random zzd;
    protected volatile Boolean zzb;
    private final zzaye zze;

    static {
        ConditionVariable conditionVariable;
        zzc = conditionVariable = new ConditionVariable();
        zza = null;
        zzd = null;
    }

    public zzawy(zzaye object) {
        this.zze = object;
        object = ((zzaye)object).zzk();
        zzawx zzawx2 = new zzawx(this);
        object.execute(zzawx2);
    }

    public static /* bridge */ /* synthetic */ ConditionVariable zza() {
        return zzc;
    }

    public static /* bridge */ /* synthetic */ zzaye zzb(zzawy zzawy2) {
        return zzawy2.zze;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static final int zzd() {
        try {
            ThreadLocalRandom threadLocalRandom = ThreadLocalRandom.current();
            return threadLocalRandom.nextInt();
        }
        catch (RuntimeException runtimeException) {
            Object object = zzd;
            if (object != null) return zzd.nextInt();
            object = zzawy.class;
            synchronized (object) {
                try {
                    Random random = zzd;
                    if (random != null) return zzd.nextInt();
                    zzd = random = new Random();
                    return zzd.nextInt();
                }
                catch (Throwable throwable) {}
                throw throwable;
            }
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void zzc(int n3, int n4, long l2, String string2, Exception exception) {
        try {
            Object object;
            Object object2;
            Object object3 = zzc;
            object3.block();
            object3 = this.zzb;
            boolean bl2 = (Boolean)object3;
            if (!bl2) return;
            object3 = zza;
            if (object3 == null) return;
            object3 = zzatd.zza();
            Object object4 = this.zze;
            object4 = ((zzaye)object4).zza;
            object4 = object4.getPackageName();
            ((zzasx)object3).zza((String)object4);
            ((zzasx)object3).zzf(l2);
            if (string2 != null) {
                ((zzasx)object3).zzb(string2);
            }
            if (exception != null) {
                object2 = new StringWriter();
                object = new PrintWriter((Writer)object2);
                exception.printStackTrace((PrintWriter)object);
                object2 = ((StringWriter)object2).toString();
                ((zzasx)object3).zzg((String)object2);
                object2 = exception.getClass();
                object2 = ((Class)object2).getName();
                ((zzasx)object3).zzd((String)object2);
            }
            object2 = zza;
            object = ((zzhbi)object3).zzbn();
            object = (zzatd)object;
            object = ((zzgzi)object).zzaV();
            object2 = ((zzftk)object2).zza((byte[])object);
            ((zzftj)object2).zza(n3);
            n3 = -1;
            if (n4 != n3) {
                ((zzftj)object2).zzb(n4);
            }
            ((zzftj)object2).zzc();
            return;
        }
        catch (Exception exception2) {
            return;
        }
    }
}

