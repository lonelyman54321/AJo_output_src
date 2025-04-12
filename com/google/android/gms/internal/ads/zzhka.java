/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzaso;
import com.google.android.gms.internal.ads.zzasr;
import com.google.android.gms.internal.ads.zzass;
import com.google.android.gms.internal.ads.zzhjz;
import com.google.android.gms.internal.ads.zzhkb;
import com.google.android.gms.internal.ads.zzhkg;
import com.google.android.gms.internal.ads.zzhkh;
import java.io.Closeable;
import java.io.EOFException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;

public class zzhka
implements Iterator,
Closeable,
zzass {
    private static final zzasr zza;
    private static final zzhkh zzb;
    protected zzaso zzc;
    protected zzhkb zzd;
    zzasr zze = null;
    long zzf;
    long zzg;
    private final List zzh;

    static {
        zzhjz zzhjz2 = new zzhjz("eof ");
        zza = zzhjz2;
        zzb = zzhkh.zzb(zzhka.class);
    }

    public zzhka() {
        ArrayList arrayList;
        long l2;
        this.zzf = l2 = 0L;
        this.zzg = l2;
        this.zzh = arrayList = new ArrayList();
    }

    public void close() {
    }

    public final boolean hasNext() {
        zzasr zzasr2 = this.zze;
        zzasr zzasr3 = zza;
        if (zzasr2 == zzasr3) {
            return false;
        }
        boolean bl2 = true;
        if (zzasr2 != null) {
            return bl2;
        }
        try {
            zzasr2 = this.zzd();
        }
        catch (NoSuchElementException noSuchElementException) {
            this.zze = zzasr2 = zza;
            return false;
        }
        this.zze = zzasr2;
        return bl2;
    }

    public final void remove() {
        UnsupportedOperationException unsupportedOperationException = new UnsupportedOperationException();
        throw unsupportedOperationException;
    }

    public String toString() {
        Object object;
        int n3;
        StringBuilder stringBuilder = new StringBuilder();
        String string2 = this.getClass().getSimpleName();
        stringBuilder.append(string2);
        stringBuilder.append("[");
        string2 = null;
        for (int i3 = 0; i3 < (n3 = (object = this.zzh).size()); ++i3) {
            if (i3 > 0) {
                object = ";";
                stringBuilder.append((String)object);
            }
            object = ((zzasr)this.zzh.get(i3)).toString();
            stringBuilder.append((String)object);
        }
        stringBuilder.append("]");
        return stringBuilder.toString();
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final zzasr zzd() {
        Object object;
        block8: {
            long l2;
            long l3;
            long l4;
            long l7;
            Object object2;
            object = this.zze;
            if (object != null && object != (object2 = zza)) {
                this.zze = null;
                return object;
            }
            object = this.zzd;
            if (object != null && (l7 = (l4 = (l3 = this.zzf) - (l2 = this.zzg)) == 0L ? 0 : (l4 < 0L ? -1 : 1)) < 0) {
                try {
                    synchronized (object) {
                        object2 = this.zzd;
                        long l8 = this.zzf;
                        object2.zze(l8);
                        object2 = this.zzc;
                        zzhkb zzhkb2 = this.zzd;
                        object2 = object2.zzb(zzhkb2, this);
                        zzhkb2 = this.zzd;
                        this.zzf = l8 = zzhkb2.zzb();
                    }
                }
                catch (EOFException eOFException) {
                    object = new NoSuchElementException();
                    throw object;
                }
                catch (IOException iOException) {
                    break block8;
                }
                return object2;
            }
            this.zze = object = zza;
            object = new NoSuchElementException();
            throw object;
        }
        object = new NoSuchElementException();
        throw object;
    }

    public final List zze() {
        Object object;
        Object object2 = this.zzd;
        if (object2 != null && (object2 = this.zze) != (object = zza)) {
            object2 = this.zzh;
            object = new zzhkg((List)object2, this);
            return object;
        }
        return this.zzh;
    }

    public final void zzf(zzhkb zzhkb2, long l2, zzaso zzaso2) {
        long l3;
        long l4;
        this.zzd = zzhkb2;
        this.zzf = l4 = zzhkb2.zzb();
        l4 = zzhkb2.zzb() + l2;
        zzhkb2.zze(l4);
        this.zzg = l3 = zzhkb2.zzb();
        this.zzc = zzaso2;
    }
}

