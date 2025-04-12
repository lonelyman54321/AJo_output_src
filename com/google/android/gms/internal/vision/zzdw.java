/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.vision;

import com.google.android.gms.internal.vision.zzde;
import com.google.android.gms.internal.vision.zzdp;
import com.google.android.gms.internal.vision.zzds;
import java.io.Serializable;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.NoSuchElementException;

abstract class zzdw
implements Iterator {
    private int zza;
    private int zzb;
    private int zzc;
    private final /* synthetic */ zzdp zzd;

    private zzdw(zzdp zzdp2) {
        int n3;
        int n4;
        this.zzd = zzdp2;
        this.zza = n4 = zzdp.zza(zzdp2);
        this.zzb = n3 = zzdp2.zzd();
        this.zzc = -1;
    }

    public /* synthetic */ zzdw(zzdp zzdp2, zzds zzds2) {
        this(zzdp2);
    }

    private final void zza() {
        int n3;
        Serializable serializable = this.zzd;
        int n4 = zzdp.zza(serializable);
        if (n4 == (n3 = this.zza)) {
            return;
        }
        serializable = new ConcurrentModificationException();
        throw serializable;
    }

    public boolean hasNext() {
        int n3 = this.zzb;
        return n3 >= 0;
    }

    public Object next() {
        this.zza();
        int n3 = this.hasNext();
        if (n3 != 0) {
            int n4;
            this.zzc = n3 = this.zzb;
            Object object = this.zza(n3);
            zzdp zzdp2 = this.zzd;
            int n7 = this.zzb;
            this.zzb = n4 = zzdp2.zza(n7);
            return object;
        }
        NoSuchElementException noSuchElementException = new NoSuchElementException();
        throw noSuchElementException;
    }

    public void remove() {
        zzdp zzdp2;
        this.zza();
        int n3 = this.zzc;
        if (n3 >= 0) {
            n3 = 1;
        } else {
            n3 = 0;
            zzdp2 = null;
        }
        zzde.zzb(n3 != 0, "no calls to next() since the last call to remove()");
        this.zza = n3 = this.zza + 32;
        zzdp2 = this.zzd;
        Object object = zzdp2.zzb;
        int n4 = this.zzc;
        object = object[n4];
        zzdp2.remove(object);
        n3 = this.zzb;
        int n7 = this.zzc;
        this.zzb = n3 = zzdp.zzb(n3, n7);
        this.zzc = -1;
    }

    public abstract Object zza(int var1);
}

