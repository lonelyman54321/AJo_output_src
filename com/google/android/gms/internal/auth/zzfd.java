/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.auth;

import com.google.android.gms.internal.auth.zzdq;
import com.google.android.gms.internal.auth.zzee;
import com.google.android.gms.internal.auth.zzez;
import com.google.android.gms.internal.auth.zzfe;
import com.google.android.gms.internal.auth.zzhd;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.RandomAccess;

public final class zzfd
extends zzdq
implements RandomAccess,
zzfe {
    public static final zzfe zza;
    private static final zzfd zzb;
    private final List zzc;

    static {
        zzfd zzfd2;
        zzb = zzfd2 = new zzfd(10);
        zzfd2.zzb();
        zza = zzfd2;
    }

    public zzfd() {
        this(10);
    }

    public zzfd(int n3) {
        ArrayList arrayList = new ArrayList(n3);
        this.zzc = arrayList;
    }

    private zzfd(ArrayList arrayList) {
        this.zzc = arrayList;
    }

    private static String zzh(Object object) {
        boolean bl2 = object instanceof String;
        if (bl2) {
            return (String)object;
        }
        bl2 = object instanceof zzee;
        if (bl2) {
            object = (zzee)object;
            Charset charset = zzez.zzb;
            return ((zzee)object).zzm(charset);
        }
        return zzez.zzh((byte[])object);
    }

    public final boolean addAll(int n3, Collection collection) {
        int n4;
        this.zza();
        boolean bl2 = collection instanceof zzfe;
        if (bl2) {
            collection = ((zzfe)collection).zzg();
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
        this.zza();
        this.zzc.clear();
        this.modCount = n3 = this.modCount + 1;
    }

    public final int size() {
        return this.zzc.size();
    }

    public final zzfe zze() {
        boolean bl2 = this.zzc();
        if (bl2) {
            zzhd zzhd2 = new zzhd(this);
            return zzhd2;
        }
        return this;
    }

    public final String zzf(int n3) {
        Object object = this.zzc.get(n3);
        boolean bl2 = object instanceof String;
        if (bl2) {
            return (String)object;
        }
        bl2 = object instanceof zzee;
        if (bl2) {
            object = (zzee)object;
            Object object2 = zzez.zzb;
            object2 = ((zzee)object).zzm((Charset)object2);
            boolean bl3 = ((zzee)object).zzh();
            if (bl3) {
                object = this.zzc;
                object.set(n3, object2);
            }
            return object2;
        }
        object = (byte[])object;
        String string2 = zzez.zzh(object);
        boolean bl4 = zzez.zzi((byte[])object);
        if (bl4) {
            object = this.zzc;
            object.set(n3, string2);
        }
        return string2;
    }

    public final List zzg() {
        return Collections.unmodifiableList(this.zzc);
    }
}

