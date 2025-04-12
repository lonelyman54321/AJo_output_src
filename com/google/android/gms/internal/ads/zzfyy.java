/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzfyw;
import com.google.android.gms.internal.ads.zzfyx;

final class zzfyy
implements zzfyw {
    private static final zzfyw zza;
    private volatile zzfyw zzb;
    private Object zzc;

    static {
        zzfyx zzfyx2 = new zzfyx();
        zza = zzfyx2;
    }

    public zzfyy(zzfyw zzfyw2) {
        this.zzb = zzfyw2;
    }

    public final String toString() {
        Object object = this.zzb;
        Object object2 = zza;
        if (object == object2) {
            object = String.valueOf(this.zzc);
            object2 = "<supplier that returned ";
            String string2 = ">";
            object = cP.a((String)object2, (String)object, string2);
        }
        object = String.valueOf(object);
        return cP.a("Suppliers.memoize(", (String)object, ")");
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final Object zza() {
        Object object = this.zzb;
        zzfyw zzfyw2 = zza;
        if (object == zzfyw2) return this.zzc;
        synchronized (this) {
            Throwable throwable2;
            block4: {
                try {
                    object = this.zzb;
                    if (object == zzfyw2) return this.zzc;
                }
                catch (Throwable throwable2) {
                    break block4;
                }
                object = this.zzb;
                this.zzc = object = object.zza();
                this.zzb = zzfyw2;
                return object;
            }
            throw throwable2;
        }
    }
}

