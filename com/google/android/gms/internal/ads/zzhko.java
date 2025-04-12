/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzhkj;
import com.google.android.gms.internal.ads.zzhky;

public final class zzhko
implements zzhky,
zzhkj {
    private static final Object zza;
    private volatile zzhky zzb;
    private volatile Object zzc;

    static {
        Object object;
        zza = object = new Object();
    }

    private zzhko(zzhky zzhky2) {
        Object object;
        this.zzc = object = zza;
        this.zzb = zzhky2;
    }

    public static zzhkj zza(zzhky zzhky2) {
        boolean bl2 = zzhky2 instanceof zzhkj;
        if (bl2) {
            return (zzhkj)((Object)zzhky2);
        }
        zzhko zzhko2 = new zzhko(zzhky2);
        return zzhko2;
    }

    public static zzhky zzc(zzhky zzhky2) {
        boolean bl2 = zzhky2 instanceof zzhko;
        if (bl2) {
            return zzhky2;
        }
        zzhko zzhko2 = new zzhko(zzhky2);
        return zzhko2;
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final Object zzb() {
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
                        object = object.zzb();
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

