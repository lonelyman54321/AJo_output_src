/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.vision;

import com.google.android.gms.internal.vision.zzde;
import com.google.android.gms.internal.vision.zzee;
import com.google.android.gms.internal.vision.zzej;
import com.google.android.gms.internal.vision.zzeo;
import com.google.android.gms.internal.vision.zzfa;
import java.util.Iterator;

final class zzex
extends zzej {
    private final transient Object zza;
    private transient int zzb;

    public zzex(Object object) {
        this.zza = object = zzde.zza(object);
    }

    public zzex(Object object, int n3) {
        this.zza = object;
        this.zzb = n3;
    }

    public final boolean contains(Object object) {
        return this.zza.equals(object);
    }

    public final int hashCode() {
        int n3 = this.zzb;
        if (n3 == 0) {
            Object object = this.zza;
            this.zzb = n3 = object.hashCode();
        }
        return n3;
    }

    public final /* synthetic */ Iterator iterator() {
        return this.zza();
    }

    public final int size() {
        return 1;
    }

    public final String toString() {
        String string2 = this.zza.toString();
        int n3 = lE2.a(2, string2);
        StringBuilder stringBuilder = new StringBuilder(n3);
        stringBuilder.append('[');
        stringBuilder.append(string2);
        stringBuilder.append(']');
        return stringBuilder.toString();
    }

    public final int zza(Object[] objectArray, int n3) {
        Object object;
        objectArray[n3] = object = this.zza;
        return n3 + 1;
    }

    public final zzfa zza() {
        Object object = this.zza;
        zzeo zzeo2 = new zzeo(object);
        return zzeo2;
    }

    public final boolean zzf() {
        return false;
    }

    public final boolean zzg() {
        int n3 = this.zzb;
        return n3 != 0;
    }

    public final zzee zzh() {
        return zzee.zza(this.zza);
    }
}

