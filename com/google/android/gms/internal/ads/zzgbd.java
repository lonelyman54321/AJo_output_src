/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

final class zzgbd {
    private final Object zza;
    private final Object zzb;
    private final Object zzc;

    public zzgbd(Object object, Object object2, Object object3) {
        this.zza = object;
        this.zzb = object2;
        this.zzc = object3;
    }

    public final IllegalArgumentException zza() {
        Object object = this.zzc;
        Object object2 = this.zzb;
        Object object3 = this.zza;
        String string2 = String.valueOf(object3);
        object2 = String.valueOf(object2);
        object3 = String.valueOf(object3);
        object = String.valueOf(object);
        String string3 = "=";
        object = BW0.b(og_1.a("Multiple entries with same key: ", string2, string3, (String)object2, " and "), (String)object3, string3, (String)object);
        IllegalArgumentException illegalArgumentException = new IllegalArgumentException((String)object);
        return illegalArgumentException;
    }
}

