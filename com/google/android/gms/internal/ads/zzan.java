/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.text.TextUtils
 */
package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import com.google.android.gms.internal.ads.zzae;
import com.google.android.gms.internal.ads.zzai;
import com.google.android.gms.internal.ads.zzaj;
import com.google.android.gms.internal.ads.zzal;
import com.google.android.gms.internal.ads.zzam;
import com.google.android.gms.internal.ads.zzas;
import com.google.android.gms.internal.ads.zzcd;
import com.google.android.gms.internal.ads.zzeq;
import com.google.android.gms.internal.ads.zzgbc;
import com.google.android.gms.internal.ads.zzgd;
import com.google.android.gms.internal.ads.zzn;
import com.google.android.gms.internal.ads.zzt;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Stream;

public final class zzan {
    private static final zzan zzI;
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
    public static final zzn zza;
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
    public final int zzA;
    public final int zzB;
    public final int zzC;
    public final int zzD;
    public final int zzE;
    public final int zzF;
    public final int zzG;
    public final int zzH;
    private int zzaq;
    public final String zzb;
    public final String zzc;
    public final List zzd;
    public final String zze;
    public final int zzf;
    public final int zzg;
    public final int zzh;
    public final int zzi;
    public final int zzj;
    public final String zzk;
    public final zzcd zzl;
    public final String zzm;
    public final String zzn;
    public final int zzo;
    public final List zzp;
    public final zzae zzq;
    public final long zzr;
    public final int zzs;
    public final int zzt;
    public final float zzu;
    public final int zzv;
    public final float zzw;
    public final byte[] zzx;
    public final int zzy;
    public final zzt zzz;

    static {
        zzan zzan2;
        Object object = new zzal();
        zzI = zzan2 = new zzan((zzal)object);
        int n3 = 36;
        zzJ = Integer.toString(0, n3);
        zzK = Integer.toString(1, n3);
        zzL = Integer.toString(2, n3);
        zzM = Integer.toString(3, n3);
        zzN = Integer.toString(4, n3);
        zzO = Integer.toString(5, n3);
        zzP = Integer.toString(6, n3);
        zzQ = Integer.toString(7, n3);
        zzR = Integer.toString(8, n3);
        zzS = Integer.toString(9, n3);
        zzT = Integer.toString(10, n3);
        zzU = Integer.toString(11, n3);
        zzV = Integer.toString(12, n3);
        zzW = Integer.toString(13, n3);
        zzX = Integer.toString(14, n3);
        zzY = Integer.toString(15, n3);
        zzZ = Integer.toString(16, n3);
        zzaa = Integer.toString(17, n3);
        zzab = Integer.toString(18, n3);
        zzac = Integer.toString(19, n3);
        zzad = Integer.toString(20, n3);
        zzae = Integer.toString(21, n3);
        zzaf = Integer.toString(22, n3);
        zzag = Integer.toString(23, n3);
        zzah = Integer.toString(24, n3);
        zzai = Integer.toString(25, n3);
        zzaj = Integer.toString(26, n3);
        zzak = Integer.toString(27, n3);
        zzal = Integer.toString(28, n3);
        zzam = Integer.toString(29, n3);
        zzan = Integer.toString(30, n3);
        zzao = Integer.toString(31, n3);
        zzap = Integer.toString(32, n3);
        zza = object = new zzai();
    }

    /*
     * Enabled aggressive block sorting
     */
    private zzan(zzal zzal2) {
        int n3;
        float f5;
        long l2;
        int n4;
        int n7;
        Object object = com.google.android.gms.internal.ads.zzal.zzah(zzal2);
        this.zzb = object;
        object = zzgd.zzD(com.google.android.gms.internal.ads.zzal.zzaj(zzal2));
        this.zze = object;
        Object object2 = com.google.android.gms.internal.ads.zzal.zzam(zzal2);
        int n8 = object2.isEmpty();
        int n10 = 1;
        int n14 = 0;
        if (n8 != 0 && (object2 = com.google.android.gms.internal.ads.zzal.zzai(zzal2)) != null) {
            String string2 = com.google.android.gms.internal.ads.zzal.zzai(zzal2);
            object2 = new zzas((String)object, string2);
            this.zzd = object = zzgbc.zzn(object2);
            this.zzc = object = com.google.android.gms.internal.ads.zzal.zzai(zzal2);
        } else {
            object2 = com.google.android.gms.internal.ads.zzal.zzam(zzal2);
            n8 = object2.isEmpty();
            if (n8 == 0 && (object2 = com.google.android.gms.internal.ads.zzal.zzai(zzal2)) == null) {
                block16: {
                    this.zzd = object2 = com.google.android.gms.internal.ads.zzal.zzam(zzal2);
                    object2 = com.google.android.gms.internal.ads.zzal.zzam(zzal2);
                    Iterator iterator = object2.iterator();
                    while ((n7 = iterator.hasNext()) != 0) {
                        zzas zzas2 = (zzas)iterator.next();
                        String string3 = zzas2.zza;
                        boolean bl2 = TextUtils.equals((CharSequence)string3, (CharSequence)object);
                        if (!bl2) continue;
                        object = zzas2.zzb;
                        break block16;
                    }
                    object = ((zzas)object2.get((int)0)).zzb;
                }
                this.zzc = object;
            } else {
                object = com.google.android.gms.internal.ads.zzal.zzam(zzal2);
                n4 = object.isEmpty();
                if (n4 != 0 && (object = com.google.android.gms.internal.ads.zzal.zzai(zzal2)) == null || (n4 = lk3_2.a((Stream)(object = kk3_2.a(com.google.android.gms.internal.ads.zzal.zzam(zzal2))), (zzaj)(object2 = new zzaj(zzal2)))) != 0) {
                    n4 = 1;
                } else {
                    n4 = 0;
                    object = null;
                }
                zzeq.zzf(n4 != 0);
                this.zzd = object = com.google.android.gms.internal.ads.zzal.zzam(zzal2);
                this.zzc = object = com.google.android.gms.internal.ads.zzal.zzai(zzal2);
            }
        }
        this.zzf = n4 = com.google.android.gms.internal.ads.zzal.zzq(zzal2);
        this.zzg = n4 = com.google.android.gms.internal.ads.zzal.zzn(zzal2);
        this.zzh = n4 = com.google.android.gms.internal.ads.zzal.zzd(zzal2);
        this.zzi = n8 = com.google.android.gms.internal.ads.zzal.zzm(zzal2);
        int n15 = -1;
        if (n8 != n15) {
            n4 = n8;
        }
        this.zzj = n4;
        this.zzk = object = com.google.android.gms.internal.ads.zzal.zzaf(zzal2);
        this.zzl = object = com.google.android.gms.internal.ads.zzal.zzae(zzal2);
        this.zzm = object = com.google.android.gms.internal.ads.zzal.zzag(zzal2);
        this.zzn = object = com.google.android.gms.internal.ads.zzal.zzak(zzal2);
        this.zzo = n4 = com.google.android.gms.internal.ads.zzal.zzk(zzal2);
        object = com.google.android.gms.internal.ads.zzal.zzal(zzal2);
        object = object == null ? Collections.emptyList() : com.google.android.gms.internal.ads.zzal.zzal(zzal2);
        this.zzp = object;
        this.zzq = object = com.google.android.gms.internal.ads.zzal.zzv(zzal2);
        this.zzr = l2 = com.google.android.gms.internal.ads.zzal.zzt(zzal2);
        this.zzs = n8 = com.google.android.gms.internal.ads.zzal.zzs(zzal2);
        this.zzt = n8 = com.google.android.gms.internal.ads.zzal.zzj(zzal2);
        this.zzu = f5 = com.google.android.gms.internal.ads.zzal.zza(zzal2);
        n8 = com.google.android.gms.internal.ads.zzal.zzo(zzal2);
        if (n8 == n15) {
            n8 = 0;
            f5 = 0.0f;
            object2 = null;
        } else {
            n8 = com.google.android.gms.internal.ads.zzal.zzo(zzal2);
        }
        this.zzv = n8;
        f5 = com.google.android.gms.internal.ads.zzal.zzb(zzal2);
        n7 = -1082130432;
        float f6 = -1.0f;
        n8 = (int)(f5 == f6 ? 0 : (f5 > f6 ? 1 : -1));
        if (n8 == 0) {
            n8 = 1065353216;
            f5 = 1.0f;
        } else {
            f5 = com.google.android.gms.internal.ads.zzal.zzb(zzal2);
        }
        this.zzw = f5;
        object2 = com.google.android.gms.internal.ads.zzal.zzan(zzal2);
        this.zzx = (byte[])object2;
        this.zzy = n8 = com.google.android.gms.internal.ads.zzal.zzr(zzal2);
        this.zzz = object2 = com.google.android.gms.internal.ads.zzal.zzu(zzal2);
        this.zzA = n8 = com.google.android.gms.internal.ads.zzal.zze(zzal2);
        this.zzB = n8 = com.google.android.gms.internal.ads.zzal.zzp(zzal2);
        this.zzC = n8 = com.google.android.gms.internal.ads.zzal.zzl(zzal2);
        n8 = com.google.android.gms.internal.ads.zzal.zzh(zzal2);
        if (n8 == n15) {
            n8 = 0;
            f5 = 0.0f;
            object2 = null;
        } else {
            n8 = com.google.android.gms.internal.ads.zzal.zzh(zzal2);
        }
        this.zzD = n8;
        n8 = com.google.android.gms.internal.ads.zzal.zzi(zzal2);
        if (n8 != n15) {
            n14 = com.google.android.gms.internal.ads.zzal.zzi(zzal2);
        }
        this.zzE = n14;
        this.zzF = n8 = com.google.android.gms.internal.ads.zzal.zzc(zzal2);
        this.zzG = n8 = com.google.android.gms.internal.ads.zzal.zzg(zzal2);
        n8 = com.google.android.gms.internal.ads.zzal.zzf(zzal2);
        if (n8 == 0 && object != null) {
            this.zzH = n10;
            return;
        }
        this.zzH = n3 = com.google.android.gms.internal.ads.zzal.zzf(zzal2);
    }

    public /* synthetic */ zzan(zzal zzal2, zzam zzam2) {
        this(zzal2);
    }

    public final boolean equals(Object object) {
        Object object2;
        Object object3;
        boolean bl2 = true;
        if (this == object) {
            return bl2;
        }
        if (object != null && (object3 = zzan.class) == (object2 = object.getClass())) {
            boolean bl3;
            float f5;
            float f6;
            long l2;
            long l3;
            long l4;
            long l7;
            int n3;
            object = (zzan)object;
            int n4 = this.zzaq;
            if (n4 != 0 && (n3 = ((zzan)object).zzaq) != 0 && n4 != n3) {
                return false;
            }
            n4 = this.zzf;
            n3 = ((zzan)object).zzf;
            if (n4 == n3 && (n4 = this.zzg) == (n3 = ((zzan)object).zzg) && (n4 = this.zzh) == (n3 = ((zzan)object).zzh) && (n4 = this.zzi) == (n3 = ((zzan)object).zzi) && (n4 = this.zzo) == (n3 = ((zzan)object).zzo) && (l7 = (l4 = (l3 = this.zzr) - (l2 = ((zzan)object).zzr)) == 0L ? 0 : (l4 < 0L ? -1 : 1)) == false && (n4 = this.zzs) == (n3 = ((zzan)object).zzs) && (n4 = this.zzt) == (n3 = ((zzan)object).zzt) && (n4 = this.zzv) == (n3 = ((zzan)object).zzv) && (n4 = this.zzy) == (n3 = ((zzan)object).zzy) && (n4 = this.zzA) == (n3 = ((zzan)object).zzA) && (n4 = this.zzB) == (n3 = ((zzan)object).zzB) && (n4 = this.zzC) == (n3 = ((zzan)object).zzC) && (n4 = this.zzD) == (n3 = ((zzan)object).zzD) && (n4 = this.zzE) == (n3 = ((zzan)object).zzE) && (n4 = this.zzF) == (n3 = ((zzan)object).zzF) && (n4 = this.zzH) == (n3 = ((zzan)object).zzH) && (n4 = Float.compare(f6 = this.zzu, f5 = ((zzan)object).zzu)) == 0 && (n4 = Float.compare(f6 = this.zzw, f5 = ((zzan)object).zzw)) == 0 && (n4 = (int)(zzgd.zzG(object2 = this.zzb, object3 = ((zzan)object).zzb) ? 1 : 0)) != 0 && (n4 = (int)(zzgd.zzG(object2 = this.zzc, object3 = ((zzan)object).zzc) ? 1 : 0)) != 0 && (n4 = (int)((object2 = this.zzd).equals(object3 = ((zzan)object).zzd) ? 1 : 0)) != 0 && (n4 = (int)(zzgd.zzG(object2 = this.zzk, object3 = ((zzan)object).zzk) ? 1 : 0)) != 0 && (n4 = (int)(zzgd.zzG(object2 = this.zzm, object3 = ((zzan)object).zzm) ? 1 : 0)) != 0 && (n4 = (int)(zzgd.zzG(object2 = this.zzn, object3 = ((zzan)object).zzn) ? 1 : 0)) != 0 && (n4 = (int)(zzgd.zzG(object2 = this.zze, object3 = ((zzan)object).zze) ? 1 : 0)) != 0 && (n4 = (int)(Arrays.equals((byte[])(object2 = (Object)this.zzx), (byte[])(object3 = (Object)((zzan)object).zzx)) ? 1 : 0)) != 0 && (n4 = (int)(zzgd.zzG(object2 = this.zzl, object3 = ((zzan)object).zzl) ? 1 : 0)) != 0 && (n4 = (int)(zzgd.zzG(object2 = this.zzz, object3 = ((zzan)object).zzz) ? 1 : 0)) != 0 && (n4 = (int)(zzgd.zzG(object2 = this.zzq, object3 = ((zzan)object).zzq) ? 1 : 0)) != 0 && (bl3 = this.zzd((zzan)object))) {
                return bl2;
            }
        }
        return false;
    }

    public final int hashCode() {
        int n3 = this.zzaq;
        if (n3 == 0) {
            int n4;
            float f5;
            Object object = this.zzb;
            int n7 = 0;
            float f6 = 0.0f;
            if (object == null) {
                n3 = 0;
                f5 = 0.0f;
                object = null;
            } else {
                n3 = ((String)object).hashCode();
            }
            String string2 = this.zzc;
            if (string2 == null) {
                n4 = 0;
                string2 = null;
            } else {
                n4 = string2.hashCode();
            }
            n3 += 527;
            List list = this.zzd;
            int n8 = 31;
            n3 = (n3 * 31 + n4) * 31;
            n4 = ((Object)list).hashCode() + n3;
            object = this.zze;
            if (object == null) {
                n3 = 0;
                f5 = 0.0f;
                object = null;
            } else {
                n3 = ((String)object).hashCode();
            }
            n4 = (n4 * 31 + n3) * 31;
            n3 = this.zzf;
            n4 = (n4 + n3) * 31;
            n3 = this.zzg;
            n4 = (n4 + n3) * 31;
            n3 = this.zzh;
            n4 = (n4 + n3) * 31;
            n3 = this.zzi;
            n4 = (n4 + n3) * 31;
            object = this.zzk;
            if (object == null) {
                n3 = 0;
                f5 = 0.0f;
                object = null;
            } else {
                n3 = ((String)object).hashCode();
            }
            n4 = (n4 + n3) * 31;
            object = this.zzl;
            if (object == null) {
                n3 = 0;
                f5 = 0.0f;
                object = null;
            } else {
                n3 = ((zzcd)object).hashCode();
            }
            n4 = (n4 + n3) * 31;
            object = this.zzm;
            if (object == null) {
                n3 = 0;
                f5 = 0.0f;
                object = null;
            } else {
                n3 = ((String)object).hashCode();
            }
            n4 = (n4 + n3) * 31;
            object = this.zzn;
            if (object != null) {
                n7 = ((String)object).hashCode();
            }
            n4 = (n4 + n7) * 31;
            n3 = this.zzo;
            n4 = (n4 + n3) * 31;
            long l2 = this.zzr;
            n7 = (int)l2;
            n4 = (n4 + n7) * 31;
            n3 = this.zzs;
            n4 = (n4 + n3) * 31;
            n3 = this.zzt;
            n4 = (n4 + n3) * 31;
            f5 = this.zzu;
            n3 = UR0.a(f5, n4, n8);
            n7 = this.zzv;
            n3 = (n3 + n7) * 31;
            f6 = this.zzw;
            n3 = UR0.a(f6, n3, n8);
            n7 = this.zzy;
            n3 = (n3 + n7) * 31;
            n7 = this.zzA;
            n3 = (n3 + n7) * 31;
            n7 = this.zzB;
            n3 = (n3 + n7) * 31;
            n7 = this.zzC;
            n3 = (n3 + n7) * 31;
            n7 = this.zzD;
            n3 = (n3 + n7) * 31;
            n7 = this.zzE;
            n3 = (n3 + n7) * 31;
            n7 = this.zzF;
            n3 = (((n3 + n7) * 31 + -1) * 31 + -1) * 31;
            n7 = this.zzH;
            this.zzaq = n3 += n7;
        }
        return n3;
    }

    public final String toString() {
        String string2 = String.valueOf(this.zzz);
        StringBuilder stringBuilder = new StringBuilder("Format(");
        String string3 = this.zzb;
        stringBuilder.append(string3);
        string3 = ", ";
        stringBuilder.append(string3);
        String string4 = this.zzc;
        stringBuilder.append(string4);
        stringBuilder.append(string3);
        string4 = this.zzm;
        stringBuilder.append(string4);
        stringBuilder.append(string3);
        string4 = this.zzn;
        stringBuilder.append(string4);
        stringBuilder.append(string3);
        string4 = this.zzk;
        stringBuilder.append(string4);
        stringBuilder.append(string3);
        int n3 = this.zzj;
        stringBuilder.append(n3);
        stringBuilder.append(string3);
        string4 = this.zze;
        stringBuilder.append(string4);
        stringBuilder.append(", [");
        n3 = this.zzs;
        stringBuilder.append(n3);
        stringBuilder.append(string3);
        n3 = this.zzt;
        stringBuilder.append(n3);
        stringBuilder.append(string3);
        float f5 = this.zzu;
        stringBuilder.append(f5);
        stringBuilder.append(string3);
        stringBuilder.append(string2);
        stringBuilder.append("], [");
        int n4 = this.zzA;
        stringBuilder.append(n4);
        stringBuilder.append(string3);
        return g30.a(this.zzB, "])", stringBuilder);
    }

    public final int zza() {
        int n3;
        int n4 = this.zzs;
        int n7 = -1;
        if (n4 != n7 && (n3 = this.zzt) != n7) {
            return n4 * n3;
        }
        return n7;
    }

    public final zzal zzb() {
        zzal zzal2 = new zzal(this, null);
        return zzal2;
    }

    public final zzan zzc(int n3) {
        zzal zzal2 = new zzal(this, null);
        zzal2.zzC(n3);
        zzan zzan2 = new zzan(zzal2);
        return zzan2;
    }

    public final boolean zzd(zzan zzan2) {
        Object object;
        int n3;
        List list = this.zzp;
        int n4 = list.size();
        if (n4 == (n3 = (object = zzan2.zzp).size())) {
            list = null;
            for (n4 = 0; n4 < (n3 = (object = this.zzp).size()); ++n4) {
                byte[] byArray;
                object = (byte[])this.zzp.get(n4);
                n3 = (int)(Arrays.equals((byte[])object, byArray = (byte[])zzan2.zzp.get(n4)) ? 1 : 0);
                if (n3 != 0) continue;
                return false;
            }
            return true;
        }
        return false;
    }
}

