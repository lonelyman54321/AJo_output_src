/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.common;

import com.google.android.gms.common.zzj;
import java.lang.ref.Reference;
import java.lang.ref.WeakReference;

abstract class zzl
extends zzj {
    private static final WeakReference zza;
    private WeakReference zzb;

    static {
        WeakReference<Object> weakReference;
        zza = weakReference = new WeakReference<Object>(null);
    }

    public zzl(byte[] object) {
        super((byte[])object);
        object = zza;
        this.zzb = object;
    }

    public abstract byte[] zzb();

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final byte[] zzf() {
        synchronized (this) {
            Throwable throwable2;
            block4: {
                Object object;
                block3: {
                    try {
                        WeakReference<Object> weakReference;
                        object = this.zzb;
                        object = ((Reference)object).get();
                        object = (byte[])object;
                        if (object != null) break block3;
                        object = this.zzb();
                        this.zzb = weakReference = new WeakReference<Object>(object);
                    }
                    catch (Throwable throwable2) {
                        break block4;
                    }
                }
                return object;
            }
            throw throwable2;
        }
    }
}

