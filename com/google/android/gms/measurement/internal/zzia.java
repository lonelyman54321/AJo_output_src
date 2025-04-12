/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.measurement.internal;

import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.measurement.zzdf;
import com.google.android.gms.internal.measurement.zzdi;
import com.google.android.gms.measurement.internal.zzgq;
import com.google.android.gms.measurement.internal.zzhv;
import com.google.android.gms.measurement.internal.zzhy;
import java.util.concurrent.Callable;
import java.util.concurrent.FutureTask;
import java.util.concurrent.atomic.AtomicLong;

final class zzia
extends FutureTask
implements Comparable {
    final boolean zza;
    private final long zzb;
    private final String zzc;
    private final /* synthetic */ zzhv zzd;

    public zzia(zzhv object, Runnable object2, boolean bl2, String string2) {
        long l2;
        this.zzd = object;
        object2 = zzdi.zza().zza((Runnable)object2);
        super((Runnable)object2, null);
        Preconditions.checkNotNull(string2);
        object2 = zzhv.zzc();
        this.zzb = l2 = ((AtomicLong)object2).getAndIncrement();
        this.zzc = string2;
        this.zza = bl2;
        long l3 = Long.MAX_VALUE;
        long l4 = l2 == l3 ? 0 : (l2 < l3 ? -1 : 1);
        if (l4 == false) {
            object = ((zzhv)object).zzj().zzg();
            object2 = "Tasks index overflow";
            ((zzgq)object).zza((String)object2);
        }
    }

    public zzia(zzhv object, Callable object2, boolean bl2, String string2) {
        long l2;
        this.zzd = object;
        zzdf zzdf2 = zzdi.zza();
        object2 = zzdf2.zza((Callable)object2);
        super(object2);
        Preconditions.checkNotNull(string2);
        object2 = zzhv.zzc();
        this.zzb = l2 = ((AtomicLong)object2).getAndIncrement();
        this.zzc = string2;
        this.zza = bl2;
        long l3 = Long.MAX_VALUE;
        long l4 = l2 == l3 ? 0 : (l2 < l3 ? -1 : 1);
        if (l4 == false) {
            object = ((zzhv)object).zzj().zzg();
            object2 = "Tasks index overflow";
            ((zzgq)object).zza((String)object2);
        }
    }

    public final /* synthetic */ int compareTo(Object object) {
        object = (zzia)object;
        boolean bl2 = this.zza;
        boolean bl3 = ((zzia)object).zza;
        int n3 = 1;
        int n4 = -1;
        if (bl2 != bl3) {
            if (bl2) {
                return n4;
            }
            return n3;
        }
        long l2 = this.zzb;
        long l3 = ((zzia)object).zzb;
        long l4 = l2 - l3;
        Object object2 = l4 == 0L ? 0 : (l4 < 0L ? -1 : 1);
        if (object2 < 0) {
            return n4;
        }
        object2 = l2 == l3 ? 0 : (l2 < l3 ? -1 : 1);
        if (object2 > 0) {
            return n3;
        }
        object = this.zzd.zzj().zzo();
        Long l7 = this.zzb;
        ((zzgq)object).zza("Two tasks share the same index. index", l7);
        return 0;
    }

    public final void setException(Throwable throwable) {
        Object object = this.zzd.zzj().zzg();
        Object object2 = this.zzc;
        ((zzgq)object).zza((String)object2, throwable);
        boolean bl2 = throwable instanceof zzhy;
        if (bl2 && (object = Thread.getDefaultUncaughtExceptionHandler()) != null) {
            object2 = Thread.currentThread();
            object.uncaughtException((Thread)object2, throwable);
        }
        super.setException(throwable);
    }
}

