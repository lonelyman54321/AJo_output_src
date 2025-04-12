/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.play.core.splitinstall.internal;

import com.google.android.play.core.splitinstall.internal.zzby;
import com.google.android.play.core.splitinstall.internal.zzcb;

public final class zzbz
implements zzcb,
zzby {
    private static final Object zza;
    private volatile zzcb zzb;
    private volatile Object zzc;

    static {
        Object object;
        zza = object = new Object();
    }

    private zzbz(zzcb zzcb2) {
        Object object;
        this.zzc = object = zza;
        this.zzb = zzcb2;
    }

    public static zzby zzb(zzcb zzcb2) {
        boolean bl2 = zzcb2 instanceof zzby;
        if (bl2) {
            return (zzby)((Object)zzcb2);
        }
        zzbz zzbz2 = new zzbz(zzcb2);
        return zzbz2;
    }

    public static zzcb zzc(zzcb zzcb2) {
        zzcb2.getClass();
        boolean bl2 = zzcb2 instanceof zzbz;
        if (bl2) {
            return zzcb2;
        }
        zzbz zzbz2 = new zzbz(zzcb2);
        return zzbz2;
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final Object zza() {
        String string2 = "Scoped provider was invoked recursively returning different results: ";
        Object object = this.zzc;
        Object object2 = zza;
        if (object != object2) return object;
        synchronized (this) {
            Throwable throwable2;
            block5: {
                block6: {
                    Object object3;
                    try {
                        object = this.zzc;
                        if (object != object2) return object;
                    }
                    catch (Throwable throwable2) {
                        break block5;
                    }
                    {
                        object = this.zzb;
                        object = object.zza();
                        object3 = this.zzc;
                        if (object3 == object2 || object3 == object) break block6;
                    }
                    StringBuilder stringBuilder = new StringBuilder(string2);
                    stringBuilder.append(object3);
                    string2 = " & ";
                    stringBuilder.append(string2);
                    stringBuilder.append(object);
                    string2 = ". This is likely due to a circular dependency.";
                    stringBuilder.append(string2);
                    string2 = stringBuilder.toString();
                    object2 = new IllegalStateException(string2);
                    throw object2;
                }
                this.zzc = object;
                string2 = null;
                this.zzb = null;
                return object;
            }
            throw throwable2;
        }
    }
}

