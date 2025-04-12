/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzdh;
import com.google.android.gms.internal.ads.zzdj;
import com.google.android.gms.internal.ads.zzdk;
import com.google.android.gms.internal.ads.zzgax;
import com.google.android.gms.internal.ads.zzgbc;
import com.google.android.gms.internal.ads.zzgbf;
import com.google.android.gms.internal.ads.zzgbh;
import com.google.android.gms.internal.ads.zzn;
import java.io.Serializable;

public class zzdl {
    private static final String zzF;
    private static final String zzG;
    private static final String zzH;
    private static final String zzI;
    private static final String zzJ;
    private static final String zzK;
    private static final String zzL;
    private static final String zzM;
    private static final String zzN;
    private static final String zzO;
    private static final String zzP;
    private static final String zzQ;
    private static final String zzR;
    private static final String zzS;
    private static final String zzT;
    private static final String zzU;
    private static final String zzV;
    private static final String zzW;
    private static final String zzX;
    private static final String zzY;
    private static final String zzZ;
    public static final zzdl zza;
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
    public static final zzdl zzb;
    public static final zzn zzc;
    public final boolean zzA;
    public final boolean zzB;
    public final boolean zzC;
    public final zzgbf zzD;
    public final zzgbh zzE;
    public final int zzd;
    public final int zze;
    public final int zzf;
    public final int zzg;
    public final int zzh;
    public final int zzi;
    public final int zzj;
    public final int zzk;
    public final int zzl;
    public final int zzm;
    public final boolean zzn;
    public final zzgbc zzo;
    public final int zzp;
    public final zzgbc zzq;
    public final int zzr;
    public final int zzs;
    public final int zzt;
    public final zzgbc zzu;
    public final zzdj zzv;
    public final zzgbc zzw;
    public final int zzx;
    public final int zzy;
    public final boolean zzz;

    static {
        zzdl zzdl2;
        Object object = new zzdk();
        zza = zzdl2 = new zzdl((zzdk)object);
        zzb = zzdl2;
        int n3 = 36;
        zzF = Integer.toString(1, n3);
        zzG = Integer.toString(2, n3);
        zzH = Integer.toString(3, n3);
        zzI = Integer.toString(4, n3);
        zzJ = Integer.toString(5, n3);
        zzK = Integer.toString(6, n3);
        zzL = Integer.toString(7, n3);
        zzM = Integer.toString(8, n3);
        zzN = Integer.toString(9, n3);
        zzO = Integer.toString(10, n3);
        zzP = Integer.toString(11, n3);
        zzQ = Integer.toString(12, n3);
        zzR = Integer.toString(13, n3);
        zzS = Integer.toString(14, n3);
        zzT = Integer.toString(15, n3);
        zzU = Integer.toString(16, n3);
        zzV = Integer.toString(17, n3);
        zzW = Integer.toString(18, n3);
        zzX = Integer.toString(19, n3);
        zzY = Integer.toString(20, n3);
        zzZ = Integer.toString(21, n3);
        zzaa = Integer.toString(22, n3);
        zzab = Integer.toString(23, n3);
        zzac = Integer.toString(24, n3);
        zzad = Integer.toString(25, n3);
        zzae = Integer.toString(26, n3);
        zzaf = Integer.toString(27, n3);
        zzag = Integer.toString(28, n3);
        zzah = Integer.toString(29, n3);
        zzai = Integer.toString(30, n3);
        zzaj = Integer.toString(31, n3);
        zzc = object = new zzdh();
    }

    public zzdl(zzdk object) {
        zzgbc zzgbc2;
        int n3;
        int n4;
        this.zzd = n4 = -1 >>> 1;
        this.zze = n4;
        this.zzf = n4;
        this.zzg = n4;
        this.zzh = 0;
        this.zzi = 0;
        this.zzj = 0;
        this.zzk = 0;
        this.zzl = n3 = zzdk.zzc((zzdk)object);
        this.zzm = n3 = zzdk.zzb((zzdk)object);
        n3 = (int)(zzdk.zzm((zzdk)object) ? 1 : 0);
        this.zzn = n3;
        this.zzo = zzgbc2 = zzdk.zzj((zzdk)object);
        this.zzp = 0;
        this.zzq = zzgbc2 = zzdk.zzg((zzdk)object);
        this.zzr = 0;
        this.zzs = n4;
        this.zzt = n4;
        Object object2 = zzdk.zzh((zzdk)object);
        this.zzu = object2;
        this.zzv = object2 = zzdk.zzd((zzdk)object);
        this.zzw = object2 = zzdk.zzi((zzdk)object);
        this.zzx = n4 = zzdk.zza((zzdk)object);
        this.zzy = 0;
        this.zzz = false;
        this.zzA = false;
        this.zzB = false;
        this.zzC = false;
        this.zzD = object2 = zzgbf.zzc(zzdk.zzk((zzdk)object));
        this.zzE = object = zzgbh.zzl(zzdk.zzl((zzdk)object));
    }

    public boolean equals(Object object) {
        Object object2;
        Object object3;
        boolean bl2 = true;
        if (this == object) {
            return bl2;
        }
        if (object != null && (object3 = this.getClass()) == (object2 = object.getClass())) {
            boolean bl3;
            object = (zzdl)object;
            int n3 = this.zzn;
            int n4 = ((zzdl)object).zzn;
            if (n3 == n4 && (n3 = this.zzl) == (n4 = ((zzdl)object).zzl) && (n3 = this.zzm) == (n4 = ((zzdl)object).zzm) && (n3 = (int)(((zzgbc)(object3 = this.zzo)).equals(object2 = ((zzdl)object).zzo) ? 1 : 0)) != 0 && (n3 = (int)(((zzgbc)(object3 = this.zzq)).equals(object2 = ((zzdl)object).zzq) ? 1 : 0)) != 0 && (n3 = (int)(((zzgbc)(object3 = this.zzu)).equals(object2 = ((zzdl)object).zzu) ? 1 : 0)) != 0 && (n3 = (int)(((zzdj)(object3 = this.zzv)).equals(object2 = ((zzdl)object).zzv) ? 1 : 0)) != 0 && (n3 = (int)(((zzgbc)(object3 = this.zzw)).equals(object2 = ((zzdl)object).zzw) ? 1 : 0)) != 0 && (n3 = this.zzx) == (n4 = ((zzdl)object).zzx) && (n3 = (int)(((zzgbf)(object3 = this.zzD)).equals(object2 = ((zzdl)object).zzD) ? 1 : 0)) != 0 && (bl3 = ((zzgbh)(object3 = this.zzE)).equals(object = ((zzdl)object).zzE))) {
                return bl2;
            }
        }
        return false;
    }

    public int hashCode() {
        int n3 = this.zzn + -1048002209;
        Serializable serializable = this.zzo;
        n3 *= 31;
        int n4 = this.zzl;
        n3 = (n3 + n4) * 31;
        n4 = this.zzm;
        n3 = (n3 + n4) * 31;
        int n7 = ((zzgbc)serializable).hashCode() + n3;
        zzgax zzgax2 = this.zzq;
        n3 = (((zzgbc)zzgax2).hashCode() + (n7 *= 961)) * 961;
        serializable = this.zzu;
        n4 = -1 >>> 1;
        n3 = ((n3 + n4) * 31 + n4) * 31;
        n7 = (((zzgbc)serializable).hashCode() + n3) * 31;
        zzgax2 = this.zzw;
        n7 = (n7 + 29791) * 31;
        n3 = (((zzgbc)zzgax2).hashCode() + n7) * 31;
        n7 = this.zzx;
        n3 += n7;
        serializable = this.zzD;
        n7 = ((zzgbf)serializable).hashCode() + (n3 *= 887503681);
        zzgax2 = this.zzE;
        return ((zzgbh)zzgax2).hashCode() + (n7 *= 31);
    }
}

