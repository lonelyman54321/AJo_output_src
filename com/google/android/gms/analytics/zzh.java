/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.analytics;

import com.google.android.gms.analytics.zzj;
import com.google.android.gms.analytics.zzk;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.Clock;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;

public final class zzh {
    private final zzk zza;
    private final Clock zzb;
    private boolean zzc;
    private long zzd;
    private long zze;
    private long zzf;
    private long zzg;
    private long zzh;
    private boolean zzi;
    private final Map zzj;
    private final List zzk;

    public zzh(zzh object) {
        boolean bl2;
        long l2;
        Object object2 = ((zzh)object).zza;
        this.zza = object2;
        this.zzb = object2 = ((zzh)object).zzb;
        this.zzd = l2 = ((zzh)object).zzd;
        this.zze = l2 = ((zzh)object).zze;
        this.zzf = l2 = ((zzh)object).zzf;
        this.zzg = l2 = ((zzh)object).zzg;
        this.zzh = l2 = ((zzh)object).zzh;
        Object object3 = ((zzh)object).zzk;
        object2 = new ArrayList(object3);
        this.zzk = object2;
        object3 = ((zzh)object).zzj;
        int n3 = object3.size();
        super(n3);
        this.zzj = object2;
        object = ((zzh)object).zzj.entrySet().iterator();
        while (bl2 = object.hasNext()) {
            object2 = (Map.Entry)object.next();
            object3 = com.google.android.gms.analytics.zzh.zzn((Class)object2.getKey());
            ((zzj)object2.getValue()).zzc((zzj)object3);
            Map map2 = this.zzj;
            object2 = (Class)object2.getKey();
            map2.put(object2, object3);
        }
    }

    public zzh(zzk cloneable, Clock clock) {
        Preconditions.checkNotNull(cloneable);
        Preconditions.checkNotNull(clock);
        this.zza = cloneable;
        this.zzb = clock;
        this.zzg = 1800000L;
        this.zzh = 3024000000L;
        this.zzj = cloneable = new Cloneable();
        this.zzk = cloneable;
    }

    private static zzj zzn(Class genericDeclaration) {
        boolean bl2 = false;
        RuntimeException runtimeException = null;
        try {
            genericDeclaration = genericDeclaration.getDeclaredConstructor(null);
        }
        catch (Exception exception) {
            bl2 = exception instanceof InstantiationException;
            if (!bl2) {
                bl2 = exception instanceof IllegalAccessException;
                if (!bl2) {
                    bl2 = exception instanceof ReflectiveOperationException;
                    if (bl2) {
                        runtimeException = new IllegalArgumentException("Linkage exception", exception);
                        throw runtimeException;
                    }
                    runtimeException = new RuntimeException(exception);
                    throw runtimeException;
                }
                runtimeException = new IllegalArgumentException("dataType default constructor is not accessible", exception);
                throw runtimeException;
            }
            runtimeException = new IllegalArgumentException("dataType doesn't have default constructor", exception);
            throw runtimeException;
        }
        genericDeclaration = ((Constructor)genericDeclaration).newInstance(null);
        return (zzj)((Object)genericDeclaration);
    }

    public final long zza() {
        return this.zzd;
    }

    public final zzj zzb(Class clazz) {
        zzj zzj2 = (zzj)this.zzj.get(clazz);
        if (zzj2 == null) {
            zzj2 = com.google.android.gms.analytics.zzh.zzn(clazz);
            Map map2 = this.zzj;
            map2.put(clazz, zzj2);
        }
        return zzj2;
    }

    public final zzj zzc(Class clazz) {
        return (zzj)this.zzj.get(clazz);
    }

    public final zzk zzd() {
        return this.zza;
    }

    public final Collection zze() {
        return this.zzj.values();
    }

    public final List zzf() {
        return this.zzk;
    }

    public final void zzg(zzj object) {
        Preconditions.checkNotNull(object);
        Object object2 = object.getClass();
        Class<?> clazz = ((Class)object2).getSuperclass();
        Class<zzj> clazz2 = zzj.class;
        if (clazz == clazz2) {
            object2 = this.zzb((Class)object2);
            ((zzj)object).zzc((zzj)object2);
            return;
        }
        object = new IllegalArgumentException();
        throw object;
    }

    public final void zzh() {
        this.zzi = true;
    }

    public final void zzi() {
        long l2;
        Clock clock = this.zzb;
        this.zzf = l2 = clock.elapsedRealtime();
        l2 = this.zze;
        long l3 = 0L;
        long l4 = l2 - l3;
        Object object = l4 == 0L ? 0 : (l4 < 0L ? -1 : 1);
        if (object != false) {
            this.zzd = l2;
        } else {
            clock = this.zzb;
            this.zzd = l2 = clock.currentTimeMillis();
        }
        this.zzc = true;
    }

    public final void zzj(long l2) {
        this.zze = l2;
    }

    public final void zzk() {
        this.zza.zzm().zzk(this);
    }

    public final boolean zzl() {
        return this.zzi;
    }

    public final boolean zzm() {
        return this.zzc;
    }
}

