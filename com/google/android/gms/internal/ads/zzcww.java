/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

import java.io.Serializable;
import java.util.concurrent.ConcurrentHashMap;

public final class zzcww {
    private final Object zza;
    private final ConcurrentHashMap zzb;
    private final ConcurrentHashMap zzc;
    private final ConcurrentHashMap zzd;

    public zzcww() {
        ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
        this.zza = concurrentHashMap;
        this.zzb = concurrentHashMap = new ConcurrentHashMap();
        this.zzc = concurrentHashMap = new ConcurrentHashMap();
        this.zzd = concurrentHashMap = new ConcurrentHashMap();
    }

    public final int zza(String object) {
        ConcurrentHashMap concurrentHashMap = this.zzb;
        if ((object = (Integer)concurrentHashMap.get(object)) == null) {
            return 0;
        }
        return (Integer)object;
    }

    public final long zzb(String object) {
        ConcurrentHashMap concurrentHashMap = this.zzd;
        if ((object = (Long)concurrentHashMap.get(object)) == null) {
            return -1;
        }
        return (Long)object;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void zzc(String string2) {
        Object object = this.zza;
        synchronized (object) {
            Throwable throwable2;
            block5: {
                Serializable serializable;
                block4: {
                    int n3;
                    block3: {
                        try {
                            serializable = this.zzb;
                            serializable = ((ConcurrentHashMap)serializable).get(string2);
                            serializable = (Integer)serializable;
                            n3 = 1;
                            if (serializable != null) break block3;
                            serializable = Integer.valueOf(n3);
                            break block4;
                        }
                        catch (Throwable throwable2) {
                            break block5;
                        }
                    }
                    int n4 = (Integer)serializable + n3;
                    serializable = Integer.valueOf(n4);
                }
                ConcurrentHashMap concurrentHashMap = this.zzb;
                concurrentHashMap.put(string2, serializable);
                return;
            }
            throw throwable2;
        }
    }

    public final void zzd(String string2, String object, long l2) {
        Long l3 = (Long)this.zzc.get(object);
        if (l3 == null) {
            return;
        }
        this.zzc.remove(object);
        object = this.zzd;
        long l4 = l3;
        Long l7 = l2 - l4;
        ((ConcurrentHashMap)object).put(string2, l7);
    }

    public final void zze(String string2, long l2) {
        Long l3 = l2;
        this.zzc.put(string2, l3);
    }
}

