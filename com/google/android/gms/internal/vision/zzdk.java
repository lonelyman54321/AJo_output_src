/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.vision;

import com.google.android.gms.internal.vision.zzde;
import com.google.android.gms.internal.vision.zzdf;

final class zzdk
implements zzdf {
    private volatile zzdf zza;
    private volatile boolean zzb;
    private Object zzc;

    public zzdk(zzdf zzdf2) {
        this.zza = zzdf2 = (zzdf)zzde.zza(zzdf2);
    }

    public final String toString() {
        StringBuilder stringBuilder;
        int n3;
        Object object = this.zza;
        if (object == null) {
            object = String.valueOf(this.zzc);
            n3 = ((String)object).length() + 25;
            stringBuilder = new StringBuilder(n3);
            String string2 = "<supplier that returned ";
            stringBuilder.append(string2);
            stringBuilder.append((String)object);
            stringBuilder.append(">");
            object = stringBuilder.toString();
        }
        object = String.valueOf(object);
        n3 = ((String)object).length() + 19;
        stringBuilder = new StringBuilder(n3);
        stringBuilder.append("Suppliers.memoize(");
        stringBuilder.append((String)object);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final Object zza() {
        boolean bl2 = this.zzb;
        if (bl2) return this.zzc;
        synchronized (this) {
            try {
                boolean bl3;
                bl2 = this.zzb;
                if (bl2) return this.zzc;
                Object object = this.zza;
                this.zzc = object = object.zza();
                this.zzb = bl3 = true;
                bl3 = false;
                this.zza = null;
                return object;
            }
            catch (Throwable throwable) {}
            throw throwable;
        }
    }
}

