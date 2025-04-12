/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzdc;
import com.google.android.gms.internal.ads.zzgd;
import com.google.android.gms.internal.ads.zzio;
import com.google.android.gms.internal.ads.zzlu;
import com.google.android.gms.internal.ads.zzmk;
import com.google.android.gms.internal.ads.zzxi;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;

final class zzml
extends zzio {
    public static final /* synthetic */ int zzc;
    private final int zzd;
    private final int zze;
    private final int[] zzf;
    private final int[] zzg;
    private final zzdc[] zzh;
    private final Object[] zzi;
    private final HashMap zzj;

    public zzml(Collection object, zzxi zzxi2) {
        int n3;
        int n4 = object.size();
        zzdc[] zzdcArray = new zzdc[n4];
        Object[] objectArray = object.iterator();
        int n7 = 0;
        int n8 = 0;
        Object object2 = null;
        while ((n3 = objectArray.hasNext()) != 0) {
            Object object3 = (zzlu)objectArray.next();
            int n10 = n8 + 1;
            zzdcArray[n8] = object3 = object3.zza();
            n8 = n10;
        }
        int n14 = object.size();
        objectArray = new Object[n14];
        object = object.iterator();
        while ((n8 = (int)(object.hasNext() ? 1 : 0)) != 0) {
            object2 = (zzlu)object.next();
            n3 = n7 + 1;
            objectArray[n7] = object2 = object2.zzb();
            n7 = n3;
        }
        this(zzdcArray, objectArray, zzxi2);
    }

    private zzml(zzdc[] zzdcArray, Object[] objectArray, zzxi hashMap) {
        super(false, (zzxi)((Object)hashMap));
        int n3;
        this.zzh = zzdcArray;
        int n4 = zzdcArray.length;
        int[] nArray = new int[n4];
        this.zzf = nArray;
        hashMap = (HashMap)new int[n4];
        this.zzg = (int[])hashMap;
        this.zzi = objectArray;
        this.zzj = hashMap = new HashMap();
        n4 = 0;
        hashMap = null;
        int n7 = 0;
        nArray = null;
        int n8 = 0;
        Integer n10 = null;
        for (int i3 = 0; i3 < (n3 = zzdcArray.length); ++i3) {
            Object object = zzdcArray[i3];
            this.zzh[n8] = object;
            this.zzg[n8] = n4;
            this.zzf[n8] = n7;
            n3 = ((zzdc)object).zzc();
            n4 += n3;
            n3 = this.zzh[n8].zzb();
            n7 += n3;
            object = this.zzj;
            Object object2 = objectArray[n8];
            int n14 = n8 + 1;
            n10 = n8;
            ((HashMap)object).put(object2, n10);
            n8 = n14;
        }
        this.zzd = n4;
        this.zze = n7;
    }

    public final int zzb() {
        return this.zze;
    }

    public final int zzc() {
        return this.zzd;
    }

    public final int zzp(Object object) {
        HashMap hashMap = this.zzj;
        if ((object = (Integer)hashMap.get(object)) == null) {
            return -1;
        }
        return (Integer)object;
    }

    public final int zzq(int n3) {
        int[] nArray = this.zzf;
        return zzgd.zzb(nArray, ++n3, false, false);
    }

    public final int zzr(int n3) {
        int[] nArray = this.zzg;
        return zzgd.zzb(nArray, ++n3, false, false);
    }

    public final int zzs(int n3) {
        return this.zzf[n3];
    }

    public final int zzt(int n3) {
        return this.zzg[n3];
    }

    public final zzdc zzu(int n3) {
        return this.zzh[n3];
    }

    public final Object zzv(int n3) {
        return this.zzi[n3];
    }

    public final List zzw() {
        return Arrays.asList(this.zzh);
    }

    public final zzml zzx(zzxi zzxi2) {
        Object object;
        int n3;
        int n4 = this.zzh.length;
        zzdc[] zzdcArray = new zzdc[n4];
        Object[] objectArray = null;
        for (int i3 = 0; i3 < (n3 = ((zzdc[])(object = this.zzh)).length); ++i3) {
            object = object[i3];
            zzmk zzmk2 = new zzmk(this, (zzdc)object);
            zzdcArray[i3] = zzmk2;
        }
        objectArray = this.zzi;
        object = new zzml(zzdcArray, objectArray, zzxi2);
        return object;
    }
}

