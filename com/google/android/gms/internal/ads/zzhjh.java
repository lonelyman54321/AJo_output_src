/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzgzi;
import com.google.android.gms.internal.ads.zzhac;
import com.google.android.gms.internal.ads.zzhbj;
import com.google.android.gms.internal.ads.zzhbn;
import com.google.android.gms.internal.ads.zzhbo;
import com.google.android.gms.internal.ads.zzhca;
import com.google.android.gms.internal.ads.zzhdf;
import com.google.android.gms.internal.ads.zzhdm;
import com.google.android.gms.internal.ads.zzhgj;
import com.google.android.gms.internal.ads.zzhgl;
import com.google.android.gms.internal.ads.zzhgn;
import com.google.android.gms.internal.ads.zzhgp;
import com.google.android.gms.internal.ads.zzhgt;
import com.google.android.gms.internal.ads.zzhhb;
import com.google.android.gms.internal.ads.zzhhs;
import com.google.android.gms.internal.ads.zzhhx;
import com.google.android.gms.internal.ads.zzhhz;
import com.google.android.gms.internal.ads.zzhie;
import com.google.android.gms.internal.ads.zzhij;
import com.google.android.gms.internal.ads.zzhil;
import com.google.android.gms.internal.ads.zzhim;
import com.google.android.gms.internal.ads.zzhir;
import com.google.android.gms.internal.ads.zzhit;
import com.google.android.gms.internal.ads.zzhiy;
import com.google.android.gms.internal.ads.zzhjb;
import com.google.android.gms.internal.ads.zzhjg;
import com.google.android.gms.internal.ads.zzhjl;
import com.google.android.gms.internal.ads.zzhjv;
import java.util.List;

public final class zzhjh
extends zzhbo
implements zzhdf {
    private static final zzhjh zza;
    private static volatile zzhdm zzb;
    private zzhca zzA;
    private zzhca zzB;
    private zzhjb zzC;
    private zzhca zzD;
    private zzhgt zzE;
    private String zzF;
    private zzhgj zzG;
    private zzhca zzH;
    private zzhhs zzI;
    private int zzJ;
    private zzhca zzK;
    private zzhca zzL;
    private long zzM;
    private zzhjg zzN;
    private zzhhz zzO;
    private byte zzP = (byte)2;
    private int zzc;
    private int zzd;
    private int zze;
    private String zzf;
    private String zzg;
    private String zzh;
    private zzhgp zzi;
    private zzhca zzj;
    private zzhca zzk;
    private String zzl;
    private zzhij zzm;
    private boolean zzn;
    private zzhca zzo;
    private String zzp;
    private boolean zzu;
    private boolean zzv;
    private zzhac zzw;
    private zzhit zzx;
    private boolean zzy;
    private String zzz;

    static {
        zzhjh zzhjh2;
        zza = zzhjh2 = new zzhjh();
        zzhbo.zzca(zzhjh.class, zzhjh2);
    }

    private zzhjh() {
        Iterable iterable;
        Object object = "";
        this.zzf = object;
        this.zzg = object;
        this.zzh = object;
        this.zzj = iterable = zzhbo.zzbK();
        this.zzk = iterable = zzhbo.zzbK();
        this.zzl = object;
        this.zzo = iterable = zzhbo.zzbK();
        this.zzp = object;
        iterable = zzhac.zzb;
        this.zzw = iterable;
        this.zzz = object;
        this.zzA = iterable = zzhbo.zzbK();
        this.zzB = iterable = zzhbo.zzbK();
        this.zzD = iterable = zzhbo.zzbK();
        this.zzF = object;
        this.zzH = object = zzhbo.zzbK();
        this.zzK = object = zzhbo.zzbK();
        this.zzL = object = zzhbo.zzbK();
    }

    public static zzhgn zzc() {
        return (zzhgn)zza.zzaZ();
    }

    public static /* synthetic */ zzhjh zze() {
        return zza;
    }

    public static /* synthetic */ void zzi(zzhjh zzhjh2, zzhim zzhim2) {
        int n3;
        zzhjh2.zzd = n3 = zzhim2.zza();
        zzhjh2.zzc = n3 = zzhjh2.zzc | 1;
    }

    public static /* synthetic */ void zzj(zzhjh zzhjh2, String string2) {
        int n3;
        string2.getClass();
        zzhjh2.zzc = n3 = zzhjh2.zzc | 4;
        zzhjh2.zzf = string2;
    }

    public static /* synthetic */ void zzk(zzhjh zzhjh2, String string2) {
        int n3;
        string2.getClass();
        zzhjh2.zzc = n3 = zzhjh2.zzc | 8;
        zzhjh2.zzg = string2;
    }

    public static /* synthetic */ void zzl(zzhjh zzhjh2, zzhgp zzhgp2) {
        int n3;
        zzhgp2.getClass();
        zzhjh2.zzi = zzhgp2;
        zzhjh2.zzc = n3 = zzhjh2.zzc | 0x20;
    }

    public static /* synthetic */ void zzm(zzhjh zzhjh2, zzhir zzhir2) {
        zzhir2.getClass();
        zzhca zzhca2 = zzhjh2.zzj;
        boolean bl2 = zzhca2.zzc();
        if (!bl2) {
            zzhjh2.zzj = zzhca2 = zzhbo.zzbL(zzhca2);
        }
        zzhjh2.zzj.add(zzhir2);
    }

    public static /* synthetic */ void zzn(zzhjh zzhjh2, String string2) {
        int n3;
        zzhjh2.zzc = n3 = zzhjh2.zzc | 0x40;
        zzhjh2.zzl = string2;
    }

    public static /* synthetic */ void zzo(zzhjh zzhjh2) {
        String string2;
        int n3;
        zzhjh2.zzc = n3 = zzhjh2.zzc & 0xFFFFFFBF;
        zzhjh2.zzl = string2 = zzhjh.zza.zzl;
    }

    public static /* synthetic */ void zzp(zzhjh zzhjh2, zzhij zzhij2) {
        int n3;
        zzhij2.getClass();
        zzhjh2.zzm = zzhij2;
        zzhjh2.zzc = n3 = zzhjh2.zzc | 0x80;
    }

    public static /* synthetic */ void zzq(zzhjh zzhjh2, zzhit zzhit2) {
        int n3;
        zzhit2.getClass();
        zzhjh2.zzx = zzhit2;
        zzhjh2.zzc = n3 = zzhjh2.zzc | 0x2000;
    }

    public static /* synthetic */ void zzr(zzhjh object, Iterable iterable) {
        zzhca zzhca2 = ((zzhjh)object).zzA;
        boolean bl2 = zzhca2.zzc();
        if (!bl2) {
            ((zzhjh)object).zzA = zzhca2 = zzhbo.zzbL(zzhca2);
        }
        object = ((zzhjh)object).zzA;
        zzgzi.zzaQ(iterable, (List)object);
    }

    public static /* synthetic */ void zzs(zzhjh object, Iterable iterable) {
        zzhca zzhca2 = ((zzhjh)object).zzB;
        boolean bl2 = zzhca2.zzc();
        if (!bl2) {
            ((zzhjh)object).zzB = zzhca2 = zzhbo.zzbL(zzhca2);
        }
        object = ((zzhjh)object).zzB;
        zzgzi.zzaQ(iterable, (List)object);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final Object zzde(zzhbn objectArray, Object object, Object object2) {
        byte by2 = 1;
        int n3 = objectArray.ordinal();
        switch (n3) {
            default: {
                objectArray = new UnsupportedOperationException();
                throw objectArray;
            }
            case 6: {
                objectArray = zzb;
                if (objectArray != null) return objectArray;
                object = zzhjh.class;
                synchronized (object) {
                    try {
                        objectArray = zzb;
                        if (objectArray != null) return objectArray;
                        object2 = zza;
                        zzb = objectArray = new zzhbj((zzhbo)object2);
                        return objectArray;
                    }
                    catch (Throwable throwable) {}
                    throw throwable;
                }
            }
            case 5: {
                return zza;
            }
            case 4: {
                return new zzhgn(null);
            }
            case 3: {
                return new zzhjh();
            }
            case 2: {
                objectArray = new Object[44];
                objectArray[0] = "zzc";
                objectArray[by2] = "zzf";
                objectArray[2] = "zzg";
                objectArray[3] = "zzh";
                objectArray[4] = "zzj";
                objectArray[5] = zzhir.class;
                objectArray[6] = "zzn";
                objectArray[7] = "zzo";
                objectArray[8] = "zzp";
                objectArray[9] = "zzu";
                objectArray[10] = "zzv";
                objectArray[11] = "zzd";
                objectArray[12] = object = zzhil.zza;
                objectArray[13] = "zze";
                objectArray[14] = object = zzhgl.zza;
                objectArray[15] = "zzi";
                objectArray[16] = "zzl";
                objectArray[17] = "zzm";
                objectArray[18] = "zzw";
                objectArray[19] = "zzk";
                objectArray[20] = zzhjl.class;
                objectArray[21] = "zzx";
                objectArray[22] = "zzy";
                objectArray[23] = "zzz";
                objectArray[24] = "zzA";
                objectArray[25] = "zzB";
                objectArray[26] = "zzC";
                objectArray[27] = "zzD";
                objectArray[28] = zzhjv.class;
                objectArray[29] = "zzE";
                objectArray[30] = "zzF";
                objectArray[31] = "zzG";
                objectArray[32] = "zzH";
                objectArray[33] = zzhhb.class;
                objectArray[34] = "zzI";
                objectArray[35] = "zzJ";
                objectArray[36] = object = zzhiy.zza;
                objectArray[37] = "zzK";
                objectArray[38] = zzhhx.class;
                objectArray[39] = "zzL";
                objectArray[40] = zzhie.class;
                objectArray[41] = "zzM";
                objectArray[42] = "zzN";
                objectArray[43] = "zzO";
                return zzhbo.zzbR(zza, "\u0001\"\u0000\u0001\u0001\"\"\u0000\t\u0001\u0001\u1008\u0002\u0002\u1008\u0003\u0003\u1008\u0004\u0004\u041b\u0005\u1007\b\u0006\u001a\u0007\u1008\t\b\u1007\n\t\u1007\u000b\n\u180c\u0000\u000b\u180c\u0001\f\u1009\u0005\r\u1008\u0006\u000e\u1009\u0007\u000f\u100a\f\u0010\u001b\u0011\u1009\r\u0012\u1007\u000e\u0013\u1008\u000f\u0014\u001a\u0015\u001a\u0016\u1009\u0010\u0017\u001b\u0018\u1009\u0011\u0019\u1008\u0012\u001a\u1009\u0013\u001b\u001b\u001c\u1009\u0014\u001d\u180c\u0015\u001e\u001b\u001f\u001b \u1002\u0016!\u1009\u0017\"\u1009\u0018", objectArray);
            }
            case 1: {
                if (object == null) {
                    by2 = 0;
                    object2 = null;
                }
                this.zzP = by2;
                return null;
            }
            case 0: 
        }
        return this.zzP;
    }

    public final String zzf() {
        return this.zzl;
    }

    public final String zzg() {
        return this.zzf;
    }

    public final List zzh() {
        return this.zzj;
    }
}

