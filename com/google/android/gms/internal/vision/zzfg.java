/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.vision;

import com.google.android.gms.internal.vision.zzff;
import java.lang.ref.ReferenceQueue;
import java.util.List;
import java.util.Vector;
import java.util.concurrent.ConcurrentHashMap;

final class zzfg {
    private final ConcurrentHashMap zza;
    private final ReferenceQueue zzb;

    public zzfg() {
        ReferenceQueue referenceQueue = new ReferenceQueue(16, 0.75f, 10);
        this.zza = referenceQueue;
        this.zzb = referenceQueue = new ReferenceQueue();
    }

    public final List zza(Throwable object, boolean bl2) {
        Object object2;
        Object object3 = this.zzb.poll();
        while (object3 != null) {
            object2 = this.zza;
            ((ConcurrentHashMap)object2).remove(object3);
            object3 = this.zzb.poll();
        }
        object3 = new zzff((Throwable)object, null);
        object2 = this.zza;
        object3 = (List)((ConcurrentHashMap)object2).get(object3);
        if (!bl2) {
            return object3;
        }
        if (object3 != null) {
            return object3;
        }
        object3 = this.zza;
        ReferenceQueue referenceQueue = this.zzb;
        object2 = new zzff((Throwable)object, referenceQueue);
        int n3 = 2;
        Vector vector = new Vector(n3);
        if ((object = (List)((ConcurrentHashMap)object3).putIfAbsent(object2, vector)) == null) {
            return vector;
        }
        return object;
    }
}

