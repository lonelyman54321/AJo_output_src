/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.gtm;

import com.google.android.gms.internal.gtm.zztl;
import com.google.android.gms.internal.gtm.zzto;
import com.google.android.gms.internal.gtm.zztp;
import com.google.android.gms.internal.gtm.zzts;
import com.google.android.gms.internal.gtm.zzua;
import java.util.Iterator;
import java.util.Map;

final class zztt
extends zztp {
    private final transient zzto zza;
    private final transient Object[] zzb;
    private final transient int zzc;

    public zztt(zzto zzto2, Object[] objectArray, int n3, int n4) {
        this.zza = zzto2;
        this.zzb = objectArray;
        this.zzc = 6;
    }

    public static /* bridge */ /* synthetic */ int zzl(zztt zztt2) {
        return zztt2.zzc;
    }

    public static /* bridge */ /* synthetic */ Object[] zzm(zztt zztt2) {
        return zztt2.zzb;
    }

    public final boolean contains(Object object) {
        boolean bl2 = object instanceof Map.Entry;
        if (bl2) {
            zzto zzto2;
            boolean bl3;
            object = (Map.Entry)object;
            Object object2 = object.getKey();
            if ((object = object.getValue()) != null && (bl3 = object.equals(object2 = (zzto2 = this.zza).get(object2)))) {
                return true;
            }
        }
        return false;
    }

    public final /* synthetic */ Iterator iterator() {
        return this.zzg().zzh(0);
    }

    public final int size() {
        return this.zzc;
    }

    public final int zza(Object[] objectArray, int n3) {
        return this.zzg().zza(objectArray, 0);
    }

    public final zzua zzd() {
        return this.zzg().zzh(0);
    }

    public final zztl zzh() {
        zzts zzts2 = new zzts(this);
        return zzts2;
    }
}

