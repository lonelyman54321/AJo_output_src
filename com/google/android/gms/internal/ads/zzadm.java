/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzadl;
import com.google.android.gms.internal.ads.zzadu;
import java.io.Serializable;
import java.lang.reflect.Constructor;
import java.util.concurrent.atomic.AtomicBoolean;

final class zzadm {
    private final zzadl zza;
    private final AtomicBoolean zzb;

    public zzadm(zzadl object) {
        this.zza = object;
        this.zzb = object = new AtomicBoolean(false);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Converted monitor instructions to comments
     * Lifted jumps to return sites
     */
    public final zzadu zza(Object ... object) {
        Object object2;
        Serializable serializable;
        block11: {
            String string2;
            block10: {
                serializable = this.zzb;
                // MONITORENTER : serializable
                object2 = this.zzb;
                boolean bl2 = ((AtomicBoolean)object2).get();
                string2 = null;
                if (!bl2) break block10;
                // MONITOREXIT : serializable
                return null;
            }
            try {
                object2 = this.zza;
                object2 = object2.zza();
            }
            catch (Exception exception) {
                string2 = "Error instantiating extension";
                object2 = new RuntimeException(string2, exception);
                throw object2;
            }
            catch (ClassNotFoundException classNotFoundException) {}
            break block11;
            object2 = this.zzb;
            boolean bl3 = true;
            ((AtomicBoolean)object2).set(bl3);
            // MONITOREXIT : serializable
            return null;
        }
        // MONITOREXIT : serializable
        if (object2 == null) {
            return null;
        }
        try {
            object = ((Constructor)object2).newInstance(object);
            return (zzadu)object;
        }
        catch (Exception exception) {
            serializable = new IllegalStateException("Unexpected error creating extractor", exception);
            throw serializable;
        }
    }
}

