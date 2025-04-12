/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzgeh;
import com.google.android.gms.internal.ads.zzgeh$zza;
import com.google.android.gms.internal.ads.zzgeh$zzd;
import com.google.android.gms.internal.ads.zzgeh$zzj$1;
import com.google.android.gms.internal.ads.zzgeh$zzk;
import com.google.android.gms.internal.ads.zzgek;
import com.google.android.gms.internal.ads.zzgel;
import java.lang.reflect.Field;
import java.security.AccessController;
import java.security.PrivilegedActionException;
import sun.misc.Unsafe;

final class zzgeh$zzj
extends zzgeh$zza {
    static final Unsafe zza;
    static final long zzb;
    static final long zzc;
    static final long zzd;
    static final long zze;
    static final long zzf;

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    static {
        Object object;
        Object object2 = zzgeh$zzk.class;
        try {
            object = Unsafe.getUnsafe();
        }
        catch (SecurityException securityException) {
            try {
                object = new zzgeh$zzj$1();
                object = AccessController.doPrivileged(object);
                object = (Unsafe)object;
            }
            catch (PrivilegedActionException privilegedActionException) {
                Throwable throwable = privilegedActionException.getCause();
                RuntimeException runtimeException = new RuntimeException("Could not initialize intrinsics", throwable);
                throw runtimeException;
            }
        }
        Object object3 = zzgeh.class;
        Object object4 = "waiters";
        try {
            long l2;
            long l3;
            object4 = ((Class)object3).getDeclaredField((String)object4);
            zzc = l3 = ((Unsafe)object).objectFieldOffset((Field)object4);
            object4 = "listeners";
            object4 = ((Class)object3).getDeclaredField((String)object4);
            zzb = l3 = ((Unsafe)object).objectFieldOffset((Field)object4);
            object4 = "value";
            object3 = ((Class)object3).getDeclaredField((String)object4);
            zzd = l2 = ((Unsafe)object).objectFieldOffset((Field)object3);
            object3 = "thread";
            object3 = ((Class)object2).getDeclaredField((String)object3);
            zze = l2 = ((Unsafe)object).objectFieldOffset((Field)object3);
            object3 = "next";
            object2 = ((Class)object2).getDeclaredField((String)object3);
            zzf = l2 = ((Unsafe)object).objectFieldOffset((Field)object2);
            zza = object;
            return;
        }
        catch (NoSuchFieldException noSuchFieldException) {
            object = new RuntimeException(noSuchFieldException);
            throw object;
        }
    }

    private zzgeh$zzj() {
        throw null;
    }

    public /* synthetic */ zzgeh$zzj(zzgel zzgel2) {
        super(null);
    }

    public final zzgeh$zzd zza(zzgeh zzgeh2, zzgeh$zzd zzgeh$zzd) {
        boolean bl2;
        zzgeh$zzd zzgeh$zzd2;
        while (zzgeh$zzd != (zzgeh$zzd2 = zzgeh.zzh(zzgeh2)) && !(bl2 = this.zze(zzgeh2, zzgeh$zzd2, zzgeh$zzd))) {
        }
        return zzgeh$zzd2;
    }

    public final zzgeh$zzk zzb(zzgeh zzgeh2, zzgeh$zzk zzgeh$zzk) {
        boolean bl2;
        zzgeh$zzk zzgeh$zzk2;
        while (zzgeh$zzk != (zzgeh$zzk2 = zzgeh.zzi(zzgeh2)) && !(bl2 = this.zzg(zzgeh2, zzgeh$zzk2, zzgeh$zzk))) {
        }
        return zzgeh$zzk2;
    }

    public final void zzc(zzgeh$zzk zzgeh$zzk, zzgeh$zzk zzgeh$zzk2) {
        Unsafe unsafe = zza;
        long l2 = zzf;
        unsafe.putObject(zzgeh$zzk, l2, zzgeh$zzk2);
    }

    public final void zzd(zzgeh$zzk zzgeh$zzk, Thread thread2) {
        Unsafe unsafe = zza;
        long l2 = zze;
        unsafe.putObject(zzgeh$zzk, l2, thread2);
    }

    public final boolean zze(zzgeh zzgeh2, zzgeh$zzd zzgeh$zzd, zzgeh$zzd zzgeh$zzd2) {
        Unsafe unsafe = zza;
        long l2 = zzb;
        return zzgek.zza(unsafe, zzgeh2, l2, zzgeh$zzd, zzgeh$zzd2);
    }

    public final boolean zzf(zzgeh zzgeh2, Object object, Object object2) {
        Unsafe unsafe = zza;
        long l2 = zzd;
        return zzgek.zza(unsafe, zzgeh2, l2, object, object2);
    }

    public final boolean zzg(zzgeh zzgeh2, zzgeh$zzk zzgeh$zzk, zzgeh$zzk zzgeh$zzk2) {
        Unsafe unsafe = zza;
        long l2 = zzc;
        return zzgek.zza(unsafe, zzgeh2, l2, zzgeh$zzk, zzgeh$zzk2);
    }
}

