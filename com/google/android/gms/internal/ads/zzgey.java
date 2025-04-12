/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzgeh$zzi;
import com.google.android.gms.internal.ads.zzgeu;
import com.google.android.gms.internal.ads.zzgev;
import com.google.android.gms.internal.ads.zzgex;
import com.google.android.gms.internal.ads.zzggd;
import java.util.Collections;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.logging.Level;
import java.util.logging.Logger;

abstract class zzgey
extends zzgeh$zzi {
    private static final zzgeu zzbd;
    private static final zzggd zzbe;
    private volatile int remaining;
    private volatile Set seenExceptions = null;

    static {
        Throwable throwable;
        zzgeu zzgeu2;
        zzggd zzggd2;
        Object object = zzgey.class;
        zzbe = zzggd2 = new zzggd((Class)object);
        zzggd2 = null;
        Object object2 = Set.class;
        Object object3 = "seenExceptions";
        object2 = AtomicReferenceFieldUpdater.newUpdater(object, object2, (String)object3);
        object3 = "remaining";
        object = AtomicIntegerFieldUpdater.newUpdater(object, (String)object3);
        try {
            zzgeu2 = new zzgev((AtomicReferenceFieldUpdater)object2, (AtomicIntegerFieldUpdater)object);
            throwable = null;
        }
        catch (Throwable throwable2) {
            zzgeu2 = new zzgex(null);
            throwable = throwable2;
        }
        zzbd = zzgeu2;
        if (throwable != null) {
            zzggd2 = zzbe;
            object2 = zzggd2.zza();
            object3 = Level.SEVERE;
            String string2 = "<clinit>";
            String string3 = "SafeAtomicHelper is broken!";
            String string4 = "com.google.common.util.concurrent.AggregateFutureState";
            ((Logger)object2).logp((Level)object3, string4, string2, string3, throwable);
        }
    }

    public zzgey(int n3) {
        this.remaining = n3;
    }

    public static /* bridge */ /* synthetic */ Set zzB(zzgey zzgey2) {
        return zzgey2.seenExceptions;
    }

    public static /* bridge */ /* synthetic */ void zzD(zzgey zzgey2, int n3) {
        zzgey2.remaining = n3;
    }

    public static /* bridge */ /* synthetic */ void zzE(zzgey zzgey2, Set set) {
        zzgey2.seenExceptions = set;
    }

    public static /* bridge */ /* synthetic */ int zzz(zzgey zzgey2) {
        return zzgey2.remaining;
    }

    public final int zzA() {
        return zzbd.zza(this);
    }

    public final Set zzC() {
        Object object = this.seenExceptions;
        if (object == null) {
            object = new ConcurrentHashMap();
            object = Collections.newSetFromMap(object);
            this.zze((Set)object);
            zzgeu zzgeu2 = zzbd;
            zzgeu2.zzb(this, null, (Set)object);
            object = this.seenExceptions;
            Objects.requireNonNull(object);
            object = (Set)object;
        }
        return object;
    }

    public final void zzF() {
        this.seenExceptions = null;
    }

    public abstract void zze(Set var1);
}

