/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.util.SparseArray
 *  android.util.SparseBooleanArray
 */
package com.google.android.gms.internal.ads;

import android.content.Context;
import android.util.SparseArray;
import android.util.SparseBooleanArray;
import com.google.android.gms.internal.ads.zzdl;
import com.google.android.gms.internal.ads.zzgd;
import com.google.android.gms.internal.ads.zzn;
import com.google.android.gms.internal.ads.zzxr;
import com.google.android.gms.internal.ads.zzyo;
import com.google.android.gms.internal.ads.zzyq;
import com.google.android.gms.internal.ads.zzyr;
import com.google.android.gms.internal.ads.zzyu;
import java.util.Map;

public final class zzys
extends zzdl {
    public static final zzys zzF;
    public static final zzys zzG;
    public static final zzn zzH;
    private static final String zzX;
    private static final String zzY;
    private static final String zzZ;
    private static final String zzaa;
    private static final String zzab;
    private static final String zzac;
    private static final String zzad;
    private static final String zzae;
    private static final String zzaf;
    private static final String zzag;
    private static final String zzah;
    private static final String zzai;
    private static final String zzaj;
    private static final String zzak;
    private static final String zzal;
    private static final String zzam;
    private static final String zzan;
    private static final String zzao;
    private static final String zzap;
    public final boolean zzI;
    public final boolean zzJ;
    public final boolean zzK;
    public final boolean zzL;
    public final boolean zzM;
    public final boolean zzN;
    public final boolean zzO;
    public final boolean zzP;
    public final boolean zzQ;
    public final boolean zzR;
    public final boolean zzS;
    public final boolean zzT;
    public final boolean zzU;
    public final boolean zzV;
    public final boolean zzW;
    private final SparseArray zzaq;
    private final SparseBooleanArray zzar;

    static {
        zzys zzys2;
        Object object = new zzyq();
        zzF = zzys2 = new zzys((zzyq)object);
        zzG = zzys2;
        int n3 = 36;
        zzX = Integer.toString(1000, n3);
        zzY = Integer.toString(1001, n3);
        zzZ = Integer.toString(1002, n3);
        zzaa = Integer.toString(1003, n3);
        zzab = Integer.toString(1004, n3);
        zzac = Integer.toString(1005, n3);
        zzad = Integer.toString(1006, n3);
        zzae = Integer.toString(1007, n3);
        zzaf = Integer.toString(1008, n3);
        zzag = Integer.toString(1009, n3);
        zzah = Integer.toString(1010, n3);
        zzai = Integer.toString(1011, n3);
        zzaj = Integer.toString(1012, n3);
        zzak = Integer.toString(1013, n3);
        zzal = Integer.toString(1014, n3);
        zzam = Integer.toString(1015, n3);
        zzan = Integer.toString(1016, n3);
        zzao = Integer.toString(1017, n3);
        zzap = Integer.toString(1018, n3);
        zzH = object = new zzyo();
    }

    private zzys(zzyq zzyq2) {
        super(zzyq2);
        SparseArray sparseArray;
        boolean bl2;
        boolean bl3;
        this.zzI = bl3 = zzyq.zzw(zzyq2);
        this.zzJ = false;
        this.zzK = bl2 = zzyq.zzs(zzyq2);
        this.zzL = false;
        this.zzM = bl2 = zzyq.zzu(zzyq2);
        this.zzN = false;
        this.zzO = false;
        this.zzP = false;
        this.zzQ = false;
        this.zzR = bl2 = zzyq.zzq(zzyq2);
        this.zzS = bl2 = zzyq.zzt(zzyq2);
        this.zzT = bl2 = zzyq.zzv(zzyq2);
        this.zzU = false;
        this.zzV = bl2 = zzyq.zzr(zzyq2);
        this.zzW = false;
        this.zzaq = sparseArray = zzyq.zzn(zzyq2);
        zzyq2 = zzyq.zzo(zzyq2);
        this.zzar = zzyq2;
    }

    public /* synthetic */ zzys(zzyq zzyq2, zzyr zzyr2) {
        this(zzyq2);
    }

    public static /* bridge */ /* synthetic */ SparseArray zza(zzys zzys2) {
        return zzys2.zzaq;
    }

    public static /* bridge */ /* synthetic */ SparseBooleanArray zzb(zzys zzys2) {
        return zzys2.zzar;
    }

    public static zzys zzd(Context object) {
        zzyq zzyq2 = new zzyq((Context)object);
        object = new zzys(zzyq2);
        return object;
    }

    public final boolean equals(Object object) {
        block8: {
            int n3;
            int n4;
            SparseBooleanArray sparseBooleanArray;
            SparseBooleanArray sparseBooleanArray2;
            boolean bl2 = true;
            if (this == object) {
                return bl2;
            }
            if (object != null && (sparseBooleanArray2 = zzys.class) == (sparseBooleanArray = object.getClass()) && (n4 = super.equals(object = (zzys)object)) && (n4 = this.zzI) == (n3 = ((zzys)object).zzI) && (n4 = this.zzK) == (n3 = ((zzys)object).zzK) && (n4 = this.zzM) == (n3 = ((zzys)object).zzM) && (n4 = this.zzR) == (n3 = ((zzys)object).zzR) && (n4 = this.zzS) == (n3 = ((zzys)object).zzS) && (n4 = this.zzT) == (n3 = ((zzys)object).zzT) && (n4 = this.zzV) == (n3 = ((zzys)object).zzV)) {
                sparseBooleanArray = this.zzar;
                sparseBooleanArray2 = ((zzys)object).zzar;
                int n7 = sparseBooleanArray.size();
                int n8 = sparseBooleanArray2.size();
                if (n8 == n7) {
                    Map map2 = null;
                    for (n8 = 0; n8 < n7; ++n8) {
                        int n10 = sparseBooleanArray.keyAt(n8);
                        if ((n10 = sparseBooleanArray2.indexOfKey(n10)) >= 0) {
                            continue;
                        }
                        break block8;
                    }
                    sparseBooleanArray = this.zzaq;
                    object = ((zzys)object).zzaq;
                    n3 = sparseBooleanArray.size();
                    n7 = object.size();
                    if (n7 == n3) {
                        for (n7 = 0; n7 < n3; ++n7) {
                            n8 = sparseBooleanArray.keyAt(n7);
                            if ((n8 = object.indexOfKey(n8)) < 0) break block8;
                            Object object2 = (Map)sparseBooleanArray.valueAt(n7);
                            map2 = (Map)object.valueAt(n8);
                            int n14 = object2.size();
                            int n15 = map2.size();
                            if (n15 != n14) break block8;
                            object2 = object2.entrySet().iterator();
                            while ((n14 = (int)(object2.hasNext() ? 1 : 0)) != 0) {
                                Map.Entry entry = (Map.Entry)object2.next();
                                zzxr zzxr2 = (zzxr)entry.getKey();
                                boolean bl3 = map2.containsKey(zzxr2);
                                if (bl3 && (n14 = (int)(zzgd.zzG(entry = entry.getValue(), zzxr2 = map2.get(zzxr2)) ? 1 : 0)) != 0) continue;
                                break block8;
                            }
                        }
                        return bl2;
                    }
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int n3 = (super.hashCode() + 31) * 31;
        int n4 = this.zzI;
        n3 = (n3 + n4) * 961;
        int n7 = this.zzK;
        n3 = (n3 + n7) * 961;
        int n8 = this.zzM;
        n3 = (n3 + n8) * 28629151;
        int n10 = this.zzR;
        n3 = (n3 + n10) * 31;
        int n14 = this.zzS;
        n3 = (n3 + n14) * 31;
        int n15 = this.zzT;
        n3 = (n3 + n15) * 961;
        int n16 = this.zzV;
        return (n3 + n16) * 31;
    }

    public final zzyq zzc() {
        zzyq zzyq2 = new zzyq(this, null);
        return zzyq2;
    }

    public final zzyu zze(int n3, zzxr zzxr2) {
        SparseArray sparseArray = this.zzaq;
        Map map2 = (Map)sparseArray.get(n3);
        if (map2 != null) {
            return (zzyu)map2.get(zzxr2);
        }
        return null;
    }

    public final boolean zzf(int n3) {
        return this.zzar.get(n3);
    }

    public final boolean zzg(int n3, zzxr zzxr2) {
        SparseArray sparseArray = this.zzaq;
        Map map2 = (Map)sparseArray.get(n3);
        return map2 != null && (n3 = (int)(map2.containsKey(zzxr2) ? 1 : 0)) != 0;
    }
}

