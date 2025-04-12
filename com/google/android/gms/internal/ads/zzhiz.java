/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzhbs;
import com.google.android.gms.internal.ads.zzhbt;
import com.google.android.gms.internal.ads.zzhix;

public final class zzhiz
extends Enum
implements zzhbs {
    public static final /* enum */ zzhiz zzA;
    public static final /* enum */ zzhiz zzB;
    public static final /* enum */ zzhiz zzC;
    private static final zzhbt zzD;
    private static final /* synthetic */ zzhiz[] zzE;
    public static final /* enum */ zzhiz zza;
    public static final /* enum */ zzhiz zzb;
    public static final /* enum */ zzhiz zzc;
    public static final /* enum */ zzhiz zzd;
    public static final /* enum */ zzhiz zze;
    public static final /* enum */ zzhiz zzf;
    public static final /* enum */ zzhiz zzg;
    public static final /* enum */ zzhiz zzh;
    public static final /* enum */ zzhiz zzi;
    public static final /* enum */ zzhiz zzj;
    public static final /* enum */ zzhiz zzk;
    public static final /* enum */ zzhiz zzl;
    public static final /* enum */ zzhiz zzm;
    public static final /* enum */ zzhiz zzn;
    public static final /* enum */ zzhiz zzo;
    public static final /* enum */ zzhiz zzp;
    public static final /* enum */ zzhiz zzq;
    public static final /* enum */ zzhiz zzr;
    public static final /* enum */ zzhiz zzs;
    public static final /* enum */ zzhiz zzt;
    public static final /* enum */ zzhiz zzu;
    public static final /* enum */ zzhiz zzv;
    public static final /* enum */ zzhiz zzw;
    public static final /* enum */ zzhiz zzx;
    public static final /* enum */ zzhiz zzy;
    public static final /* enum */ zzhiz zzz;
    private final int zzF;

    static {
        zzhiz zzhiz2;
        zzhiz zzhiz3;
        zzhiz zzhiz4;
        zzhiz zzhiz5;
        zzhiz zzhiz6;
        zzhiz zzhiz7;
        zzhiz zzhiz8;
        zzhiz zzhiz9;
        zzhiz zzhiz10;
        zzhiz zzhiz11;
        zzhiz zzhiz12;
        zzhiz zzhiz13;
        zzhiz zzhiz14;
        zzhiz zzhiz15;
        Object object = new zzhiz("REQUEST_DESTINATION_UNSPECIFIED", 0, 0);
        zza = object;
        int n3 = 1;
        zzb = zzhiz15 = new zzhiz("EMPTY", n3, n3);
        int n4 = 2;
        zzc = zzhiz14 = new zzhiz("AUDIO", n4, n4);
        int n7 = 3;
        zzd = zzhiz13 = new zzhiz("AUDIO_WORKLET", n7, n7);
        int n8 = 4;
        zze = zzhiz12 = new zzhiz("DOCUMENT", n8, n8);
        int n10 = 5;
        zzf = zzhiz11 = new zzhiz("EMBED", n10, n10);
        int n14 = 6;
        zzg = zzhiz10 = new zzhiz("FONT", n14, n14);
        n14 = 7;
        zzh = zzhiz9 = new zzhiz("FRAME", n14, n14);
        n10 = 8;
        zzi = zzhiz8 = new zzhiz("IFRAME", n10, n10);
        n8 = 9;
        zzj = zzhiz7 = new zzhiz("IMAGE", n8, n8);
        n7 = 10;
        zzk = zzhiz6 = new zzhiz("MANIFEST", n7, n7);
        n4 = 11;
        zzl = zzhiz5 = new zzhiz("OBJECT", n4, n4);
        n3 = 12;
        zzm = zzhiz4 = new zzhiz("PAINT_WORKLET", n3, n3);
        int n15 = 13;
        zzn = zzhiz3 = new zzhiz("REPORT", n15, n15);
        zzhiz zzhiz16 = zzhiz3;
        n4 = 14;
        zzo = zzhiz2 = new zzhiz("SCRIPT", n4, n4);
        zzhiz zzhiz17 = zzhiz2;
        n3 = 15;
        zzhiz[] zzhizArray = new zzhiz("SERVICE_WORKER", n3, n3);
        zzp = zzhizArray;
        zzhiz[] zzhizArray2 = zzhizArray;
        n15 = 16;
        zzq = zzhiz3 = new zzhiz("SHARED_WORKER", n15, n15);
        zzhiz zzhiz18 = zzhiz3;
        n4 = 17;
        zzr = zzhiz2 = new zzhiz("STYLE", n4, n4);
        zzhiz zzhiz19 = zzhiz2;
        n3 = 18;
        zzhizArray = new zzhiz("TRACK", n3, n3);
        zzs = zzhizArray;
        zzhiz[] zzhizArray3 = zzhizArray;
        n15 = 19;
        zzt = zzhiz3 = new zzhiz("VIDEO", n15, n15);
        zzhiz zzhiz20 = zzhiz3;
        n4 = 20;
        zzu = zzhiz2 = new zzhiz("WEB_BUNDLE", n4, n4);
        zzhiz zzhiz21 = zzhiz2;
        n3 = 21;
        zzhizArray = new zzhiz("WORKER", n3, n3);
        zzv = zzhizArray;
        zzhiz[] zzhizArray4 = zzhizArray;
        n15 = 22;
        zzw = zzhiz3 = new zzhiz("XSLT", n15, n15);
        n4 = 23;
        zzhizArray = new zzhiz("FENCED_FRAME", n4, n4);
        zzx = zzhizArray;
        zzhiz[] zzhizArray5 = zzhizArray;
        n15 = 24;
        zzy = zzhiz2 = new zzhiz("WEB_IDENTITY", n15, n15);
        zzhiz zzhiz22 = zzhiz2;
        n3 = 25;
        zzhizArray = new zzhiz("DICTIONARY", n3, n3);
        zzz = zzhizArray;
        zzhiz[] zzhizArray6 = zzhizArray;
        n15 = 26;
        zzA = zzhiz2 = new zzhiz("SPECULATION_RULES", n15, n15);
        zzhiz zzhiz23 = zzhiz2;
        n3 = 27;
        zzhizArray = new zzhiz("JSON", n3, n3);
        zzB = zzhizArray;
        zzhiz[] zzhizArray7 = zzhizArray;
        n15 = 28;
        zzC = zzhiz2 = new zzhiz("SHARED_STORAGE_WORKLET", n15, n15);
        zzhizArray = new zzhiz[]{object, zzhiz15, zzhiz14, zzhiz13, zzhiz12, zzhiz11, zzhiz10, zzhiz9, zzhiz8, zzhiz7, zzhiz6, zzhiz5, zzhiz4, zzhiz16, zzhiz17, zzhizArray2, zzhiz18, zzhiz19, zzhizArray3, zzhiz20, zzhiz21, zzhizArray4, zzhiz3, zzhizArray5, zzhiz22, zzhizArray6, zzhiz23, zzhizArray7, zzhiz2};
        zzE = zzhizArray;
        zzD = object = new zzhix();
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private zzhiz() {
        void var3_2;
        void var2_-1;
        void var1_-1;
        this.zzF = var3_2;
    }

    public static zzhiz[] values() {
        return (zzhiz[])zzE.clone();
    }

    public static zzhiz zzb(int n3) {
        switch (n3) {
            default: {
                return null;
            }
            case 28: {
                return zzC;
            }
            case 27: {
                return zzB;
            }
            case 26: {
                return zzA;
            }
            case 25: {
                return zzz;
            }
            case 24: {
                return zzy;
            }
            case 23: {
                return zzx;
            }
            case 22: {
                return zzw;
            }
            case 21: {
                return zzv;
            }
            case 20: {
                return zzu;
            }
            case 19: {
                return zzt;
            }
            case 18: {
                return zzs;
            }
            case 17: {
                return zzr;
            }
            case 16: {
                return zzq;
            }
            case 15: {
                return zzp;
            }
            case 14: {
                return zzo;
            }
            case 13: {
                return zzn;
            }
            case 12: {
                return zzm;
            }
            case 11: {
                return zzl;
            }
            case 10: {
                return zzk;
            }
            case 9: {
                return zzj;
            }
            case 8: {
                return zzi;
            }
            case 7: {
                return zzh;
            }
            case 6: {
                return zzg;
            }
            case 5: {
                return zzf;
            }
            case 4: {
                return zze;
            }
            case 3: {
                return zzd;
            }
            case 2: {
                return zzc;
            }
            case 1: {
                return zzb;
            }
            case 0: 
        }
        return zza;
    }

    public final String toString() {
        return Integer.toString(this.zzF);
    }

    public final int zza() {
        return this.zzF;
    }
}

