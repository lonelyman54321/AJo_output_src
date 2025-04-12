/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzgzl;
import com.google.android.gms.internal.ads.zzhac;
import com.google.android.gms.internal.ads.zzhcb;
import com.google.android.gms.internal.ads.zzhcm;
import com.google.android.gms.internal.ads.zzhev;
import com.google.android.gms.internal.ads.zzhff;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.RandomAccess;

public final class zzhcl
extends zzgzl
implements RandomAccess,
zzhcm {
    public static final zzhcm zza;
    private static final zzhcl zzb;
    private final List zzc;

    static {
        zzhcl zzhcl2;
        zzb = zzhcl2 = new zzhcl(false);
        zza = zzhcl2;
    }

    public zzhcl() {
        this(10);
    }

    public zzhcl(int n3) {
        ArrayList arrayList = new ArrayList(n3);
        super(true);
        this.zzc = arrayList;
    }

    private zzhcl(ArrayList arrayList) {
        super(true);
        this.zzc = arrayList;
    }

    private zzhcl(boolean bl2) {
        super(false);
        List list;
        this.zzc = list = Collections.emptyList();
    }

    private static String zzj(Object object) {
        boolean bl2 = object instanceof String;
        if (bl2) {
            return (String)object;
        }
        bl2 = object instanceof zzhac;
        if (bl2) {
            object = (zzhac)object;
            Charset charset = zzhcb.zzb;
            return ((zzhac)object).zzx(charset);
        }
        return zzhcb.zzd((byte[])object);
    }

    public final boolean addAll(int n3, Collection collection) {
        int n4;
        this.zzdJ();
        boolean bl2 = collection instanceof zzhcm;
        if (bl2) {
            collection = ((zzhcm)collection).zzh();
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
        this.zzdJ();
        this.zzc.clear();
        this.modCount = n3 = this.modCount + 1;
    }

    public final int size() {
        return this.zzc.size();
    }

    public final zzhcm zzd() {
        boolean bl2 = this.zzc();
        if (bl2) {
            zzhev zzhev2 = new zzhev(this);
            return zzhev2;
        }
        return this;
    }

    public final Object zze(int n3) {
        return this.zzc.get(n3);
    }

    public final String zzg(int n3) {
        Object object = this.zzc.get(n3);
        boolean bl2 = object instanceof String;
        if (bl2) {
            return (String)object;
        }
        bl2 = object instanceof zzhac;
        if (bl2) {
            object = (zzhac)object;
            Object object2 = zzhcb.zzb;
            object2 = ((zzhac)object).zzx((Charset)object2);
            boolean bl3 = ((zzhac)object).zzp();
            if (bl3) {
                object = this.zzc;
                object.set(n3, object2);
            }
            return object2;
        }
        object = (byte[])object;
        String string2 = zzhcb.zzd(object);
        boolean bl4 = zzhff.zzi((byte[])object);
        if (bl4) {
            object = this.zzc;
            object.set(n3, string2);
        }
        return string2;
    }

    public final List zzh() {
        return Collections.unmodifiableList(this.zzc);
    }

    public final void zzi(zzhac zzhac2) {
        int n3;
        this.zzdJ();
        this.zzc.add(zzhac2);
        this.modCount = n3 = this.modCount + 1;
    }
}

