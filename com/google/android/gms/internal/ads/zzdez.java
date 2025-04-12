/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzdex;
import com.google.android.gms.internal.ads.zzdey;
import com.google.android.gms.internal.ads.zzdha;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Executor;

public class zzdez {
    protected final Map zza;

    public zzdez(Set set) {
        HashMap hashMap;
        this.zza = hashMap = new HashMap();
        this.zzp(set);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void zzk(zzdha object) {
        synchronized (this) {
            Object object2 = ((zzdha)object).zza;
            object = ((zzdha)object).zzb;
            this.zzo(object2, (Executor)object);
            return;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void zzo(Object object, Executor executor) {
        synchronized (this) {
            Map map2 = this.zza;
            map2.put(object, executor);
            return;
        }
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void zzp(Set object) {
        synchronized (this) {
            Throwable throwable2;
            block5: {
                try {
                    boolean bl2;
                    object = object.iterator();
                    while (bl2 = object.hasNext()) {
                        Object object2 = object.next();
                        object2 = (zzdha)object2;
                        this.zzk((zzdha)object2);
                    }
                }
                catch (Throwable throwable2) {
                    break block5;
                }
                return;
            }
            throw throwable2;
        }
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void zzq(zzdey zzdey2) {
        synchronized (this) {
            Throwable throwable2;
            block5: {
                try {
                    boolean bl2;
                    Iterator iterator = this.zza;
                    iterator = iterator.entrySet();
                    iterator = iterator.iterator();
                    while (bl2 = iterator.hasNext()) {
                        Object object = iterator.next();
                        object = (Map.Entry)object;
                        Object k2 = object.getKey();
                        object = object.getValue();
                        object = (Executor)object;
                        zzdex zzdex2 = new zzdex(zzdey2, k2);
                        object.execute(zzdex2);
                    }
                }
                catch (Throwable throwable2) {
                    break block5;
                }
                return;
            }
            throw throwable2;
        }
    }
}

