/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.icing;

import com.google.android.gms.internal.icing.zzbt;
import com.google.android.gms.internal.icing.zzcf;
import com.google.android.gms.internal.icing.zzdh;
import com.google.android.gms.internal.icing.zzdo;
import com.google.android.gms.internal.icing.zzfi;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.RandomAccess;

public final class zzdn
extends zzbt
implements RandomAccess,
zzdo {
    public static final zzdo zza;
    private static final zzdn zzb;
    private final List zzc;

    static {
        zzdn zzdn2;
        zzb = zzdn2 = new zzdn(10);
        zzdn2.zzb();
        zza = zzdn2;
    }

    public zzdn() {
        this(10);
    }

    public zzdn(int n3) {
        ArrayList arrayList = new ArrayList(n3);
        this.zzc = arrayList;
    }

    private zzdn(ArrayList arrayList) {
        this.zzc = arrayList;
    }

    private static String zzj(Object object) {
        boolean bl2 = object instanceof String;
        if (bl2) {
            return (String)object;
        }
        bl2 = object instanceof zzcf;
        if (bl2) {
            object = (zzcf)object;
            Charset charset = zzdh.zza;
            return ((zzcf)object).zzk(charset);
        }
        return zzdh.zzd((byte[])object);
    }

    public final boolean addAll(int n3, Collection collection) {
        int n4;
        this.zzc();
        boolean bl2 = collection instanceof zzdo;
        if (bl2) {
            collection = ((zzdo)collection).zzh();
        }
        n3 = (int)(this.zzc.addAll(n3, collection) ? 1 : 0);
        this.modCount = n4 = this.modCount + 1;
        return n3 != 0;
    }

    public final boolean addAll(Collection collection) {
        int n3 = this.size();
        return this.addAll(n3, collection);
    }

    public final void clear() {
        int n3;
        this.zzc();
        this.zzc.clear();
        this.modCount = n3 = this.modCount + 1;
    }

    public final int size() {
        return this.zzc.size();
    }

    public final String zzd(int n3) {
        Object object = this.zzc.get(n3);
        boolean bl2 = object instanceof String;
        if (bl2) {
            return (String)object;
        }
        bl2 = object instanceof zzcf;
        if (bl2) {
            object = (zzcf)object;
            Object object2 = zzdh.zza;
            object2 = ((zzcf)object).zzk((Charset)object2);
            boolean bl3 = ((zzcf)object).zzh();
            if (bl3) {
                object = this.zzc;
                object.set(n3, object2);
            }
            return object2;
        }
        object = (byte[])object;
        String string2 = zzdh.zzd(object);
        boolean bl4 = zzdh.zzc((byte[])object);
        if (bl4) {
            object = this.zzc;
            object.set(n3, string2);
        }
        return string2;
    }

    public final void zzf(zzcf zzcf2) {
        int n3;
        this.zzc();
        this.zzc.add(zzcf2);
        this.modCount = n3 = this.modCount + 1;
    }

    public final Object zzg(int n3) {
        return this.zzc.get(n3);
    }

    public final List zzh() {
        return Collections.unmodifiableList(this.zzc);
    }

    public final zzdo zzi() {
        boolean bl2 = this.zza();
        if (bl2) {
            zzfi zzfi2 = new zzfi(this);
            return zzfi2;
        }
        return this;
    }
}

